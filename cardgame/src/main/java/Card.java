import java.util.LinkedList;
import java.util.HashMap;

public class Card implements Cloneable {
   private static HashMap<String, Card> generatedCards = new HashMap<String, Card>();
   String title;
   LinkedList<Rule> rules;
   int artID; //this may be subject to change in order to better reflect how we connect each card to its art.
   LinkedList<Trait> traits;

   /**
    * Generates a card from the mode's information.
    */
   public Card generateCard(String t, Mode m) {
      if (generatedCards.containsKey(t)) {
         try {
            return (Card) generatedCards.get(t).clone();
         } catch (CloneNotSupportedException e) {
            System.err.println("Card failed to clone on generation.");
            //go on to generate from source and overwrite the old generatedCards value.
         }
      }

      return new Card("temp", new LinkedList<Rule>(), 0, new LinkedList<Trait>());
   }

   private Card(String title, LinkedList<Rule> rules, int artID, LinkedList<Trait> traits) {
      this.title = title;
      this.rules = rules;
      this.artID = artID;
      this.traits = traits;
   }

   @Override
   public Object clone() throws CloneNotSupportedException {
      return super.clone();
   }

}

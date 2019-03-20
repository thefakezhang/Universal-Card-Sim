import java.util.ArrayList;
import java.util.List;

public class Zone {
    String descriptor;
    String id;
    List<Card> cards = new ArrayList<>();

    /**
     * Creates a zone with a descriptor
     * @param descriptor The description of the zone
     * @param id The zone id
     */
    public Zone(String id, String descriptor){
        this.id = id;
        this.descriptor = descriptor;
    }

    public Zone(String id){
        this.id = id;
        descriptor = "";
    }


    /**
     * Creates a zone with a descriptor and a list of cards in the zone
     * @param descriptor The description of the zone
     * @param cards The cards currently in the zone
     * @param id The zone id
     */
    /*
    public Zone(String id, String descriptor, List<Card> cards){
        this.id = id;
        this.descriptor = descriptor;
        this.cards = cards;
    }*/

    /**
     *  plays a card on top of what is already in play
     * @param c the card that is being played
     */
    public void play(Card c){
        cards.add(c);
    }

    /**
     * plays a card into position n, the card that was originally in position n goes to position n+1 and so on
     * @param c the card that is being played
     * @param n the position that the card is being played in
     */
    public void play(Card c, int n){
        cards.add(n, c);
    }

    /**
     * Removes the card on top
     * @return the card that was removed, throws an exception on failure
     */
    public Card remove(){
        assert cards.size() > 0;
        Card c = cards.remove(cards.size()-1);
        return c;
    }

    /**
     * Removes the card in the n-th position. Requires {@code n < cards.length()}
     * @param n The position of the card in the list of cards that you want to remove. Requires {@code n>=0 && n<cards.size()}
     * @return the card that was removed
     */
    public Card remove(int n){
        assert cards.size() > 0 && n<cards.size();
        Card c = cards.remove(n);
        return c;
    }

    public String toString(){
        String acc = "";
        for(int i=0; i<cards.size(); i++){
            acc+=cards.get(i).title + ", ";
        }
        return descriptor + "\n" + acc;
    }


    private class NonExistantCardException extends java.lang.Exception{
        public NonExistantCardException() { super(); }
        public NonExistantCardException(String message) { super(message); }
        public NonExistantCardException(String message, Throwable cause) { super(message, cause); }
        public NonExistantCardException(Throwable cause) { super(cause); }
    }
}

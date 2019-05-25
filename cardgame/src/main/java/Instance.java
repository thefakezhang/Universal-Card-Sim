import java.util.HashMap;

/**
 * An instance of a particular game
 */
public class Instance {
   Mode mode;
   String ID;
   HashMap<String, Zone> zones;

   public Instance(Mode mode, String ID) {
      this.mode = mode;
      this.ID = ID;
   }
}

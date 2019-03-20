import java.util.HashMap;

/**
 * Defines the base actions of all card games
 */
public final class Action {

    public static Zone createZone(String id, String descrptor){ return new Zone(id, descrptor); }
    public static Zone createZone(String id){return new Zone(id);}

    public static void removeZone(HashMap<String, Zone> zones, String id){zones.remove(id);}

    public static Card createCard(String title, Mode m, int ID){return Card.generateCard(title, m, ID);}

    /**
     *
     * @param z
     * @param index
     */
    public static void removeCard(Zone z, int index){z.cards.remove(index);}

    public static 



}

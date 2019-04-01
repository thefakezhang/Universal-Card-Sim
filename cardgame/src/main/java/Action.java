import java.util.HashMap;

/**
 * Defines the base actions of all card games
 */
public final class Action {

    /**
     * Create a new uniquely identified zone. If
     * @param id
     * @param desc
     * @return
     */
    public static Zone createZone(String id, String desc){ return new Zone(id, desc); }
    public static Zone createZone(String id){return new Zone(id);}

    public static void removeZone(HashMap<String, Zone> zones, String id){zones.remove(id);}

    public static Card createCard(String title, Mode m, String ID){return Card.generateCard(title, m, ID);}

    /**
     *
     * @param z
     * @param index
     */
    public static void removeCard(Zone z, int index){z.cards.remove(index);}

    public static void moveCard(Zone zStart, int indexStart, Zone zEnd, int indexEnd){zEnd.cards.add(indexEnd, zStart.cards.remove(indexStart));}



}

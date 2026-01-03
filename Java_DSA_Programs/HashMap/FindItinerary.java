import java.util.HashMap;

public class FindItinerary {

    public static String getStart(HashMap<String, String> map) {
        HashMap<String, String> revMap = new HashMap<>();

        for (String key : map.keySet()) {
            revMap.put(map.get(key), key);
        }

        for (String key : map.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bangalore");
        tickets.put("Bombay", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        while (tickets.containsKey(start)) {
            System.out.print(start + " -> ");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}

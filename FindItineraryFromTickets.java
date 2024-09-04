import java.util.HashMap;

public class FindItineraryFromTickets {
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();
        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }
        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        if (start == null) {
            System.out.println("No valid starting point found.");
            return;
        }

        System.out.print(start);

        while (tickets.containsKey(start)) {
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }
}
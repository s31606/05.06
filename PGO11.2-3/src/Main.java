import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> przedmioty = new ArrayList<>();
        przedmioty.add(new Item(1, "butelka"));
        przedmioty.add(new Item(2, "wieszak"));
        przedmioty.add(new Item(3, "pomadka"));
        przedmioty.add(new Item(4, "książka"));
        przedmioty.add(new Item(5, "okulary"));

        for (int i = 0; i < przedmioty.size(); i++) {
            przedmioty.get(i).show();
        }

        HashMap<Integer, String> mapa = new HashMap<>();
        for (Item item : przedmioty) {
            mapa.put(item.identyfikator, item.nazwa);
        }

        for (Map.Entry<Integer, String> e : mapa.entrySet()) {
            System.out.println("identyfikator: " + e.getKey() + ", nazwa: " + e.getValue());
        }

        ArrayList<Item> przedmioty2 = new ArrayList<>();
        przedmioty2.add(new Item(6, "lampa"));
        przedmioty2.add(new Item(7, "spinka"));
        przedmioty2.add(new Item(8, "głośniik"));
        przedmioty2.add(new Item(9, "pasek"));
        przedmioty2.add(new Item(10, "torba"));
        przedmioty2.add(new Item(11, "komputer"));
        przedmioty2.add(new Item(12, "myszka"));
        przedmioty2.add(new Item(13, "kalkulator"));
        przedmioty2.add(new Item(14, "koc"));
        przedmioty2.add(new Item(15, "wstążka"));

        List<Item> przedmioty3 = przedmioty2.subList(0, 4);

        HashSet<Item> itemSet = new HashSet<>();
        for (Item item : przedmioty3) {
            itemSet.add(item);
        }
    }
}
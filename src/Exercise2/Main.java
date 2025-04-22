package Exercise2;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashSet<Restaurant> listRestaurants= new HashSet<>();
        listRestaurants.add(new Restaurant("Mc Donald´s", 4));
        listRestaurants.add(new Restaurant("Mc Donald´s", 5));
        listRestaurants.add(new Restaurant("KFC", 5));
        listRestaurants.add(new Restaurant("KFC", 1));
        listRestaurants.add(new Restaurant("KFC", 4));
        listRestaurants.add(new Restaurant("KFC", 2));
        listRestaurants.add(new Restaurant("KFC", 4));

        List<Restaurant> sortedList = new ArrayList<>(listRestaurants);

        Comparator<Restaurant> comparator = Comparator
                .comparing(Restaurant::getName, Comparator.reverseOrder())
                .thenComparing(Comparator.comparingInt(Restaurant::getScore).reversed());

        sortedList.sort(comparator);

        for (Restaurant restaurant : sortedList) {
            System.out.println(restaurant);
        }
    }
}
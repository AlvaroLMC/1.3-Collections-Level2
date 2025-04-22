package Exercise1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Restaurant> ListRestaurants= new HashSet<>();
        ListRestaurants.add(new Restaurant("Mc Donald´s", 5));
        ListRestaurants.add(new Restaurant("KFC", 5));
        ListRestaurants.add(new Restaurant("KFC", 4));
        ListRestaurants.add(new Restaurant("KFC", 4));
        ListRestaurants.add(new Restaurant("KFC", 2));
        ListRestaurants.add(new Restaurant("KFC", 1));

        for (Restaurant restaurant : ListRestaurants) {
            System.out.println(restaurant);
        }
    }
}
package day31_CustomClass_Constructors.RestaurantTask;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Bra Hak", "Vasteras", 5);

        Server server1 = new Server("Mahmut", 24, 18, true);
        Server server2 = new Server("Ozan", 15, 19.5, false);
        Server server3 = new Server("Ismet", 17, 20.0, true);

        Server[] servers = {server1, server2, server3};

        Chef chef1 = new Chef("Ceyhun", 11, 45.0, true);
        Chef chef2 = new Chef("Deniz", 12, 55.0, true);

        Chef[] chefs = {chef1, chef2};

        restaurant.hireServer(servers);
        restaurant.hireChef(chefs);
        restaurant.terminateServer(17);

        System.out.println(restaurant);


    }
}
/*
6.4. Create a class LocalRestaurant that has a main method with the following:
                - Make a Restaurant object
                - Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
                - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

                - Print your whole restaurants information

 */
package Collections.question2;
import java.io.*;
public class Main {
	public static void main(String[] args) {
        CitystateMap cityStateMap = new CitystateMap();

        try {
            cityStateMap.loadFromFile("city_state.txt");
        } catch (IOException e) {
            System.out.println("Error loading city-state data from file: " + e.getMessage());
        }

        cityStateMap.addCityState("New York", "New York");

        System.out.println("All Cities: " + cityStateMap.getAllCities());

        System.out.println("All States: " + cityStateMap.getAllStates());
        System.out.println("Cities for New York: " + cityStateMap.getCitiesForState("New York"));

        cityStateMap.deleteCitiesForState("California");
        System.out.println("Cities after deletion of California: " + cityStateMap.getAllCities());
    }


}

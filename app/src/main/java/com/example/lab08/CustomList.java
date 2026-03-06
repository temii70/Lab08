package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * This deletes a city from the list if it exists
     * @param city The city to delete
     */
    public void deleteCity(City city) {
        if (cities.contains(city)) {
            cities.remove(city);
        } else {
            throw new IllegalArgumentException("City not found");
        }
    }

    /**
     * This returns the number of cities in the list
     * @return
     */
    public int countCities() {
        return cities.size();
    }
}

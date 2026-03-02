package com.example.lab08;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        
        // This will fail initially because hasCity() doesn't exist yet
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity(){
        CustomList list = new CustomList();
        City city = new City("Montreal","QB");
        list.addCity(city);

        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        City city1 = new City("Edmonton", "AB");
        City city2 = new City("Vancouver", "BC");
        list.addCity(city1);
        list.addCity(city2);
        
        assertEquals(2, list.countCities());
    }
}

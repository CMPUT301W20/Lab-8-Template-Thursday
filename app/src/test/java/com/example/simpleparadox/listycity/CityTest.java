package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CityTest {
    private City mockCity() {
        City city = new City("Edmonton", "Alberta");
        return city;
    }

    @Test
    void testCompareTo(){
//        City city = new City("Edmonton", "Alberta");
//        assertEquals(2, city.compareTo(mockCity()));
    }


}

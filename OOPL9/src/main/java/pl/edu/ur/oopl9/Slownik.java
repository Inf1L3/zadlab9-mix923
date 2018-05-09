/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.HashMap;

/**
 *
 * @author student
 */
public class Slownik {

    public Slownik() {
    }
    
    public String Szukaj_slowa(String slowo)
    {
        HashMap<String, String> myMap = new HashMap<String, String>();
        myMap.put("jeden", "one");
        myMap.put("dobry", "good");
        myMap.put("dwa", "two");
        myMap.put("piekny", "pretty");
        myMap.put("brzydki", "ugly");
        myMap.put("auto", "car");
        myMap.put("bus", "bus");
        myMap.put("zona", "wife");
        myMap.put("mama", "mam");
        myMap.put("osoba", "person");
        myMap.put("zachowany", "preserved");
        myMap.put("duzy", "big");
        myMap.put("maly", "small");
        myMap.put("wysoki", "tall");
        myMap.put("pilka", "ball");
        myMap.put("dom", "house");
        myMap.put("dom", "house");
        myMap.put("koniec!", "koniec!");
        
        return  myMap.get(slowo);
        
    }
}

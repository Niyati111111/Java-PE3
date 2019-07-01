package com.stackroute.PE3;

public class RemoveVowels {

    public String[] removeVowels(String[] places) {
        for (int i = 0; i < places.length; ++i) {
            places[i] = places[i].toLowerCase();
            for (int j = 0; j < places[i].length(); ++j) {
                if (places[i].charAt(j) == 'a' || places[i].charAt(j) == 'e' || places[i].charAt(j) == 'i' || places[i].charAt(j) == 'o' || places[i].charAt(j) == 'u') {
                    places[i] = places[i].replace("a", "");
                    places[i] = places[i].replace("e", "");
                    places[i] = places[i].replace("i", "");
                    places[i] = places[i].replace("o", "");
                    places[i] = places[i].replace("u", "");

                }
            }

        }
        return places;

    }

}

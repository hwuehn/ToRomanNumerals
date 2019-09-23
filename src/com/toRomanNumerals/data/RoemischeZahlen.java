package com.toRomanNumerals.data;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RoemischeZahlen {

    private int dezimalZahl = 0;
    private List<Integer> integerListe = new ArrayList<>();
    private List<String> stringListe = new ArrayList<>();
    private List<String> stringListeRoemischeZahlen = new ArrayList<>();

    public List<Integer> getIntegerListe() {
        return integerListe;
    }
    public List<String> getStringListe() {
        return stringListe;
    }

    public void pruefe(int dezimalZahl) {
        boolean erstelleIntListeAusDezimalZahl = false;
        System.out.println(dezimalZahl);

        while (dezimalZahl != 0) {
            erstelleIntListeAusDezimalZahl = (dezimalZahl >= 1000) ? integerListe.add(1000) :
                    (dezimalZahl >= 500 && dezimalZahl < 1000) ? integerListe.add(500) :
                            (dezimalZahl >= 100 && dezimalZahl < 500) ? integerListe.add(100) :
                                    (dezimalZahl >= 50 && dezimalZahl < 100) ? integerListe.add(50) :
                                            (dezimalZahl >= 10 && dezimalZahl < 50) ? integerListe.add(10) :
                                                    (dezimalZahl >= 5 && dezimalZahl < 10) ? integerListe.add(5) :
                                                            (dezimalZahl >= 1 && dezimalZahl < 5) ? integerListe.add(1) : false;


            dezimalZahl = (dezimalZahl >= 1000) ? dezimalZahl - 1000 :
                    (dezimalZahl >= 500 && dezimalZahl < 1000) ? dezimalZahl - 500 :
                            (dezimalZahl >= 100 && dezimalZahl < 500) ? dezimalZahl - 100 :
                                    (dezimalZahl >= 50 && dezimalZahl < 100) ? dezimalZahl - 50 :
                                            (dezimalZahl >= 10 && dezimalZahl < 50) ? dezimalZahl - 10 :
                                                    (dezimalZahl >= 5 && dezimalZahl < 10) ? dezimalZahl - 5 :
                                                            (dezimalZahl >= 1 && dezimalZahl < 5) ? dezimalZahl - 1 : dezimalZahl;
        }
    }

    public void parseIntegerListToStringList(List<Integer> integerListe) {
        for (Integer e : integerListe) {
            stringListe.add(String.valueOf(e));
        }
    }

    public void parseElementeStringListToRoemischeZahl(List<String> stringListe) {
        getStringListe().stream().map(e -> e
                        .replace("1000","M")
                        .replace("500","D")
                        .replace("100","C")
                        .replace("50","L")
                        .replace("10", "X")
                        .replace("5","V")
                        .replace("1", "I")).forEach(System.out::print);
    }

}

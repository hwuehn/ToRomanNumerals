package com.toRomanNumerals;

import com.toRomanNumerals.data.RoemischeZahlen;

public class main {

    public static void main(String[] args) {
        RoemischeZahlen test = new RoemischeZahlen();
        test.pruefe(2013);
        test.getIntegerListe();
        test.parseIntegerListToStringList(test.getIntegerListe());
        test.parseElementeStringListToRoemischeZahl(test.getStringListe());
    }
}

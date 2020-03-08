package pl.sda.gporlowski.structures;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Osoba implements Comparable<Osoba>{
    private String imie;
    private String nazwisko;
    private int wiek;

    @Override
    public int compareTo(Osoba osoba) {
        return Integer.compare(wiek, osoba.getWiek());
    }
}

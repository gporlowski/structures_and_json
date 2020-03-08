package pl.sda.gporlowski.structures;

import java.util.*;

public class App {
    public static void main(String[] args) {

//        List<Osoba> list = new ArrayList<>(Arrays.asList(
//                new Osoba("A0", "B0", 20),
//                new Osoba("A1", "B1", 22),
//                new Osoba("A2", "B2", 28),
//                new Osoba("A3", "B3", 18),
//                new Osoba("A4", "B4", 75),
//                new Osoba("A5", "B5", 31),
//                new Osoba("A6", "B6", 13),
//                new Osoba("A7", "B7", 10),
//                new Osoba("A8", "B8", 21)
//        ));
//
//        list.forEach(System.out::println);
//        System.out.println();
//
//        Collections.sort(list);
//
//        list.forEach(System.out::println);

        List<OfertaSprzedazy> list = new ArrayList<>(Arrays.asList(
                new OfertaSprzedazy("Kompot", 2.3),
                new OfertaSprzedazy("Maslo", 2.0),
                new OfertaSprzedazy("Ser", 3.0),
                new OfertaSprzedazy("Bulka", 1.5)
        ));

        Scanner scanner = new Scanner(System.in);

        String komenda;
        do {
            System.out.print("Podaj komendę: ");
            komenda = scanner.nextLine();

            if (komenda.equalsIgnoreCase("listuj")) {
                list.forEach(System.out::println);
                System.out.println();
            } else if (komenda.equalsIgnoreCase("sortuj malejaco")){
                Collections.sort(list, new OfertaComparator(true));
            } else if (komenda.equalsIgnoreCase("sortuj rosnaco")){
                Collections.sort(list, new OfertaComparator(false));
            } else if (komenda.startsWith("dodaj")) {
                String[] slowa = komenda.split(" ");
                String nazwa = slowa[1];
                Double cena = Double.parseDouble(slowa[2]);

                OfertaSprzedazy ofertaSprzedazy = new OfertaSprzedazy(nazwa, cena);
                list.add(ofertaSprzedazy);
                System.out.println("Dodano: " + ofertaSprzedazy);
            } else if (!komenda.equalsIgnoreCase("quit")) {
                System.err.println("Nie rozpoznalem komendy");
            }
        } while (!komenda.equalsIgnoreCase("quit"));
    }
}
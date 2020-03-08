package pl.sda.gporlowski.structures;

import java.util.Comparator;

public class OfertaComparator implements Comparator<OfertaSprzedazy> {
    private boolean malejaco;

    public OfertaComparator(boolean malejaco) {
        this.malejaco = malejaco;
    }

    @Override
    public int compare(OfertaSprzedazy o1, OfertaSprzedazy o2) {
        if(malejaco) {
            return Double.compare(o2.getCena(), o1.getCena());
        } else {
            return Double.compare(o1.getCena(), o2.getCena());
        }
    }
}

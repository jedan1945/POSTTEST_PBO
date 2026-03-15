package yugioh;

import java.util.ArrayList;

public class Deck {

    private String namaDeck;
    protected ArrayList<Kartu> kartuDeck = new ArrayList<>();

    public Deck(String namaDeck) {
        this.namaDeck = namaDeck;
    }

    public String getNamaDeck() {
        return namaDeck;
    }

    public void setNamaDeck(String namaDeck) {
        this.namaDeck = namaDeck;
    }

    public void tambahKartu(Kartu kartu) {
        kartuDeck.add(kartu);
    }

    public void tampilkanDeck() {
        System.out.println("Deck : " + namaDeck);
        for (Kartu k : kartuDeck) {
            k.tampilkan();
        }
    }
}
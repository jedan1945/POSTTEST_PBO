package yugioh;

import java.util.ArrayList;

public class Deck {

    String namaDeck;
    ArrayList<Kartu> kartuDeck = new ArrayList<>();

    public Deck(String namaDeck) {
        this.namaDeck = namaDeck;
    }

    void tambahKartu(Kartu kartu) {
        kartuDeck.add(kartu);
    }

    void tampilkanDeck() {
        System.out.println("Deck : " + namaDeck);
        for (Kartu k : kartuDeck) {
            k.tampilkan();
        }
    }
}
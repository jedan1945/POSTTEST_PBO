package yugioh;

public class Kartu {

    String nama;
    String tipe;
    int attack;
    int defense;

    public Kartu(String nama, String tipe, int attack, int defense) {
        this.nama = nama;
        this.tipe = tipe;
        this.attack = attack;
        this.defense = defense;
    }

    void tampilkan() {
        System.out.println("Nama Kartu : " + nama);
        System.out.println("Tipe       : " + tipe);
        System.out.println("Attack     : " + attack);
        System.out.println("Defense    : " + defense);
        System.out.println("---------------------------");
    }
}
package yugioh;

public class Player {

    String nama;
    int level;

    public Player(String nama, int level) {
        this.nama = nama;
        this.level = level;
    }

    void tampilkan() {
        System.out.println("Nama Player : " + nama);
        System.out.println("Level       : " + level);
    }
}
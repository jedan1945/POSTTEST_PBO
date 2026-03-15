package yugioh;

public class Player {

    private String nama;
    private int level;

    public Player(String nama, int level) {
        this.nama = nama;
        this.level = level;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level >= 0) {
            this.level = level;
        }
    }

    public void tampilkan() {
        System.out.println("Nama Player : " + nama);
        System.out.println("Level       : " + level);
    }
}
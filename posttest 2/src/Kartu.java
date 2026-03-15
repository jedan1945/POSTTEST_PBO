package yugioh;

public class Kartu {

    private String nama;
    private String tipe;
    private int attack;
    private int defense;

    public Kartu(String nama, String tipe, int attack, int defense) {
        this.nama = nama;
        this.tipe = tipe;
        this.attack = attack;
        this.defense = defense;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        if (attack >= 0) {
            this.attack = attack;
        }
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        if (defense >= 0) {
            this.defense = defense;
        }
    }

    public void tampilkan() {
        System.out.println("Nama Kartu : " + nama);
        System.out.println("Tipe       : " + tipe);
        System.out.println("Attack     : " + attack);
        System.out.println("Defense    : " + defense);
        System.out.println("---------------------------");
    }
}
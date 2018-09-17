package ffadilaputra.org.dolanfragment;

public class Resep {
    private String nama_makanan;
    private String deskripsi;

    private Resep(String nama_makanan, String deskripsi) {
        this.nama_makanan = nama_makanan;
        this.deskripsi = deskripsi;
    }

    public static final Resep[] resep = {
            new Resep("Cilok", "Tepungnya dibakar eaa, dikasih terasi"),
            new Resep("Batako", "Tepung batubata,dicepit alus alus"),
            new Resep("Bakwan", "Tepung bakwan uleg"),
    };

    public String getNama_makanan() {
        return nama_makanan;
    }

    public void setNama_makanan(String nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String toString() {
        return this.nama_makanan;
    }
}

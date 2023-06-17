
public class MataKuliah {
    private String kode;
    private String nama;
    private int sks;

    public MataKuliah(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public MataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public int getSks() {
        return sks;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public String toString() {
        return String.format(
        """
                                DETAIL MATA KULIAH
                ---------------------------------------------------
                Nama Mata Kuliah : %s
                Kode Mata Kuliah : %s
                Sks              : %d
                ---------------------------------------------------
                """,
        nama, kode, sks);
    }
}

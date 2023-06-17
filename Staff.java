public class Staff extends Manusia implements Tugas {

    private String id;
    private String divisi;
    private String gaji;
    private String Gedung;
    final String tugas = "STAFF";
    public static String verifikasiStaff;

    Staff(String nama, String alamat, String kelamin, String noTelp, String goldar, String id, String divisi) {
        super(nama, alamat, kelamin, noTelp, goldar);
        this.id = id;
        this.divisi = divisi;
        this.gaji = "10000000";
        this.Gedung = "Gedung F"; 
    }

    public boolean isMatch(String nama, String id) {
        return this.getnama().equals(nama) && this.id.equals(id);
    }

    @Override
    protected void pekerjaan() {
        System.out.println("          Data Staff          ");
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getid() {
        return id;
    }

    public void setdivisi(String divisi) {
        this.divisi = divisi;
    }

    public String getdivisi() {
        return divisi;
    }

    public void setgaji(String gaji) {
        this.gaji = gaji;
    }

    public String getgaji() {
        return gaji;
    }

    public void setGedung(String Gedung) {
        this.Gedung = Gedung;
    }

    public String getGedung() {
        return Gedung;
    }

    public void validasiStaff() {
        System.out.println(" Anda adalah staff tidak tetap di Universitas Brawijaya");
    }

    public String toString() {
        return super.toString() + String.format(
            """
            \nID         : %s
            Divisi      : %s
            Gaji        : %s
            Gedung      : %s      
            """, 
            id,divisi, gaji,Gedung
        );
    }

    @Override
    public void TampilkanIdentitas() {
        System.out.println();
        System.out.println("=>> Identitas " + tugas);
        System.out.println();
        super.printData();
        System.out.printf("%-15s: %s\n", "ID Staff ", getid());
        System.out.printf("%-15s: %s\n", "Divisi ", getdivisi());
        System.out.printf("%-15s: %s\n", "Fakultas ", getgaji());
        System.out.printf("%-15s: %s\n", "Gedung ", getGedung());
        System.out.println();
    }

    @Override
    public void TampilkanTugas() {
        System.out.println("\n Tugas Staff yaitu:");
        
        System.out.println("1. Melaksanakan program kerja sesuai divisi");
        System.out.println("2. Membantu Dosen serta Mahasiswa dalam kegiatan pendidikan");
        System.out.println("3. Memberikan senyum sapa salam");
    }
}

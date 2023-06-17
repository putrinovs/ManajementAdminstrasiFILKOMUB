import java.util.ArrayList;


public class Mahasiswa extends Manusia implements Tugas {
    private String nim;
    private String prodi;
    private String fakultas;
    private String universitas;
    public static String verifikasiMahasiswa;
    public final String tugas = "MAHASISWA";
    private KRS krs;

    public Mahasiswa(String nama, String alamat, String kelamin, String noTelp, String goldar, String nim, String prodi) {
        super(nama, alamat, kelamin, noTelp, goldar);
        this.nim = nim;
        this.prodi = prodi;
        setFakultas("Ilmu Komputer");
        setUniversitas("Universitas Brawijaya");
    }

    public boolean isMatch(String nama, String nim) {
        return this.getnama().equals(nama) && this.nim.equals(nim);
    }

    @Override
    protected void pekerjaan() {
        System.out.println("        Data Mahasiswa        ");
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setUniversitas(String universitas) {
        this.universitas = universitas;
    }

    public String getUniversitas() {
        return universitas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getProdi() {
        return prodi;
    }

    public void statusKRS() {
        System.out.println("KRS telah disetujui, silahkan mendownload PDF KRS padalink berikut bit.ly/CetakKRS");
    }

    @Override
    public void TampilkanTugas() {
        System.out.println("\n Tugas Mahasiswa yaitu:");
        System.out.println("1. Melaksanakan Kegiatan Pendidikan");
        System.out.println("2. Mengabdi ke Masyarakat");
        System.out.println("3. Mengerjakan Tugas Tepat Waktu");

    }

    public void TampilkanTugas(ArrayList<String> daftarTugas) {
        for (int i = 0; i < daftarTugas.size(); i++) {
            System.out.println(i + "" + daftarTugas);
        }
    }

    public String toString() {
        return super.toString() + String.format(
            """
            \nNIM         : %s
            Prodi       : %s
            Fakultas    : %s
            Universitas : %s      
            """, 
            nim,prodi,fakultas,universitas
        );
    }

    public void tambah(MataKuliah mk)  {
        krs.tambahMataKuliah(mk);
    }

    @Override
    public void TampilkanIdentitas() {
        System.out.println();
        System.out.println("=>> Identitas " + tugas);
        System.out.println();
        super.printData();
        System.out.printf("%-15s: %s\n", "NIM ", getNim());
        System.out.printf("%-15s: %s\n", "Universitas ", getUniversitas());
        System.out.printf("%-15s: %s\n", "Fakultas ", getFakultas());
        System.out.printf("%-15s: %s\n", "Prodi ", getProdi());
        System.out.println();
    }

}

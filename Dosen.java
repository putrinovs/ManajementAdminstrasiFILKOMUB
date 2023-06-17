import java.util.ArrayList;

class Dosen extends Manusia implements Tugas{
    private String nip;
    private String matkul;
    private String fakultas;
    private String ruangan;
    public final String tugas = "DOSEN";
    public static String verifikasiDosen;

    
    public Dosen(String nama, String alamat, String kelamin, String noTelp,
    String goldar, String nip, String matkul, String fakultas, String ruangan){
        super(nama, alamat, kelamin, noTelp, goldar);
        this.nip= nip;
        this.matkul= matkul;
        this.fakultas = fakultas;
        this.ruangan = ruangan;
    }

    public boolean isMatch(String nama, String nip) {
        return this.getnama().equals(nama) && this.nip.equals(nip);
    }

    @Override
    protected void pekerjaan() {
        System.out.println("          Data Dosen          ");
    }

    public void setNip(String nip){
    this.nip = nip;
    }
    public String getNip(){
    return nip;
    }

    public void setMatkul(String matkul){
        this.matkul = matkul;
    }
    public String getMatkul(){
        return matkul;
    }
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }
    public String getFakultas(){
        return fakultas;
    }
    public void setRuangan(String ruangan){
        this.ruangan = ruangan;
    }
    public String getRuangan(){
        return ruangan;
    }

    public String toString() {
        return super.toString() + String.format(
            """
            \nNIP         : %s
            Matkul       : %s
            Fakultas     : %s
            Ruangan      : %s      
            """, 
            nip,matkul,fakultas,ruangan
        );
    }
    
    @Override
    public void TampilkanTugas() {
        System.out.println("\n Tugas Dosen yaitu :");
        System.out.println("1. Melakukan Penelitian");
        System.out.println("2. Melaksanakan Kegiatan Pembelajaran");
        System.out.println("3. Melaksanakan serta Merencakana Proses Pembelajaran");
    }

    public void TampilkanTugas(ArrayList<String> daftarTugas) {
        for (int i = 0; i < daftarTugas.size(); i++) {
            System.out.println(i + "" + daftarTugas);
        }
    }

    @Override
    public void TampilkanIdentitas() {
        System.out.println();
        System.out.println("=>> Identitas " + tugas);
        System.out.println();
        super.printData();
        System.out.printf("%-15s: %s\n", "NIP ", getNip());
        System.out.printf("%-15s: %s\n", "Mata Kuliah ", getMatkul());
        System.out.printf("%-15s: %s\n", "Fakultas ", getFakultas());
        System.out.printf("%-15s: %s\n", "Ruangan ", getRuangan());
        System.out.println();
    }
    
}

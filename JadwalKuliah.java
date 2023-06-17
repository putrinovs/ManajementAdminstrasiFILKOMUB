public class JadwalKuliah {
    private Dosen pengajar;
    private MataKuliah matkul;
    private String ruang;
    private String waktu;
    
    
    public JadwalKuliah(Dosen pengajar, MataKuliah matkul, String ruang, String waktu) {
        this.pengajar = pengajar;
        this.matkul = matkul;
        this.ruang = ruang;
        this.waktu = waktu;
    }

    public boolean isMatch(String ruang, String waktu) {
        return this.ruang.equals(ruang) && this.waktu.equals(waktu);
    }

    public Dosen getPengajar() {
        return pengajar;
    }
    
    public void setPengajar(Dosen pengajar) {
        this.pengajar = pengajar;
    }
    
    public MataKuliah getMatkul() {
        return matkul;
    }
    
    public void setMatkul(MataKuliah matkul) {
        this.matkul = matkul;
    }
    
    public String getRuang() {
        return ruang;
    }
    
    public void setRuang(String ruang) {
        this.ruang = ruang;
    }
    
    public String getWaktu() {
        return waktu;
    }
    
    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String toString() {
        return String.format
        (
        """
        Detail Dosen
        %s
        ------------------
        Detail Matkul
        %s
        ------------------
        Ruang : %s
        Waktu : %s        
        """,pengajar, matkul, ruang, waktu
            );
    }
}

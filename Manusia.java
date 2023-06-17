public abstract class Manusia {
    private String nama;
    private String alamat;
    private String kelamin;
    private String noTelp;
    private String goldar;

    public Manusia(String nama, String alamat, String kelamin, String noTelp, String goldar) {
        this.nama = nama;
        this.alamat = alamat;
        this.kelamin = kelamin;
        this.noTelp = noTelp;
        this.goldar = goldar;
    }

    protected abstract void pekerjaan();

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getnama() {
        return nama;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    public String getalamat() {
        return alamat;
    }

    public void setkelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    public String getkelamin() {
        return kelamin;
    }

    public void setnoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getnoTelpn() {
        return noTelp;
    }

    public void setgoldar(String goldar) {
        this.goldar = goldar;
    }

    public String getgoldar() {
        return goldar;
    }

    public void printData() {
        System.out.printf("%-15s: %s\n", "Nama ", getnama());
        System.out.printf("%-15s: %s\n", "Alamat ", getalamat());
        System.out.printf("%-15s: %s\n", "Kelamin ", getkelamin());
        System.out.printf("%-15s: %s\n", "No Telepon ", getnoTelpn());
        System.out.printf("%-15s: %s\n", "Golongan Darah ", getgoldar());
    }

    public String toString() {
        return String.format(
            """
            Nama           : %s
            Alamat         : %s
            Kelamin        : %s
            No Telp        : %s
            Golongan Darah : %s     
            """,
            nama, alamat, kelamin, noTelp, goldar
        );
    }

}

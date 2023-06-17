import java.util.ArrayList;

public class KRS {
    private ArrayList<MataKuliah> Matkul;

    public KRS() {
        Matkul = new ArrayList<>();
    }

    public void tambahMataKuliah(MataKuliah mataKuliah) {
        Matkul.add(mataKuliah);
    }

    public void print() {
        for (MataKuliah mk : Matkul) {
            System.out.println(mk);
        }
    }
}

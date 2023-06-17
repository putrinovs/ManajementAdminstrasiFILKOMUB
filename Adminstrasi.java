import java.util.ArrayList;
import java.util.Scanner;

public class Adminstrasi {
    private static Scanner in = new Scanner(System.in);
    private static ArrayList<MataKuliah> dataMatkul;
    private static ArrayList<JadwalKuliah> dataJadwal;
    private static ArrayList<Mahasiswa> dataMahasiswa;
    private static ArrayList<Dosen> dataDosen;
    private static ArrayList<Staff> dataStaff;

    public static void init() {
        dataDosen = new ArrayList<>();
        dataStaff = new ArrayList<>();
        dataMahasiswa = new ArrayList<>();
        dataMatkul = new ArrayList<>();
        dataMatkul.add(new MataKuliah("CIE62006", "Teori Belajar dan Pembelajaran", 3));
        dataMatkul.add(new MataKuliah("COM60015", "Matematika Komputasi", 3));
        dataMatkul.add(new MataKuliah("CIE62004", "Pemrograman Berorientasi Objek", 3));
        dataMatkul.add(new MataKuliah("CIE62007", "Statistika Dasar", 3));
        dataMatkul.add(new MataKuliah("CIE61010", "Algoritma dan Struktur Data", 3));
        dataMatkul.add(new MataKuliah("CIE61011", "Desain Database dan SQL", 3));
        dataMatkul.add(new MataKuliah("CIE61012", "Sains Data Dasar", 3));
        dataMatkul.add(new MataKuliah("CIE61014", "Sistem Informasi dan Proses Bisnis", 2));
        dataMatkul.add(new MataKuliah("CIE61013", "Dasar Desain Antarmuka Pengguna", 3));
        dataMatkul.add(new MataKuliah("CIE62016", "Jaringan Komputer", 3));
        dataMatkul.add(new MataKuliah("CIE62017", "Pemrograman Web", 3));

    }

    public static void run() {
        init();
        System.out.println("=".repeat(40));
        System.out.println("SISTEM TUGAS SEMANGAT PBO");
        System.out.println("Putri Nov Syawulandari");
        System.out.println("=".repeat(40));

        char c = 'y', choice1, choice2;
        do {
            System.out.println("=".repeat(40));
            System.out.println("Pilih pilihan");
            System.out.println("=".repeat(40));
            System.out.println("1. Print Data");
            System.out.println("2. Register Data");
            System.out.println("3. Update Data");
            System.out.println("4. Delete Data");
            System.out.print("Masukkan pilihan : ");
            choice1 = in.nextLine().charAt(0);
            System.out.println("Pilih sesuai pekerjaan");
            System.out.println("-".repeat(40));
            System.out.println("Pilih Data yang ingin dikelola :");
            System.out.println("1. Mahasiswa");
            System.out.println("2. Dosen");
            System.out.println("3. Staff");
            System.out.println("4. All");
            System.out.println("5. Jadwal Kuliah");
            System.out.print("Pilihan : ");
            choice2 = in.nextLine().charAt(0);
            switchHandler(choice1, choice2);
            System.out.print("Apakah masih ingin menggunakan program (y/n) : ");
            c = in.nextLine().charAt(0);
        } while (c == 'y');
    }

    public static void switchHandler(char choice1, char choice2) {
        switch (choice1) {
            case '1':
                switch (choice2) {
                    case '1':
                        printMahasiswa();
                        break;
                    case '2':
                        printDosen();
                        break;
                    case '3':
                        printStaff();
                        break;
                    case '4':
                        printAll();
                        break;
                    case '5':
                        printJadwalKuliah();
                    default:
                        System.out.println("Manusia tidak bisa dimasukkan");
                }
                break;
            case '2':
                switch (choice2) {
                    case '1':
                        inputDataMahasiswa();
                        break;
                    case '2':
                        inputDataDosen();
                        break;
                    case '3':
                        inputDataStaff();
                        break;
                    case '5':
                        inputDataJadwal();
                    default:
                        System.out.println("Data all tidak bisa dimasukkan");

                }
                break;
            
            default:
                System.out.println("Tidak ada pilihan");
        }
    }

    public static void insert(Dosen dosen) {
        dataDosen.add(dosen);
        
    }

    public static void insert(Mahasiswa mahasiswa) {
        dataMahasiswa.add(mahasiswa);
        
    }

    public static void insert(Staff staff) {
        dataStaff.add(staff);
        
    }

    public static void inputDataDosen() {
        String nama, alamat, kelamin, noTelp, goldar, nip, matkul, fakultas, ruangan;
        System.out.print("Masukkan nama        : ");
        nama = in.nextLine();
        System.out.print("Masukkan alamat      : ");
        alamat = in.nextLine();
        System.out.print("Masukkan kelamin     : ");
        kelamin = in.nextLine();
        System.out.print("Masukkan no. telepon : ");
        noTelp = in.nextLine();
        System.out.print("Masukkan goldar      : ");
        goldar = in.nextLine();
        System.out.print("Masukkan nip         : ");
        nip = in.nextLine();
        System.out.print("Masukkan matkul      : ");
        matkul = in.nextLine();
        System.out.print("Masukkan fakultas      : ");
        fakultas = in.nextLine();
        System.out.print("Masukkan ruangan      : ");
        ruangan = in.nextLine();

        insert(new Dosen(nama, alamat, kelamin, noTelp, goldar, nip, matkul,fakultas,ruangan));
        System.out.println("Data sudah masuk!");
    }

    public static void inputDataMahasiswa() {
        String nama, alamat, kelamin, noTelp, goldar, nim, prodi;
        System.out.print("Masukkan nama        : ");
        nama = in.nextLine();
        System.out.print("Masukkan alamat      : ");
        alamat = in.nextLine();
        System.out.print("Masukkan kelamin     : ");
        kelamin = in.nextLine();
        System.out.print("Masukkan no. telepon : ");
        noTelp = in.nextLine();
        System.out.print("Masukkan goldar      : ");
        goldar = in.nextLine();
        System.out.print("Masukkan nim         : ");
        nim = in.nextLine();
        System.out.print("Masukkan prodi       : ");
        prodi = in.nextLine();

        insert(new Mahasiswa(nama, alamat, kelamin, noTelp, goldar, nim, prodi));
        dataMahasiswa.get(dataMahasiswa.size() - 1).tambah(dataMatkul.get(0));
        dataMahasiswa.get(dataMahasiswa.size() - 1).tambah(dataMatkul.get(1));
        dataMahasiswa.get(dataMahasiswa.size() - 1).tambah(dataMatkul.get(2));
        dataMahasiswa.get(dataMahasiswa.size() - 1).tambah(dataMatkul.get(3));
        dataMahasiswa.get(dataMahasiswa.size() - 1).tambah(dataMatkul.get(4));
        System.out.println("Data sudah masuk!");
    }

    public static void inputDataStaff() {
        String nama, alamat, kelamin, noTelp, goldar, id, divisi;
        System.out.print("Masukkan nama        : ");
        nama = in.nextLine();
        System.out.print("Masukkan alamat      : ");
        alamat = in.nextLine();
        System.out.print("Masukkan kelamin     : ");
        kelamin = in.nextLine();
        System.out.print("Masukkan no. telepon : ");
        noTelp = in.nextLine();
        System.out.print("Masukkan goldar      : ");
        goldar = in.nextLine();
        System.out.print("Masukkan id          : ");
        id = in.nextLine();
        System.out.print("Masukkan divisi      : ");
        divisi = in.nextLine();

        insert(new Staff(nama, alamat, kelamin, noTelp, goldar, id, divisi));
        System.out.println("Data sudah masuk!");
    }

    public static void inputDataJadwal() {
        printDosen();
        System.out.print("Pilih Dosen :");
        int input = in.nextInt(); in.nextLine();
        if (input < 0 || input >= dataDosen.size()) {
            System.out.println("Tidak ada data yang cocok");
            return;
        }
        Dosen dosen = dataDosen.get(input);
        printMataKuliah();
        System.out.print("Pilih Mata Kuliah : ");
        input = in.nextInt(); in.nextLine();
        if (input < 0 || input >= dataMatkul.size()) {
            System.out.println("Tidak ada data yang cocok");
            return;
        }
        MataKuliah matkul = dataMatkul.get(input);
        String ruang, waktu;
        boolean bentrok = true;
        do {
            System.out.print("Masukkan data ruang : ");
            ruang = in.nextLine();
            System.out.print("Masukkan data waktu : ");
            waktu = in.nextLine();
    
            for (JadwalKuliah jadkul : dataJadwal) {
                if (jadkul.isMatch(ruang, waktu)) {
                    System.out.println("Jadwal kuliah bentrok");
                    bentrok = true;       
                    break;
                }
                bentrok = false;
            }

        } while (bentrok);
        dataJadwal.add(new JadwalKuliah(dosen, matkul, ruang, waktu));
        System.out.println("Data sudah masuk!");
    }

    public static void printAll() {
        System.out.println("=".repeat(40));
        System.out.println("Data Fakultas");
        System.out.println("=".repeat(40));
        ArrayList<Manusia> fakultas = new ArrayList<>();
        fakultas.addAll(dataDosen);
        fakultas.addAll(dataStaff);
        fakultas.addAll(dataMahasiswa);

        if (fakultas.size() == 0) {
            System.out.println("Tidak ada data");
            return;
        }

        int i = 0;
        for (Manusia manusia : fakultas) {
            System.out.println(i++ + ". " + manusia);
            System.out.println("-".repeat(40));
        }
    }

    public static void printDosen() {
        System.out.println("=".repeat(40));
        System.out.println("Data Dosen");
        System.out.println("=".repeat(40));

        if (dataDosen.size() == 0) {
            System.out.println("Tidak ada data");
            return;
        }
        
        int i = 0;
        for (Dosen dosen : dataDosen) {
            System.out.println(i++ + ". " + dosen);
            System.out.println("-".repeat(40));
        }
    }

    public static void printMahasiswa() {
        System.out.println("=".repeat(40));
        System.out.println("Data Mahasiswa");
        System.out.println("=".repeat(40));

        if (dataMahasiswa.size() == 0) {
            System.out.println("Tidak ada data");
            return;
        }

        int i = 0;
        for (Mahasiswa mahasiswa : dataMahasiswa) {
            System.out.println(i++ + ". " + mahasiswa);
            System.out.println("-".repeat(40));
        }
    }

    public static void printStaff() {
        System.out.println("=".repeat(40));
        System.out.println("Data Staff");
        System.out.println("=".repeat(40));

        if (dataStaff.size() == 0) {
            System.out.println("Tidak ada data");
            return;
        }

        int i = 0;
        for (Staff staff : dataStaff) {
            System.out.println(i++ + ". " + staff);
            System.out.println("-".repeat(40));
        }
    }

    public static void printJadwalKuliah() {
        System.out.println("=".repeat(40));
        System.out.println("Data Jadwal Kuliah");
        System.out.println("=".repeat(40));

        if (dataJadwal.size() == 0) {
            System.out.println("Tidak ada data");
            return;
        }

        int i = 0;
        for (JadwalKuliah jadkul : dataJadwal) {
            System.out.println(i++ + ". " + jadkul);
            System.out.println("-".repeat(40));
        }
    }

    public static void printMataKuliah() {
        System.out.println("=".repeat(40));
        System.out.println("Data Mata Kuliah");
        System.out.println("=".repeat(40));

        if (dataMatkul.size() == 0) {
            System.out.println("Tidak ada data");
            return;
        }

        int i = 0;
        for (MataKuliah matkul : dataMatkul) {
            System.out.println(i++ + ". " + matkul);
            System.out.println("-".repeat(40));
        }
    }
}

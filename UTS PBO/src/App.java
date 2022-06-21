import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static int getIndexFromMataKuliah(ArrayList<Matakuliah> array, String kode_matKul) {
        int index = 0;
        for (Matakuliah matakuliah : array) {
            if (matakuliah.getKode_matakuliah().equals(kode_matKul)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static int getIndexFromMahasiswa(ArrayList<mahasiswa> array, String studentID) {
        int index = 0;
        for (mahasiswa mhs : array) {
            if (mhs.getStudentID().equals(studentID)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static int getIndexFromTerm(ArrayList<term> array, String semester) {
        int index = 0;
        for (term Term : array) {
            if (Term.getKode_term().equals(semester)) {
                return index;
            }
            index++;
        }
        return -1;
    } 

    public static void clearScreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    } 


    public static ArrayList<mahasiswa> initMahasiswa(ArrayList<mahasiswa> Mahasiswa){
        mahasiswa mhs1 = new mahasiswa("SI#1", "A", "Sistem Informasi", "2021");
        Mahasiswa.add(mhs1);
        mahasiswa mhs2 = new mahasiswa("SI#2", "B", "Sistem Informasi", "2021");
        Mahasiswa.add(mhs2);
        mahasiswa mhs3 = new mahasiswa("SI#3", "C", "Sistem Informasi", "2021");
        Mahasiswa.add(mhs3);
        return Mahasiswa;
    }

    public static ArrayList<term> initTerm(ArrayList<term> Term){
        term term1 = new term("T1", "2021", "1", "Periode 2021/2022", "Semester Ganjil");
        Term.add(term1);
        term term2 = new term("T2", "2021", "2", "Periode 2021/2022", "Semester Genap");
        Term.add(term2);
        term term3 = new term("T3", "2021", "3", "Periode 2021/2022", "Semester Akselerasi");
        Term.add(term3);
        return Term;
    }

    public static ArrayList<Matakuliah> initMataKuliah(ArrayList<Matakuliah> matKul) {
        Matakuliah matKul1 = new Matakuliah("MD", "Matematika Diskrit", 4);
        matKul.add(matKul1);
        Matakuliah matKul2 = new Matakuliah("BI", "Bahasa Indonesia", 2);
        matKul.add(matKul2);
        Matakuliah matKul3 = new Matakuliah("WR", "World Religion", 3);
        matKul.add(matKul3);
        return matKul;
    }

    public static void main(String[] args) throws Exception {
        ArrayList<term> Term = new ArrayList<term>();
        ArrayList<Matakuliah> matakuliah = new ArrayList<Matakuliah>();
        ArrayList<mahasiswa> mhs = new ArrayList<mahasiswa>();
        
        initMahasiswa(mhs);
        initTerm(Term);
        initMataKuliah(matakuliah);


        Scanner keyboard = new Scanner(System.in);
        String yn = "y";
        while(yn.equalsIgnoreCase("y")){
            clearScreen();
            System.out.println("                      UTS PBO                      ");
            System.out.println("---------------------------------------------------");
            System.out.println("1. Input/Cetak Mata Kuliah");
            System.out.println("2. Input/Cetak Data Mahasiswa");
            System.out.println("3. Input/Cetak Data Term/Semester");
            System.out.println("4. Input/Cetak Data KHS (Overall)");
            System.out.println("5. Input/Cetak Data Detail KHS (MatKul)");
            System.out.println("6. Cetak IPK (sementara) Mahasiswa");
            System.out.println("7. Cetak Transkrip (sementara) Mahasiswa");
            System.out.println("8. Keluar");
            System.out.print("Pilihan Anda [1/2/3/4/5/6/7/8] ? ");
            String pilihan = keyboard.next();
            
            clearScreen();
            if (pilihan.equals("1")) {
                System.out.println("Data Mata Kuliah");
                System.out.println("----------------");
                System.out.println("1. Input");
                System.out.println("2. Cetak Mata Kuliah (Kode MatKul)");
                System.out.println("3. Cetak Semua Mata Kuliah");
                System.out.print("Pilihan Anda [1/2] ? ");
                String opsi = keyboard.next();

                clearScreen();
                if (opsi.equals("1")) {
                    System.out.println("Input Mata Kuliah Baru");
                    System.out.println("----------------------");
                    System.out.print("Masukkan kode mata kuliah : ");
                    String kodeMatKul = keyboard.nextLine();
                    kodeMatKul+=keyboard.nextLine();
                    System.out.print("Masukkan nama mata kuliah : ");
                    String namaMatKul = keyboard.nextLine();
                    System.out.print("Masukkan jumlah sks       : ");
                    int sksMatKul = keyboard.nextInt();
                    matakuliah.add(new Matakuliah(kodeMatKul, namaMatKul, sksMatKul));
                }
                else if (opsi.equals("2")) {
                    System.out.println("Cetak Mata Kuliah");
                    System.out.println("-----------------");
                    System.out.print("Masukkan kode mata kuliah : ");
                    String kode = keyboard.next();
                    if (matakuliah.size() > 0) {
                        int idx = getIndexFromMataKuliah(matakuliah, kode);
                        if (idx == -1) {
                            System.out.println("Kode yang Anda masukkan invalid..");
                        }
                        else {
                            clearScreen();
                            System.out.println("Data Mata Kuliah");
                            System.out.println("----------------");
                            System.out.println("Nama  : " + matakuliah.get(idx).getNama_matakuliah());
                            System.out.println("Sks   : " + matakuliah.get(idx).getSks());
                        }
                    }
                    else {
                        System.out.println("Tidak ada data mata kuliah yang ditemukan..");
                    }
                }
                else if (opsi.equals("3")) {
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("\t\t\tData Mata Kuliah");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Kode MatKul\t\tNama MatKul\t\tSks");
                    System.out.println("----------------------------------------------------------------");
                    for (Matakuliah matKul : matakuliah) {
                        matKul.tampilkanDataMataKuliah();
                    }
                    System.out.println("----------------------------------------------------------------");
                }
                else {
                    System.out.println("Pilihan tidak tersedia..");
                }
            }

            else if(pilihan.equals("2")) {
                System.out.println("Data Mahasiswa");
                System.out.println("--------------");
                System.out.println("1. Input");
                System.out.println("2. Cetak Mahasiswa (studentID)");
                System.out.println("3. Cetak Semua Data Mahasiswa");
                System.out.print("Pilihan Anda [1/2/3] ? ");
                String opsi = keyboard.next();

                clearScreen();
                if (opsi.equals("1")) {
                    System.out.println("Input Mahasiswa Baru");
                    System.out.println("--------------------");
                    System.out.print("Masukkan studentID      : ");
                    String studentID = keyboard.next();
                    System.out.print("Masukkan nama mahasiswa : ");
                    String namaMhsString = keyboard.nextLine();
                    namaMhsString += keyboard.nextLine();
                    System.out.print("Masukkan jurusan        : ");
                    String jurusanMhs = keyboard.nextLine();
                    System.out.print("Masukkan tahun masuk    : ");
                    String tahunmasuk = keyboard.nextLine();
                    mhs.add(new mahasiswa( studentID, namaMhsString,  jurusanMhs, tahunmasuk ));
                }
                else if (opsi.equals("2")) {
                    System.out.println("Cetak Data Mahasiswa");
                    System.out.println("--------------------");
                    System.out.print("Masukkan studentID : ");
                    String studentID = keyboard.next();
                    if (mhs.size()>0) {
                        int idx = getIndexFromMahasiswa(mhs, studentID);
                        if (idx == -1) {
                            System.out.println("Kode yang Anda masukkan invalid..");
                        }
                        else {
                            clearScreen();
                            System.out.println("Data Mahasiswa");
                            System.out.println("--------------");
                            System.out.println("Nama          : " + mhs.get(idx).getNama());
                            System.out.println("Jurusan       : " + mhs.get(idx).getJurusan());
                            System.out.println("Tahun masuk   : " + mhs.get(idx).getTahunmasuk());
                        }
                    }
                    else {
                        System.out.println("Tidak ada data yang ditemukan..");
                    }
                }
                else if (opsi.equals("3")) {
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("\t\t\tData Mahasiswa");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("StudentID\tNama\t\tJurusan\t\tTahun Masuk");
                    System.out.println("-------------------------------------------------------------------");  
                    for (mahasiswa Mahasiswa : mhs) {
                        Mahasiswa.tampilDataMahasiswa();
                    }       
                }
                else {
                    System.out.println("Pilihan tidak tersedia..");
                }
            }

            else if (pilihan.equals("3")) {
                System.out.println("Data Term/Semester");
                System.out.println("------------------");
                System.out.println("1. Input");
                System.out.println("2. Cetak");
                System.out.print("Pilihan Anda [1/2] ? ");
                String opsi = keyboard.next();

                clearScreen();
                if (opsi.equals("1")) {
                    System.out.println("Input Data Term/Semester Baru");
                    System.out.println("-----------------------------");
                    System.out.print("Masukkan kode term          : ");
                    String kodeTerm = keyboard.next();
                    System.out.print("Masukkan tahun ajaran       : ");
                    String tahunAjaran = keyboard.next();
                    System.out.print("Masukkan semester           : ");
                    String semester = keyboard.next();
                    System.out.print("Masukkan keterangan         : ");
                    String keterangan = keyboard.nextLine();
                    keterangan += keyboard.nextLine();
                    System.out.print("Masukkan keterangan singkat : ");
                    String keteranganSingkat = keyboard.nextLine();
                    Term.add(new term(kodeTerm, tahunAjaran, semester, keterangan, keteranganSingkat));
                }
                else if (opsi.equals("2")) {
                    System.out.println("Cetak Data Term/Semester");
                    System.out.println("--------------------");
                    System.out.print("Masukkan kode term : ");
                    String kodeTerm = keyboard.nextLine();
                    kodeTerm += keyboard.nextLine();
                    if (mhs.size()>0) {
                        int idx = getIndexFromTerm(Term, kodeTerm);
                        if (idx == -1) {
                            System.out.println("Kode yang Anda masukkan invalid..");
                        }
                        else {
                            Term.get(idx).tampilTerm();
                        }
                    }
                    else {
                        System.out.println("Tidak ada data yang ditemukan..");
                    }
                }
                else {
                    System.out.println("Pilihan tidak tersedia..");
                }
            }

            else if (pilihan.equals("4")) {
                System.out.println("Data Kartu hasil studi (KHS)");
                System.out.println("---------------------------");
                System.out.println("1. Input");
                System.out.println("2. Cetak");
                System.out.print("Pilihan Anda [1/2] ? ");
                String opsi = keyboard.next();

                clearScreen();
                if (opsi.equals("1")) {
                    System.out.println("Input Data KHS Baru");
                    System.out.println("-------------------");
                    System.out.print("Masukkan kode KHS     : ");
                    String kodeKHS = keyboard.next();
                    System.out.print("Masukkan studentID    : ");
                    String studentID = keyboard.next();
                    int index = getIndexFromMahasiswa(mhs, studentID);
                    if (index == -1) {
                        System.out.println("studentID yang Anda masukkan invalid..");
                    }
                    else {
                        System.out.print("Masukkan term/semester  : ");
                        String semester = keyboard.next();
                        int idx = getIndexFromTerm(Term, semester);
                        if (idx == -1) {
                            System.out.println("Kode term yang Anda masukkan invalid..");
                        }
                        else {
                            System.out.print("Masukkan keterangan  : ");
                            String keterangan = keyboard.next();
                            System.out.print("Masukkan keterangan singkat  : ");
                            String keteranganSingkat = keyboard.next();
                            mhs.get(index).Khs.add(new khs(kodeKHS, keterangan, keteranganSingkat, mhs.get(index), Term.get(idx)));
                        }
                    }
                }
                else if (opsi.equals("2")) {
                    System.out.println("Cetak Data KHS");
                    System.out.println("--------------");
                    System.out.print("Masukkan kode KHS : ");
                    String kodeKHS = keyboard.next();
                    boolean temu = false;
                    int idx = 0;
                    int index = 0;
                    for (mahasiswa mahasiswa1 : mhs) {
                        for (khs khs1 : mahasiswa1.getKhs()) {
                            if (khs1.getKode_khs().equalsIgnoreCase(kodeKHS)) {
                                temu = true;
                                if (mhs.get(index).Khs.get(idx).getKhsd().size() == 0) {
                                    System.out.println("\nTidak ada Detail KHS yang ditemukan..");
                                }
                                else {
                                    clearScreen();
                                    System.out.println("Data KHS");
                                    for (khsdetail khsDetail : mhs.get(index).Khs.get(idx).getKhsd()) {
                                        khsDetail.tampilkanDetailKHS();
                                    }
                                }
                                break;
                            }
                            idx++;
                        }
                        idx = 0;
                        index++;
                    }
                    if(temu == false){
                        System.out.println("Kode KHS yang Anda masukkan invalid..");
                    }
                }
                else {
                    System.out.println("Pilihan tidak tersedia..");
                }
            }

            else if (pilihan.equals("5")) {
                System.out.println("Data Detail KHS (MatKul)");
                System.out.println("------------------------");
                System.out.println("1. Input");
                System.out.println("2. Cetak");
                System.out.print("Pilihan Anda [1/2] ? ");
                String opsi = keyboard.next();

                clearScreen();
                if (opsi.equals("1")) {
                    System.out.println("Input Data Detail KHS Baru");
                    System.out.println("-----------------------------");
                    System.out.print("Masukkan kode detail KHS  : ");
                    String kodeDetailKHS = keyboard.nextLine();
                    kodeDetailKHS += keyboard.nextLine();
                    System.out.print("Masukkan kode KHS         : ");
                    String kodeKHS = keyboard.nextLine();

                    int idx = 0; // cari index array mahasiswa
                    int index = 0; // cari index array khs dalam mahasiswa
                    boolean temu = false;
                    for (mahasiswa mahasiswa2 : mhs) {
                        for (khs khs : mahasiswa2.getKhs()) {
                            if (khs.getKode_khs().equals(kodeKHS)) {
                                temu = true;
                                System.out.print("Masukkan kode mata kuliah : ");
                                String matKul = keyboard.nextLine();
                                int IDX = getIndexFromMataKuliah(matakuliah, matKul);
                                if (IDX != -1) {
                                    System.out.print("Masukkan nilai            : ");
                                    int nilai = keyboard.nextInt();
                                    mahasiswa Mahasiswa = mhs.get(idx);
                                    Mahasiswa.Khs.get(index).khsd.add(new khsdetail(kodeDetailKHS, kodeKHS, nilai, matakuliah.get(IDX) ));
                                }
                        else {
                            System.out.println("Kode mata kuliah yang Anda masukkan invalid..");
                        }
                                break;
                            }
                            index++;
                        }
                        index = 0;
                        idx++;
                    }
                    if(temu == false) {
                        System.out.println("Kode KHS yang Anda masukkan invalid..");
                    }
                }
                else if (opsi.equals("2")) {
                    System.out.println("Cetak Data Detail KHS");
                    System.out.println("---------------------");
                    System.out.print("Masukkan kode KHS : ");
                    String kodeKHS = keyboard.next();
                    boolean temu = false;
                    int idx = 0;
                    int index = 0;
                    for (mahasiswa mahasiswa2 : mhs) {
                        for (khs khs : mahasiswa2.getKhs()) {
                            if (khs.getKode_khs().equals(kodeKHS)) {
                                temu = true;
                                System.out.print("Masukkan kode detail KHS : ");
                                String kodeDetailKHS = keyboard.nextLine();
                                kodeDetailKHS += keyboard.nextLine();
                                boolean ketemu = false;
                                int Index = 0;
                                for (khsdetail khsDetail : mhs.get(index).Khs.get(idx).khsd) {
                                    if (khsDetail.kode_khs_detail.equals(kodeDetailKHS)) {
                                        ketemu = true;
                                        mhs.get(index).Khs.get(idx).khsd.get(Index).tampilkanDetailKHS();
                                    }
                                    Index++;
                                }
                                if(ketemu == false) {
                                    System.out.println("\nKode detail KHS yang Anda masukkan invalid..");
                                }
                                break;
                            }
                            idx++;
                        }
                        idx = 0;
                        index++;
                    }
                    if(temu == false) {
                        System.out.println("Kode KHS yang Anda masukkan invalid..");
                    }
                }
                else {
                    System.out.println("Pilihan tidak tersedia..");
                }
            }
            
            else if (pilihan.equals("6")) {
                System.out.println("IPK Sementara Mahasiswa");
                System.out.println("-----------------------");
                System.out.print("Masukkan studentID : ");
                String studentID = keyboard.next();
                int idx = getIndexFromMahasiswa(mhs, studentID);
                if (idx == -1) {
                    System.out.println("\nStudentID yang Anda masukkan invalid..");
                }
                else {
                    clearScreen();
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("\t\t  IPK Sementara Mahasiswa");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Nama          : " +  mhs.get(idx).getNama());
                    System.out.println("Student ID    : " +  mhs.get(idx).getStudentID());
                    System.out.println("Jurusan       : " + mhs.get(idx).getJurusan()); 
                    System.out.println("IPK sementara : " +  mhs.get(idx).getIPK());
                    System.out.println("----------------------------------------------------------------");
                }
            }

            else if (pilihan.equals("7")) {
                // kodematkul, matkul, sks, bobot, gradepoint
                System.out.println("Transkrip Nilai Mahasiswa");
                System.out.println("-------------------------");
                System.out.print("Masukkan studentID : ");
                String studentID = keyboard.next();
                int idx = getIndexFromMahasiswa(mhs, studentID);
                if (idx == -1) {
                    System.out.println("\nstudentID yang Anda masukkan invalid..");
                }
                else {
                    clearScreen();
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("\t\t  Transkrip Nilai Mahasiswa");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Nama        : " +  mhs.get(idx).getNama());
                    System.out.println("Student ID  : " +  mhs.get(idx).getStudentID());
                    System.out.println("Jurusan     : " +  mhs.get(idx).getJurusan());
                    System.out.println("----------------------------------------------------------------");
                    
                    if (mhs.get(idx).Khs.size() == 0) {
                        System.out.println("\nTidak ada KHS yang ditemukan..");
                    }
                    else {
                        System.out.println("Kode MatKul\tNama MatKul\tSks\tNilai\tAngka Kualitas");
                        System.out.println("----------------------------------------------------------------");
                        for (khs khs :mhs.get(idx).Khs) {
                            for (khsdetail khsDetail : khs.getKhsd()) {
                                System.out.println(khsDetail.getDetailMatakuliah().getKode_matakuliah() + "\t\t" 
                                + khsDetail.getDetailMatakuliah().getNama_matakuliah() + "\t"
                                + khsDetail.getDetailMatakuliah().getSks() + "\t" 
                                + khsDetail.gradeIPK() + "\t" 
                                + khsDetail.getDetailMatakuliah().getSks() *khsDetail.nilaiIPK());
                            }
                        }
                    }
                }
            }

            else if (pilihan.equals("8")) {
                break;
            }

            else {
                System.out.println("Pilihan tidak tersedia..");
            }

            System.out.print("\nKembali ke halaman utama [y/n] ? ");
            yn = keyboard.next();
        }

            clearScreen();
            System.out.println("\nTerima Kasih!\n");
            keyboard.close();
        }}
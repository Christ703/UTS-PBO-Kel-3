import java.util.ArrayList;

public class mahasiswa {
    private String studentID, nama, jurusan, tahunmasuk;
    public ArrayList<khs> Khs = new ArrayList<khs>();


    public mahasiswa(String studentID, String nama, String jurusan, String tahunmasuk) {
        this.studentID = studentID;
        this.nama = nama;
        this.jurusan = jurusan;
        this.tahunmasuk = tahunmasuk;
    }

    public mahasiswa() {
    }

    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return this.jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getTahunmasuk() {
        return this.tahunmasuk;
    }

    public void setTahun_masuk(String tahun_masuk) {
        this.tahunmasuk = tahun_masuk;
    }

    public ArrayList<khs> getKhs() {
        return this.Khs;
    }

    public void setKhs(ArrayList<khs> Khs) {
        this.Khs = Khs;
    }
    
    public khs getKhs(term Term){
        int idx=0;
        for (khs i : Khs) {
            if(i.getDetailTerm().getKode_term().equalsIgnoreCase(Term.getKode_term())){
                return Khs.get(idx);
            }
            idx += 1;
        }
        return null;
    }
    
    public double getIPKTerm(term Term) {
        for (khs i : Khs) {
            if(i.getDetailTerm().getKode_term().equalsIgnoreCase(Term.getKode_term())){
                return getKhs(Term).getIPSemester();
            }
        }
        return 0.0;
    }

    public double getIPK(){
        double total = 0;
        for (khs Khss : Khs) {
            total+=Khss.getIPSemester();
        }
        return total/Khs.size();
    }

    public void tampilDataMahasiswa() {
        System.out.println(studentID + "\t\t" + nama + "\t" + jurusan + "\t" + tahunmasuk);
    }
}
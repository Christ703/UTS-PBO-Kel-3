import java.util.ArrayList;

public class khs {
    private String kode_khs, keterangan, keterangan_singkat;
    private mahasiswa Mhs;
    private term Term;
    public ArrayList<khsdetail> khsd = new ArrayList<khsdetail>(); 

    public khs(String kode_khs, String keterangan, String keterangan_singkat, mahasiswa Mhs, term Term) {
        this.kode_khs = kode_khs;
        this.keterangan = keterangan;
        this.keterangan_singkat = keterangan_singkat;
        this.Mhs = Mhs;
        this.Term = Term;
    }


    public khs() {
    }
    

    public String getKode_khs() {
        return this.kode_khs;
    }

    public void setKode_khs(String kode_khs) {
        this.kode_khs = kode_khs;
    }

    public String getKeterangan() {
        return this.keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getKeterangan_singkat() {
        return this.keterangan_singkat;
    }

    public void setKeterangan_singkat(String keterangan_singkat) {
        this.keterangan_singkat = keterangan_singkat;
    }

    public mahasiswa getMhs() {
        return this.Mhs;
    }

    public void setMhs(mahasiswa Mhs) {
        this.Mhs = Mhs;
    }

    public term getTerm() {
        return this.Term;
    }

    public void setTerm(term Term) {
        this.Term = Term;
    }


    public ArrayList<khsdetail> getKhsd() {
        return this.khsd;
    }

    public void setKhsd(ArrayList<khsdetail> khsd) {
        this.khsd = khsd;
    }
    

    public void cetakDetailKHS() {
        System.out.println("Kartu Hasil Studi");
        System.out.println("-----------------");
        for (khsdetail khs_detail : khsd) {
            khs_detail.tampilkanDetailKHS();
        }
    }

    public term getDetailTerm(){
        return Term;
    }

    public double getIPSemester() {
        float sumNilai = 0.0f;
        float sumSKS = 0.0f;
        for (khsdetail x : khsd) {
            sumNilai+=x.nilaiIPK()*x.getDetailMatakuliah().getSks();
            sumSKS += x.getDetailMatakuliah().getSks();
        }
        return sumNilai/sumSKS;
    }
}

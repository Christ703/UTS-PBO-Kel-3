public class khsdetail {
    private String kode_khs;
    String kode_khs_detail;
    private int nilai;
    private Matakuliah matkul;


    public khsdetail(String kode_khs, String kode_khs_detail, int nilai, Matakuliah matkul) {
        this.kode_khs = kode_khs;
        this.kode_khs_detail = kode_khs_detail;
        this.nilai = nilai;
        this.matkul = matkul;
    }
    

    public khsdetail() {
    }

    public String getKode_khs() {
        return this.kode_khs;
    }

    public void setKode_khs(String kode_khs) {
        this.kode_khs = kode_khs;
    }

    public String getKode_khs_detail() {
        return this.kode_khs_detail;
    }

    public void setKode_khs_detail(String kode_khs_detail) {
        this.kode_khs_detail = kode_khs_detail;
    }

    public int getNilai() {
        return this.nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public Matakuliah getMatkul() {
        return this.matkul;
    }

    public void setMatkul(Matakuliah matkul) {
        this.matkul = matkul;
    }
    public float nilaiIPK(){
        if(nilai>=90 && nilai<=100){
            return 4.00f;
        }
		else if(nilai>=85 && nilai<=89.99){
            return 3.70f;
        }
        else if(nilai>=80 && nilai<=84.99){
            return 3.30f;
        } 
        else if (nilai >= 75 && nilai <= 79.99){
            return 3.00f;
        }
        else if(nilai>=70 && nilai<=74.99){
            return 2.70f;
        } 
        else if(nilai>=65 && nilai<=69.99){
            return 2.30f;
        } 
        else if (nilai >= 60 && nilai <= 64.99){
            return 2.00f;
        }
        else{
            return 0.0f;
        }
    }

    public String gradeIPK(){
        if(nilai>=90 && nilai<=100){
            return "A";
        }
		else if(nilai>=85 && nilai<=89.99){
            return "A-";
        }
        else if(nilai>=80 && nilai<=84.99){
            return "B+";
        } 
        else if(nilai>=75 && nilai<=79.99){
            return "B";
        }
        else if(nilai>=70 && nilai<=74.99){
            return "B-";
        } 
        else if(nilai>=65 && nilai<=69.99){
            return "C+";
        } 
        else if(nilai>=60 && nilai<=64.99){
            return "C";
        }
        else{
            return "F";
        }
    } 

    public Matakuliah getDetailMatakuliah(){
        return matkul;
    }
    
    public void tampilkanDetailKHS() {
        System.out.println("Kode KHS        : " + kode_khs);
        System.out.println("Kode KHS Detail : " + kode_khs_detail);
        System.out.println("Mata kuliah     : " + matkul.getNama_matakuliah());
        System.out.println("Nilai           : " + nilai);
    }    

}

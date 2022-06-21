public class term {
    private String kode_term, tahun_ajaran, semester, keterangan, keterangan_singkat;

    public term(String kode_term, String tahun_ajaran, String semester, String keterangan, String keterangan_singkat) {
        this.kode_term = kode_term;
        this.tahun_ajaran = tahun_ajaran;
        this.semester = semester;
        this.keterangan = keterangan;
        this.keterangan_singkat = keterangan_singkat;
    }
    

    public term() {
    }

    public String getKode_term() {
        return this.kode_term;
    }

    public void setKode_term(String kode_term) {
        this.kode_term = kode_term;
    }

    public String getTahun_ajaran() {
        return this.tahun_ajaran;
    }

    public void setTahun_ajaran(String tahun_ajaran) {
        this.tahun_ajaran = tahun_ajaran;
    }

    public String getSemester() {
        return this.semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
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
    public void tampilTerm() {
        System.out.println("Cetak Data Term");
        System.out.println("---------------");
        System.out.println("Tahun ajaran       : " + tahun_ajaran);
        System.out.println("Semester           : " + semester);
        System.out.println("Keterangan         : " + keterangan);
        System.out.println("Keterangan singkat : " + keterangan_singkat);
    }

}

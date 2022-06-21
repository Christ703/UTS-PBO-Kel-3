public class Matakuliah {
    private String kode_matakuliah, nama_matakuliah;
    private int sks;

    public Matakuliah(String kode_matakuliah, String nama_matakuliah, int sks) {
        this.kode_matakuliah = kode_matakuliah;
        this.nama_matakuliah = nama_matakuliah;
        this.sks = sks;
    }

    public Matakuliah() {
    }

    public String getKode_matakuliah() {
        return this.kode_matakuliah;
    }

    public void setKode_matakuliah(String kode_matakuliah) {
        this.kode_matakuliah = kode_matakuliah;
    }

    public String getNama_matakuliah() {
        return this.nama_matakuliah;
    }

    public void setNama_matakuliah(String nama_matakuliah) {
        this.nama_matakuliah = nama_matakuliah;
    }

    public int getSks() {
        return this.sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
    public void tampilkanDataMataKuliah() {
        System.out.println(kode_matakuliah + "\t\t\t" + nama_matakuliah + "\t\t" + sks);
    }

}
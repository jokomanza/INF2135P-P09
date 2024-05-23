package assignment;

public class Karyawan {

    private int nip;
    private String nama;
    private int gaji;
    private float lamaKerja;

    public Karyawan() {
    }

    public Karyawan(int nip, String nama, int gaji, float lamaKerja) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
        this.lamaKerja = lamaKerja;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public float getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(float lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    public float calculateBonus() {
        return (lamaKerja / 50) * gaji;
    }
}

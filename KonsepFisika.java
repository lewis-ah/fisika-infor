public abstract class KonsepFisika {
    protected String namaKonsep;
    protected String deskripsi;

    public KonsepFisika(String namaKonsep, String deskripsi) {
        this.namaKonsep = namaKonsep;
        this.deskripsi = deskripsi;
    }

    public void tampilkanInfo() {
        System.out.println("== " + namaKonsep + " ==");
        System.out.println(deskripsi + "\n");
    }

    public abstract void kalkulasi();
}
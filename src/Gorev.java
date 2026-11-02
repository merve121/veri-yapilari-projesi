public class Gorev {

    private int gorevId;
    private String gorevAdi;
    private String aciklama;
    private String durum;
    private int atananUyeId;

    public Gorev(int gorevId, String gorevAdi, String aciklama, String durum, int atananUyeId) {
        this.gorevId = gorevId;
        this.gorevAdi = gorevAdi;
        this.aciklama = aciklama;
        this.durum = durum;
        this.atananUyeId = atananUyeId;
    }

    public int getGorevId() {
        return gorevId;
    }

    public String getGorevAdi() {
        return gorevAdi;
    }

    public void setGorevAdi(String gorevAdi) {
        this.gorevAdi = gorevAdi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public int getAtananUyeId() {
        return atananUyeId;
    }

    public void setAtananUyeId(int atananUyeId) {
        this.atananUyeId = atananUyeId;
    }

    @Override
    public String toString() {
        return "Görev ID: " + gorevId +
               ", Görev Adı: " + gorevAdi +
               ", Açıklama: " + aciklama +
               ", Durum: " + durum +
               ", Atanan Üye ID: " + atananUyeId;
    }
}

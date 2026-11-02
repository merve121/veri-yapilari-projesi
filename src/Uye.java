

public class Uye {
    private int uyeNo;
    private String adSoyad;
    private int aktifGorevSayisi;
    private UygunlukDurumu uygunlukDurumu;

    public Uye(int uyeNo, String adSoyad) {
        this.uyeNo = uyeNo;
        this.adSoyad = adSoyad;
        this.aktifGorevSayisi = 0;
        this.uygunlukDurumu = UygunlukDurumu.UYGUN;
    }

    public int getUyeNo() { return uyeNo; }
    public String getAdSoyad() { return adSoyad; }
    public int getAktifGorevSayisi() { return aktifGorevSayisi; }
    public UygunlukDurumu getUygunlukDurumu() { return uygunlukDurumu; }

    public void setAdSoyad(String adSoyad) { this.adSoyad = adSoyad; }
    public void setUygunlukDurumu(UygunlukDurumu uygunlukDurumu) {
        this.uygunlukDurumu = uygunlukDurumu;
    }

    public void gorevArttir() {
        aktifGorevSayisi++;
    }

    @Override
    public String toString() {
        return "Üye No: " + uyeNo
                + " | Ad Soyad: " + adSoyad
                + " | Aktif Görev: " + aktifGorevSayisi
                + " | Durum: " + uygunlukDurumu;
    }
}

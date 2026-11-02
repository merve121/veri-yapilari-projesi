import java.util.ArrayList;
import java.util.HashMap;

public class GorevYonetimi {

    private ArrayList<Gorev> gorevler;
    private HashMap<Integer, Gorev> gorevHaritasi;

    public GorevYonetimi() {
        gorevler = new ArrayList<>();
        gorevHaritasi = new HashMap<>();
    }

    // Görev ekleme
    public void gorevEkle(Gorev gorev) {
        gorevler.add(gorev);
        gorevHaritasi.put(gorev.getGorevId(), gorev);
    }

    // Görev silme
    public void gorevSil(int id) {
        Gorev gorev = gorevHaritasi.remove(id);
        if (gorev != null) {
            gorevler.remove(gorev);
            System.out.println("Görev silindi.");
        } else {
            System.out.println("Görev bulunamadı.");
        }
    }

    // Görev güncelleme
    public void gorevGuncelle(int id, String yeniAd, String yeniAciklama) {
        Gorev gorev = gorevHaritasi.get(id);

        if (gorev != null) {
            gorev.setGorevAdi(yeniAd);
            gorev.setAciklama(yeniAciklama);
            System.out.println("Görev güncellendi.");
        } else {
            System.out.println("Görev bulunamadı.");
        }
    }

    // Görev listeleme
    public void gorevleriListele() {
        for (Gorev gorev : gorevler) {
            System.out.println(gorev);
        }
    }

    // Görev atama
    public void gorevAta(int gorevId, int uyeId) {
        Gorev gorev = gorevHaritasi.get(gorevId);

        if (gorev != null) {
            gorev.setAtananUyeId(uyeId);
            System.out.println("Görev üyeye atandı.");
        } else {
            System.out.println("Görev bulunamadı.");
        }
    }

    // ID ile görev bulma
    public Gorev gorevBul(int id) {
        return gorevHaritasi.get(id);
    }
}

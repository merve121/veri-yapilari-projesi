

import java.util.ArrayList;
import java.util.List;

public class UyeYonetimi {
    private ArrayList<Uye> uyeler = new ArrayList<>();

    public boolean uyeEkle(Uye uye) {
        if (uyeNoIleAra(uye.getUyeNo()) != null) {
            return false;
        }
        uyeler.add(uye);
        return true;
    }
 
    public List<Uye> uyeleriListele() {
        return new ArrayList<>(uyeler);
    }

    public Uye uyeNoIleAra(int uyeNo) {
        for (Uye uye : uyeler) {
            if (uye.getUyeNo() == uyeNo) {
                return uye;
            }
        }
        return null;
    }
}
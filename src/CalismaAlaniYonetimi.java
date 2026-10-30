import java.util.Arraylist;
import java.util.List;

public class CalismaAlaniYonetimi{
  private List<CalismaAlani> calismaAlanlari;
public CalismaAlaniYonetimi() {
  this.calismaAlanlari = new Arraylist<>();
}
  public void calismaAlaniEkle(CalismaAlani alan)   {
    if (alan != null) {
      calismaAlanlari.add(alan);
     }
  }
  public void calismaAlaniSil(int alanId) {
    calismaAlanlari.removeIf(alan -> alan.getAlanId() == alanId);
  } 
public void alanlariListele() {
  for (CalismaAlani alan : calismaAlanlari){
    System.out.println("alan ıd : " + alan.getAlanId() + ", Alan Adı: " + alan.getAlanAdi());
  }
}
}

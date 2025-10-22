package modeller;

/**
 * Canta sınıfı da Urun sınıfından türetilmiştir. Kalıtım!
 */
public class Canta extends Urun {

    private String malzeme;
    private int hacimLt; // Hacim litre cinsinden

    /**
     * Canta sınıfının Yapıcı Metotu (Constructor).
     */
    public Canta(int urunId, String ad, double fiyat, String malzeme, int hacimLt) {
        // Üst sınıfın constructor'ını çağırıyoruz.
        super(urunId, ad, fiyat);
        this.malzeme = malzeme;
        this.hacimLt = hacimLt;
    }

    // --- Canta'ya Özel Getter ve Setter'lar ---
    public String getMalzeme() {
        return malzeme;
    }

    public void setMalzeme(String malzeme) {
        this.malzeme = malzeme;
    }

    public int getHacimLt() {
        return hacimLt;
    }

    public void setHacimLt(int hacimLt) {
        this.hacimLt = hacimLt;
    }

    /**
     * Urun'den gelen toString() metodunu Canta'ya özel bilgilerle zenginleştiriyoruz.
     */
    @Override
    public String toString() {
        return super.toString() + ", Malzeme: '" + malzeme + "', Hacim: " + hacimLt + "L";
    }
}
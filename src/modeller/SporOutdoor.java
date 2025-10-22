package modeller;

public class SporOutdoor extends Urun {

    private String brans;
    private String malzemeTuru;

    public SporOutdoor(int urunId, String ad, double fiyat, String brans, String malzemeTuru) {
        super(urunId, ad, fiyat);
        this.brans = brans;
        this.malzemeTuru = malzemeTuru;
    }

    // Getter ve Setter'lar
    public String getBrans() { return brans; }
    public String getMalzemeTuru() { return malzemeTuru; }

    @Override
    public String toString() {
        return super.toString() + ", Branş: '" + brans + "', Malzeme: '" + malzemeTuru + "'";
    }
}
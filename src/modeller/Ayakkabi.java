package modeller;

/**
 * Ayakkabi sınıfı da, Giyim gibi, Urun sınıfından Kalıtım (Inheritance) yoluyla
 * türetilmiştir. Bu sayede o da bir Urun'dür.
 */
public class Ayakkabi extends Urun {

    // Ayakkabı kategorisine özel ek özellikler
    private int numara;
    private String tip; // Örneğin: "Sneaker", "Bot", "Topuklu Ayakkabı"

    /**
     * Ayakkabi sınıfının Yapıcı Metotu (Constructor).
     * @param urunId Miras alınan Urun sınıfının özelliği
     * @param ad Miras alınan Urun sınıfının özelliği
     * @param fiyat Miras alınan Urun sınıfının özelliği
     * @param numara Sadece Ayakkabi sınıfına ait özellik
     * @param tip Sadece Ayakkabi sınıfına ait özellik
     */
    public Ayakkabi(int urunId, String ad, double fiyat, int numara, String tip) {
        // Yine üst sınıfın (Urun) yapıcı metodunu çağırarak temel bilgileri ona iletiyoruz.
        super(urunId, ad, fiyat);

        // Bu sınıfa ait özellikleri de kendimiz ayarlıyoruz.
        this.numara = numara;
        this.tip = tip;
    }

    // --- Ayakkabi'ya Özel Getter ve Setter Metotları ---

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    /**
     * Urun sınıfındaki toString() metodunu Ayakkabi'ya özel bilgilerle zenginleştiriyoruz.
     */
    @Override
    public String toString() {
        // super.toString() ile Urun'den gelen temel bilgileri alıp,
        // yanına ayakkabıya özel bilgileri ekliyoruz.
        return super.toString() + ", Numara: " + numara + ", Tip: '" + tip + "'";
    }
}
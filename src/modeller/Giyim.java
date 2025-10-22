package modeller;

/**
 * 'extends Urun' ifadesi, Giyim sınıfının Urun sınıfının bir alt sınıfı olduğunu belirtir.
 * Bu sayede Giyim sınıfı, Urun sınıfının tüm public özellik ve metotlarını miras alır.
 * Bu, "Kalıtım (Inheritance)" prensibidir.
 */
public class Giyim extends Urun {

    // Giyim kategorisine özel ek özellikler.
    // Bunlar da 'private' olarak tanımlanarak Kapsülleme ilkesine uyulur.
    private String beden;
    private String renk;

    /**
     * Giyim sınıfının Yapıcı Metotu (Constructor).
     * @param urunId Miras alınan Urun sınıfının özelliği
     * @param ad Miras alınan Urun sınıfının özelliği
     * @param fiyat Miras alınan Urun sınıfının özelliği
     * @param beden Sadece Giyim sınıfına ait özellik
     * @param renk Sadece Giyim sınıfına ait özellik
     */
    public Giyim(int urunId, String ad, double fiyat, String beden, String renk) {
        // 'super(...)' anahtar kelimesi, üst sınıfın (Urun) yapıcı metodunu çağırır.
        // Bu sayede urunId, ad, ve fiyat özelliklerini Urun sınıfının kendisi ayarlar.
        super(urunId, ad, fiyat);

        // 'this' anahtar kelimesi ile bu sınıfa ait özellikleri ayarlarız.
        this.beden = beden;
        this.renk = renk;
    }

    // --- Giyim'e Özel Getter ve Setter Metotları ---

    public String getBeden() {
        return beden;
    }

    public void setBeden(String beden) {
        this.beden = beden;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * Urun sınıfındaki toString() metodunu burada eziyoruz (Override).
     * Üst sınıfın bilgilerine ek olarak Giyim'e özel bilgileri de ekliyoruz.
     */
    @Override
    public String toString() {
        // super.toString() ile üst sınıfın toString() metodunun sonucunu alıyoruz
        // ve sonuna kendi ek bilgilerimizi ekliyoruz.
        return super.toString() + ", Beden: '" + beden + "', Renk: '" + renk + "'";
    }
}
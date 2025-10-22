package modeller;

/**
 * Bu sınıf, projedeki tüm ürünler için bir şablon görevi görür.
 * 'abstract' olduğu için bu sınıftan doğrudan bir nesne oluşturulamaz.
 * Bu, yönergede istenen "Soyutlama (Abstraction)" ilkesidir.
 */
public abstract class Urun {

    /**
     * 'private' erişim belirteci, bu değişkenlere sadece Urun sınıfı içinden
     * erişilebileceğini garantiler. Bu, "Kapsülleme (Encapsulation)" ilkesidir.
     */
    private int urunId;
    private String ad;
    private double fiyat;

    /**
     * Bu, Yapıcı Metot'tur (Constructor).
     * Bir ürün oluşturulurken bu bilgilerin mutlaka verilmesi gerektiğini belirtir.
     * @param urunId Ürünün benzersiz numarası
     * @param ad Ürünün adı
     * @param fiyat Ürünün fiyatı
     */
    public Urun(int urunId, String ad, double fiyat) {
        this.urunId = urunId;
        this.ad = ad;
        this.fiyat = fiyat;
    }

    // --- GETTER METOTLARI ---
    // Kapsülleme (Encapsulation) ilkesi gereği, private değişkenlerin
    // değerlerini dışarıya güvenli bir şekilde okutmak için kullanılırlar.

    public int getUrunId() {
        return urunId;
    }

    public String getAd() {
        return ad;
    }

    public double getFiyat() {
        return fiyat;
    }

    // --- SETTER METOTLARI ---
    // Private değişkenlerin değerlerini dışarıdan kontrollü bir şekilde
    // değiştirmek için kullanılırlar.

    public void setFiyat(double fiyat) {
        // Fiyatın negatif olmasını engelleyen bir kontrol
        if (fiyat >= 0) {
            this.fiyat = fiyat;
        }
    }

    /**
     * Bu metot, Java'nın temel Object sınıfından gelir ve onu ezeriz (Override).
     * Nesnenin bilgilerini ekrana kolayca yazdırabilmek için kullanılır.
     * @return Ürünün bilgilerini içeren bir String metin.
     */
    @Override
    public String toString() {
        return "ID: " + urunId + ", Ad: '" + ad + "', Fiyat: " + fiyat + " TL";
    }
}
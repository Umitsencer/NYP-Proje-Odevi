package uygulama;

// ArrayList ve List sınıflarını projemize dahil ediyoruz.

import modeller.Urun;

import java.util.ArrayList;
import java.util.List;

/**
 * Kullanıcının alışveriş sepetini temsil eden sınıf.
 * İçerisinde ürünleri ekleme, çıkarma ve listeleme gibi işlemler yapılır.
 */
public class Sepet {

    /**
     * ----> POLİMORFİZM (ÇOK BİÇİMLİLİK) BURADA! <----
     * Bu liste, 'Urun' tipinde nesneler tutacak şekilde tanımlanmıştır.
     * Kalıtım sayesinde 'Giyim' bir 'Urun'dür ve 'Ayakkabi' da bir 'Urun'dür.
     * Bu nedenle, bu tek listeye hem Giyim hem de Ayakkabi nesnelerini aynı anda ekleyebiliriz.
     * İşte bu duruma Çok Biçimlilik (Polymorphism) denir.
     */
    List<Urun> urunler;

    /**
     * Sepet sınıfının Yapıcı Metotu (Constructor).
     * Yeni bir Sepet nesnesi oluşturulduğunda, içindeki ürünler listesini boş bir
     * ArrayList olarak başlatır.
     */
    public Sepet() {
        this.urunler = new ArrayList<>();
    }

    /**
     * Sepete yeni bir ürün ekler.
     * Parametre olarak herhangi bir Urun veya Urun'den türemiş bir nesne alabilir.
     * @param urun Sepete eklenecek olan Giyim, Ayakkabi vb. nesne.
     */
    public void sepeteEkle(Urun urun) {
        this.urunler.add(urun);
        System.out.println("'" + urun.getAd() + "' sepete eklendi.");
    }

    /**
     * Sepetten ID'sine göre bir ürün çıkarır.
     * @param urunId Sepetten çıkarılacak ürünün ID'si.
     */
    public void sepettenCikar(int urunId) {
        // urunler listesindeki her bir 'urun' için, eğer urun'ün ID'si
        // parametre olarak gelen urunId'ye eşitse, o ürünü listeden kaldır.
        boolean isRemoved = urunler.removeIf(urun -> urun.getUrunId() == urunId);

        if (isRemoved) {
            System.out.println(urunId + " ID'li ürün sepetten çıkarıldı.");
        } else {
            System.out.println(urunId + " ID'li ürün sepette bulunamadı.");
        }
    }

    /**
     * Sepetteki tüm ürünleri ve toplam tutarı ekrana yazdırır.
     */
    public void sepetiGoster() {
        System.out.println("\n--- SEPET İÇERİĞİ ---");
        if (urunler.isEmpty()) {
            System.out.println("Sepetiniz şu anda boş.");
        } else {
            for (Urun urun : urunler) {
                // ----> POLİMORFİZM YİNE DEVREDE! <----
                // Java, buradaki 'urun' nesnesinin gerçekte 'Giyim' mi yoksa 'Ayakkabi' mı
                // olduğunu bilir ve o sınıfa ait olan override edilmiş toString() metodunu
                // otomatik olarak çağırır.
                System.out.println(urun);
            }
            System.out.println("------------------------");
            System.out.printf("Toplam Tutar: %.2f TL\n", toplamTutarHesapla());
        }
    }

    /**
     * Sepetteki ürünlerin toplam fiyatını hesaplar.
     * @return Sepetin toplam tutarı (double).
     */
    public double toplamTutarHesapla() {
        double toplam = 0.0;
        for (Urun urun : urunler) {
            toplam += urun.getFiyat();
        }
        return toplam;
    }
}
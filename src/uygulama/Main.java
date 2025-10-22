package uygulama;

import modeller.Ayakkabi;
import modeller.Giyim;
import modeller.Urun;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // --- 1. Mağazadaki Ürünleri Oluşturalım (Katalog) ---
        List<Urun> mevcutUrunler = new ArrayList<>();
        mevcutUrunler.add(new Giyim(101, "Basic Tişört", 299.99, "M", "Beyaz"));
        mevcutUrunler.add(new Giyim(102, "Kot Pantolon", 899.50, "32", "Mavi"));
        mevcutUrunler.add(new Ayakkabi(201, "Koşu Ayakkabısı", 1499.90, 42, "Sneaker"));
        mevcutUrunler.add(new Ayakkabi(202, "Deri Bot", 2199.00, 43, "Bot"));
        mevcutUrunler.add(new Giyim(103, "Yün Kazak", 650.00, "L", "Bordo"));

        // --- 2. Gerekli Nesneleri Başlatalım ---
        Scanner scanner = new Scanner(System.in);
        Sepet sepet = new Sepet();
        int secim = 0;

        System.out.println("E-Ticaret Uygulamasına Hoş Geldiniz!");

        // --- 3. Ana Menü Döngüsü ---
        while (true) {
            System.out.println("\n--- ANA MENÜ ---");
            System.out.println("1. Ürünleri Listele");
            System.out.println("2. Sepete Ürün Ekle");
            System.out.println("3. Sepetten Ürün Çıkar");
            System.out.println("4. Sepeti Görüntüle");
            System.out.println("5. Çıkış");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçin: ");

            try {
                secim = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Hatalı giriş! Lütfen sadece sayı giriniz.");
                scanner.next(); // Hatalı girişi temizle
                continue; // Döngünün başına dön
            }

            // --- 4. Kullanıcı Seçimine Göre İşlem Yap ---
            switch (secim) {
                case 1:
                    System.out.println("\n--- MAĞAZADAKİ ÜRÜNLER ---");
                    for (Urun urun : mevcutUrunler) {
                        System.out.println(urun);
                    }
                    break;
                case 2:
                    System.out.print("Sepete eklemek istediğiniz ürünün ID'sini girin: ");
                    int eklenecekId = scanner.nextInt();
                    Urun eklenecekUrun = null;
                    for (Urun urun : mevcutUrunler) {
                        if (urun.getUrunId() == eklenecekId) {
                            eklenecekUrun = urun;
                            break;
                        }
                    }
                    if (eklenecekUrun != null) {
                        sepet.sepeteEkle(eklenecekUrun);
                    } else {
                        System.out.println("Hata: Bu ID'ye sahip bir ürün bulunamadı.");
                    }
                    break;
                case 3:
                    System.out.print("Sepetten çıkarmak istediğiniz ürünün ID'sini girin: ");
                    int cikarilacakId = scanner.nextInt();
                    sepet.sepettenCikar(cikarilacakId);
                    break;
                case 4:
                    sepet.sepetiGoster();
                    break;
                case 5:
                    System.out.println("Uygulamadan çıkılıyor. İyi günler!");
                    scanner.close(); // Scanner'ı kapat
                    return; // Programı sonlandır
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}
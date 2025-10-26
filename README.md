# E-Ticaret Uygulaması

Java programlama dili ile geliştirilmiş bir e-ticaret uygulaması. Proje, çeşitli ürün kategorilerini yönetmek ve sepet işlemlerini gerçekleştirmek için nesne yönelimli programlama prensiplerini kullanır.

## 📋 İçindekiler

- [Özellikler](#özellikler)
- [Proje Yapısı](#proje-yapısı)
- [Sınıf Hiyerarşisi](#sınıf-hiyerarşisi)
- [Kullanım](#kullanım)
- [Kurulum](#kurulum)
- [Geliştirme Ortamı](#geliştirme-ortamı)

## ✨ Özellikler

- **Ürün Yönetimi**: Farklı kategorilerde ürünlerin yönetimi
- **Sepet İşlemleri**: Ürün ekleme, çıkarma ve toplam tutar hesaplama
- **Kategori Bazlı Ürünler**: Ayakkabı, Çanta, Giyim, Kozmetik ve Spor/Outdoor kategorileri
- **Nesne Yönelimli Tasarım**: Kalıtım ve polimorfizm kullanımı

## 📁 Proje Yapısı

```
ETicaretUygulamasi/
│
├── modeller/
│   ├── Urun.class          # Soyut ana ürün sınıfı
│   ├── Ayakkabi.class      # Ayakkabı ürünleri
│   ├── Canta.class         # Çanta ürünleri
│   ├── Giyim.class         # Giyim ürünleri
│   ├── Kozmetik.class      # Kozmetik ürünleri
│   ├── SporOutdoor.class   # Spor ve Outdoor ürünleri
│   └── Sepet.class         # Sepet yönetimi
│
└── uygulama/
    └── Main.class          # Ana uygulama sınıfı
```

## 🏗️ Sınıf Hiyerarşisi

### Urun (Soyut Sınıf)
Tüm ürünlerin türetildiği temel soyut sınıf.

**Alanlar:**
- `int urunId` - Ürün kimliği
- `String ad` - Ürün adı
- `double fiyat` - Ürün fiyatı

**Metodlar:**
- `getUrunId()` - Ürün kimliğini getirir
- `getAd()` - Ürün adını getirir
- `getFiyat()` - Ürün fiyatını getirir
- `setFiyat(double)` - Ürün fiyatını ayarlar
- `toString()` - Ürün bilgilerini string olarak döndürür

### Ürün Alt Sınıfları

#### Ayakkabi
Ayakkabı ürünleri için özel sınıf.

**Ek Alanlar:**
- `int numara` - Ayakkabı numarası
- `String tip` - Ayakkabı tipi (erkek, kadın, çocuk, spor vb.)

**Metodlar:**
- `getNumara()` / `setNumara(int)` - Numara getirme/ayarlama
- `getTip()` / `setTip(String)` - Tip getirme/ayarlama
- `toString()` - Ayakkabı bilgilerini string olarak döndürür

#### Canta
Çanta ürünleri için özel sınıf.

**Ek Alanlar:**
- `String malzeme` - Çanta malzemesi
- `int hacimLt` - Hacim (litre cinsinden)

**Metodlar:**
- `getMalzeme()` / `setMalzeme(String)` - Malzeme getirme/ayarlama
- `getHacimLt()` / `setHacimLt(int)` - Hacim getirme/ayarlama
- `toString()` - Çanta bilgilerini string olarak döndürür

#### Giyim
Giyim ürünleri için özel sınıf.

**Ek Alanlar:**
- `String beden` - Ürün bedeni (S, M, L, XL vb.)
- `String renk` - Ürün rengi

**Metodlar:**
- `getBeden()` / `setBeden(String)` - Beden getirme/ayarlama
- `getRenk()` / `setRenk(String)` - Renk getirme/ayarlama
- `toString()` - Giyim bilgilerini string olarak döndürür

#### Kozmetik
Kozmetik ürünleri için özel sınıf.

**Ek Alanlar:**
- `String marka` - Ürün markası
- `String altKategori` - Alt kategori bilgisi

**Metodlar:**
- `getMarka()` - Marka getirme
- `getAltKategori()` - Alt kategori getirme
- `toString()` - Kozmetik bilgilerini string olarak döndürür

#### SporOutdoor
Spor ve outdoor ürünleri için özel sınıf.

**Ek Alanlar:**
- `String brans` - Spor branşı
- `String malzemeTuru` - Malzeme türü

**Metodlar:**
- `getBrans()` - Branş getirme
- `getMalzemeTuru()` - Malzeme türü getirme
- `toString()` - Spor/Outdoor bilgilerini string olarak döndürür

### Sepet
Sepet yönetimi için sınıf.

**Metodlar:**
- `sepeteEkle(Urun)` - Ürün ekleme
- `sepettenCikar(int)` - ID'ye göre ürün çıkarma
- `sepetiGoster()` - Sepet içeriğini gösterme
- `toplamTutarHesapla()` - Toplam tutarı hesaplama

### Main
Ana uygulama sınıfı.

**Metodlar:**
- `main(String[])` - Programın giriş noktası

## 🚀 Kullanım

Programı çalıştırmak için:

```bash
java uygulama.Main
```

Program aşağıdaki işlemleri gerçekleştirir:
1. Farklı kategorilerde ürün örnekleri oluşturur
2. Bu ürünleri sepete ekler
3. Sepet içeriğini gösterir
4. Toplam tutarı hesaplayıp gösterir

## 💻 Kurulum

### Gereksinimler
- Java 8 veya üzeri
- Java Development Kit (JDK)

### Adımlar

1. Projeyi indirin veya klonlayın
2. Terminal/Command Prompt'ta proje dizinine gidin
3. Programı derleyin (gerekirse):
   ```bash
   javac modeller/*.java uygulama/*.java
   ```
4. Programı çalıştırın:
   ```bash
   java uygulama.Main
   ```

## 🔧 Geliştirme Ortamı

- **Dil**: Java
- **Paradigma**: Nesne Yönelimli Programlama (OOP)
- **Tasarım Desenleri**: 
  - Inheritance (Kalıtım)
  - Polymorphism (Çok biçimlilik)
  - Abstract Classes (Soyut Sınıflar)

## 📝 Notlar

- Proje derlenmiş `.class` dosyalarını içermektedir
- Kaynak `.java` dosyaları mevcut değildir
- Sınıf yapısı `javap` aracı kullanılarak analiz edilmiştir
- Tüm ürün sınıfları `Urun` sınıfından türetilmiştir

## 👨‍💻 Geliştirici

Bu proje, e-ticaret sistemleri ve Java programlama öğrenmek amacıyla geliştirilmiştir.

---

**Lisans**: Bu proje eğitim amaçlı geliştirilmiştir.

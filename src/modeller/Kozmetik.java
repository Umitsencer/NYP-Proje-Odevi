package modeller;

public class Kozmetik extends Urun {

    private String marka;
    private String altKategori;

    public Kozmetik(int urunId, String ad, double fiyat, String marka, String altKategori) {
        super(urunId, ad, fiyat);
        this.marka = marka;
        this.altKategori = altKategori;
    }

    // Getter ve Setter'lar
    public String getMarka() { return marka; }
    public String getAltKategori() { return altKategori; }

    @Override
    public String toString() {
        return super.toString() + ", Marka: '" + marka + "', Kategori: '" + altKategori + "'";
    }
}
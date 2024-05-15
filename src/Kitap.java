public class Kitap {
    int id;
    String isim;
    Tür tür;
    String yazar;
    int sayfaSayisi;
    double fiyat;

    public Kitap(int id, Tür tür, String isim, String yazar, int sayfaSayisi, double fiyat) {
        this.id = id;
        this.tür = tür;
        this.isim = isim;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;
        this.fiyat = fiyat;
    }

    public int getId() {
        return id;
    }

    public Tür getTür() {
        return tür;
    }

    public void setTür(Tür tür) {
        this.tür = tür;
    }

    public String getIsim() {
        return isim;
    }

    public String getYazar() {
        return yazar;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "" + id + " - " + tür + " - " + isim + " - " + yazar + " - " + sayfaSayisi + " - " + fiyat;
    }

}



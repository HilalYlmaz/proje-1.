
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File dosya= new File("C:\\Users\\hilal\\Desktop\\proje-1\\src\\Yeni Metin Belgesi.txt");
//        DosyaIslemleri.dosyaBilgileri(dosya);
        List<Kitap> kitapListesi = DosyaIslemleri.dosyaOkuma(dosya);
        for (Kitap k: kitapListesi ){
            k.toString();
        }

//        DosyaIslemleri.sil(dosya, 9);

        DosyaIslemleri.guncelle(dosya, 7, 55.0);

        Kitap yeniKitap = new Kitap(36, Tür.PolisiyeGizem, "Sherlock HolmesBütün Maceralar",  "Arthur Conan Doyle", 768, 35);
        DosyaIslemleri.dosyayaEkle(kitapListesi, dosya, yeniKitap);







    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File dosya= new File("C:\\Users\\hilal\\Desktop\\proje-1\\src\\Yeni Metin Belgesi.txt");
//        DosyayaIslemleri.dosyaBilgileri(dosya);
        List<Kitap> kitaplar = DosyayaIslemleri.dosyaOkuma(dosya);
        for (Kitap k: kitaplar ){
            k.toString();
        }






    }
}
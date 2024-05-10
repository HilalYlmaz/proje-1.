import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class DosyayaEkle {
    public static void dosyayaEkle(List<Kitap> kitaplar) {

        Path dosya = Path.of("C:\\Users\\hilal\\Desktop\\proje-1\\src\\Yeni Metin Belgesi.txt");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(dosya.toFile(), true));
            for (Kitap k: kitaplar ){
                writer.write(k.toString());
                writer.newLine();
                System.out.println("Dosyaya eklendi");
            }
            writer.close();

        } catch (IOException e){
            System.out.println("İşlem başarısız oldu" + e.getMessage());
        }

        System.out.println();

    }
    }


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DosyaIslemleri {

    public static void sil(File dosya, int id){
        List<Kitap> kitapList = dosyaOkuma(dosya);
        kitapList.remove(id-1);

        dosyayaEkle(kitapList, dosya);
    }

    public static void guncelle(File dosya, int id, double guncelFiyat){
        List<Kitap> kitapList = dosyaOkuma(dosya);

        for (Kitap k : kitapList){
            if (k.getId()== id){
                k.setFiyat(guncelFiyat);
            }
        }
        for (Kitap k: kitapList){
            System.out.println(k);
        }
        dosyayaEkle(kitapList,dosya);
    }
    public static void dosyaBilgileri(File dosya) {
        if(dosya.exists()){
            System.out.println("Dosya Adı: " + dosya.getName());
            System.out.println("Dosya Yolu: " + dosya.getAbsolutePath());
            System.out.println("Yazılabilirlik Durumu: " + dosya.canWrite());
            System.out.println("Okunabilirlik Durumu: " + dosya.canRead());
        }else {
            System.out.println("Dosya yok");
        }
    }
    public static List<Kitap> dosyaOkuma(File dosya) {
        List<Kitap> kitapList = new ArrayList<>();
        try {
            Scanner myReader = new Scanner(dosya);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
//                System.out.println(data);
                String[] array= data.split(" - ");
                Kitap kitap1 = new Kitap(   Integer.valueOf(array[0]), Tür.valueOf(array[1]), array[2], array[3],Integer.valueOf(array[4]), Double.valueOf(array[5]) );

                kitapList.add(kitap1);
            }
            myReader.close();
            return kitapList;

        } catch (FileNotFoundException e) {
            System.out.println("error");
            e.printStackTrace();
        }
        return null;
    }
    public static void dosyayaEkle(List<Kitap> kitaplar , File dosya) {


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(dosya, false));
            for (Kitap k: kitaplar ){
                writer.write(k.toString());
                writer.newLine();
//                System.out.println("Dosyaya eklendi");
            }
            writer.close();

        } catch (IOException e){
            System.out.println("İşlem başarısız oldu" + e.getMessage());
        }

        System.out.println();

    }

    public static void dosyayaEkle (List<Kitap> kitaplar , File dosya, Kitap yeniKitap){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(dosya, true));
            writer.write(yeniKitap.toString());
            writer.newLine();
            writer.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        kitaplar.add(yeniKitap);

    }
    }


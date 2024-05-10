package main;

import dosyaİslemleri.DosyayaEkle;
import dosyaİslemleri.ListeOkuma;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
//        ListeOkuma listeOkuma = new ListeOkuma();
        List<Kitap> kitapList = new ArrayList<>();
        Kitap kitap1 = new Kitap(1, Tür.Romanlar, "Suç ve Ceza", "Fyodor Dostoyevski", 480 , 25 );
        Kitap kitap2 = new Kitap(2, Tür.Romanlar, "1984", "George Orwel", 320 , 20 );
        kitapList.add(kitap1);
        kitapList.add(kitap2);
        DosyayaEkle.dosyayaEkle(kitapList);





    }
}
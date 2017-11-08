package com.rubydev.fuzzylogic;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<Data> listData = new ArrayList<>();
        listData.add(new Data("B01", 97, 74));
        listData.add(new Data("B02", 36, 85));
        listData.add(new Data("B03", 63, 43));
        listData.add(new Data("B04", 82, 90));
        listData.add(new Data("B05", 71, 25));
        listData.add(new Data("B06", 79, 81));
        listData.add(new Data("B07", 55, 62));
        listData.add(new Data("B08", 57, 45));
        listData.add(new Data("B09", 40, 65));
        listData.add(new Data("B10", 57, 45));
        listData.add(new Data("B11", 77, 70));
        listData.add(new Data("B12", 68, 75));
        listData.add(new Data("B13", 60, 70));
        listData.add(new Data("B14", 82, 90));
        listData.add(new Data("B15", 40, 85));
        listData.add(new Data("B16", 80, 68));
        listData.add(new Data("B17", 60, 72));
        listData.add(new Data("B18", 50, 95));
        listData.add(new Data("B19", 100, 18));
        listData.add(new Data("B20", 11, 99));
        /////// DATA TESTING
        listData.add(new Data("B21", 58, 63));
        listData.add(new Data("B22", 68, 70));
        listData.add(new Data("B23", 64, 66));
        listData.add(new Data("B24", 57, 77));
        listData.add(new Data("B25", 77, 55));
        listData.add(new Data("B26", 98, 64));
        listData.add(new Data("B27", 91, 59));
        listData.add(new Data("B28", 50, 95));
        listData.add(new Data("B29", 95, 55));
        listData.add(new Data("B30", 27, 79));



        for (int j = 0; j <listData.size() ; j++) {
            /*System.out.print(listData.get(j).getNama() + " " );*/
            FuzzySystem fs = new FuzzySystem();

            ArrayList<Myu> myuEmosi = fs.myuEmosi(listData.get(j));

          /* for (int i = 0; i < myuEmosi.size() ; i++) {
                System.out.println("\n\nMyu Emosi\nFUNGSI KEANGGOTAAN: " +myuEmosi.get(i).getFungsiKeanggotaan() + "\nVALUE:  " + myuEmosi.get(i).getValue());
            }*/
            ArrayList<Myu> myuProvokasi = fs.myuProvokasi(listData.get(j));

/*            for (int i = 0; i < myuProvokasi.size() ; i++) {
                System.out.println("\n\nMyu Provokasi\nFUNGSI KEANGGOTAAN: " +myuProvokasi.get(i).getFungsiKeanggotaan() + "\nVALUE:  " + myuProvokasi.get(i).getValue());
            }*/
            ArrayList<Inference> listInference = fs.inference(myuEmosi,myuProvokasi);
/*
          for (int i = 0; i < listInference.size(); i++) {
                System.out.println("\nInference\nNAMA: " +listInference.get(i).getName() + "\nVALUE:  " + listInference.get(i).getValue());
            }
*/

            listData.get(j).setHoax(fs.deffuzyfication(listInference));
            /*System.out.print(" " +listData.get(j).getHoax() +"\n");*/
        }

        //TODO: FINAL OUTPUT DALAM TABEL
        for (int i = 0; i < listData.size() ; i++) {
            System.out.println(listData.get(i).getNama() + " " + listData.get(i).getHoax().toString().toUpperCase());
        }
    }



}

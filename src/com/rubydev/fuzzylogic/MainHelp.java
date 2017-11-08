package com.rubydev.fuzzylogic;

import java.util.ArrayList;

/**
 * Created by Yogi Wisesa on 10/23/2017.
 */
public class MainHelp {
    public static void main(String[] args) {
        ArrayList<Data> listData = new ArrayList<>();
        listData.add(new Data("B01", 97, 74, true));
        listData.add(new Data("B02", 36, 85, true));
        listData.add(new Data("B03", 63, 43, false));
        listData.add(new Data("B04", 82, 90, true));
        listData.add(new Data("B05", 71, 25, false));
        listData.add(new Data("B06", 79, 81, true));
        listData.add(new Data("B07", 55, 62, false));
        listData.add(new Data("B08", 57, 45, false));
        listData.add(new Data("B09", 40, 65, false));
        listData.add(new Data("B10", 57, 45, false));
        listData.add(new Data("B11", 77, 70, true));
        listData.add(new Data("B12", 68, 75, true));
        listData.add(new Data("B13", 60, 70, false));
        listData.add(new Data("B14", 82, 90, true));
        listData.add(new Data("B15", 40, 85, false));
        listData.add(new Data("B16", 80, 68, true));
        listData.add(new Data("B17", 60, 72, false));
        listData.add(new Data("B18", 50, 95, true));
        listData.add(new Data("B19", 100, 18, false));
        listData.add(new Data("B20", 11, 99, true));

        for (int i = 0; i < listData.size() ; i++) {
            if (listData.get(i).getHoax() == true){
                System.out.println("NAMA: " + listData.get(i).getNama());
            }
        }
    }

}

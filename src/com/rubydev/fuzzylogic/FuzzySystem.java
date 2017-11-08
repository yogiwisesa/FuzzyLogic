package com.rubydev.fuzzylogic;

import java.util.ArrayList;

/**
 * Created by Yogi Wisesa on 10/23/2017.
 */
public class FuzzySystem {
    private String HIGH = "High";
    private String MEDIUM = "Medium";
    private String LOW = "Low";

    public ArrayList<Myu> myuEmosi(Data data) {
        float x = data.getEmosi();
        ArrayList<Myu> myu = new ArrayList<>();
        if (x <= 20 || x >= 90) {

            if (x <= 20) {
                myu.add(new Myu(HIGH, 1));
            } else {
                myu.add(new Myu(LOW, 1));
            }

            return myu;
        } else if (x >= 50 && x <= 60) {
            myu.add(new Myu(MEDIUM, 1));
        } else if (x > 20 && x < 50) {
            float highB = 20;
            float highC = 50;
            float medA = 20;
            float medB = 50;


            float high = -1 * ((x - highC) / (highC - highB));
            float medium = (x - medA) / (medB - medA);

            myu.add(new Myu(HIGH, high));
            myu.add(new Myu(MEDIUM, medium));

            return myu;
        } else if (x > 60 && x < 90) {
            float medB = 60 ;
            float medC = 90;
            float lowA = 60;
            float lowB = 90;

            float medium = -1 * ((x - medC) / (medC - medB));
            float low = (x - lowA) / (lowB - lowA);


            myu.add(new Myu(MEDIUM, medium));
            myu.add(new Myu(LOW, low));

        }

        return myu;
    }

    public ArrayList<Myu> myuProvokasi(Data data) {
        float x = data.getProvokasi();
        ArrayList<Myu> myu = new ArrayList<>();
        if (x <= 40 || x >= 90) {

            if (x <= 40) {
                myu.add(new Myu(LOW, 1));
            } else {
                myu.add(new Myu(HIGH, 1));
            }

            return myu;
        } else if (x >= 60 && x <= 75) {
            myu.add(new Myu(MEDIUM, 1));
        } else if (x > 40 && x < 60) {
            float lowB = 40;
            float lowC = 60;
            float medA = 40;
            float medB = 60;


            float low = -1 * ((x - lowC) / (lowC - lowB));
            float medium = (x - medA) / (medB - medA);

            myu.add(new Myu(LOW, low));
            myu.add(new Myu(MEDIUM, medium));

            return myu;
        } else if (x > 75 && x < 90) {
            float medB = 75;
            float medC = 90;
            float highA = 75;
            float highB = 90;

            float medium = -1 * ((x - medC) / (medC - medB));
            float high = (x - highA) / (highB - highA);


            myu.add(new Myu(MEDIUM, medium));
            myu.add(new Myu(HIGH, high));

        }

        return myu;
    }

    public ArrayList<Inference> inference(ArrayList<Myu> myuEmosi, ArrayList<Myu> myuProvokasi) {
        ArrayList<Inference> listInference = new ArrayList<>();
        for (int i = 0; i < myuEmosi.size(); i++) {
            for (int j = 0; j < myuProvokasi.size(); j++) {
                if (myuEmosi.get(i).getFungsiKeanggotaan().equals(HIGH) && myuProvokasi.get(j).getFungsiKeanggotaan().equals(HIGH)) {
                    if (myuEmosi.get(i).getValue() < myuProvokasi.get(j).getValue()) {
                        listInference.add(new Inference("YES", myuEmosi.get(i).getValue()));
                    } else {
                        listInference.add(new Inference("YES", myuProvokasi.get(i).getValue()));
                    }
                } else if (myuEmosi.get(i).getFungsiKeanggotaan().equals(HIGH) && myuProvokasi.get(j).getFungsiKeanggotaan().equals(MEDIUM)) {
                    if (myuEmosi.get(i).getValue() < myuProvokasi.get(j).getValue()) {
                        listInference.add(new Inference("NO", myuEmosi.get(i).getValue()));
                    } else {
                        listInference.add(new Inference("NO", myuProvokasi.get(i).getValue()));
                    }
                } else if (myuEmosi.get(i).getFungsiKeanggotaan().equals(HIGH) && myuProvokasi.get(j).getFungsiKeanggotaan().equals(LOW)) {
                    if (myuEmosi.get(i).getValue() < myuProvokasi.get(j).getValue()) {
                        listInference.add(new Inference("NO", myuEmosi.get(i).getValue()));
                    } else {
                        listInference.add(new Inference("NO", myuProvokasi.get(i).getValue()));
                    }
                } else if (myuEmosi.get(i).getFungsiKeanggotaan().equals(MEDIUM) && myuProvokasi.get(j).getFungsiKeanggotaan().equals(HIGH)) {
                    if (myuEmosi.get(i).getValue() < myuProvokasi.get(j).getValue()) {
                        listInference.add(new Inference("YES", myuEmosi.get(i).getValue()));
                    } else {
                        listInference.add(new Inference("YES", myuProvokasi.get(i).getValue()));
                    }
                } else if (myuEmosi.get(i).getFungsiKeanggotaan().equals(MEDIUM) && myuProvokasi.get(j).getFungsiKeanggotaan().equals(MEDIUM)) {
                    if (myuEmosi.get(i).getValue() < myuProvokasi.get(j).getValue()) {
                        listInference.add(new Inference("NO", myuEmosi.get(i).getValue()));
                    } else {
                        listInference.add(new Inference("NO", myuProvokasi.get(i).getValue()));
                    }
                } else if (myuEmosi.get(i).getFungsiKeanggotaan().equals(MEDIUM) && myuProvokasi.get(j).getFungsiKeanggotaan().equals(LOW)) {
                    if (myuEmosi.get(i).getValue() < myuProvokasi.get(j).getValue()) {
                        listInference.add(new Inference("NO", myuEmosi.get(i).getValue()));
                    } else {
                        listInference.add(new Inference("NO", myuProvokasi.get(i).getValue()));
                    }
                } else if (myuEmosi.get(i).getFungsiKeanggotaan().equals(LOW) && myuProvokasi.get(j).getFungsiKeanggotaan().equals(HIGH)) {
                    if (myuEmosi.get(i).getValue() < myuProvokasi.get(j).getValue()) {
                        listInference.add(new Inference("YES", myuEmosi.get(i).getValue()));
                    } else {
                        listInference.add(new Inference("YES", myuProvokasi.get(i).getValue()));
                    }
                } else if (myuEmosi.get(i).getFungsiKeanggotaan().equals(LOW) && myuProvokasi.get(j).getFungsiKeanggotaan().equals(MEDIUM)) {
                    if (myuEmosi.get(i).getValue() < myuProvokasi.get(j).getValue()) {
                        listInference.add(new Inference("YES", myuEmosi.get(i).getValue()));
                    } else {
                        listInference.add(new Inference("YES", myuProvokasi.get(i).getValue()));
                    }
                } else if (myuEmosi.get(i).getFungsiKeanggotaan().equals(LOW) && myuProvokasi.get(j).getFungsiKeanggotaan().equals(LOW)) {
                    if (myuEmosi.get(i).getValue() < myuProvokasi.get(j).getValue()) {
                        listInference.add(new Inference("NO", myuEmosi.get(i).getValue()));
                    } else {
                        listInference.add(new Inference("NO", myuProvokasi.get(i).getValue()));
                    }
                }
            }
        }
        //TODO: CEK INFERENCE JIKA ADA YG HASILNYA SAMA
        Inference maxYES = new Inference("YES", 0);
        Inference maxNO = new Inference("NO", 0);
        int jumYES = 0, jumNO = 0;

        for (int i = 0; i < listInference.size(); i++) { // Kalau ada yg nilainya sama, ambil terbesar
            if (listInference.get(i).getName().equals("YES") && listInference.get(i).getValue() > maxYES.getValue()) {
                maxYES = listInference.get(i);
                jumYES = jumYES + 1;
            } else if (listInference.get(i).getName().equals("NO") && listInference.get(i).getValue() > maxNO.getValue()) {
                maxNO = listInference.get(i);
                jumNO = jumNO + 1;
            }
        }

        listInference.clear(); // kosongin listInference

        if (jumYES > 0) { // berarti yg hasilnya YES ada
            listInference.add(maxYES);
        }
        if (jumNO > 0) { // berarti yg hasilnya NO ada
            listInference.add(maxNO);
        }

        return listInference;
    }

    public boolean deffuzyfication(ArrayList<Inference> listInference) {
        float atas = 0, bawah = 0;

        for (int i = 0; i < listInference.size(); i++) {
            if (listInference.get(i).getName().equals("YES")) {
                atas = atas + listInference.get(i).getValue() * 100;
            } else if (listInference.get(i).getName().equals("NO")) {
                atas = atas + listInference.get(i).getValue() *  50;
            }

        }

        for (int i = 0; i < listInference.size(); i++) {
            bawah = bawah + listInference.get(i).getValue();
        }

        float ystar = atas / bawah;
        /*System.out.print("\n" + ystar);*/
        if (ystar > 56) {
            return true;
        } else {
            return false;
        }

    }
}

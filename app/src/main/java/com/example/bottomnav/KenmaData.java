package com.example.bottomnav;

import java.util.ArrayList;

public class KenmaData {

    private static int[] gambarKarya = {
            R.drawable.kenma,
            R.drawable.kenma2,
            R.drawable.kenma4,
            R.drawable.kenma6,
            R.drawable.kenma7,
            R.drawable.kenma8,
            R.drawable.kenma9,
            R.drawable.kenma10
    };

    public static ArrayList<Kenma> getListData() {
        ArrayList<Kenma> list = new ArrayList<>();
        for (int position = 0; position < gambarKarya.length; position++) {
            Kenma kenma = new Kenma();
            kenma.setGambarKenma(gambarKarya[position]);
            list.add(kenma);
        }
        return list;
    }
}

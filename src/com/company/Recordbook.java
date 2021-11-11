package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Recordbook {




    private int betygen;
    private int betyg1;
    private int betyg2;





    public Recordbook( int betygen, int betyg1, int betyg2) {
        this.betyg1 = betyg1;
        this.betyg2 = betyg2;
        this.betygen = betygen;



    }

    public int getBetygen() {
        return betygen;
    }



    public int getBetyg1() {
        return betyg1;
    }



    public int getBetyg2() {
        return betyg2;
    }




    public Recordbook(){

    }
    public double avarageGrade (){

        return Math.floor(betygen +betyg1 +betyg2)/3;

    }
    public int lowestGrade(){
        List<Integer> low = new ArrayList<>();
        low.add(betygen);
        low.add(betyg2);
        low.add(betyg1);

        Collections.sort(low);
        return low.get(0);
    }
    public int highestGrade(){
        List<Integer> high = new ArrayList<>();
        high.add(betygen);
        high.add(betyg2);
        high.add(betyg1);

        Collections.sort(high);
        return high.get(2);
    }

    //metod lowest grade
    //int num3 = Math.min( num1, num2 );
    //int num5 = Math.min( num3 ,num4);

    // highest sameshit men med Math.max


}


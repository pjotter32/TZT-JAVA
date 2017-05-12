package com.company;

/**
 * Created by User on 10-5-2017.
 */
public class AutoTest {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        System.out.println(auto1);
        auto1.setMerk("Skoda");
        auto1.setType("Fabia");
        auto1.setPk(60);
        System.out.println(auto1);
        Auto auto2 = new Auto();
        auto2.setMerk("Tesla");
        auto2.setType("S");
        auto2.setPk(400);
        System.out.println(auto2);

        int pk1 = auto1.getPk();
        int pk2 = auto2.getPk();
        String m1 = auto1.getMerk();
        String m2 = auto2.getMerk();
        int maxOpvoer;

        int verschil;

        if (pk1>pk2){
            verschil = pk1-pk2;
            System.out.println("De " + m1 + " heeft meer vermogen dan de " + m2 + ", het verschil is " + verschil + " pk" );
            }
        else if (pk2>pk1){
            verschil = pk2-pk1;
            System.out.println("De " + m2 + " heeft meer vermogen dan de " + m1 + ", het verschil is " + verschil + " pk" );
        }
        else {
            System.out.println("Zowel de " + m1 + " als de " + m2 + " hebben precies evenveel pk");
            verschil = 0;
        }

        while (auto1.getPk()<auto2.getPk()){
            int maxOpvoerPks = auto1.berekenOpvoerMogelijkheid();
            auto1.voerOp(maxOpvoerPks);
            System.out.println(auto1);
        }

        System.out.println(auto1);


    }

}

package com.company;

/**
 * Created by User on 10-5-2017.
 */
public class Auto {
    private String merk;
    private String type;
    private int pk;

    public Auto(){
        merk = "merk onbekend";
        type = "";
        pk = 20;
    }

    public int berekenOpvoerMogelijkheid(){
        return pk-20;
    }

    public  void  voerOp(int extraPk) {
        System.out.println(merk + " opvoeren met " + extraPk + " pk");
        if (extraPk > berekenOpvoerMogelijkheid()){
            System.out.println(extraPk + " is te veel, maximaal " + berekenOpvoerMogelijkheid());
        }
        else {
            pk = pk + extraPk; // hier worden de pk's aangepast
            System.out.println("resultaat: " + this.toString());
        }

    }


    public String toString(){
        return merk + " " + type + " (" + pk  + " pk, maximaal op te voeren met " + berekenOpvoerMogelijkheid() + " )";
    }

    //Getters + Setters

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }
}

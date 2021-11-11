package com.company;

import java.util.List;

class Student{
    private int id;
    private String fName;
    private String lName;



    private Recordbook recordbook;



    // consturkter
    public Student(int id, String fName, String lName, Recordbook recordbook) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.recordbook = recordbook;
    }






    public Recordbook getRecordbook() {
        return recordbook;
    }
    public String getfName() {
        return fName;
    }
    public String getlName() {
        return lName;
    }




    @Override
    public String toString() {
        return   fName + " " + lName + "\n" + "Betygen: " + getRecordbook().getBetygen() +" " + getRecordbook().getBetyg1() +" "+ getRecordbook().getBetyg2()+ "\r";
    }
}
package com.company;

class Student{
    public int id;
    public String fName;

    public String lName;
    public  int betygen;

    // consturkter
    public Student(int id, String fName, String lName, int betygen) {
        super();
        this.id = id;
        this.fName = fName;
        this.betygen = betygen;
        this.lName = lName;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public int getbetygen() {
        return betygen;
    }
    public void setmName(int betygen) {
        this.betygen = betygen;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }



    @Override
    public String toString() {
        return "Employee [id=" + id + ", fName=" + fName + ", lName=" + lName + ", betygen " + betygen + "]";
    }

}
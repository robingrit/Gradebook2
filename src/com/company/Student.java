package com.company;

class Student{
    public int id;
    public String fName;
    public String mName;
    public String lName;

    private Student student;
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
    public String getmName() {
        return mName;
    }
    public void setmName(String mName) {
        this.mName = mName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public Student(int id, String fName, String mName, String lName) {
        super();
        this.id = id;
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", fName=" + fName + ", mName="
                + mName + ", lName=" + lName + "]";
    }

}
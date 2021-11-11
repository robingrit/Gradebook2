package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Catalogue {



    private List<Student> Studentsname;

    //constructer är obslelit för tillfället
    public Catalogue() {

        Studentsname = new ArrayList<>();
    }
        public  void setStudentList(){
        File f1 = new File("C:\\Users\\Rezz\\IdeaProjects\\Gradebook\\src\\com\\company\\Student.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(f1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Studentsname = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String[] data = scanner.nextLine().split(",");
            int id = Integer.parseInt(data[0]);
            String fname = data[1];
            String lname = data[2];
            int betyg = Integer.parseInt(data[3]);
            int betyg1 = Integer.parseInt(data[4]);
            int betyg2 = Integer.parseInt(data[5]);

            Recordbook recordbook = new Recordbook(betyg, betyg1 , betyg2);

            Studentsname.add(new Student(id, fname, lname, recordbook));


        }
        scanner.close();
    }

    public void printstudents(){

        System.out.println("Eleverna som går på skolan"+ "\n");
        for ( Student S : Studentsname){
            System.out.println(S);
        }

    }
    /*public void Sebetyg(){
        int i = 0;
        do {
            Scanner input = new Scanner(System.in);

            String namn = input.nextLine();

            if (namn.equals("lars")){


                System.out.println(getStudentslist().get(0).betygen+ " " + getStudentslist().get(0).betyg1 + " " + getStudentslist().get(0).betyg2);
                i = 1;
            }
            else if (namn.equals("kalle")){
                System.out.println(getStudentslist().get(1).betygen);
                i = 2;
            }
            else if (namn.equals("ronja")){
                System.out.println(getStudentslist().get(2).betygen);
                i = 2;
            }
            else if (namn.equals("markus")){
                System.out.println(getStudentslist().get(3).betygen);
                i = 2;
            }
            else if (namn.equals("gunnar")){
                System.out.println(getStudentslist().get(4).betygen);
                i = 2;
            }
            else{
                i = 5;
            }

        }
        while (i < 5);
    }*/

    public Student findStudent(String inputName) {
        Student student;

        for (Student value : Studentsname) {

            student = value;

            if (inputName.equals(student.getfName())) {

                return student;

            }
        }
        return null;
    }
    // skickar listan
    public List<Student> getStudentslist() {
        return Studentsname;
    }






}

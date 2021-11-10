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
        File f1 = new File("C:\\Users\\zorpi\\Desktop\\Gradebook2\\src\\com\\company\\Student.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(f1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Studentsname = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String data[] = scanner.nextLine().split(",");
            int id = Integer.parseInt(data[0]);
            String fname = data[1];
            String lname = data[2];
            int betyg = Integer.parseInt(data[3]);

            Studentsname.add(new Student(id, fname, lname, betyg));


        }
        scanner.close();
    }

    public void Loadstudents(){

        System.out.println(Studentsname.size());
        for (Student S : Studentsname){
            System.out.println(S);
        }
    }




}

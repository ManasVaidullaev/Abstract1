import Package1.*;

import java.time.LocalDate;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        EducationCenter school = new School("Seitek","Kyrgyzstan", LocalDate.of(2012,9,1));
        EducationCenter univercity=new Univercity("KRSU","Kyrgyzstan",LocalDate.of(1992,6,1));
        EducationCenter college=new College("Politeh","Kyrgyzstan",LocalDate.of(2002,1,15));
        EducationCenter[]educationCenters={school,univercity,college};
        for (int i = 0; i < educationCenters.length; i++) {
            System.out.println(educationCenters[i].toString());
            educationCenters[i].getEducationCentersYear();
            System.out.println("-------------------------------------------------------------------");
        }
        System.out.println("*******************************************************************");


        Student student1= new Student("Aizada Krasavica","female",school,LocalDate.of(2020,9,1));
        Student student2= new Student("Djack Richer","male",univercity,LocalDate.of(2015,9,1));
        Student student3= new Student("Kanzharbek Krutoi","male",univercity,LocalDate.of(2022,5,1));
        Student student4= new Student("Nurik Aitishnik","male",college,LocalDate.of(2023,4,1));
        Student[]students={student1,student2,student3,student4};
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].toString());
            students[i].yearOfStudying();
            System.out.println("-----------------------------------------------------------");

        }











    }



}
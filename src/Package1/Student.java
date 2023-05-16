package Package1;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String fullName;
    private String gender;
    private EducationCenter educationcenter;
    private LocalDate dateOfStart;

    public Student(String fullName, String gender, EducationCenter educationcenter, LocalDate dateOfStart) {
        this.fullName = fullName;
        this.gender = gender;
        this.educationcenter = educationcenter;
        this.dateOfStart = dateOfStart;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public EducationCenter getEducationcenter() {
        return educationcenter;
    }

    public void setEducationcenter(EducationCenter educationcenter) {
        this.educationcenter = educationcenter;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;

    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }
    public  void yearOfStudying(){
        LocalDate localDate=dateOfStart;
        LocalDate currentDate=LocalDate.now();
        Period period=Period.between(currentDate,localDate);
        System.out.println(getFullName()+" "+"yearOfStudying: " +period);
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", educationcenter=" + educationcenter.getName() +
                '}'+"\n";
    }
}


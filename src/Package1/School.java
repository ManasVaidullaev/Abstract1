package Package1;

import java.time.LocalDate;
import java.time.Period;

public class School extends EducationCenter {
    public School(String name, String locatrdCoutry, LocalDate foundationYear) {
        super(name, locatrdCoutry, foundationYear);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void getEducationCenterInfo() {
        System.out.println(toString());

    }

    @Override
    public void getEducationCentersYear() {
        LocalDate foundationYear=getFoundationYear();
        LocalDate currentDate=LocalDate.now();
        Period period=Period.between(currentDate,foundationYear);
        System.out.println("Existance of "+getName()+": "+period);


    }



}

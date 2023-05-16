package Package1;

import java.time.LocalDate;
import java.time.Period;

public class Univercity extends EducationCenter{
    public Univercity(String name, String locatrdCoutry, LocalDate foundationYear) {
        super(name, locatrdCoutry, foundationYear);
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

    @Override
    public String toString() {
        return super.toString();
    }
}

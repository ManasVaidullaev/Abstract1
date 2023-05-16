package Package1;

import java.time.LocalDate;

public abstract class EducationCenter {
    private  String name;
    private String locatrdCoutry;
    private LocalDate foundationYear;

    public EducationCenter(String name, String locatrdCoutry, LocalDate foundationYear) {
        this.name = name;
        this.locatrdCoutry = locatrdCoutry;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocatrdCoutry() {
        return locatrdCoutry;
    }

    public void setLocatrdCoutry(String locatrdCoutry) {
        this.locatrdCoutry = locatrdCoutry;
    }

    public LocalDate getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(LocalDate foundationYear) {
        this.foundationYear = foundationYear;
    }
    public abstract void getEducationCenterInfo();
    public abstract void getEducationCentersYear();

    @Override
    public String toString() {
        return "EducationCenter{" +
                "name='" + name + '\'' +
                ", locatrdCoutry='" + locatrdCoutry + '\'' +
                ", foundationYear=" + foundationYear +
                '}';
    }
}

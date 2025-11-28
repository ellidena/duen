package member;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Member {
    private String name;
    private LocalDate birthDate;
    private int age;
    private double yearlyFee;
    private boolean isActive;
    private boolean hasPaid;

    public Member(String name, LocalDate birthDate, boolean isActive, boolean hasPaid){
        this.name = name;
        this.birthDate = birthDate;
        this.isActive = isActive;
        this.hasPaid = hasPaid;
        this.age = calculateAge();
        setYearlyFee();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate(){
        return birthDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean hasPaid() {
        return hasPaid;
    }

    public int getAge(){
        return age;
    }


    private int calculateAge(){
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        return period.getYears();
    }

    public String getAgeGroup(){
        return getAge() < 18 ? "Junior" : "Senior";
    }

    private void setYearlyFee(){
        if(!isActive){
            this.yearlyFee = 500;
        }
        else if(getAge() >= 60){
            this.yearlyFee = 1600*0.75;
        }
        else if (getAgeGroup() == "Senior") {
            this.yearlyFee = 1600;

        }
        else {
            this.yearlyFee = 1000;
        }
    }

    public double getYearlyFee() {
        return yearlyFee;
    }

    public boolean getIsActive(){
        return isActive;
    }

    @Override
    public String toString(){
        String status = getIsActive() ? "Aktiv" : "Passiv";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = birthDate.format(formatter);
        return formattedDate+" "+getName()+", Alder: "+getAge()+", Hold: "+getAgeGroup()+"\nStatus: "+status+", Kontingent: "+getYearlyFee();
    }


}

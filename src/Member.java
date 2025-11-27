import java.time.LocalDate;
import java.time.Period;

public class Member {
    private String name;
    private LocalDate birthDate;
    private int age;
    private boolean isActive;
    private boolean hasPaid;

    public Member(String name, LocalDate birthDate, boolean isActive, boolean hasPaid){
        this.name = name;
        this.birthDate = birthDate;
        this.isActive = isActive;
        this.hasPaid = hasPaid;
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

    public boolean isHasPaid() {
        return hasPaid;
    }

    public boolean isCompetitor() {
        return isCompetitor;
    }

    public int calculateAge(){
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        return period.getYears();
    }

    @Override
    public String toString(){
        return getBirthDate()+" "+getName();
    }


}

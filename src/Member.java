import java.time.LocalDate;

public class Member {
    private String name;
    private LocalDate birthDate;
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

    @Override
    public String toString(){
        return getBirthDate()+" "+getName();
    }
}

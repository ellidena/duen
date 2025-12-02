package domain;

import java.time.LocalDate;

public class Result {
    // classes representing the real world
    private final Discipline discipline;
    private final double time;
    private final LocalDate date;

    public Result(Discipline discipline, double time, LocalDate date){
        this.discipline = discipline;
        this.time = time;
        this.date = date;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public double getTime() {
        return time;
    }

    public LocalDate getDate() {
        return date;
    }
}

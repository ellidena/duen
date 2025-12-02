package data;

import domain.Member;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MemberFileHandler {
    // loading/saving
    // Responsibilities:
    // save all members to file, load all members from file,
    // start with simple csv file like name;age;active;competitive;disciplines;fee;debt
    // TODO: save all members to one text file and load again on startup

    public MemberFileHandler(){}

    public void writeToFile(Member member){
        String pathname = ""; // ?
        // member constructor: Member(String firstName, String surName, LocalDate birthDate, boolean isCompetitive, boolean isActive, boolean isPaid)
        String memberString = String.format("%s,%s,%s,%b,%b,%b",
                member.getFirstName(),
                member.getSurName(),
                member.getBirthDate(),
                member.getIsCompetitive(),
                member.getIsActive(),
                member.getIsPaid());
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("TuesDayTest.txt"));
            writer.println(memberString);
            writer.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Filen blev ikke fundet");
        }
        catch (IOException e){
            System.out.println("Der upstod en fejl under skrivning til filen");
            e.printStackTrace();
        }
    }
}

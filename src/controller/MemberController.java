package controller;

import domain.Member;

import java.time.LocalDate;

public class MemberController {
    // logic
    // Responsibilities:
    // create new member, get all members, calculate total fees, find members in debt
    //Member member = new Member(); // TODO is this even needed? remove?!
    Database database = new Database();

    //Regular member constructor: Member(String firstName, String surName, LocalDate birthDate, boolean isCompetitive, boolean isActive, boolean isPaid)
    public void addNewMember(String firstName, String surName, LocalDate birthDate, boolean isCompetitive, boolean isActive, boolean isPaid){
        database.addNewMember(firstName,surName,birthDate,isCompetitive,isActive,isPaid);
    }
}

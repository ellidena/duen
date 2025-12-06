package test;

import controller.Database;
import controller.ResultController;
import data.MemberFileHandler;
import org.junit.jupiter.api.Test;

class ResultControllerTest {

    //TODO Test:
    // Throws MemberNotFoundException if phonedoes not exist
    // Throws NotCompetitiveSwimmer if member is not competitive
    // Adds result correctly when legal
    @Test
    void addTrainingResult() {
        Database database = new Database(new MemberFileHandler("test-members.txt"));
        ResultController resultController = new ResultController(database);
    }

    @Test
    void addTrainingResultThrowsIfMemberNotFound(){
        Database database = new Database(new MemberFileHandler("Memberlist.txt"));
        ResultController resultController = new ResultController(database);


    }


    //TODO Test:
    // Same cases as above, also veryfy placement/event saved
    @Test
    void addCompetitionResult() {
        Database database = new Database(new MemberFileHandler("test-members.txt"));
        ResultController resultController = new ResultController(database);
    }

    // TODO Test:
    // Returns the correct object OR throws the two exceptions
    @Test
    void getCompetitiveSwimmer() {
        Database database = new Database(new MemberFileHandler("test-members.txt"));
        ResultController resultController = new ResultController(database);
    }
}
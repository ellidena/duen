package UI;
import controller.MemberController;
import data.MemberFileHandler;
import domain.Member;

import java.time.LocalDate;

public class MainMenu {
    // printing menus and taking input
    public static void main(String[] args) {
        MemberController memberController = new MemberController();
        MemberFileHandler memberFileHandler = new MemberFileHandler();

        Member member1 = new Member("dani","norgren", LocalDate.of(1990,10,19),false,true,true);

        memberFileHandler.writeToFile(member1);

    }
}

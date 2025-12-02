package UI;
import controller.MemberController;
import data.MemberFileHandler;
import domain.Member;

import java.time.LocalDate;

public class MainMenu {
    // printing menus and taking input
    public static void main(String[] args) {
        MemberController memberController = new MemberController();

        Member member1 = new Member("dani","norgren", LocalDate.of(1990,10,19),false,true,true);

        memberController.addNewMember("testFirstName","testSurName",LocalDate.of(1988,05,21),false,true,false);

    }
}

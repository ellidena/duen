import Konsol.MenuKonsol;
import member.Member;
import member.MemberRegistry;

import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MemberRegistry memberRegistry = new MemberRegistry();

        memberRegistry.addMember(new Member("George", LocalDate.of(1985,02,4), false,false));

        try {
            MenuKonsol.startmenu();
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }


        while (true) {
            System.out.println("  |~~~~~~~~~~~~~");
            System.out.println("  | KlubSystem:");
            System.out.println("  | < 1 > Vis Medlemmer");
            System.out.println("  | < 2 > Luk Program");
            System.out.println("  |~~~~~~~~~~~~~");
            System.out.print("  | Vælg Handling: ");

            int number = input.nextInt();
            input.nextLine();
            switch (number) {
                case 1:
                    System.out.println(memberRegistry);
                    break;
                case 2:
                    input.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
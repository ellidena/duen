import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void main() {
        Scanner input = new Scanner(System.in);
        MemberRegistry memberRegistry = new MemberRegistry();

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
                    System.out.println(memberRegistry);;
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
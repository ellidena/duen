import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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
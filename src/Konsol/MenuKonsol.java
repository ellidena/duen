package Konsol;

import java.time.LocalDate;
import java.util.Scanner;

public class MenuKonsol {

    public MenuKonsol(){

    }

    public void startMenuKonsol(){
        // List list = new List();

        //loop 1:
        while (true){
            System.out.println("   NAVIGATIONSMENY:");
            System.out.println("""
                    +-+\s
                    |1|\s FORMAND
                    +-+\s
                    """);
            System.out.println("""
                    +-+\s
                    |2|\s KASSERER
                    +-+\s
                    """);
            System.out.println("""
                    +-+\s
                    |3|\s TRÆNER
                    +-+\s
                    """);
            System.out.println("""
                    +-+\s
                    |4|\s AFSLUT
                    +-+\s
                    """);

            try{
                Scanner input = new Scanner(System.in);
                System.out.print(": ");
                int choice = input.nextInt();
                switch (choice){
                    case 1:
                        //fakeClearConsoleScreen(); // just 50 linebreaks for visual effect
                        //Formand
                        //evt login
                        /*
                        System.out.println("Angiv kode: ");
                        Scanner pin = new Scanner(System.in); // why the new scanner object??
                        String code = pin.next();
                        if(code.equals("1234")){
                            //loop 2 in here
                        }
                         */
                        //loop 2:
                        loop2();
                        /*
                        //Hvis formand login:
                        else {
                            System.out.println("Forkert kode");
                        }
                         */
                        break;
                    case 2:
                        // kasserer login
                        /*
                        System.out.println("Angiv kode: ");
                        Scanner pin2 = new Scanner(System.in);
                        String code2 = pin2.next();
                        if (code2.equals("1234"));{
                            // loop3 in here
                        }
                         */
                        //loop 3:
                        loop3();
                        /*
                        //for kasserer login
                        else{
                            System.out.println("Forkert kode");
                        }
                        */
                        break;
                    case 3:
                        // Træner login
                        // loop 4:
                        break;
                    case 4:
                        // exit
                        input.close();
                        System.exit(0);
                        break;

                    default:
                        break;

                }
            }
            catch (Exception i){
                System.out.println(i);
            }
        }
    }

    public void login(){
        // add a little login input + if else thing here
    }

    public void fakeClearConsoleScreen(){
        // just 50 linebreaks for visual effect
        int lineCount = 50;
        String lines = "\n".repeat(lineCount);
        System.out.println(lines);
    }

    public void enterBirthDate(){
        /*
        HEJ!! HER KAN MAN LAVE EN CUSTOM EXCEPTION
        HVIS BRUGEREN TASTER EN UGYLDIG FØDSELSDATO IND,
        F.EKS AT PERSONEN ER FOR UNG, ELLER OVER 120 ÅR
         */
        boolean again = true;
        Scanner reader = new Scanner(System.in);
        System.out.print("FØDSELSDATO (ÅÅÅÅ-MM-DD): ");
        while (again){
            try {
                String date = reader.nextLine();
                int birthYear = Integer.parseInt(date.split("-")[0]);
                int birthMonth = Integer.parseInt(date.split("-")[1]);
                int birthDay = Integer.parseInt(date.split("-")[2]);
                LocalDate birthDate = LocalDate.of(birthYear,birthMonth,birthDay);
                System.out.println("Fødselsdato noteret :)) "+birthDate);
                System.out.println();
                again = false;
            } catch (Exception e) {
                System.out.println(e);
                System.out.print("Tastefejl. Venligst prøv igen (ÅÅÅÅ-MM-DD): ");
                //throw new RuntimeException(e); // skal ikke bruges, den kaster os ud af input-loop
            }
        }



    }

    public void loop2(){
        while (true){
            System.out.println("   FORMAND:");
            System.out.println("1. Se Medlemsliste");
            System.out.println("""
                    ╔═══════════════╗
                    ║2. OPRET MEDLEM║
                    ╚═══════════════╝
                    """);
            System.out.println("3. Redigere Medlem");
            System.out.println("4. Slet Medlem");
            System.out.println("5. Find medlem");
            System.out.println("""
                    ╔═══════════════╗
                    ║6. TILBAGE     ║
                    ╚═══════════════╝
                    """);
            System.out.println("""
                    ╔═══════════════╗
                    ║7. AFSLUT      ║
                    ╚═══════════════╝
                    """);
            try {
                Scanner inputFormand = new Scanner(System.in); // why the new scanner?
                System.out.print(": ");
                int formandChoice = inputFormand.nextInt();
                switch (formandChoice){
                    case 1:
                        // se medlemsliste
                        // f.eks memberList.printMembers();
                        break;
                    case 2:
                        // opret medlem, f.eks
                        // memberList.createMember();
                        enterBirthDate();
                        break;
                    case 3:
                        // rediger medlem, f.eks:
                        // memberList.editMember();
                        break;
                    case 4:
                        // slet medlem, f.eks:
                        // memberList.deleteMember();
                        break;
                    case 5:
                        // se kontingent, f.eks:
                        // memberList.viewAnnualFee();
                        break;
                    case 6:
                        // tilbage
                        //fakeClearConsoleScreen(); // just 50 linebreaks for visual effect
                        startMenuKonsol();
                        break;
                    case 7:
                        // afslut
                        inputFormand.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("fejl");
                        break;
                }
            }
            catch (Exception i){
                System.out.println(i);
            }
        }
    }

    public void loop3(){
        while (true){
            System.out.println("Kasserer:");
            System.out.println("1. Se restance");
            System.out.println("2. Se forventet kontingentindtægt");
            System.out.println("3. Tilbage");
            System.out.println("4. Afslut");
            try {
                Scanner inputKasserer = new Scanner(System.in); // whyy the new scanner
                int formandChoice = inputKasserer.nextInt();
                switch (formandChoice){
                    case 1:
                        break;
                    //se restance, f.eks:
                    //memberList.printRestance();
                    case 2:
                        // se forventet indtægt, f.eks
                        //memberList.printExpecterRevenue();
                        break;
                    case 3:
                        //fakeClearConsoleScreen(); // just 50 linebreaks for visual effect
                        startMenuKonsol();
                        break;
                    case 4:
                        // exit
                        inputKasserer.close();
                        System.exit(0);
                        break;
                    default:
                        break;
                }
            }
            catch (Exception i){
                System.out.println(i);
            }
        }
    }

    public void birdAsciiImage(){
        System.out.println("""
                      .---.        .-----------
                     /     \\  __  /    ------
                    / /     \\(  )/    -----
                   //////   ' \\/ `   ---
                  //// / // :    : ---
                 // /   /  /`    '--
                //          //..\\\\
                       ====UU====UU====
                           '//||\\\\`
                             ''``
                """);
    }





}

package Console;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Menu {

    public Menu(){}

    public void startMenu(){
        //loop 1:
        while (true){
            System.out.println("   NAVIGATIONS-MENU:");
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
                        //Formand
                        //evt login
                        loop1();
                        break;
                    case 2:
                        // evt kasserer login
                        loop2();
                        break;
                    case 3:
                        // evt Træner login
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
        /*
                        System.out.println("Angiv kode: ");
                        Scanner pin = new Scanner(System.in); // why the new scanner object??
                        String code = pin.next();
                        if(code.equals("1234")){
                            //loop 2 in here
                        }
                         */
        /*
                        //for kasserer login
                        else{
                            System.out.println("Forkert kode");
                        }
                        */
    }

    public void fakeClearConsoleScreen(){
        // just 50 linebreaks for visual effect
        int lineCount = 50;
        String lines = "\n".repeat(lineCount);
        System.out.println(lines);
    }

    // Metode som ber brugeren at indtaste fødselsdato i formatet ÅÅÅÅ-MM-DD
    // og konverterer det til en localDate
    public void enterBirthDate(){
        /*
        HEJ LAV EN ESCAPE "tast 'q' for at gå tilbage" f.eks
         */
        boolean again = true; // Så at metoden kan køres som et loop
        Scanner reader = new Scanner(System.in);
        System.out.print("FØDSELSDATO (ÅÅÅÅ-MM-DD): ");
        while (again){ // så længe again er true gentages dette
            try {
                String date = reader.nextLine();
                LocalDate birthDate = convertStringDateToLocalDate(date); // prøver at lave et LocalDate objekt
                int age = calculateAge(birthDate); // finder lige ud af alderen...
                if(age < 3 || age > 122){ // hvis det er blevet tastet ind en ugyldig alder skal brugeren lige prøve igen
                    throw new InvalidBirthYearException("Alder skal være minimum 3 og maks 122.");
                }
                System.out.println("\nFødselsdato noteret :)) "+birthDate);
                System.out.println();
                again = false; // hvis alt lykkes sættes again til at være false og vi kommer ud af while-loopen
            } catch (Exception e) {
                System.out.println(e); // fejlmeddelelse
                System.out.print("Tastefejl. Venligst prøv igen (ÅÅÅÅ-MM-DD): ");
                //throw new RuntimeException(e); // skal ikke bruges, den kaster os ud af input-loop
            }
        }
    }

    // Metode som tager String i formatet YYYY-MM-DD og konverterer til LocalDate
    public LocalDate convertStringDateToLocalDate(String date){
        int birthYear = Integer.parseInt(date.split("-")[0]); // henter det første element fra input
        int birthMonth = Integer.parseInt(date.split("-")[1]);
        int birthDay = Integer.parseInt(date.split("-")[2]);
        return LocalDate.of(birthYear,birthMonth,birthDay);
    }

    // Metode som beregner og returnerer int alder ud fra et localDate objekt
    public int calculateAge(LocalDate date){
        LocalDate currentDate = LocalDate.now(); // henter dagens dato
        Period period = Period.between(date, currentDate); // sammenligner de to
        return period.getYears();
    }

    public void loop1(){
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
                Scanner inputFormand = new Scanner(System.in); // den tidligere oprettede Scanner input virker ej her, så opretter en ny
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
                        startMenu();
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

    public void loop2(){
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
                        startMenu();
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

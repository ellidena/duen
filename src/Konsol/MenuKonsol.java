package Konsol;

import java.util.Scanner;

public class MenuKonsol {

    public MenuKonsol(){

    }

    public void startMenuKonsol(){
        // List list = new List();

        //loop 1:
        while (true){
            System.out.println("Navigationsmeny:");
            System.out.println("1. Formand");
            System.out.println("2. Kasserer");
            System.out.println("3. Træner");
            System.out.println("4. Afslut");

            try{
                Scanner input = new Scanner(System.in);
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

    }

    public void fakeClearConsoleScreen(){
        // just 50 linebreaks for visual effect
        int lineCount = 50;
        String lines = "\n".repeat(lineCount);
        System.out.println(lines);
    }

    public void loop1(){

    }

    public void loop2(){
        while (true){
            System.out.println("Formand: ");
            System.out.println("1. Se Medlemsliste");
            System.out.println("2. Opret Medlem");
            System.out.println("3. Redigere Medlem");
            System.out.println("4. Slet Medlem");
            System.out.println("5. Find medlem");
            System.out.println("6. Tilbage");
            System.out.println("Afslut");
            // kan man gå tilbage?
            try {
                Scanner inputFormand = new Scanner(System.in); // why the new scanner?
                int formandChoice = inputFormand.nextInt();
                switch (formandChoice){
                    case 1:
                        // se medlemsliste
                        // f.eks memberList.printMembers();
                        break;
                    case 2:
                        // opret medlem, f.eks
                        // memberList.createMember();
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





}

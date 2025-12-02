package File;

import java.io.*;
import java.util.Scanner;

public class FileStuff {
    public FileStuff(){}

    public static void printLines(){
        try {
            File file = new File("C:/Users/ellid/Desktop/DELFINEN/DuensMedlemsklub/duen/src/Data/test.txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
            //file.close(); // just took this from Jakobs slides, but it does not appear to work - it might not be needed even
        }
        catch (FileNotFoundException e){
            System.out.println("Filen blev ikke fundet.");
            e.printStackTrace();
        }
    }

    public static void readLines() throws FileNotFoundException{
        File file = new File("C:/Users/ellid/Desktop/DELFINEN/DuensMedlemsklub/duen/src/Data/test.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            //Read lines, process scanner.nextLine output somehow
        }
    }

    public static void writeToFile(){
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("printWriterTest.txt"));
            writer.println("Lena, 12345");
            writer.print("Frida, ");
            writer.println("12346");
            writer.close(); // lukker filen
        }
        catch (FileNotFoundException e){
            System.out.println("Filen blev ikke fundet.");
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println("Der opstod en fejl under skrivning til filen.");
            e.printStackTrace();
        }
    }

    public static void writeToCsv(String testString){ //later, makle this take a an ArryList of Member objects
        //example format:
        //1,Daniella,Norgren,1990-10-19,true,false
        //2,Greta,Lindberg,1996-12-03,true,true
        //3,Tanja,Munch,1979-04-23,true,false,Frontcrawl,Null,Null,Null
        //4,Gina,Lund,1989-03-04,true,false,FrontCrawl,Backstroke,Butterfly,Breaststroke
        //String memberString = String.format("%d,%s,%s,%s,%b,%b,%s,%s,%s,%s",
            //member.getMemberId(), member.getFirstName(),member.getBirthday(),member.getIsActive(),member.getIsPaid(),
            //compMember.getDiscipline1() != null ? compMember.getDiscipline1().toString() : "", // handle null case
            //. . . );
        try{
            PrintWriter writer = new PrintWriter(new FileWriter("test.csv"));
            // later, use the memberlist here and do a for loop to get all new members for(Member member : list)
            // while getting each member from the memberlist, check if they are competitionSwimmer or exerciseSwimmer
            // if they are competitionswimmer the memberString format is %d,%s,%s,%s,%b,%b,%s,%s,%s,%s
            //else if they are exerciseswimmer the memberString format is %d,%s,%s,%s,%b,%b
            // end with writer.println(memberString;
        }
        catch (FileNotFoundException e){
            System.out.println("Filen blev ikke fundet.");
        }
        catch (IOException e){
            System.out.println("Der opstod en fejl under skrivning til filen.");
            e.printStackTrace();
        }

    }
}

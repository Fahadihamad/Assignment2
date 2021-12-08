import java.util.Scanner;
   
   class partA4 {

       public static void main (String [] args){

           Scanner ask = new Scanner (System.in);

             System.out.println ("Please enter your name");
             String name = ask.nextLine();
               
               System.out.println ("How many years of old");
                 int age = ask.nextInt();

                 System.out.println ("Welcome " + name + " " + "you are " + age+ " " + "years old");

       }
   }
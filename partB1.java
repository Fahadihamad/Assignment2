import java.util.Scanner;

class partB1 {

    public static void main (String [] args) {
        Scanner reader = new Scanner (System.in);
           
           System.out.println ("Enter a number to determine a largest ones ");
           int number = reader.nextInt ( );
        switch (number) {

            case 1:
            System.out.println ("Small");
            break;

            case 2:
            System.out.println ("Medium");
            break;

            case 3:
            System.out.println ("Largest");
            break;

            default:
            System.out.println ("unknown");
        }
    }
}
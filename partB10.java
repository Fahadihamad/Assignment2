import java.util.Scanner;
class partB10 {
    public static void main (String [] args) {



        Scanner input = new Scanner(System.in);

        System.out.println ("Enter a number ");
        int num = input.nextInt();

        for (int i = 1; i < num; i=i+2){
            System.out.print (i);

        }


    }
}
import java.util.Scanner;

     class partA5 {

         public static void main (String [] args) {
          
          Scanner input = new Scanner (System.in);

            System.out.println ("Enter value a : ");

            float point = input.nextFloat();

            System.out.println ("The value of a before adding is " + point++ );

                System.out.println ("Enter value b : ");

                float point2 = input.nextFloat();
                  float ab = point + point2;
                    System.out.println ("The value after adding is " + ab);



         }
     }
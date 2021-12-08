import java.util.Scanner;

     class partA6 {
         public static void main (String [] args) {

             Scanner input = new Scanner (System.in);

             System.out.println ("Enter value a : ");

               int a = input.nextInt();

             System.out.println ("Enter value b : ");

               int b = input.nextInt();

                       int c = a + b;

                        System.out.println ("The result of adding is " + c );

                           int d = a - b;
                             
                             System.out.println ("The result of subracting is " + d );

                                int e = a * b;

                                  System.out.println("The result of multiplying is " + e );

                                    int f = a / b;

                                      System.out.println ("The result of deviding is " + f );

         }
     }
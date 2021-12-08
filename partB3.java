import java.util.Scanner;

class partB3 {

    public static void main (String [] args){

      Scanner input = new Scanner (System.in);

        System.out.println ("Enter Score ");
        int score = input.nextInt();

          if (score == 5) {

              System.out.println ("A");
          }
             else if (score == 4) {

                 System.out.println ("B");

             }
             else if (score == 3) {

                 System.out.println ("C");

             }

             else if (score == 2) {

                 System.out.println ("D");

             }
                else if (score == 1 || score == 0) {

                    System.out.println ("F");
                } else {

                    System.out.println ("You've entered incorrect marks range\nPlease try again");
                    
                }




 
        }
}









        switch (score) {
           
            case 5:
             System.out.println ("A");
             break;

            case 4:
              System.out.println ("B");
              break;

            case 3:
              System.out.println ("C");
              break;
             
            case 2:
              System.out.println ("D");
              break;

            case 1:
               System.out.println ("F");
               break;

            case 0:
               System.out.println ("F");
               break;

               default:
               System.out.println ("No score recorded");

          }
        }
    }
           
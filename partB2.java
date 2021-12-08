import java .util.Scanner;

class partB2 {
    public static void main (String [] args) {

      Scanner reader = new Scanner (System.in);

      System.out.println (" Enter  max ");
      int max = reader.nextInt ( );
        
        if(max >= 90) {
            
            System.out.println (" Quiz score : " + max + "\ngrade A ");
 
        }
           else if ( max >= 70 && max < 90) {

                  System.out.println (" Mid-term score : " + max + "\ngrade B ");    

           }
             else if (max >= 50 && max < 70) {
                 System.out.println (" Final Score : " + max + "\ngrade B ");
                  
             }

            else {
                System.out.println (" grade : F ");
            }

    }
}
import java.util.Scanner;

public class IT24101092Lab5Q2{
       public static void main(String[] args){

       Scanner pz = new Scanner(System.in);
      
       System.out.print("Enter the number of new members introduced : ");
       int number = pz.nextInt();

       switch(number)
       {
         case 0 : System.out.print("No prize");
                    break;

         case 1 : System.out.print("The prize is a : Pen");
                    break;

         case 2 : System.out.print("The prize is a : Umbrella");
                    break;

         case 3 : System.out.print("The prize is a : Bag");
                    break;

         case 4 : System.out.print("The prize is a : Travelling Chair");
                    break;

              
         default :
            if(number>5 || number == 5){
            System.out.print("The prize is a : Headphone");
            }
            else{
            System.out.print("Input must be a number 0 or greater");
            }
          }
      } 
}
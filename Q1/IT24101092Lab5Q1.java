import java.util.Scanner;

public class IT24101092Lab5Q1{
       public static void main(String[] args){
 
       int n1;
       int n2;
       int n3;

       Scanner hs = new Scanner(System.in);

        System.out.print("Enter the first integer : ");
        n1 = hs.nextInt();

        System.out.print("Enter the second integer : ");
        n2 = hs.nextInt();

        System.out.print("Enter the third integer : ");
        n3 = hs.nextInt();
        
        System.out.println("User entered numbers are : "+n1+" "+n2+" "+n3);

        if(n1<n2 && n1<n3){
        System.out.println("The Smallest number is : "+n1);
        }
        else if(n2<n1 && n2<n3){
        System.out.println("The Smallest number is : "+n2);
        }
        else{
        System.out.println("The Smallest number is : "+n3);
        }

        
        if(n1>n2 && n1>n3){
        System.out.println("The Largest number is : "+n1);
        }
        else if(n2>n1 && n2>n3){
        System.out.println("The Largest number is : "+n2);
        }
        else{
        System.out.println("The Largest number is : "+n3);
        }
      } 
}

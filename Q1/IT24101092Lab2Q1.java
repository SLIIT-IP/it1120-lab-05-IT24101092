public class IT24101092Lab2Q1{
       public static void main(String[]args){

       int perimeter;
       double length;
       double width;

         perimeter=100;
       //width to length ratio: 3/4 = 0.75;
       //perimeter of a rectangle = 2*(length+width)
        length= perimeter/3.5;
        width= length*0.75;

  
       System.out.println("Length of the fence : "+length);
       System.out.println("Width of the fence: "+width);
       }
}
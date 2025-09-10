import java.util.Scanner;

class LAB2P3{
           
          public static void main(String...args){ 
          Scanner s = new Scanner(System.in);
          int a = s.nextInt();
          int b = s.nextInt();
          
          String op = s.next();
          
          String str = switch(op){
          
                case "++" -> "Hello";
                case "--" , "=" , "-" -> "not good";
                default -> "sorry";
 
          };
       
          System.out.println("result is: "+str);
          
          }

}




 

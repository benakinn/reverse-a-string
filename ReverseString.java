import java.util.Scanner;
public class ReverseString {

 public static void main(String[] args) {
  System.out.println("Insert text");
  Scanner text = new Scanner(System.in);
  String welp = text.nextLine();
  int welp2 = welp.length();
  int j = welp2-1;
  
  for (int i=0; i< welp2;i++) {
   
   System.out.print(welp.charAt(j-i));
   
  }
  

 }

}
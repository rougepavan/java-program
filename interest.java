import java.util.Scanner;

class interest {
  public static void main(String[] args) 
{
 Scanner input = new Scanner(System.in);
 System.out.print("Enter the principal: "); 
 double principal = input.nextDouble();
 System.out.print("Enter the rate: ");
 double rate = input.nextDouble();
 double interest = (principal * rate) / 100;
 System.out.println("Principal: " + principal);
 System.out.println("Interest Rate: " + rate);
 System.out.println("Simple Interest: " + interest);
  input.close();
}
}
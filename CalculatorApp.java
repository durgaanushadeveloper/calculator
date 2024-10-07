import java.util.*;
public class CalculatorApp extends Calculator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a value");
int a=sc.nextInt();
System.out.println("enter b value");
int b=sc.nextInt();
Calculator c=new CalculatorApp();
c.add(a,b);
c.sub(a,b);
}
public void add(int a,int b)
{
System.out.println("addition is "+(a+b));
}
public void sub(int a,int b)
{
System.out.println("substraction is "+(a-b));
}

}
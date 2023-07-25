import java.util.*;
public class factorial1
{
public static int factorial(int num)
{
int fact=1;
for(int i=1;i<=num;i++)
{
fact=fact*i;
}
return fact;
}
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the number");
int num=obj.nextInt();
int fact=factorial(num);
System.out.println("Factorial of number="+fact);
}
}
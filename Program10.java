import java.util.*;
public class Program10
{
public static void main(String args[])
{
char ch;
System.out.print("enter a character:");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
System.out.println();
int ascii=(int)ch;
System.out.println("the ascii value of"+ch +"is"+ascii);
}
}


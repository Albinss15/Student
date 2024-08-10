import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String a = sc.nextLine();
        System.out.println("Roll number");
        int b = sc.nextInt();
        System.out.println("Enter first Mark");
        int c = sc.nextInt();
        System.out.println("Enter second Mark");
        int d = sc.nextInt();
        System.out.println("Enter third Mark");
        int e = sc.nextInt();
        Student1 s1 = new Student1(a,b,c,d,e);
        s1.calc();
        s1.display();
    }
    }

import java.util.Scanner;

public class grade_calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your marks");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int m4=sc.nextInt();
        int m5=sc.nextInt();
        int total=m1+m2+m3+m4+m5;
        System.out.println("Your total marks is "+total);
        
        double avg_percentage = total/5;
        System.out.println("Your average is "+avg_percentage+"%");
        if (avg_percentage>90){
            System.out.println("Your grade is A");
        }
        else if (avg_percentage>75){
            System.out.println("Your grade is B");
        }
        else if (avg_percentage>60){
            System.out.println("Your grade is C");
        }
        else if (avg_percentage>40){
            System.out.println("Your grade is D");
        }
        else {
            System.out.println("You are Fail");
        }
    }
}

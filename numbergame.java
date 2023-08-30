import java.util.*;

public class numbergame {
    
    public static void main(String[] args) {
        int no_of_rounds=0;
        int no_of_wons=0;
        Scanner sc = new Scanner(System.in);
        int a= (int)(Math.random()*101);
        System.out.print("Want to play a guessing game?\n \"yes\" or \"no\": ");
        String c= sc.nextLine();
        do{
            if (c.equals("yes")){
                no_of_rounds++;
                for(int i=1; i<=5; i++) {
                    System.out.print("give the number");
                    int b=sc.nextInt();
                    if(b==a){
                        System.out.println("your guess is correct");
                        System.out.println("your attempt no is: "+i);
                        no_of_wons++;
                        break;
                    }
                    else if(b<a){
                        System.out.println("your guess is low: ");
                    }
                    else if(b>a){
                        System.out.println("your guess is high: ");
                    }
                }
                System.out.println("your number is: "+a);
                sc.nextLine();
                
                System.out.println("do you want to play again? \n \"yes \" or \"no\"");
                c=sc.nextLine();
            }
                                
            else if(c.equals("no")){
                System.out.println("Exiting.....");
            }
            else{
                System.out.println("invalid input");
            }
        }while(c.equals("yes"));
        System.out.println("total round played: "+no_of_rounds);
        System.out.println("totalround wons: "+no_of_wons);
    }
}
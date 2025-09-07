
import java.util.Scanner;


public class GuessNumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); 
        int mynum = (int)(Math.random()*100);
        int Usernum=0;
        do{
            System.out.println("Guess my number(1-100):");
            Usernum=sc.nextInt();
            if(Usernum==mynum){
                System.out.println("WOWWWWWW... YOU WON THE GAME.. ITS CORRECT NUMBER**");
                break;
            }
            else if (Usernum>mynum){
                System.out.println("Your Number is Large");
            }

            else{
                System.out.println("Your Number is Small");
            }
        } while(Usernum>=0);
        System.out.println(" My number was:  "+ mynum);
        sc.close();   
    }
}
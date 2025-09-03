

import java.util.Scanner;
public class Prize {
    public static void main(String[]args){
        Scanner sc =new Scanner (System.in);
        int cash=sc.nextInt();
        if (cash<10 ){
            System.out.println("can not buy anything");
        }
        else if (cash>10&&cash<50){
            System.out.println("canbuy one thing");
        }
        else{
            System.out.println("can buy anything");
        }
    }
}

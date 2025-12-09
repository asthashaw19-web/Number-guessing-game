import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int mynum = (int)(Math.random()*100);
        int usernum = 0;

        do{
            System.out.println("guess my num :");
            usernum = Sc.nextInt();

            if (usernum == mynum) {
                System.out.println("woohoo.. correct number!!");
                break;
            }
            else if(usernum > mynum){
                System.out.println("your number is too large");
            }
            else{
                System.out.println("your number is too small");
            }
        } while(usernum >= 0);

        System.out.print("my number was : ");
        System.out.println("mynum");
        Sc.close();
    }
    
}

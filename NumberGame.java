import java.util.Scanner;


public class NumberGame
{
    
    public static void  guess(){
        int GuessedNum=0,a,trails;
        Scanner sc=new Scanner(System.in);

        int ranNum=1+(int)(100*Math.random());
    
        System.out.println("\nGame Description");
        System.out.println("Initially your score will be trails*10,if you guess the number at first attempt your score is same else after each attempt your score wil be deducted by 10 points.\nIf number is not guessed your score would be 0 after all attempts");
        System.out.println("\nEnter Number of trails you will need to guess the number:\n");
        trails=sc.nextInt();
        int score=trails*10;
        System.out.println("\nChoose a number between 1 to 100 within 10 trails");

        for(a=0;a<trails;a++){
            System.out.println("Start Guessing....");
            GuessedNum=sc.nextInt();

            if(ranNum==GuessedNum){
                System.out.println("\nCongratulations....You have guessed the number right!!!!");
                System.out.println("Your Score is "+score);

                break;
                

            }
            else if(ranNum>GuessedNum && a!=trails-1){
                System.out.println("\nThe number is greater than " +GuessedNum);
                score=score-10;
            }
            else if(ranNum<GuessedNum && a!=trails-1){
                System.out.println("\nThe number is lesser than " +GuessedNum);
                score=score-10;
            }

        }

        if(a==trails){
            System.out.println("\nYou have used all the "+trails+" trails  provided");

            System.out.println("The number you need to guess was "+GuessedNum);

            System.out.println("\nYOUR SCORE IS 0");
        }

    }
    public static void main(String[] args){
        guess();
    }

}
import java.util.*;
public class FirstProgram {
    public static void GuessingNumberGame()
    {
        Scanner sc=new Scanner(System.in);
        int number=1+(int)(100*Math.random());
        int k=5;
        int i,guess;
        System.out.println("A number is chosen between 1 to 100.Guesss the number within 5 trials");
        for(i=0;i<k;i++)
        {
            System.out.println("Guess the number");
            guess=sc.nextInt();
            if(number==guess)
            {
                System.out.println("Congratulations You guessed the number.");
                break;
            }
            else if (number>guess && i !=k-1) {
                System.out.println("The number is greater than " + guess);
            }
            else if (number<guess && i!=k-1) {
                System.out.println("The number is less than " + guess);   
            }
        }
        if(i==k)
        {
            System.out.println("You have exhausted k trials");
            System.out.println("The number was" + number);
        }
    }
    public static void main(String[] args) {
        GuessingNumberGame();
    }
}


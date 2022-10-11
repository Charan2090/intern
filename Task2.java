import java.util.*;
class My_First_Game
{
    public void play()
    {
        Random rand1 = new Random(); //usage of the random class for generating random numbers
        int num1 = rand1.nextInt(100); // for generating the pseudo random number from the computer
        System.out.println("Random Number generated\n");
        int x = (int)(Math.ceil(Math.log(100)));
        System.out.println("You have just " + x + " chances to guess the number\n");
        int reward = 100; //Used for correct guess
        int j = 0;
        for( j = 0; j < x; j++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number you have guessed? : \n");
            int a = sc.nextInt();
            if(a == num1)
            {
                System.out.println("Wow! You won the game!!!!!\n");
                System.out.println("Your score is " + reward);
                break;
            }
            else if(a > num1)
            {
                if(a - num1 > 25)
                {
                    System.out.println("Your guess extremely High!\n");
                }
                else
                {
                    System.out.println("Your guess nearly high!\n");
                }
            }
            else
            {
                if(num1 - a > 25)
                {
                    System.out.println("Your guess is extremely low!\n");
                }
                else
                {
                    System.out.println("Your guess is nearly low!\n");
                }
            }
            reward = reward - 10; //decreasing reward for every wrong guess
        }
        if(j == x)
        {
            System.out.println("Sorry!!!You are unable to guess the number\n");
            System.out.println("The random number is " + num1);
            reward = 0;
            System.out.println("Your reward is : " + reward);
        }
    }
}
public class Numguess {
    public static void main(String args[])
    {
        System.out.println("Welcome to the Number Guessing Game!!!\n");
        System.out.println("Enter your choice: 1.Play \n2.Exit \n");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if(option == 1)
        {
            My_First_Game g = new My_First_Game();
            g.play();
            System.out.println("Do you want to play again: Yes/No\n");
            String a = sc.next();
            while(a.equalsIgnoreCase("Yes"))
            {
                g.play();
                System.out.println("Do you want to play once again: Yes/No\n");
                a = sc.next();
            }
        }
        else {
            System.out.println("You are now exited!!!\n");
        }


    }
}

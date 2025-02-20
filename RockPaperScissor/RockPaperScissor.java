package RockPaperScissor;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {
  
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            
            String[] choices = {"rock", "paper", "scissors"};
            int rounds = 5;
            
            while (rounds-- > 0) {
                System.out.print("Enter rock, paper, or scissors: ");
                String userChoice = scanner.next().toLowerCase();
                String computerChoice = choices[random.nextInt(3)];
                
                System.out.println("Computer chose: " + computerChoice);
                
                if (userChoice.equals(computerChoice)) {
                    System.out.println("It's a tie!");
                } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                           (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                           (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Computer wins!");
                }
                System.out.println("---------------------------");
            }
            
            scanner.close();
        }    
}
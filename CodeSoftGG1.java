import java.util.Scanner; 

public class CodeSoftGG1 {
     
        public static void main(String[] args) 
       {
           System.out.println("Guess a Number Game. ");
      
           Scanner sc1 = new Scanner(System.in); 
           boolean
            playAgain;
           do {
              playGame();  // call subroutine to play one game
              System.out.println(" play again");
              playAgain = sc1.nextBoolean();  
              } while (playAgain);
          System.out.println("Exit.");
        }         
        
        static void playGame() {
            int computersNumber; 
            int usersGuess;      
            int guessCount;      
            computersNumber = (int)(100 * Math.random()) + 1;
            guessCount = 0;
            System.out.println();
            System.out.println(" guess the first number:");
            Scanner sc= new Scanner(System.in);   
            while (true) {
               usersGuess = sc.nextInt();  
               guessCount++;
               if (usersGuess == computersNumber) {
                  System.out.println("You got it in " + guessCount
                          + "   My number was " + computersNumber);
                  break;  
               }
               if (guessCount == 5) {
                  System.out.println("You lose.  The  number is " + computersNumber);
                  break;  
               }
               if (usersGuess < computersNumber)
                  System.out.println("the number is  too low. Try again:");
               else if (usersGuess > computersNumber)
                  System.out.println("the number is  too high.  Try again:");
            }
            System.out.println();
        } 
         
      }

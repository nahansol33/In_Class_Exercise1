package exercise1;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant May 2020
 * @modifiedby Hansol Na
 * @modified Fri May 26 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(randNumGen());
            card.setSuit(Card.SUITS[randSuitNum()]);
            hand[i] = card;
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        //This is for debugging:
        for (Card c:hand){
            System.out.println("The card number is: " + c.getValue() + "suit is: " + c.getSuit());
        }
        
        //Asking for user input and verifying
        Scanner input = new Scanner(System.in);
        System.out.print("Choose a card number between 1-13, 11 for jack, 12 for queen, 13 for king: ");
        int userCardNum = input.nextInt();
        System.out.print("\nNow choose a suit (1 for Hearts, 2 for Diamonds, 3 for Spades, 4 for Cloves) ");
        int userSuit = input.nextInt() - 1;
        //checking to see if the user's card is in the hands
        for (int i = 0; i < hand.length; i++){
            Card currentCard = hand[i];
            if ((currentCard.getValue() == userCardNum) && (currentCard.getSuit().equals(Card.SUITS[userSuit]))){
               printInfo(); 
            }
        } 
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     * @modifedBy Hansol Na May 26 2023
     */
    private static void printInfo() {
        //I'm done!
    	/*I Apologize for the confusion, but I have already modified this method when I first pushed it to github.
	This comment was made After it was pushed to show some changes*/
	//This comment was made on Jun 2, at 12:06pm for testing purposes
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Hansol, I do not have a nickname,");
        System.out.println();
        
        System.out.println("My career ambitions: Become a successfull software developer, or an App developer");
        System.out.println("-- I want to make a creative app that will have many users");
        System.out.println("-- Get a 4.0 GPA this term");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Soccer");
        System.out.println("-- Working out");
        System.out.println("-- Chilling with my cats");
        System.out.println("-- Watching movies");
	
	//I am adding a few more lines here to add more modification to the printInfo method
	System.out.println("I am looking forward to learning from you this term, Thank you very much!")
        System.out.println()
    }
    private static int randNumGen(){
        return 1 + (int)(Math.random()*13);
    }
    private static int randSuitNum(){
        return 1 + (int)(Math.random()*3);
    }

}

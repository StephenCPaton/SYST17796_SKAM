package project1_skam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



/* @author Manuel Martinez */
public class Project1_SKAM 
{

    /* @param args the command line arguments */
    public static void main(String[] args) 
    {
        
        //Start a game
        Game game = new Game();
        
//        for(int i = 0; i < 52; i++){
//            System.out.println("Card " + game.deck.get(i).suit + " " + game.deck.get(i).value);
//
//        }
        
        
        //Ask how many player between 1 and 4
        System.out.println("How many players will be playing(1-4): ");
        Scanner input = new Scanner(System.in);
        int numOfPlayers = input.nextInt();
        
        game.createPlayers(numOfPlayers);
        
        
        input.nextLine();
        //Name players
        for (int i = 1; i <= numOfPlayers; i++)
        {
            System.out.print("What do you want to name p" + i + ": ");

            game.players.get(i-1).name = input.nextLine();
        }
        
        //testing
//        for (int i = 0; i < numOfPlayers; i++)
//        {
//            System.out.println(game.players.get(i).name);
//        }

        game.dealCards();
        game.showCards();

        

        
    }

}

//Comment was successful

//Git Comment successful

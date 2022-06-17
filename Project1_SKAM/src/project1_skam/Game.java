/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1_skam;

import java.util.ArrayList;

/**
 *
 * @author manuelmartinez
 */
public class Game 
{
    public ArrayList<Card> deck = new ArrayList<>(); 
    public ArrayList<Player> players = new ArrayList<>(); 
    public Dealer dealer = new Dealer();
    
    Game()
    {
        generateDeck();
    }
    
    void generateDeck()
    {
        
        
        for(String suit: Card.SUITS){
            for(int i = 0; i < 13; i++){
                Card newCard = new Card(suit, i);
                
                deck.add(newCard);
            }
        }
    }
    
    public void createPlayers(int numOfPlayers)
    {
       
        for (int i = 0; i < numOfPlayers; i++)
        {
            Player newPlayer = new Player();
            
            players.add(newPlayer);
        }
        
    }
    
    public void dealCards()
    {
        for(Player player: players)
        {
            for (int i = 0; i < 2; i++)
            {
                int cardIndex = (int) (Math.random() * deck.size());
                player.hand.add(deck.remove(cardIndex));
                
            }
         }
        
//        for (int i = 0; i < 2; i++)
//        {
//            int cardIndex = (int) (Math.random() * deck.size());
//            dealer.hand.add(deck.remove(cardIndex));
//        }
        
    }
    
    public void showCards()
    {
        for(Player player: players)
        {
            for (int i = 0; i < 2; i++)
            {
                System.out.println(player.hand.get(i).suit + " " + player.hand.get(i).value);
            }

        }
    }
    
    
}

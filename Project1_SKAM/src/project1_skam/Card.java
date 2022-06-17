/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1_skam;

// @author manuelmartinez
public class Card 
{
    public enum Suit
    {
        HEARTS("Hearts"), 
        DIAMONDS("Diamonds"), 
        SPADES("Spades"), 
        CLUBS("Clubs");

        String name;

        Suit(String name)
        {
            this.name = name;
        }
    }
    
    
    public enum Value
    {
        ACE ("Ace", 1), 
        TWO ("Two", 2), 
        THREE ("Three", 3), 
        FOUR ("Four", 4), 
        FIVE ("Five", 5), 
        SIX ("Six", 6), 
        SEVEN ("Seven", 7), 
        EIGHT ("Eight", 8), 
        NINE ("Nine", 9), 
        TEN ("Ten", 10), 
        JACK ("Jack", 10), 
        QUEEN ("Queen", 10), 
        KING ("King", 10);
        
        String name;
        int value;
        
        Value(String name, int value)
        {
            this.name = name;
            this.value = value;
        }
    }
    
    private final Suit suit;
    private final Rank rank;

    public Card(Colour colour,Rank rank)
    {
        this.colour=colour;
        this.rank=rank;
    }
    /**
     * @return the suit
     */
    public Colour getColour() 
    {
        return colour;
    }

    /**
     * @return the value
     */
    public Rank getRank() 
    {
        return rank;
    }
}

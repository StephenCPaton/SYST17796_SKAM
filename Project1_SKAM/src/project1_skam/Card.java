/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1_skam;

// @author manuelmartinez
public class Card 
{
    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    public String suit;
    public int value; //1-13
    
    
    public Card(String suit, int value)
    {
        this.suit = suit;
        this.value = value;
    }
}

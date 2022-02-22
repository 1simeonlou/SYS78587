/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgame;

/**
 *
 * @author josel
 */
public class CardCompare {
    
    public static void cCompare(Card[] c, Card uc)
    {
        //compare with user input
        boolean match=false;
        for(Card card:c){
            if(card.getValue()==uc.getValue() && card.getSuit().equals(uc.getSuit()))
            {
                match=true;
                break;
            }
        
        }
        if(match)
            System.out.println("Your guess is right");
        else
            System.out.println("sorry no match");
        
    }
    
}

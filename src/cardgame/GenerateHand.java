/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgame;

import java.util.Random;

/**
 *
 * @author josel
 */
public class GenerateHand {
    public static Card[] handGenerate()
    {
        //create an array to hold 7 cards
        Card[] magicHand = new Card[7];
        
        Random random=new Random();
        //generating a hand of 7 cards
        for (int i=0; i<magicHand.length; i++)
        {
           Value value=Value.values()[random.nextInt(13)];
           Suit suit=Suit.values()[random.nextInt(4)];
           Card c = new Card(value,suit);
            magicHand[i]=c;
        }
        
        return magicHand;
    }
}

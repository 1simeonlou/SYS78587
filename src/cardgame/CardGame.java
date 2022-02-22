/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package cardgame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Megha Patel
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
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
        System.out.println("cards in magicHand: ");
        for(Card card:magicHand) {
            System.out.println("value: "+card.getValue()+ " Suit: "+card.getSuit());
            }
        //user input
        System.out.println("Pick a suit:");
        for(int i=0;i<Suit.values().length;i++)
        {
            System.out.println((i+1)+": "+Suit.values()[i]);
        }
        int suit= input.nextInt()-1;
        
        System.out.println("Enter a value: ");
         for(int i=0;i<Value.values().length;i++)
        {
            System.out.println((i+1)+": "+Value.values()[i]);
        }
        int valuePos=input.nextInt()-1;
        Card userCard=new Card(Value.values()[valuePos],Suit.values()[suit]);
        
        //compare with user input
        boolean match=false;
        for(Card card:magicHand){
            if(card.getValue()==userCard.getValue() && card.getSuit().equals(userCard.getSuit()))
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


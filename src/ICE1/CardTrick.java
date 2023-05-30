/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.CardTrick to edit this template
 */
package ICE1;

/**
 *
 * @author Jay
 */
import java.util.*;
 class Card {

    private String suit; //clubs, spades, diamonds, hearts
    private int value;//1-13

    public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
   
    
    
}
public class CardTrick {
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
           
          c.setValue((int)(Math.random() * 13 + 1));
           
          c.setSuit(Card.SUITS[(int)(Math.random() *3+0)]);
        
            magicHand[i]=c;
        }

      
        Scanner sc=  new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 13");
        int entered_num = sc.nextInt();
        while(entered_num <1 || entered_num>13){
                    System.out.println("Wrong Input, Please enter a number from 1 to 13");
                    entered_num = sc.nextInt();
        }

        System.out.println("Please enter the suit from Clubs, Spades, Diamonds, Hearts");
        String str = sc.next();
       
        
        while( str.equals("Hearts")==false && str.equals("Clubs")==false && str.equals("Spades")==false && str.equals("Diamonds")==false ){
            System.out.println("Wrong Input, Please enter a correct Suit");
                    str = sc.next();
        }
        
       int ans = 0;
     

       System.out.println("The Values set by System are as follows : \n");
for(int i = 0;i<magicHand.length; i++){

   
    System.out.println("Value = "+magicHand[i].getValue()+"\tSuit = "+magicHand[i].getSuit() );
}
    
    System.out.println("\n\nYour Selections are Value: "+entered_num + "\tSuit = "+str+"\n");
     

        for(int i=0; i<magicHand.length;i++)
        {
            if((magicHand[i].getValue()==entered_num) && (magicHand[i].getSuit().equals(str))){
                ans = 1;
                break;
            }
                
        }
        
        
        
       if(ans==1) System.out.println("Oh yeah, You Won\n ");
       else System.out.println("Oops No Match, Try again\n");
        sc.close();
    }    
}


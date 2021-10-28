package be.intechbrussel.association;

import java.util.Random;

public class HigherLowerGame {

    //Chapter 9 Example 1
    private int value;
    private int max;
    private Random rand;

    public void higherLowerGame(int max) {
        this.max = max;
        rand = new Random();
        reset();
    }

    public void reset() {
        value = rand.nextInt(max + 1);
    }
    public int guess(int guessValue) {
        if(guessValue<value){
            return -1;
        }
        else if(guessValue>value){
            return 1;
        }
        else{
            return 0;
        }

    }
}

package com.ICT221.mathgame;

import java.util.Random;
import java.util.Scanner;
/**
 * This is a simple math game for grades 3-5.
 *
 * @author Martin Kojoni
 */
public class MathGame {
    int num1, num2, ans, att;
    int score = 0;
    Random rand = new Random();
    Scanner in = new Scanner(System.in);

    public void sumGenerator(){
        num1 = rand.nextInt(10);
        num2 = rand.nextInt(10);
        ans = num1 + num2;

        System.out.println(num1 +  " + " + num2 );
    }//sumGenerator Method

    public void answerGetter_score(){
        att = in.nextInt();
        if(att == ans){
            score = score + 1;
            System.out.println("Correct");
            System.out.println("Score is currently: " + score + "/5");
        }else{
            score = score - 1;
            System.out.println("Incorrect");
            System.out.println("Score is currently: " + score + "/5");
        }//else
    }//answer Getter method
}//machine class


class Quiz {
    public static void main(String[] args) {
        MathGame machine1 = new MathGame();
        System.out.println("***Welcome to addition Math test***");

        for (int i = 5; i > 0; i--) {
            machine1.sumGenerator();
            machine1.answerGetter_score();
        }
        System.out.println("Thanks for taking the test.");
    }//main method
}
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
    boolean repeadThePreviousQuestion = false;
    int reattempts = 3;
    String jokeAnswer;
    char attJoke;

    Random rand = new Random();
    Scanner in = new Scanner(System.in);

    public void randomNumbersCreator(){
        num1 = rand.nextInt(50);
        num2 = rand.nextInt(50);
    }

    public void additionGenerator(){

        ans = num1 + num2;
        System.out.println(num1 +  " + " + num2 );
    }

    public void subtractionGenerator(){

        ans = num1 - num2;

        System.out.println(num1 +  " - " + num2 );
    }//sumGenerator Method

    public void multiplicationGenerator(){

        ans = num1 * num2;

        System.out.println(num1 +  " * " + num2 );
    }//sumGenerator Method

    public void divisionGenerator(){

        ans = num1 / num2;

        System.out.println(num1 +  " / " + num2 );
    }//sumGenerator Method

    public void jokeGenerator(){
        repeadThePreviousQuestion = false;
        int randomJoke = rand.nextInt(3);
        if(randomJoke == 0){
            System.out.println("How are you doing?");

        }else if(randomJoke == 1){
            System.out.println("What would coloure is the Napeleon white whorse?");

        }else {
            System.out.println("What is my name?");

        }

        attJoke = in.next().charAt(0);
        repeadThePreviousQuestion = false;
        System.out.println("Good one!");

    }//
    public void answerGetter_score(){
        att = in.nextInt();
        if(att == ans){

            score = score + 1;
            System.out.println("Correct");
            System.out.println("Score is currently: " + score + "/5");
            repeadThePreviousQuestion = false;
        }else{

            /* score = score - 1; */
            System.out.println("Incorrect");
            System.out.println("Score is currently: " + score + "/5");
            repeadThePreviousQuestion = true;
        }
    }
}


class Quiz {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        MathGame machine1 = new MathGame();
        System.out.println("***Welcome to Basic Algebra, Math test***");
        System.out.println("***You have only 3 re-attempts in total***" );

        int questionType = rand.nextInt(5);
        machine1.randomNumbersCreator();
        int i;
do{

    machine1.reattempts = 3;

        for (i = 5; i > 0; i--) {

            //generating a random number and then in switch case deciding what question to ask based on that num
            switch(questionType){
                case 0:

                    machine1.additionGenerator();
                    machine1.answerGetter_score();

                    if(machine1.repeadThePreviousQuestion & machine1.reattempts > 0){
                        questionType = questionType;
                        machine1.reattempts = machine1.reattempts - 1;
                        i++;
                    } else {
                        machine1.randomNumbersCreator();
                        questionType = rand.nextInt(5);
                    }

                    break;

                case 1:

                    machine1.subtractionGenerator();
                    machine1.answerGetter_score();

                    if(machine1.repeadThePreviousQuestion & machine1.reattempts > 0){
                        questionType = questionType;
                        machine1.reattempts = machine1.reattempts - 1;
                        i++;
                    } else {
                        machine1.randomNumbersCreator();
                        questionType = rand.nextInt(5);
                    }

                    break;

                case 2:

                    machine1.multiplicationGenerator();
                    machine1.answerGetter_score();

                    if(machine1.repeadThePreviousQuestion & machine1.reattempts > 0){
                        questionType = questionType;
                        machine1.reattempts = machine1.reattempts - 1;
                        i++;
                    } else {
                        machine1.randomNumbersCreator();
                        questionType = rand.nextInt(5);
                    }

                    break;

                case 3:

                    machine1.divisionGenerator();
                    machine1.answerGetter_score();

                    if(machine1.repeadThePreviousQuestion & machine1.reattempts > 0){
                        questionType = questionType;
                        machine1.reattempts = machine1.reattempts - 1;
                        i++;
                    } else {
                        machine1.randomNumbersCreator();
                        questionType = rand.nextInt(5);
                    }

                    break;


                case 4:

                    machine1.jokeGenerator();
                    questionType = rand.nextInt(5);
                    break;
            }
        }
    System.out.println("Would you like to go for a another round(y/n)?");
} while(Character.compare(in.next().charAt(0), 'y') == 0);

        System.out.println("Thanks for taking the test.");
        System.out.println("Your final Score for this game is: " + machine1.score + "/5");
    }
}
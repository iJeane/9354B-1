package com.codeforces;

import java.util.Scanner;
import java.util.ArrayList;

public class FairGame {

    public static void Main(String[] args){
        Scanner input = new Scanner(System.in);
        int petya = 0;
        int vasya = 0;
        boolean turn = true;
        int numOfCards = input.nextInt();
        ArrayList<Integer> cards = new ArrayList<>();

        for(int i = 0; i < numOfCards; i++){
            cards.add(input.nextInt());
        }

        for(int i = 0; i < cards.size(); i++){
            for(int j = i + 1; j < cards.size(); j++){
                if(cards.get(i) == cards.get(j)){
                    if(turn){
                        petya++;
                    }else{
                        vasya++;
                    }
                    cards.remove(j);
                    j--;
                }
            }
            turn = !turn;
        }

        if(cards.size() == 4 &&
          (cards.contains(1) &&
           cards.contains(2) &&
           cards.contains(3) &&
           cards.contains(4))){
            System.out.println("NO");
        }else{

            if(petya == vasya){
                System.out.println("YES");

                for(int temp : cards){
                    System.out.print(temp + " ");
                }
            }else{
                System.out.println("NO");
            }

        }

    }

}
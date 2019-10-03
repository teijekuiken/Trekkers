package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Trekker> parade = new ArrayList<>();


        for(int i = 0; i < 75; i++){
            int rand = (int)(Math.random() * 3);

            switch(rand){
                case 0:
                    parade.add(new JohnDeere());
                case 1:
                    parade.add(new Fendt());
                case 2:
                    parade.add(new NewHolland());
            }
        }

        for(Trekker trekker: parade){
            trekker.doeToeteren();
        }

    }
}

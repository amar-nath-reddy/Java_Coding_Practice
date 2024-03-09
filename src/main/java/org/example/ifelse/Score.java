package org.example.ifelse;

public class Score {
    public static void main(String[] args) {
        boolean game_over = true ;
        int score = 10000;
        int level_completed = 8;
        int bonus = 200;
        int final_score = score;
        if(game_over){

            if (score >= 1000 && level_completed ==8){
                final_score += (level_completed*bonus);
                System.out.println("Final score with bonus:"+final_score);
            }
        }
    }
}

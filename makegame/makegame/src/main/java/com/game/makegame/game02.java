package com.game.makegame;

import com.game.makegame.comsole.Sping01Config;
import com.game.makegame.game.GameRunner;
import com.game.makegame.game.MarioGame;
import com.game.makegame.game.Pacman;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.naming.Context;

public class game02 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext();

        var game1 = new MarioGame();
        var game = new Pacman();
        var gameRunner= new GameRunner(game, game1);
        System.out.println(gameRunner);


//        var game = new MarioGame();
//        //var game= new PacmanGame();
//        var gameRunner = new Sping01Config(game);
//        gameRunner.run();
    }
}

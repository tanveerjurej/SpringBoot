package com.game.makegame.game;

public class GameRunner {
    public GameRunner(Pacman game, MarioGame game1) {
        game.up();
        game.down();
        game.left();
        game.right();
        game1.up();
        game1.down();
        game1.right();
        game1.left();
    }
}

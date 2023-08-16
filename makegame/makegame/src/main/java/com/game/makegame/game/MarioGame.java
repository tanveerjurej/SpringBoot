package com.game.makegame.game;

public class MarioGame implements mediator{

    public void up(){
        System.out.println("jump");
    }
    public void down(){
        System.out.println("get into the hole ");
    }
    public void left(){
        System.out.println("pause");

    }
    public void right()
    {
        System.out.println("go to menu");
    }
}

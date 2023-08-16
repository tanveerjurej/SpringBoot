package com.game.makegame.comsole;

import com.game.makegame.game.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Sping01Config {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("adress"));
        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person2"));
    }


}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Client
 */

public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld() {    
        super(600, 400, 1);
        GreenfootImage bg = new GreenfootImage("room.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
    }
}

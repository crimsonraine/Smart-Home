import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Simple Instructions Text
 */

public class Instructions extends Actor
{
    private GreenfootImage instructions;
    
    public Instructions() {
        instructions = new GreenfootImage("instruction.png");
        instructions.scale(instructions.getWidth() / 2, instructions.getHeight() / 2);
        setImage(instructions);
    }
    
    public void toggle() {
        if (getImage().getTransparency() < 1) getImage().setTransparency(255);
        else getImage().setTransparency(0);
    }
}

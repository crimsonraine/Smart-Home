import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fireplace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireplace extends Light
{
    private GreenfootSound fireplaceSound;

    public Fireplace() {
        super("fire_on.png", "fire_off.png");
        fireplaceSound = new GreenfootSound("fire.mp3");
    }

    @Override
    public void flipLight() {
        super.flipLight();
        if (super.lightOn) {
            fireplaceSound.playLoop();
        }
        else {
            fireplaceSound.pause();
        }

    }
}

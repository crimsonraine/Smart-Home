import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Receiver - defines the operations called by commands and carries out requests
 */

public class Fireplace extends Light
{
    private GreenfootSound fireplaceSound;

    public Fireplace() {
        super("fire_on.png", "fire_off.png");
        fireplaceSound = new GreenfootSound("fire.mp3");
    }

    @Override
    public void flipLight() { // method to be associated with a command
        super.flipLight();
        if (super.lightOn) {
            fireplaceSound.playLoop();
        }
        else {
            fireplaceSound.pause();
        }

    }
}

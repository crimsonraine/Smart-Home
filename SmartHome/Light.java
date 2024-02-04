import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Receiver - defines the operations called by commands and carries out requests
 */

public class Light extends Actor
{
    protected boolean lightOn;
    private GreenfootImage onImage;
    private GreenfootImage offImage;

    public Light() {
        onImage = new GreenfootImage("light_on.png");
        onImage.scale(onImage.getWidth() * 2,onImage.getHeight() * 2);
        offImage = new GreenfootImage("light_off.png");
        offImage.scale(offImage.getWidth() * 2,offImage.getHeight() * 2);
        updateImage();
        lightOn = false;
    }
    
    public Light(String onImageLoc, String offImageLoc) {
        onImage = new GreenfootImage(onImageLoc);
        onImage.scale(onImage.getWidth() * 2,onImage.getHeight() * 2);
        offImage = new GreenfootImage(offImageLoc);
        offImage.scale(offImage.getWidth() * 2,offImage.getHeight() * 2);
        updateImage();
        lightOn = false;
    }

    public void flipLight() { // method to be associated with a command
        if (lightOn) {
            turnLightOff();
        }
        else {
            turnLightOn();
        }
    }

    public void turnLightOn() {
        lightOn = true;
        updateImage();
    }

    public void turnLightOff() {
        lightOn = false;
        updateImage();
    }

    private void updateImage() {
        if (lightOn) {
            setImage(onImage);
        } else {
            setImage(offImage);
        }
    }
}

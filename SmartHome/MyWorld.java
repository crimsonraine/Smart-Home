import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Client
 */

public class MyWorld extends World
{
    private String lastKey = "";
    private ArrayList<GreenfootImage> bgs;
    private Instructions instructions;
    private SmartHomeRemote remote;
    private ArrayList<Light> lights;
    private int[] on;
    private TV television;

    public MyWorld() {    
        super(600, 400, 1);
        String[] bg_imgs = {"room_darkest.png", "room_dark.png",
                "room_slight_tint.png", "room.png"};

        bgs = new ArrayList<>();
        for (String bg : bg_imgs) {
            GreenfootImage img = new GreenfootImage(bg);
            img.scale(getWidth(), getHeight());
            bgs.add(img);
        }
        setBackground(bgs.get(0));

        remote = new SmartHomeRemote();

        Light floorLight1 = new Light();
        addObject(floorLight1, getWidth() / 6, getHeight() * 7 / 20);

        Light floorLight2 = new Light();
        addObject(floorLight2, getWidth() *  8 / 9, getHeight() * 7 / 9);

        Light falseFirePlace = new Fireplace();
        addObject(falseFirePlace, getWidth() *  9 / 10, getHeight() * 3 / 10);

        lights = new ArrayList<>();
        lights.add(floorLight1);
        lights.add(floorLight2);
        lights.add(falseFirePlace);

        on = new int[lights.size()];

        
        television = new TV();
        addObject(television, getWidth() / 4, getHeight() * 5 / 8);
        
        instructions = new Instructions();
        addObject(instructions, getWidth() / 2, getHeight() / 2);
    }

    private void checkKeys() {
        String key = Greenfoot.getKey();
        if (key != null && !key.equals(lastKey)) {
            switch (key) {
                case "p":
                    hitButton(new TVPlayPauseCommand(television));
                    break;
                case "o":
                    hitButton(new TVOnOffCommand(television));
                    break;
                case "d":
                    hitButton(new TVSkipCommand(television));
                    break;
                case "a":
                    hitButton(new TVBackCommand(television));
                    break;
                case "w":
                    hitButton(new TVVolUpCommand(television));
                    break;
                case "s":
                    hitButton(new TVVolDownCommand(television));
                    break;
                case "1":
                    hitButton(new LightFlipCommand(lights.get(0)));
                    updateLighting(0);
                    break;
                case "2":
                    hitButton(new LightFlipCommand(lights.get(1)));
                    updateLighting(1);
                    break;
                case "3":
                    hitButton(new LightFlipCommand(lights.get(2)));
                    updateLighting(2);
                    break;
                case "space":
                    hitButton(new InstructionToggleCommand(instructions));
                    break;
            }
        }
        lastKey = key;
    }

    public void act() {
        checkKeys();
    }

    private void hitButton(ICommand command) {
        remote.setCommand(command);
        remote.executeCommand();
    }

    private void updateLighting(int i) {
        if (on[i] == 1) on[i] = 0;
        else on[i] = 1;

        int level = 0;
        for (int j : on) level += j;
        setBackground(bgs.get(level));
    }
}

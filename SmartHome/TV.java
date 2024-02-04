import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Receiver
 */

public class TV extends Actor {

    private boolean tvOn;
    private boolean isPaused;
    private GreenfootImage onImage;
    private GreenfootImage offImage;
    private int volume;
    private ArrayList<GreenfootSound> tracks;
    private int currentTrack;

    public TV() {
        tvOn = false;
        isPaused = true;
        volume = 50;
        onImage = new GreenfootImage("tv_on.png");
        onImage.scale(onImage.getWidth() / 6,onImage.getHeight() / 6);
        offImage = new GreenfootImage("tv_off.png");
        offImage.scale(offImage.getWidth() / 6,offImage.getHeight() / 6);

        tracks = new ArrayList<>();
        tracks.add(new GreenfootSound("track1.mp3"));

        tracks.add(new GreenfootSound("track2.mp3"));
        tracks.add(new GreenfootSound("track3.mp3"));
        tracks.add(new GreenfootSound("track4.mp3"));

        currentTrack = 0;

        updateImage();
    }

    public void toggleTV() {
        tvOn = !tvOn;
        updateImage();
    }

    public void playPause() {
        if (tvOn) isPaused = !isPaused;
    }

    private void updateTVTrack() {
        if (isPaused || !tvOn) {
            tracks.get(currentTrack).pause();
        }
        else if (tracks.get(currentTrack).isPlaying()) {
            tracks.get(currentTrack).setVolume(volume);
        }
        else {
            tracks.get(currentTrack).playLoop();
        }
    }

    public void volumeUp() {
        if (tvOn && volume < 100) {
            volume = volume + 10;
        }
    }

    public void volumeDown() {
        if (tvOn && volume > 0) {
            volume = volume - 10;
        }
    }

    public void skip() {
        chooseSong(1);
    }

    public void back() {
        chooseSong(-1);
    }

    private void chooseSong(int direction) {
        if (tvOn) {
            isPaused = true;
            updateTVTrack();
            isPaused = false;
            currentTrack =
                (tracks.size() + currentTrack + direction) % tracks.size();
        }
    }

    private void updateImage() {
        if (tvOn) {
            setImage(onImage);
        } else {
            setImage(offImage);
        }
    }
    
    public void act() {
        updateTVTrack();
        updateImage();
    }
}

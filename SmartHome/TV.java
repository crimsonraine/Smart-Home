import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

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
        isPaused = false;
        volume = 50;
        onImage = new GreenfootImage("tv_on.png");
        onImage.scale(onImage.getWidth() / 5,onImage.getHeight() / 5);
        offImage = new GreenfootImage("tv_off.png");
        offImage.scale(offImage.getWidth() / 5,offImage.getHeight() / 5);

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
        if (tvOn) {
            isPaused = !isPaused;
            updateTVTrack();
        }
    }

    private void updateTVTrack() {
        updateImage();
        if (isPaused) {
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
            volume++;
            updateTVTrack();
        }
    }

    public void volumeDown() {
        if (tvOn && volume > 0) {
            volume--;
            updateTVTrack();
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
            playPause();
            currentTrack =
                (tracks.size() + currentTrack + direction) % tracks.size();
            updateTVTrack();
        }
    }

    private void updateImage() {
        if (tvOn) {
            setImage(onImage);
        } else {
            setImage(offImage);
        }
    }
}

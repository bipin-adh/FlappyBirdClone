package com.nabgstudios.flappybirdclone;

public class BackgroundImage {

    private int backgroundImageX, backgroundImageY, backgroundImageVelocity;

    public BackgroundImage() {
        backgroundImageX = 0;
        backgroundImageY = 0;
        backgroundImageVelocity = 10;
    }

    // Getter method for getting the X-coordinate
    public int getX() {
        return backgroundImageX;
    }

    // Getter method for getting the Y-coordinate
    public int getY() {
        return backgroundImageY;
    }

    // Setter method for X-coordinate
    public void setX(int backgroundImageX) {
        this.backgroundImageX = backgroundImageX;
    }

    // Setter method for Y-coordinate
    public void setY(int backgroundImageY) {
        this.backgroundImageY = backgroundImageY;
    }

    // Getter method for getting the velocity
    public int getVelocity(){
        return backgroundImageVelocity;
    }
}

package com.nabgstudios.flappybirdclone;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class BitmapBank {

    Bitmap background;

    public BitmapBank(Resources res) {

        background = BitmapFactory.decodeResource(res, R.drawable.background1024x512);
        background = scaleImage(background);
    }

    /**
     * Returns background bitmap
     */
    public Bitmap getBackground() {
        return background;
    }

    /**
     * Returns background width
     */
    public int getBackgroundWidth() {
        return background.getWidth();
    }

    /**
     * Returns background height.
     */
    public int getBackgroundHeight() {
        return background.getHeight();
    }

    /**
     *  method to fit the background to screen
     */

    public Bitmap scaleImage(Bitmap bitmap){
        float widthHeightRatio = getBackgroundWidth() / getBackgroundHeight();
        /**
         * We will multiply width height ratio with screenHeight to get scaled width of the bitmap.
         * Then call createScaledBitmap() to create a new bitmap,
         * scaled from an existing bitmap, when possible.
         */
        int backgroundScaledWidth = (int)widthHeightRatio * AppConstants.SCREEN_HEIGHT;
        return Bitmap.createScaledBitmap(bitmap,backgroundScaledWidth,AppConstants.SCREEN_HEIGHT,false);
    }
}
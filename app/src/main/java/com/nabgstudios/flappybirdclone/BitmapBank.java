package com.nabgstudios.flappybirdclone;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class BitmapBank {

    Bitmap background;

    public BitmapBank(Resources res) {

        background = BitmapFactory.decodeResource(res, R.drawable.background);
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
}
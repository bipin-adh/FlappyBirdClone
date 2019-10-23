package com.nabgstudios.flappybirdclone;

import android.content.Context;

public class AppConstants {

    static BitmapBank bitmapBank; // Bitmap object reference
    static GameEngine gameEngine; // GameEngine object reference

    public static void initialization(Context context){
        bitmapBank = new BitmapBank(context.getResources());
        gameEngine = new GameEngine();
    }

    // Return BitmapBank instance
    public static BitmapBank getBitmapBank(){
        return bitmapBank;
    }

    // Return GameEngine instance
    public static GameEngine getGameEngine(){
        return gameEngine;
    }
}

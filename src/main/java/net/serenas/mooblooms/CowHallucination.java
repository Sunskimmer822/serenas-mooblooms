package net.serenas.mooblooms;

import net.minecraft.client.MinecraftClient;
import net.minecraft.util.Identifier;

public class CowHallucination {

    private int velocity;
    private int x;
    private int y;
    private Identifier texture;
    private int hWidth;
    private int hHeight;

    public CowHallucination(MinecraftClient client) {
        int wWidth = client.getWindow().getWidth();
        int wHeight = client.getWindow().getHeight();


        this.x = (int)(Math.round(Math.random())*wWidth);
        this.y = (int)(Math.random()*wHeight);
        
        hWidth = (int)(Math.random()*(wWidth*0.1));
        hHeight = (int)(Math.random()*(wHeight*0.1));
        
        this.velocity = (int)(1 + Math.random()*0.01*wWidth);
        texture = new Identifier("serenas-mooblooms", "cow");

        if (x == wWidth) {
            velocity = -velocity;
            texture = new Identifier("serenas-mooblooms", "backwards_cow");
        }
    }

    public int getVelocity() {
        return velocity;
    }

    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }

    public Identifier getTexture() {
        return texture;
    }

    public void setX(int newX) {
        x = newX;
    }

    public int getWidth() {
        return hWidth;
    }

    public int getHeight() {
        return hHeight;
    }


    public static int getRandomDimension(int lastDimension) {





        return 0;
    }
}

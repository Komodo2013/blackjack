package src.draw;

import java.awt.*;

public class Snowman extends DrawTreeBaseline.LandscapeObject {

    private int MID = 250;

    private int TOP = 300;

    private String bodyColor;

    private String hatColor;


    public Snowman(Graphics2D g2, int x, int y, double scale, String s_bodyColor, String s_hatColor) {
        super(g2, x, y, scale);
        this.bodyColor = "#" + s_bodyColor;
        this.hatColor = "#" + s_hatColor;
    }

    @Override
    public void draw() {
        applyScale();
        drawBody();
        drawHat();
    }

    private void drawHat() {
        int x = this.getStartX();
        int y = this.getStartY();

        g2.setColor (Color.black);
        g2.fillOval (x-10, y+10, 5, 5);   // left eye
        g2.fillOval (x+5, y+10, 5, 5);    // right eye
        g2.drawArc (x-10, y+20, 20, 10, 190, 160);   // smile
        g2.drawLine (x-25, y+60, x-50, y+40);  // left arm
        g2.drawLine (x+25, y+60, x+55, y+60);  // right arm
        g2.fillOval (x-3, y+50, 5, 5);    // first  button
        g2.fillOval (x-3, y+70, 5, 5);    // first  button
        g2.fillOval (x-3, y+100, 5, 5);    // second button
        g2.fillOval (x-3, y+120, 5, 5);    // second button
        g2.drawLine (x-20, y+5, x+20, y+5);  // brim of hat
        g2.fillRect (x-15, y-20, 30, 25);        // top of hat
    }

    private void drawBody() {
        int x = this.getStartX();
        int y = this.getStartY();
        g2.setColor (Color.white);
        g2.fillOval (x-20, y, 40, 40);
        g2.fillOval (x-35, y+35, 70, 50);
        g2.fillOval (x-50, y+80, 100, 60);
    }

    @Override
    public void applyScale() {
        this.MID *= this.getScale();
        this.TOP *= this.getScale();
    }
}

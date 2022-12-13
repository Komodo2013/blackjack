package src.draw;

import java.awt.*;
import java.util.Random;

public class Present extends LandscapeObject {

    public static final String LARGE = "LARGE";
    public static final String SMALL = "SMALL";
    public static final String REG = "REG";
    private String type = "";

    private int dx = 15;
    private int dy = 15;

    Color[] colors = {new Color(255, 36, 36), new Color(47, 112, 66), new Color(229, 217, 22),
            new Color(74, 208, 234), new Color(133, 3, 161), new Color(49, 34, 157)};
    private Color black = new Color(0, 0,0);

    public Present(Graphics2D g2, int x, int y, double scale, String type) {
        super(g2, x, y, scale);
        this.type = type;
    }


    @Override
    public void draw() {
        applyScale();

        switch (type){
            case LARGE -> {
                this.dx = 40;
                this.dy = 30;
            }
            case REG -> {
                this.dx = 25;
                this.dy = 25;
            }
            case SMALL -> {
                this.dx = 15;
                this.dy = 30;
            }
        }

        Random r = new Random();
        g2.setColor(colors[r.nextInt(0, colors.length)]);
        g2.fillRect(super.getStartX(), super.getStartY(), dx, dy);

        g2.setColor(g2.getColor().brighter().brighter());
        g2.setStroke(new BasicStroke(3));
        g2.drawLine(super.getStartX() + dx/2 +2, super.getStartY() +2,
                super.getStartX() + dx/2 -2, super.getStartY() + dy -2);
        g2.drawLine(super.getStartX() +2, super.getStartY() + dy/2 +2,
                super.getStartX() + dx -2, super.getStartY() + dy/2 -2);

        g2.setStroke(new BasicStroke(1));
        g2.setColor(black);
        g2.drawRect(super.getStartX(), super.getStartY(), dx, dy);

    }

    @Override
    public void applyScale() {
        this.dx *= getScale();
        this.dy *= getScale();
    }
}

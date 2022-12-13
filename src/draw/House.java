/**
 * File: House.java
 * Description: Creating the House drawing
 * Lessons Learned: In this lesson I learned how to use switch to draw
 * Creating a house object with switch
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Jacob Larsen & Miguel Espinoza.
 * @since: 12/12/2022.
 */

package src.draw;

import java.awt.*;
import java.util.Random;

public class House extends LandscapeObject{

    public static final String LOG = "LOG";
    public static final String PLASTER = "PLASTER";
    private String type = "";

    public static final String TRIANGLE = "TRIANGLE";
    public static final String RECTANGLE = "RECTANGLE";
    private String roof = "";

    private int dx = 150;
    private int dy = 75;

    Color[] colors = {new Color(131, 74, 74), new Color(208, 84, 202), new Color(246, 241, 183),
            new Color(33, 90, 101), new Color(85, 0, 101), new Color(90, 71, 231)};
    private Color black = new Color(0, 0,0);
    private Color window = new Color(107, 207, 236);

    /**
     * Primary Constructor.
     * Sets all class attributes.
     *
     * @param    g2            The Graphics2D interface.
     * @param    x            An int.  The startX coordinate.  currentX is also set to x upon object creation.
     * @param    y            An int.  The startY coordinate.  currentX is also set to y upon object creation.
     * @param    scale        A double.  Scale multiplier for the object.
     * @return void
     */
    public House(Graphics2D g2, int x, int y, double scale, String type, String roof) {
        super(g2, x, y, scale);
        this.type = type;
        this.roof = roof;
    }

    @Override
    public void draw() {
        Random r = new Random();
        Color body = Color.BLACK;
        Color roofColor = Color.BLACK;

        switch (type){
            case LOG -> {
                body = new Color(0x653200);
                roofColor = new Color(0x013600);
                g2.setColor(body);

                g2.fillRect(getStartX(), getStartY(), dx, dy);
                int off = 10;
                for (int i = 0; i < 5; i++) {
                    g2.fillPolygon(new int[] {getStartX() - r.nextInt(-0, off),
                                    getStartX() + dx + r.nextInt(-0, off),
                                    getStartX() + dx + r.nextInt(-0, off),
                                    getStartX() - r.nextInt(-0, off)},
                            new int[]{getStartY() + r.nextInt(-0, off) + i * dy/5,
                                    getStartY() + r.nextInt(-0, off) + i * dy/5,
                                    getStartY() + r.nextInt(-0, off) + (i+1) * dy/5,
                                    getStartY() + r.nextInt(-0, off) + (i+1) * dy/5}, 4);
                }
            }
            case PLASTER -> {
                body = colors[r.nextInt(0, colors.length)];
                roofColor = new Color(body.getRGB()).darker().darker();

                g2.setColor(body);
                g2.fillRect(getStartX(), getStartY(), dx, dy);
            }
        }

        g2.setColor(window);
        g2.fillRect(getStartX() + dx*2/5, getStartY() + dy/3, dx/5, dy/3);
        g2.setColor(Color.WHITE);
        g2.setStroke(new BasicStroke(2));
        g2.drawRect(getStartX() + dx*2/5, getStartY() + dy/3, dx/5, dy/3);
        g2.drawLine(getStartX() + dx/2, getStartY() + dy/3, getStartX() + dx/2, getStartY() + dy*2/3);
        g2.drawLine(getStartX() + dx*2/5, getStartY() + dy/2, getStartX() + dx*3/5, getStartY() + dy/2);

        switch (roof){
            case RECTANGLE -> {
                g2.setColor(roofColor);
                g2.fillRect(getStartX() -(int) (10 * getScale()), getStartY() -(int) (10 * getScale()),
                        dx += (int)(20 * getScale()), dy *= .5);
            }
            case TRIANGLE -> {
                g2.setColor(roofColor);

                g2.fillPolygon(
                        new int[]{
                                getStartX() - (int) (20 * getScale()),
                                getStartX() + (int) (20 * getScale()) + dx,
                                getStartX() + dx / 2,
                        },
                        new int[] {
                                getStartY() + (int) (10 * getScale()),
                                getStartY() + (int) (10 * getScale()),
                                getStartY() - (int) (dy * .5)
                        }, 3);
            }
        }
    }

    @Override
    public void applyScale() {
        dx *= getScale();
        dy *= getScale();
    }
}
package src.draw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Stroke;
import javax.swing.JPanel;
import java.awt.geom.*;

/**
 * Class used to create a DrawPanel where shapes will be drawn by the programmer (via code).
 * 
 * @author Jared N. Plumb
 * @version 1.0
 * @since 2019-11-26
 * @Minor modifications by Jeff Light
 * @since 2019-12-01
 */
public class DrawPanel extends JPanel {
	//Attributes
	private static final long serialVersionUID = 6311020027600344213L;

	public DrawPanel() {
		this.setPreferredSize(new Dimension(1600, 900));	//Sets the dimensions of the DrawPanel.  Change this if your screen doesn't support this size.
		this.setOpaque(true);
		this.setBackground(Color.WHITE);			//Sets the background of the DrawPanel LIGHT_GRAY.  You may change this if desired.
	}
	
	
	/**
	 * Overrides the JComponent.paintComponent method.
	 * EVERYTHING that gets drawn to the Component (which sits on the content frame of the JFrame) is drawn in this method.
	 * Draw12a
	 * Draw all your objects in the paintComponent method.
	 * Automatically called by the event handler whenever the screen needs to be redrawn.
	 * DO NOT CALL THIS METHOD MANUALLY
	 * 
	 * @param	g	//All drawing in Java must go through a Graphics object
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;			//Allows us to draw using both the Graphics class methods and the Graphics2D class methods

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);	//Makes drawn shapes and fonts clearer

        g2.setColor(Color.GRAY);
        g2.setStroke(new BasicStroke(2));
        g2.drawRect(50, 50, 200, 100);
        g2.fillRect(300, 50, 100, 200);

        g2.setColor(Color.BLUE);
        g2.setStroke(new BasicStroke(3));
        int[] xPoints1 = {500, 600, 600}; //Define the x cords for each point
        int[] yPoints1 = {250, 50, 250}; //Define the y cords for each point
        g2.drawPolygon(xPoints1, yPoints1, 3);
        g2.fillPolygon(new int[]{700, 750, 800}, new int[]{50, 250, 50}, 3);

        g2.setColor(Color.GREEN);
        g2.setStroke(new BasicStroke(1));
        g2.drawPolygon(new int[]{900, 950, 1050, 1000}, new int[]{50, 250, 250, 50}, 4);
        g2.fillPolygon(new int[]{1100, 1150, 1250, 1200}, new int[]{50, 250, 250, 50}, 4);


        g2.setColor(Color.RED);
        g2.setStroke(new BasicStroke(4));
        g2.drawPolygon(new int[]{50, 100, 200, 250, 200, 100}, new int[]{400, 450, 450, 400, 350, 350}, 6);
        g2.fillPolygon(new int[]{60, 100, 200, 240, 200, 100}, new int[]{400, 440, 440, 400, 360, 360}, 6);

        /*
        g2.setColor(Color.CYAN);
        g2.setStroke(new BasicStroke(5));

         */

        g2.setColor(Color.YELLOW);
        g2.setStroke(new BasicStroke(6));
        g2.drawPolygon(new int[]{600, 650, 450, 500, 550}, new int[]{350, 450, 550, 650, 750}, 5);
        g2.fillPolygon(new int[]{350, 450, 550, 600, 650}, new int[]{150, 250, 350, 350, 360}, 5);

        /*
         * Draw at least 6 shapes in BOTH draw and fill formats using methods found in the Graphics class and/or the Graphics2D class.
         * At least one of the colors should NOT be a standard color from the COLOR palette.
         * Be sure all shapes are located such that they can all be seen.
         */


    }//end of method paintComponent(Graphics)

}//end of class DrawPanel
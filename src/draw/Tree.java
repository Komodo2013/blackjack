package src.draw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

/**
 * Tree Class.  Extends LandscapObject Class.
 * Note this class inherits 3 protected attributes from LandscapeObject for convenience in coding methods.
 * protected int currentX
 * protected int currentY
 * protected Graphics2D
 * 
 * When creating a Tree object in the DrawPanel.paintComponent(Graphics) method, usually the following syntax is used.
 * 
 * Tree t1 = new Tree(args);
 * t1.draw();
 * 
 * @author Jeffrey L Light
 * @version 1.0
 * @since 2019-11-26
 * @Minor modifications by Jeff Miguel Espinoza and Jacob Larsen
 * @since 2022-12-05
 */
public class Tree extends LandscapeObject{
	//Attributes
	protected int levels;						//The number of levels (branch triangles) the tree will have.
	protected String trunkColor; 				// The Hex color of the trunk, including the preceding '#'. Set in the constructor.
	protected String branchColor; 			// The Hex color of the branches, including the preceding '#'. Set in the constructor.
	protected int trunkWidth = 10;			//The trunk width in pixels.  Default of 10 for a scale of 1.  Modified by applyScale method().
	protected int trunkHeight = 15;			//The trunk height in pixels.  Default of 15 for a scale of 1.  Modified by applyScale method().
	protected int branchWidth = 30;			//The branch width in pixels.  Default of 30 for a scale of 1.  Modified by applyScale method().
	protected int branchHeight = 30;			//The branch height in pixels.  Default of 30 for a scale of 1.  Modified by applyScale method().
	protected double branchOverlap = .45;		//Indicates how much of each triangle is overlapped by the one above it.
	protected BasicStroke treeStroke = new BasicStroke(1);	//Stroke of 1 pixel use to outline each shape of the tree.
	protected String type = "regular";
	Color[] ORNAMENT_COLORS = {Color.RED, Color.ORANGE, Color.YELLOW};
	public static final String REG = "REG";
	public static final String DECO = "DECO";


	/**
	 * Primary Constructor.
	 * Sets all class attributes.
	 * 
	 * @param	g2				The Graphics2D interface.
	 * @param	x				int.  The startX coordinate.  currentX is also set to x upon object creation.
	 * @param	y				int.  The startY coordinate.  currentX is also set to y upon object creation.
	 * @param	levels			int indicating how many levels (branch triangles) the tree will have.
	 * @param	scale			double.  Scale multiplier for the object.
	 * @param	s_trunkColor	A String representing the Hex code for the color used for the trunk of the tree.
	 * @param	s_branchColor	A String representing the Hex code for the color used for the branches of the tree.
	 *  
	 * @return	void
	 */
	public Tree(Graphics2D g2, int x, int y, double scale, int levels,
				String s_trunkColor, String s_branchColor, String type) {
		super(g2, x, y, scale);
		this.levels = levels;
		this.trunkColor = "#" + s_trunkColor;
		this.branchColor = "#" + s_branchColor;
		this.type = type;
	}//end of Constructor Tree

	public Tree(Graphics2D g2, int x, int y, double scale, int levels,
				String s_trunkColor, String s_branchColor) {
		super(g2, x, y, scale);
		this.levels = levels;
		this.trunkColor = "#" + s_trunkColor;
		this.branchColor = "#" + s_branchColor;
		this.type = REG;
	}//end of Constructor Tree
	
	
	//Methods
	/**
	 * draw()
	 * Calls applyScale to apply the scale multiplier to all shape dimensions for the object.
	 * Calls drawTrunk to draw the trunk of the tree.
	 * Calls drawBranches to draw the branches of the tree.
	 * 
	 * @return	void. 
	 */
	public void draw() {
		applyScale();
		drawTrunk();
		switch (type) {
			case REG -> drawBranches();
			case DECO -> drawDecoBranches();
		}
	}//end of method draw()
	
	/**
	 * applyScale
	 * Applies the scale multiplier to all shape dimensions for the object.
	 * Called by draw()
	 * 
	 * @return	void. 
	 */
	public void applyScale() {
		this.branchHeight *= this.getScale();
		this.branchWidth *= this.getScale();
		this.trunkHeight *= this.getScale();
		this.trunkWidth *= this.getScale();
	}//end of method applyScale()
	/**
	 * drawTrunk()
	 * Draws a rectangle for the trunk of the tree.
	 * Called by draw()
	 * 
	 * @return	void. 
	 */
	private void drawTrunk() {
		int x = this.getStartX();
		int y = this.getStartY();
		g2.setStroke(treeStroke);
		g2.setColor(Color.decode(trunkColor));
		g2.fillRect(x+trunkWidth,y,trunkWidth,trunkHeight);
		g2.setColor(Color.black);
		g2.drawRect(x+trunkWidth,y,trunkWidth,trunkHeight);
	}

	protected void drawDecoBranches() {
		int x = this.getStartX();
		int y = this.getStartY();

		g2.setStroke(treeStroke); // Reset stroke if needed

		int yOffSet = 0; // Amount each triangle will be offset by
		int startX = branchWidth;

		for (int i = 0; i < levels; i++) { // For each triangle
			int xoff = (startX - branchWidth) / 2;
			int yBase = y - yOffSet; // Base for the branch triangle

			g2.setStroke(new BasicStroke(1));

			g2.setColor(Color.decode(branchColor)); // Reset color
			this.g2.fillPolygon(new int[]{x + xoff, x + xoff + branchWidth / 2, x + branchWidth + xoff},
					new int[]{yBase, yBase - branchHeight, yBase}, 3); // color triangle

			g2.setColor(Color.BLACK);
			this.g2.drawPolygon(new int[]{x + xoff, x + xoff + branchWidth / 2, x + branchWidth + xoff},
					new int[]{yBase, yBase - branchHeight, yBase}, 3); // outline

			g2.setStroke(new BasicStroke((int) (2 * getScale())));
			// Draw ornaments
			Random r = new Random();
			for (int j = 0; j < r.nextInt(2, Math.max(Math.min((int) (branchWidth * branchHeight / 30), 5), 3)); j++) {
				g2.setColor(ORNAMENT_COLORS[r.nextInt(0, ORNAMENT_COLORS.length)]);
				var _x = r.nextInt(0, branchWidth);
				var _y = r.nextInt(0, branchHeight);
				//System.out.printf("%d\t%d\t\t%d\t%d\n", Math.abs(_x - branchWidth/2), _y, branchWidth, branchHeight);
				if (Math.abs(_x - branchWidth / 2) < (branchHeight - _y) * branchWidth / (branchHeight * 2)) {
					//System.out.println("drawn");
					g2.drawOval(_x + x + xoff, yBase - _y, (int) (2 * getScale()), (int) (2 * getScale()));
				}
			}

			yOffSet += (int) (branchHeight * branchOverlap); // update offset
			this.branchWidth *= .8;
			this.branchHeight *= .8;
		}
	}

	/**
	 * drawBranches()
	 * Draws 'level' number of triangles above the trunk overlapped by 'branchOverlap'.
	 * Called by draw()
	 *
	 * @return	void.
	 */
	protected void drawBranches() {
		int x = this.getStartX();
		int y = this.getStartY();

		g2.setStroke(treeStroke); // Reset stroke if needed

		int yOffSet = 0; // Amount each triangle will be offset by
		int startX = branchWidth;

		for (int i = 0; i < levels; i++) { // For each triangle
			int xoff = (startX - branchWidth)/2;
			int yBase = y - yOffSet; // Base for the branch triangle

			g2.setColor(Color.decode(branchColor)); // Reset color
			this.g2.fillPolygon(new int[] {x+xoff, x+xoff+branchWidth/2, x+branchWidth+xoff},
					new int[] {yBase, yBase-branchHeight, yBase}, 3); // color triangle

			g2.setColor(Color.BLACK);
			this.g2.drawPolygon(new int[] {x+xoff, x+xoff+branchWidth/2, x+branchWidth+xoff},
					new int[] {yBase, yBase-branchHeight, yBase}, 3); // outline

			yOffSet += (int) (branchHeight * branchOverlap); // update offset
			this.branchWidth *= .8;
			this.branchHeight *= .8;
			}
	}//end of method drawBranches()
}//end of class Tree

import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;

public class Island extends JPanel {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;

    private BufferedImage bimg;
    private ArrayList<Turtle> turtles;

    public Island() {
        super();
        setSize(WIDTH, HEIGHT);
        bimg = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics g = bimg.createGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        turtles = new ArrayList<Turtle>();
        Turtle.setIsland(this);
    }

    public Graphics getImgG() {
        return bimg.createGraphics();
    }

    public void addTurtle(Turtle turtle) {
        turtles.add(turtle);
    }

    // override
    public void paint(Graphics g) {
        g.drawImage(bimg, 0, 0, this);
        for (Turtle turtle : turtles) {
            turtle.paint(g);
        }
    }
}

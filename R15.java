//15.Using 2D graphics commands in an applet, construct a house. 
// On mouse click event, change the colour of the door from blue to red.

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

public class R15 extends Applet {
    private Color doorColor = Color.BLUE;

    @Override
    public void init() {
        // Add mouse listener to change door color on click
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (doorColor == Color.BLUE) {
                    doorColor = Color.RED;
                } else {
                    doorColor = Color.BLUE;
                }
                repaint(); // Repaint the applet to reflect the color change
            }
        });
    }
    @Override
    public void paint(Graphics g) {
        // Draw the house
        g.setColor(Color.YELLOW);
        g.fillRect(100, 200, 200, 150); // House body

        // Draw the roof
        g.setColor(Color.RED);
        int[] xPoints = { 80, 200, 320 };
        int[] yPoints = { 200, 100, 200 };
        g.fillPolygon(xPoints, yPoints, 3); // Roof

        // Draw the door
        g.setColor(doorColor);
        g.fillRect(170, 270, 60, 80); // Door
    }
    public static void main(String[] args) {
            // Create a frame to display the applet
            Frame frame = new Frame("House Applet");
            R15 applet = new R15();
            applet.init();
            frame.add(applet);
            frame.setSize(400, 400);
            frame.addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            frame.setVisible(true);
            applet.start();
        }
    @Override
    public void start() {
        // Start the applet
    }
    @Override
    public void stop() {
        // Stop the applet
    }
    @Override
    public void destroy() {
        // Destroy the applet
    }
}

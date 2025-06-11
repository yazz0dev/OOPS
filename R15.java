//15.Using 2D graphics commands in an applet, construct a house. 
// On mouse click event, change the colour of the door from blue to red.


import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Home extends Applet {
    Color door = Color.BLUE;

    @Override
    public void init() {
        // Toggle door color on mouse click
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // Toggle between BLUE and RED for door color
                door = (door == Color.BLUE) ? Color.RED : Color.BLUE;
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        // Draw house body (yellow rectangle)
        g.setColor(Color.YELLOW);
        g.fillRect(100, 200, 200, 100);
        
        // Draw triangular roof (red) 
        g.setColor(Color.RED);
        int[] x = {100, 200, 300};
        int[] y = {200, 100, 200};
        g.fillPolygon(x, y, 3);
        
        // Draw door (color toggles between blue/red on click)
        g.setColor(door);
        g.fillRect(180, 250, 40, 50); 

    }

    public static void main(String[] args) {
        // Create and configure the application window
        Frame frame = new Frame("House Applet");
        Home applet = new Home();
        applet.init();
        
        frame.add(applet);
        frame.setSize(400, 400);
        
        // Simple exit handler for window close button
        frame.addWindowListener(new WindowAdapter() { 
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });
        
        frame.setVisible(true);
        applet.start();
    }
}

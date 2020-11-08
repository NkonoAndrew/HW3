

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class GraphView extends JFrame {
    int number1;
    int number2;
    int number3;

    public GraphView(int n1, int n2, int n3) {
        number1 = n1;
        number2 = n2;
        number3 = n3;
        setSize(1000, 1000);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void update(Graphics g) {
        super.update(g);
        repaint();
    }

    public void updateGraph(int n1, int n2, int n3) {
        // update values
        number1 = n1;
        number2 = n2;
        number3 = n3;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // to clear the previous stuff if any (for repainting)
        Graphics2D g2 = (Graphics2D) g;

        // how to glue it to the bottom? little math here

        int y1 =  getHeight() - number1 - 10;
        g2.setColor(Color.RED);
        Rectangle rec1 = new Rectangle(10, y1, 50, number1);
        g2.draw(rec1);
        g2.fill(rec1);

        int y2 = getHeight() - number2 - 10;
        g2.setColor(Color.GREEN);
        Rectangle2D rec2 = new Rectangle2D.Double(80, y2, 50, number2);
        g2.draw(rec2);
        g2.fill(rec2);

        int y3  = getHeight() - number3 - 10;
        g2.setColor(Color.YELLOW);
        Rectangle rec3 = new Rectangle(150, y3, 50, number3);
        g2.draw(rec3);
        g2.fill(rec3);

    }
}

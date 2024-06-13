import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RotatingDonutApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rotating Donut");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setResizable(false);
        
        DonutPanel donutPanel = new DonutPanel();
        frame.add(donutPanel);
        
        frame.setVisible(true);
        
        Timer timer = new Timer(30, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                donutPanel.repaint();
            }
        });
        timer.start();
    }
}

class DonutPanel extends JPanel {
    private double angle = 0;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Set background color
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Translate to the center of the panel
        g2d.translate(getWidth() / 2, getHeight() / 2);

        drawDonut(g2d);
        angle += 0.05; // Increase the angle for rotation
    }

    private void drawDonut(Graphics2D g2d) {
        int outerRadius = 100;
        int innerRadius = 50;
        int numPoints = 100;
        double[] x = new double[numPoints];
        double[] y = new double[numPoints];

        for (int i = 0; i < numPoints; i++) {
            double t = 2 * Math.PI * i / numPoints;
            x[i] = (outerRadius + innerRadius * Math.cos(6 * t)) * Math.cos(t);
            y[i] = (outerRadius + innerRadius * Math.cos(6 * t)) * Math.sin(t);
        }

        // Rotate the donut
        for (int i = 0; i < numPoints; i++) {
            double tempX = x[i];
            x[i] = x[i] * Math.cos(angle) - y[i] * Math.sin(angle);
            y[i] = tempX * Math.sin(angle) + y[i] * Math.cos(angle);
        }

        // Draw the donut
        g2d.setColor(Color.YELLOW);
        for (int i = 0; i < numPoints; i++) {
            int next = (i + 1) % numPoints;
            g2d.drawLine((int) x[i], (int) y[i], (int) x[next], (int) y[next]);
        }
    }
}

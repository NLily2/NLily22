import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {

    graphics.setColor(Color.GREEN);
    graphics.drawLine(50, 50, 100, 50);

    graphics.setColor(Color.RED);
    graphics.drawLine(50, 50, 50, 150);

    graphics.setColor(Color.BLACK);
    graphics.drawLine(50, 150, 100, 150);

    graphics.setColor(Color.BLUE);
    graphics.drawLine(100, 50, 100, 150);
  }
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
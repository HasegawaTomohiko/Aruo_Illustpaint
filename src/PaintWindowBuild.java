import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// import javax.swing.SwingUtilities;

public class PaintWindowBuild extends JPanel implements MouseListener, MouseMotionListener{

  final int WINDOW_WIDTH = 3000;
  final int WINDOW_HEIGHT = 3000;

  private Point point;
  //private BufferedImage buffimg = null;
  private Image buffimg = null;
  private Graphics2D buffGraphics = null;

  static int red = 0;
  static int green = 0;
  static int blue = 0;
  static float stroke = 0.0f;

  // public static int DRAW_MODE; set draw mode(choose tools kit)

  public PaintWindowBuild(){
    this.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
    this.setPreferredSize(new Dimension(WINDOW_WIDTH,WINDOW_HEIGHT));
    this.setBackground(Color.GRAY);
    addMouseListener(this);
    addMouseMotionListener(this);
  }

  //MouseEvent
  public void mouseDragged(MouseEvent e) {
    buffGraphics.setStroke(new BasicStroke(stroke)); // 変更出来るようにする。
    buffGraphics.setColor(new Color(red,green,blue));
    buffGraphics.drawLine(point.x,point.y,e.getX(),e.getY());
    point = new Point(e.getX(),e.getY());
    repaint();
  }
  public void mouseMoved(MouseEvent e) {}
  public void mouseClicked(MouseEvent e) {}
  public void mousePressed(MouseEvent e) {
    point = new Point(e.getX(),e.getY());
  }
  public void mouseReleased(MouseEvent e) {}
  public void mouseEntered(MouseEvent e) {}
  public void mouseExited(MouseEvent e) {}

  public void paintComponent(Graphics g){
    if(buffimg == null){
      //buffimg = new BufferedImage(getWidth()*8,getHeight()*8,BufferedImage.TYPE_INT_RGB);
      buffimg = createImage(getWidth()*8,getHeight()*8);
      buffGraphics = (Graphics2D) buffimg.getGraphics();
      buffGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      Paint paint = buffGraphics.getPaint();
      buffGraphics.setPaint(Color.white);
      buffGraphics.fillRect(0, 0, getWidth(),getHeight());
      buffGraphics.setPaint(paint);
      repaint();
    }
    g.drawImage(buffimg, 0, 0, null);
  }

  public Image getImage(){
    return buffimg;
  }
}

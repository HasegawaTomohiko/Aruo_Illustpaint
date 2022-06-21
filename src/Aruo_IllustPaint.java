import java.awt.*;
import javax.swing.*;

public class Aruo_IllustPaint{

  static JFrame frame;
  static JPanel paintPanel;
  static JMenuBar menubar;
  static JPanel sideMenu;
  /**
   * This is Initialize Aruo_IllustPaint to create a components.
   */
  public static void initialize(){
    paintPanel = new PaintWindowBuild();
    sideMenu = new SideMenuBuild();
    menubar = new MenuBarBuild();
    frame = new FrameBuild();
    frame.setJMenuBar(menubar);
    frame.getContentPane().add(paintPanel,BorderLayout.CENTER);
    frame.getContentPane().add(sideMenu,BorderLayout.WEST);
    frame.setVisible(true);
  }
  public static void main(String[] args) {
    initialize();
  }
}

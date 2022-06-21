import java.awt.*;
import javax.swing.*;

public abstract class MenuBuild extends JMenu{
  final int MENU_WIDTH = 60;
  final int MENU_HEIGHT = 20;

  public MenuBuild(String menuName){
    new JMenu(menuName);
    setText(menuName);
    setSize(MENU_WIDTH,MENU_HEIGHT);
    setPreferredSize(new Dimension(MENU_WIDTH,MENU_HEIGHT));
    setAlignmentX(Component.CENTER_ALIGNMENT);
    setAlignmentY(Component.CENTER_ALIGNMENT);
    setVerticalAlignment(SwingConstants.CENTER);
    setVerticalTextPosition(SwingConstants.CENTER);
    setHorizontalAlignment(SwingConstants.CENTER);
    setHorizontalTextPosition(SwingConstants.CENTER);
    setBackground(Color.WHITE);
  }

  public void addMenuItem(JMenuItem item){
    add(item);
  }
}

//こいつらもSingleton生成で良きかな？って思っている。


import java.awt.Dimension;
import java.awt.*;
import javax.swing.JMenuItem;

public class MenuItemBuild extends JMenuItem{
  
  final int ITEM_WIDTH = 100;
  final int ITEM_HEIGHT = 20;

  MenuItemBuild(String itemName){
    new JMenuItem(itemName);
    setText(itemName);
    setSize(ITEM_WIDTH,ITEM_HEIGHT);
    setPreferredSize(new Dimension(ITEM_WIDTH,ITEM_HEIGHT));
    setBackground(Color.WHITE);
  }
}

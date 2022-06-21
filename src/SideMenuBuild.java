import javax.swing.*;
import java.awt.*;

public class SideMenuBuild extends JPanel{

  final int SIDEMENU_WIDTH = 250;
  final int SIDEMENU_HEIGHT = 1080;

  public SideMenuBuild(){
    setSize(SIDEMENU_WIDTH,SIDEMENU_HEIGHT);
    setPreferredSize(new Dimension(SIDEMENU_WIDTH,SIDEMENU_HEIGHT));
    setBackground(Color.GRAY);

    add(new SideMenu_ColorPicker());
    add(new SideMenu_StrokePicker());
    //add contents of tools.
    //JToolBarクラスを使うのも良さげ？
  }
}

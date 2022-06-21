import java.awt.*;
import javax.swing.*;

public class MenuBarBuild extends JMenuBar{

  JMenu menu_File;
  JMenu menu_Edit;
  JMenu menu_Setting;
  JMenu menu_Tools;
  JMenu menu_Window;
  JMenu menu_Help;

  public MenuBarBuild(){

    new JMenuBar();
    setBackground(Color.WHITE);
    setAlignmentX(Component.CENTER_ALIGNMENT);
    setAlignmentY(Component.CENTER_ALIGNMENT);
    setBackground(Color.WHITE);

    menu_File = new Menu_FileBuild();
    menu_Edit = new Menu_EditBuild();
    menu_Setting = new Menu_SettingBuild();
    menu_Tools = new Menu_ToolsBuild();
    menu_Window = new Menu_WindowBuild();
    menu_Help = new Menu_HelpBuild();

    add(menu_File);
    add(menu_Edit);
    add(menu_Setting);
    add(menu_Tools);
    add(menu_Window);
    add(menu_Help);

  }
}

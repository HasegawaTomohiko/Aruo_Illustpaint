import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;
public class MenuItem_OpenBuild extends MenuItemBuild implements ActionListener{
    MenuItem_OpenBuild(){
      super("Open");
      addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      System.out.println("Selected Open");
      JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

      fileChooser.showOpenDialog(null);
      
    }
}

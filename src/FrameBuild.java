import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class FrameBuild extends JFrame{
  
  static final int FRAME_WIDTH = 1920;
  static final int FRAME_HEIGHT = 1080;


  public FrameBuild(){
    new JFrame("Aruo IllustPaint");
    this.setTitle("Aruo IllustPaint");
    this.setIconImage(readImage());
    this.setSize(FRAME_WIDTH,FRAME_HEIGHT);
    this.setPreferredSize(new Dimension(FRAME_WIDTH,FRAME_HEIGHT));
    this.setBackground(new Color(0,0,0));
    this.setBounds(0,0,FRAME_WIDTH,FRAME_HEIGHT);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Xボタンを押したら保存するかどうかを聞くべき。
    this.setVisible(true); 
  }

  private Image readImage(){
    Image img_icon = null;
    try{
      img_icon = ImageIO.read(new File("./bin/img/icon_image.png"));
    }catch(Exception e){
      System.out.println(e);
    }
    return img_icon;
  }
}

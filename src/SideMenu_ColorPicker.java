import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SideMenu_ColorPicker extends JPanel implements ChangeListener{
  
  final int WIDTH = 250;
  final int HEIGHT = 400;
  private JSlider red_Slider;
  private JSlider green_Slider;
  private JSlider blue_Slider;
  private JLabel check;
  private JPanel checkColor;

  public SideMenu_ColorPicker(){
    setSize(WIDTH,HEIGHT);
    setPreferredSize(new Dimension(WIDTH,HEIGHT));
    setBackground(Color.WHITE);

    check = new JLabel();
    red_Slider = new JSlider(0,255);
    red_Slider.setValue(0);
    green_Slider = new JSlider(0,255);
    green_Slider.setValue(0);
    blue_Slider = new JSlider(0,255);
    blue_Slider.setValue(0);

    red_Slider.addChangeListener((ChangeListener) this);
    green_Slider.addChangeListener((ChangeListener) this);
    blue_Slider.addChangeListener((ChangeListener) this);

    checkColor = new JPanel();
    checkColor.setSize(100,100);
    checkColor.setPreferredSize(new Dimension(100,100));
    checkColor.setBackground(new Color(red_Slider.getValue(),green_Slider.getValue(),blue_Slider.getValue()));

    add(red_Slider);
    add(green_Slider);
    add(blue_Slider);
    add(check);
    add(checkColor);
    check.setText("R:"+red_Slider.getValue()+" G:"+green_Slider.getValue()+" B:"+blue_Slider.getValue());

  }

  @Override
  public void stateChanged(ChangeEvent e) {
    // TODO Auto-generated method stub
    check.setText("R:"+red_Slider.getValue()+" G:"+green_Slider.getValue()+" B:"+blue_Slider.getValue());
    checkColor.setBackground(new Color(red_Slider.getValue(),green_Slider.getValue(),blue_Slider.getValue()));
    PaintWindowBuild.red = red_Slider.getValue();
    PaintWindowBuild.green = green_Slider.getValue();
    PaintWindowBuild.blue = blue_Slider.getValue();
  }

  public int getRed(){
    return red_Slider.getValue();
  }

  public int getGreen(){
    return green_Slider.getValue();
  }

  public int getBlue(){
    return blue_Slider.getValue();
  }
}

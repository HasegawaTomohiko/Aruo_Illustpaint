import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SideMenu_StrokePicker extends JPanel implements ChangeListener{

  final int WIDTH = 250;
  final int HEIGHT = 400;
  private JSlider strokeSlider ;
  private JLabel label;

  public SideMenu_StrokePicker(){
    setSize(WIDTH,HEIGHT);
    setPreferredSize(new Dimension(WIDTH,HEIGHT));
    setBackground(Color.GRAY);

    strokeSlider = new JSlider();
    strokeSlider.setMaximum(100);
    strokeSlider.setMinimum(1);
    strokeSlider.setValue(1);

    strokeSlider.addChangeListener((ChangeListener)this);

    label = new JLabel();
    label.setText("s : " + changeStroke(strokeSlider.getValue()));
    add(strokeSlider);
    add(label);
  }

  @Override
  public void stateChanged(ChangeEvent e) {
    PaintWindowBuild.stroke = changeStroke(strokeSlider.getValue());
    label.setText("s :" + changeStroke(strokeSlider.getValue()));
  }

  private float changeStroke(int a){
    Integer alpha = a;
    return alpha.floatValue() / 10.0f;
  }
  
}

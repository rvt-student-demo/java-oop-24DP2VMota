package rvt;

import javax.swing.JPanel;
import java.awt.*;

public class GrafiskasPanelis extends JPanel{
    public GrafiskasPanelis(){

    }
    public GrafiskasPanelis(LayoutManager layout){
        super(layout);
    }
    public GrafiskasPanelis(boolean isDoubleBuffered){
        super(isDoubleBuffered);
    }
    public GrafiskasPanelis(LayoutManager layout, boolean isDoubleBuffered){
        super(layout, isDoubleBuffered);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.drawRect(80, 80, 100, 100);
        g.setColor(Color.blue);
        g.drawRect(90, 120, 40, 60);
        g.drawRect(140, 90, 30, 30);
        g.setColor(Color.blue);
        g.drawLine(180, 80, 130, 50);
        g.drawLine(80, 80, 130, 50);
    }
}

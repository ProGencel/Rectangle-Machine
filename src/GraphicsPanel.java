import javax.swing.*;
import java.awt.*;

public class GraphicsPanel extends JPanel {

    Panel p;

    public GraphicsPanel(Panel2 p2,Panel p) //If you will use Panel2 out of constructor then create a reference for that
    {
        this.p = p;
        setLayout(null);
        setBounds(0,0,p2.screenWidth- p2.smallPanelWidth,p2.screenHeight);
        setOpaque(false);
    }

    final int startX = 200;
    final int startY = 600;
    final int lineWidth = 500;
    final int lineHeight = 500;
    final int howManyX = 10;
    final int howManyY = 10;
    final int gapX = lineWidth/howManyX;
    final int gapY = lineHeight/howManyY;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setStroke(new BasicStroke(2));
        g2.setColor(Color.decode("#D9E6FF"));
        g2.drawLine(startX,startY,startX+lineWidth,startY);
        g2.drawLine(startX,startY,startX,startY-lineHeight);

        for(int i = 1;i<=howManyX;i++)
        {
            g2.drawLine(startX+i*gapX,startY+5,startX+i*gapX,startY-5);
        }

        for(int i = 1;i<=howManyY;i++)
        {
            g2.drawLine(startX+5,startY-i*gapY,startX-5,startY-i*gapY);
        }

        g2.setStroke(new BasicStroke(3));
        g2.setColor(Color.BLACK);

        if(p.x2_1 < p.x1_1)
        {
            int temp = p.x2_1;
            p.x2_1 = p.x1_1;
            p.x1_1 = temp;
        }
        if(p.x2_2 < p.x1_2)
        {
            int temp = p.x2_2;
            p.x2_2 = p.x1_2;
            p.x1_2 = temp;
        }
        if(p.y2_1 < p.y1_1)
        {
            int temp = p.y2_1;
            p.y2_1 = p.y1_1;
            p.y1_1 = temp;
        }
        if(p.y2_2 < p.y1_2)
        {
            int temp = p.y2_2;
            p.y2_2 = p.y1_2;
            p.y1_2 = temp;
        }

        Color color1 = Color.decode("#FFC857");
        g2.setColor(color1);

        if(p.isButton1Pressed)g2.drawRect(startX+gapX*p.x1_1,(startY-gapY*p.y1_1)-((gapY*p.y2_1)-(p.y1_1*gapY)),
                (gapX*p.x2_1)-(p.x1_1*gapX),(gapY*p.y2_1)-(p.y1_1*gapY));

        Color color2 = Color.decode("#5AB9EA");
        g2.setColor(color2);

        if(p.isButton2Pressed)g2.drawRect(startX+gapX*p.x1_2,(startY-gapY*p.y1_2)-((gapY*p.y2_2)-(p.y1_2*gapY)),
                (gapX*p.x2_2)-(p.x1_2*gapX),(gapY*p.y2_2)-(p.y1_2*gapY));
    }
}

import javax.swing.*;
import java.awt.*;

public class GraphicsPanel extends JPanel {

    Panel p;

    public GraphicsPanel(Panel2 p2,Panel p) //If you use Panel2 out of constructor then create a reference for that
    {
        this.p = p;
        setLayout(null);
        setBounds(0,0,p2.screenWidth- p2.smallPanelWidth,p2.screenHeight);
        setOpaque(false);
    }

    int width1 = 0;
    int width2 = 0;
    int height1 = 0;
    int height2 = 0;

    int howManyX = 20;
    int howManyY = 20;
    final int startX = 200;
    final int startY = 600;
    int lineWidth = 500;
    int lineHeight = 500;
    int gapX = lineWidth/howManyX;
    int gapY = lineHeight/howManyY;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

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

        width1 = p.x2_1 - p.x1_1;
        width2 = p.x2_2 - p.x1_2;

        height1 = p.y2_1 - p.y1_1;
        height2 = p.y2_2 - p.y1_2;

        int mainWidth = Math.max(width1, width2);
        int mainHeight = Math.max(height1,height2);

        int mamaScale = Math.max(mainWidth,mainHeight);

        lineWidth = 500;
        lineHeight = 500;

        if(mamaScale == 0)
        {
            mamaScale = 20;
        }

        mamaScale += Math.max(Math.max(p.x1_2,p.x1_1),Math.max(p.y1_1,p.y1_2));

        for(int i = lineWidth-mamaScale/2;i<lineWidth+mamaScale/2;i++)
        {
            if(i%mamaScale == 0)
            {
                lineWidth = i;
                lineHeight = i;
                break;
            }
        }


        howManyX = mamaScale;
        gapX = lineWidth/howManyX;
        howManyY = mamaScale;
        gapY = lineWidth/howManyY;

        g2.setStroke(new BasicStroke(0.1f));
        g2.setColor(Color.decode("#D9E6FF"));
        g2.drawLine(startX,startY,startX+lineWidth,startY);
        g2.drawLine(startX,startY,startX,startY-lineHeight);

        for(int i = 1;i<=howManyX;i++)
        {
            g2.drawLine(startX+i*gapX,startY+5,startX+i*gapX,startY-5);
            if(i%10 == 0)
            {
                g2.drawString(String.valueOf(i),startX+i*gapX-g2.getFontMetrics().stringWidth(String.valueOf(i))/2,
                        startY+15);
            }
        }

        for(int i = 1;i<=howManyY;i++)
        {
            g2.drawLine(startX+5,startY-i*gapY,startX-5,startY-i*gapY);
        }

        howManyX = lineWidth/mamaScale;
        howManyY = lineHeight/mamaScale;

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

package id.its.simplemouseevent;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class MousePanel extends JPanel implements MouseListener, MouseMotionListener {

    private int areaWidth;
    private int areaHeight;
    private int mouseX;
    private int mouseY;
    private String text;
    private boolean isDragged = false;

    public MousePanel(int width, int height) {
        this.areaWidth = width;
        this.areaHeight = height;

        this.setPreferredSize(new Dimension(this.areaWidth, this.areaHeight));

        this.text = "Do something with mouse!";
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
        this.setFocusable(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString("Position X: " + this.mouseX + " Y: " + this.mouseY + (this.isDragged ? " Dragged" : ""), 0, 20);
        g.drawString(this.text, 0, this.areaHeight/2);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.text = "Mouse clicked on X: " + e.getX() + " Y: " + e.getY();
        this.repaint();
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        this.text = "Mouse pressed on X: " + e.getX() + " Y: " + e.getY();
        this.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.text = "Mouse released on X: " + e.getX() + " Y: " + e.getY();
        this.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.text = "Mouse enetered JPanel";
        this.repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.text = "Mouse exited MousePanel";
        this.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        this.isDragged = false;
        this.mouseX = e.getX();
        this.mouseY = e.getY();
        this.repaint();
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        this.isDragged = true;
        this.mouseX = e.getX();
        this.mouseY = e.getY();
        this.repaint();
    }

}
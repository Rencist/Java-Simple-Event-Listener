package id.its.simplekeyboardevent;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class KeyboardPanel extends JPanel implements KeyListener {
	private List<Key> keys;
	public KeyboardPanel(int width, int height) {
		this.setPreferredSize(new Dimension(width, height));
		this.keys = new ArrayList<Key>();
		// Line 1
		this.keys.add(new Key(110, 100, 60, 30, KeyEvent.VK_ESCAPE, "Esc"));
		this.keys.add(new Key(180, 100, 40, 30, KeyEvent.VK_F1, "F1"));
		this.keys.add(new Key(230, 100, 40, 30, KeyEvent.VK_F2, "F2"));
		this.keys.add(new Key(280, 100, 40, 30, KeyEvent.VK_F3, "F3"));
		this.keys.add(new Key(330, 100, 40, 30, KeyEvent.VK_F4, "F4"));
		this.keys.add(new Key(380, 100, 40, 30, KeyEvent.VK_F5, "F5"));
		this.keys.add(new Key(430, 100, 40, 30, KeyEvent.VK_F6, "F6"));
		this.keys.add(new Key(480, 100, 40, 30, KeyEvent.VK_F7, "F7"));
		this.keys.add(new Key(530, 100, 40, 30, KeyEvent.VK_F8, "F8"));
		this.keys.add(new Key(580, 100, 40, 30, KeyEvent.VK_F9, "F9"));
		this.keys.add(new Key(630, 100, 40, 30, KeyEvent.VK_F10, "F10"));
		this.keys.add(new Key(680, 100, 40, 30, KeyEvent.VK_F11, "F11"));
		this.keys.add(new Key(730, 100, 40, 30, KeyEvent.VK_F12, "F12"));
		this.keys.add(new Key(780, 100, 60, 30, KeyEvent.VK_INSERT, "Insert"));
		this.keys.add(new Key(850, 100, 60, 30, KeyEvent.VK_PRINTSCREEN, "PrtSc"));
		this.keys.add(new Key(920, 100, 60, 30, KeyEvent.VK_DELETE, "Delete"));
		// Line 2
		this.keys.add(new Key(110, 150, 50, 50, KeyEvent.VK_BACK_QUOTE, "`"));
		this.keys.add(new Key(170, 150, 50, 50, KeyEvent.VK_1, "1"));
		this.keys.add(new Key(230, 150, 50, 50, KeyEvent.VK_2, "2"));
		this.keys.add(new Key(290, 150, 50, 50, KeyEvent.VK_3, "3"));
		this.keys.add(new Key(350, 150, 50, 50, KeyEvent.VK_4, "4"));
		this.keys.add(new Key(410, 150, 50, 50, KeyEvent.VK_5, "5"));
		this.keys.add(new Key(470, 150, 50, 50, KeyEvent.VK_6, "6"));
		this.keys.add(new Key(530, 150, 50, 50, KeyEvent.VK_7, "7"));
		this.keys.add(new Key(590, 150, 50, 50, KeyEvent.VK_8, "8"));
		this.keys.add(new Key(650, 150, 50, 50, KeyEvent.VK_9, "9"));
		this.keys.add(new Key(710, 150, 50, 50, KeyEvent.VK_0, "0"));
		this.keys.add(new Key(770, 150, 50, 50, KeyEvent.VK_MINUS, "-"));
		this.keys.add(new Key(830, 150, 50, 50, KeyEvent.VK_EQUALS, "="));
		this.keys.add(new Key(890, 150, 90, 50, KeyEvent.VK_BACK_SPACE, "Backspace"));
		// Line 3
		this.keys.add(new Key(110, 220, 80, 50, KeyEvent.VK_TAB, "Tab"));
		this.keys.add(new Key(200, 220, 50, 50, KeyEvent.VK_Q, "Q"));
		this.keys.add(new Key(260, 220, 50, 50, KeyEvent.VK_W, "W"));
		this.keys.add(new Key(320, 220, 50, 50, KeyEvent.VK_E, "E"));
		this.keys.add(new Key(380, 220, 50, 50, KeyEvent.VK_R, "R"));
		this.keys.add(new Key(440, 220, 50, 50, KeyEvent.VK_T, "T"));
		this.keys.add(new Key(500, 220, 50, 50, KeyEvent.VK_Y, "Y"));
		this.keys.add(new Key(560, 220, 50, 50, KeyEvent.VK_U, "U"));
		this.keys.add(new Key(620, 220, 50, 50, KeyEvent.VK_I, "I"));
		this.keys.add(new Key(680, 220, 50, 50, KeyEvent.VK_O, "O"));
		this.keys.add(new Key(740, 220, 50, 50, KeyEvent.VK_P, "P"));
		this.keys.add(new Key(800, 220, 50, 50, KeyEvent.VK_OPEN_BRACKET, "["));
		this.keys.add(new Key(865, 220, 50, 50, KeyEvent.VK_CLOSE_BRACKET, "]"));
		this.keys.add(new Key(930, 220, 50, 50, KeyEvent.VK_BACK_SLASH, "\\"));
		// Line 4
		this.keys.add(new Key(110, 290, 100, 50, KeyEvent.VK_CAPS_LOCK, "CapsLk"));
		this.keys.add(new Key(220, 290, 50, 50, KeyEvent.VK_A, "A"));
		this.keys.add(new Key(280, 290, 50, 50, KeyEvent.VK_S, "S"));
		this.keys.add(new Key(340, 290, 50, 50, KeyEvent.VK_D, "D"));
		this.keys.add(new Key(400, 290, 50, 50, KeyEvent.VK_F, "F"));
		this.keys.add(new Key(460, 290, 50, 50, KeyEvent.VK_G, "G"));
		this.keys.add(new Key(520, 290, 50, 50, KeyEvent.VK_H, "H"));
		this.keys.add(new Key(580, 290, 50, 50, KeyEvent.VK_J, "J"));
		this.keys.add(new Key(640, 290, 50, 50, KeyEvent.VK_K, "K"));
		this.keys.add(new Key(700, 290, 50, 50, KeyEvent.VK_L, "L"));
		this.keys.add(new Key(760, 290, 50, 50, KeyEvent.VK_SEMICOLON, ";"));
		this.keys.add(new Key(820, 290, 50, 50, KeyEvent.VK_QUOTE, "'"));
		this.keys.add(new Key(880, 290, 100, 50, KeyEvent.VK_ENTER, "Enter"));
		// Line 5
		this.keys.add(new Key(110, 360, 130, 50, KeyEvent.VK_SHIFT, "Shift"));
		this.keys.add(new Key(250, 360, 50, 50, KeyEvent.VK_Z, "Z"));
		this.keys.add(new Key(310, 360, 50, 50, KeyEvent.VK_X, "X"));
		this.keys.add(new Key(370, 360, 50, 50, KeyEvent.VK_C, "C"));
		this.keys.add(new Key(430, 360, 50, 50, KeyEvent.VK_V, "V"));
		this.keys.add(new Key(490, 360, 50, 50, KeyEvent.VK_B, "B"));
		this.keys.add(new Key(550, 360, 50, 50, KeyEvent.VK_N, "N"));
		this.keys.add(new Key(610, 360, 50, 50, KeyEvent.VK_M, "M"));
		this.keys.add(new Key(670, 360, 50, 50, KeyEvent.VK_COMMA, ","));
		this.keys.add(new Key(730, 360, 50, 50, KeyEvent.VK_PERIOD, "."));
		this.keys.add(new Key(790, 360, 50, 50, KeyEvent.VK_SLASH, "/"));
		this.keys.add(new Key(850, 360, 130, 50, KeyEvent.VK_SHIFT, "Shift"));
		// Line 6
		this.keys.add(new Key(110, 430, 60, 50, KeyEvent.VK_CONTROL, "Ctrl"));
		this.keys.add(new Key(180, 430, 50, 50, KeyEvent.VK_FINAL, "Fn"));
		this.keys.add(new Key(240, 430, 60, 50, KeyEvent.VK_ALT, "Alt"));
		this.keys.add(new Key(310, 430, 350, 50, KeyEvent.VK_SPACE, ""));
		this.keys.add(new Key(670, 430, 60, 50, KeyEvent.VK_ALT, "Alt"));
		this.keys.add(new Key(740, 430, 60, 50, KeyEvent.VK_CONTROL, "Ctrl"));
		this.keys.add(new Key(870, 430, 50, 22, KeyEvent.VK_UP, "Up"));
		this.keys.add(new Key(810, 430, 50, 50, KeyEvent.VK_LEFT, "Left"));
		this.keys.add(new Key(870, 455, 50, 22, KeyEvent.VK_DOWN, "Down"));
		this.keys.add(new Key(930, 430, 50, 50, KeyEvent.VK_RIGHT, "Right"));

		this.addKeyListener(this);
		this.setFocusable(true);
		this.setFocusTraversalKeysEnabled(false);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		//render seluruh keys
		for (Key key : this.keys) {
			key.render(g);
		}	
	}
	
	public void keyTyped(KeyEvent e) {
	//do nothing
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		for (Key k : this.keys) {
				if (k.isSymbolMatch(key)) {
				k.setPressed();
				repaint();
			}
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		for (Key k : this.keys) {
			if (k.isSymbolMatch(key)) {
				k.setReleased();
				repaint();
			}
		}
	}
}

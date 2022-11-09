package id.its.simplekeyboardevent;

import java.awt.Color;
import java.awt.Graphics;

public class Key {
	private static final int RELEASED = 1;
	private static final int PRESSED = 2;
	private int x;
	private int y;
	private String symbol;
	private int state;
	private int code;
	private int width;
	private int height;
	
	public Key(int x, int y, int width, int height, int code, String symbol) {
		this.x = x;
		this.y = y;
		this.code = code;
		this.state = RELEASED;
		this.width = width;
		this.height = height;
		this.symbol = symbol;
	}
	
	public void render(Graphics g) {
		//render tuts sesuai dengan state
		if (this.state == RELEASED) {
			g.setColor(Color.WHITE);
		} 
		else if (this.state == PRESSED) {
			g.setColor(Color.GRAY);
		} 
		else {
			g.setColor(Color.WHITE);
		}
		g.fillRect(this.x, this.y, width, height);
		//render text
		int stringPosX = (int)this.x + (width / 3);
		int stringPosY = this.y + (height / 2);
		g.setColor(Color.BLACK);
		g.drawString(String.valueOf(this.symbol), stringPosX, stringPosY);
	}
	public boolean isSymbolMatch(int key_code) {
		if (this.code == key_code) {
			return true;
		}
		return false;
	}
	public void setPressed() {
		this.state = PRESSED;
	}
	public void setReleased() {
		this.state = RELEASED;
	}
}
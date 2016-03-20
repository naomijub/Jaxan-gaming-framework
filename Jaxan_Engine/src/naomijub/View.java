package naomijub;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class View extends JPanel {
	
	private static final int BOARD_WIDTH = 1080, BOARD_HEIGHT = 720;
	
	private ArrayList<Image> sprites;
	
	private Timer updater;
	
	private boolean gameOn; 
	
	public View(){
		this.setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
		this.setBackground(new Color(10, 220, 30));
		this.setFocusable(true);
		this.setDoubleBuffered(true);

		//Load Variables
		initVar();
		//load sprites (images)
        loadSprites();
        //starts game
        initGame();
	}
	
	private void initVar(){
		//number of sprites to be created for the arraylist
		sprites = new ArrayList<Image>(/*NUMBER OF SPRITES*/);
		
		updater = new Timer(1, new ActionListener(){
			public void actionPerformed(ActionEvent e){
				 repaint();
			 }
		});
	}
	
	private void loadSprites(){
		for(int i = 0;i < sprites.size();i++){
			ImageIcon iiAux = new ImageIcon(/*Path to sprites*/);
			sprites.add(i, iiAux.getImage());
		}
	}
	
	private void initGame(){
		//set number of lifes

		initLevel();
	}
	
	private void initLevel(){
		//Sets level data and updates screendata
		
		//updates or resets any variables
		gameOn = true;
	}
	
	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);
    }
	
	public void doDrawing(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		
		if(gameOn){
			playGame(g2d);
		}
	}
	
	public void playGame(Graphics2D g2d){
		
	}
	
	public void drawImage(Graphics2D g2d, int imageIndex, int x, int y){
		g2d.drawImage(sprites.get(imageIndex), x, y, this);
	}
	
	public void update(){
		repaint();
	}
	
	void addKeyListener(ActionListener e){
		addKeyListener(e);
	}
	
	//gets and sets
}

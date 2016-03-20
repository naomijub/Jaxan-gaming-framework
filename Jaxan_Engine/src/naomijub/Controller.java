package naomijub;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller {
	private View board;
	private Models player;
	
	public Controller(View board, Models player){
		this.board = board;
		this.player = player;
		
		insertVariables();
		
		this.board.addKeyListener(new TAdapter());
	}
	
	public void insertVariables(){}
	
	public void updateValues(){}
	
	class TAdapter implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}

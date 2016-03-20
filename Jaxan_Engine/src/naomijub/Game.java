package naomijub;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Game extends JFrame{

	public Game(){
		initUI();
		
		//Exit Listener
  		addWindowListener(new WindowAdapter() {
  			public void windowClosed(WindowEvent e) {
  				System.exit(0);
  			}
  		});
	}
	
	public void initUI(){
		//MVC pattern
		View board = new View();
		//list of necessary models
		Models player = new Models();
		//include all models
		Controller controller = new Controller(board, player);
		
		//Set to preferred size
		this.setSize(1080, 720);
		this.setResizable(false);
		this.setTitle("@naomijub");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {		 
            public void run() {
                Game game = new Game();
                game.setVisible(true);
            }
        });

	}

}

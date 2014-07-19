/**
 * 
 */
package my;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridLayout;
/**
 * @author Siddharth
 *
 */
public class LoginFrame extends JFrame {
	private LoginPanel lp;
	private LoginButtons lb;
	
	/**
	 * 
	 */
	public LoginFrame() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Login Window");
		
		lp = new LoginPanel();
		lb = new LoginButtons();
		
		//this.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		this.getContentPane().setLayout(new GridLayout(2,0));
		
		this.getContentPane().add(lp);
	//	this.getContentPane().add(lb);
		
		
		
		pack();
		setVisible(true);
	}

}

/**
 * 
 */
package my;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridLayout;

/**
 * @author Siddharth
 *
 */
public class LoginButtons extends JPanel{
	JButton loginBut;
	JButton clearBut;

	/**
	 * 
	 */
	public LoginButtons() {
		// TODO Auto-generated constructor stub
		loginBut = new JButton("Login");
		clearBut = new JButton("Clear");
		
		
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		//this.setLayout(new GridLayout(0,2));
		
		this.add(loginBut);
		this.add(clearBut);
	}

}

/**
 * 
 */
package my;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
/**
 * @author Siddharth
 *
 */
public class LoginPanel extends JPanel{
	JLabel login;
	JLabel password;
	JLabel extra;
	JTextField loginText;
	JTextField passwordText;
	LoginButtons LB;
	//JButton logBut;
	//JButton clearBut;
	

	/**
	 * 
	 */
	public LoginPanel() {
		// TODO Auto-generated constructor stub
		//logBut = new JButton("Login");
		//clearBut = new JButton("Clear");
		login = new JLabel("Login");
		password = new JLabel("Password");
		loginText = new JTextField(10);
		passwordText = new JTextField(10);
		LB = new LoginButtons();
		extra = new JLabel("");
		
		this.setLayout(new GridLayout(3,2));
		
		this.add(login);
		this.add(loginText);
		this.add(password);
		this.add(passwordText);
		this.add(extra);
		this.add(LB);
		//this.add(logBut);
		//this.add(clearBut);
		
		
	}

}

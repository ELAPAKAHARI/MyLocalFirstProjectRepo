import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Container;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

//not sure if all needed but keep for now then delete later


public class Login {
    
    public static void main(String args[]) { //no longer static
        JFrame frame;
        Container contentPane;
        JTextField username = new JTextField( "User Name", 10 );
	JTextField password = new JTextField( "Password", 10 );;
        JButton button;
        FlowLayout layout;
	String LogOn;
	String realpass;// Still need?
// declares all needed stuff

        frame = new JFrame();
        frame.setTitle("Interact");
        contentPane = frame.getContentPane();
//puts in a nice little frame but not for applet


	LogOn = "This button is temporarily out of order.";
        button = new JButton(LogOn); //risky now from here
	button.setActionCommand("enable");
	button.addActionListener(this); //is this correct?


        contentPane.add(username);
	contentPane.add(password);
        contentPane.add(button);
        layout = new FlowLayout();
        contentPane.setLayout(layout);
//Layout design (so they show on page)


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
//allows you to close page etc.


	//taking username
	String user = username.getText();

	//taking password 
	String pass = password.getText();

	public void actionPerformed(ActionEvent e) {

    if ( pass == "java")// following is simple for while trying to get the code working!
        button.setEnabled(false);
    else 
        button.setEnabled(true);
	}


}//closses "main" method
}//closess class
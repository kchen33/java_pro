package graph;
import com.database.*;
import com.event.*;
import com.social.*;
import com.study.*;
import javax.swing.*;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class login extends JFrame implements ActionListener{
	JTextField username = new JTextField(15);
	JTextField password = new JTextField(15);
	JButton login = new JButton("login");
	JLabel status = new JLabel("");
	static ImageIcon background;
	
	public login(){
		super("ezLife");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,500);
		
		background = new ImageIcon("back.jpg");
		JLabel label = new JLabel(background);
		label.setSize(background.getIconWidth(), background.getIconHeight());
		this.getLayeredPane().setLayout(null);
		this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
		JPanel imagePanel = (JPanel)this.getContentPane();
		imagePanel.setOpaque(false);

		GridBagLayout g = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		setLayout(g);
		c.gridx = 0;
		c.gridy = 0;
		add(username,c);
		username.setText("Username");
		password.setText("Password");
		c.gridx = 0;
		c.gridy = 2;
		add(password,c);
		c.gridx = 0;
		c.gridy = 4;
		add(login,c);
		c.gridx = 0;
		c.gridy = 6;
		login.setPreferredSize(new Dimension(40,20));
		add(status,c);
		login.addActionListener(this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == login){
			String user = username.getText();
			String pass = username.getText();
			if(user.equals("kchen33") && pass.equals("kchen33")){
				status.setText("logged in successfully");
				panel p = new panel();
				setVisible(false);
			} else {
				status.setText("Incorrect username and password");
			}
		}
	}
	

}


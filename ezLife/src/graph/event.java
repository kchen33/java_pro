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

class event extends JFrame implements ActionListener{
	JButton act = new JButton("Add Activity");
	JButton exe = new JButton("Add Exercise");
	JButton back = new JButton("back");
	static ImageIcon background;
	
	public event(){
		super("Events");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,500);
		GridBagLayout g = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		setLayout(g);
		
		background = new ImageIcon("back.jpg");
		JLabel label = new JLabel(background);
		label.setSize(background.getIconWidth(), background.getIconHeight());
		this.getLayeredPane().setLayout(null);
		this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
		JPanel imagePanel = (JPanel)this.getContentPane();
		imagePanel.setOpaque(false);
		
		c.gridx = 0;
		c.gridy = 0;
		add(act,c);
		c.gridx = 0;
		c.gridy = 2;
		act.setPreferredSize(new Dimension(300, 40));
		act.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				activity ac = new activity();
			}
        });
		add(exe,c);
		c.gridx = 0;
		c.gridy = 4;
		exe.setPreferredSize(new Dimension(300, 40));
		exe.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				execise ex = new execise();
			}
        });
		add(back,c);
		c.gridx = 0;
		c.gridy = 6;
		add(back,c);
		back.setPreferredSize(new Dimension(80, 40));
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panel p = new panel();
				setVisible(false);
			}
        });
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		
	}
	

}



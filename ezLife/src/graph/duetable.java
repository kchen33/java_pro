package graph;
import com.database.*;
import com.event.*;
import com.social.*;
import com.study.*;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class duetable extends JFrame implements ActionListener{

	static ImageIcon background;
	JButton back = new JButton("back");
	
	public duetable() throws IOException{
		super("duedate");
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
		
		add(back,c);
		c.gridx = 0;
		c.gridy = 2;
		back.setPreferredSize(new Dimension(100, 40));
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				schedule s = new schedule();
				setVisible(false);
			}
        });
		
		BufferedReader bf = new BufferedReader(new FileReader("dueday"));
		String temp = "";
		int t = 2;
		while((temp = bf.readLine())!=null){
			final String[] onejob = temp.split(" ");
			final Time stime = new Time(onejob[1],onejob[2],onejob[3],onejob[4],onejob[5]);
			boolean repeat = Boolean.parseBoolean(onejob[6]);
			JButton jb = new JButton(onejob[0]);
			c.gridx = 0;
			c.gridy = t*2;
			add(jb, c);
			jb.setPreferredSize(new Dimension(300, 20));
			jb.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					
					JOptionPane.showMessageDialog(null,onejob[0]+"  "+stime.fomstring(), "information", JOptionPane.INFORMATION_MESSAGE);
				}
	        });
			
			t = t+2;
			
		}

	setVisible(true);
}
	public void actionPerformed(ActionEvent e){
		
	}
	

}

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

class social extends JFrame implements ActionListener{
	//name date time repeat
	JTextField Status = new JTextField(10);
	JCheckBox fb = new JCheckBox();
	JCheckBox tw = new JCheckBox();
	JCheckBox Lin = new JCheckBox();
	JButton post = new JButton("post");
	JButton back = new JButton("back");
	JLabel statuslb = new JLabel("Post Status:");
	ImageIcon fbic = new ImageIcon("fb.png");
    JLabel fblb = new JLabel(fbic);
    ImageIcon twic = new ImageIcon("tw.png");
    JLabel twlb = new JLabel(twic);
    ImageIcon liic = new ImageIcon("li.jpg");
    JLabel lilb = new JLabel(liic);
	static ImageIcon background;
    
	public social(){
		super("Social");
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
		
		add(statuslb);
		Status.setText("Tell your friends what's in your mind");
		add(Status);
		
		c.gridy = 3;
		add(fblb,c);
		c.gridx = 2;
		add(twlb,c);
		c.gridx = 4;
		add(lilb,c);
		c.gridy = 4;
		c.gridx = 0;
		add(fb,c);
		c.gridx = 2;
		add(tw,c);
		c.gridx = 4;
		add(Lin,c);
		c.gridx = 1;
		c.gridy = 5;
		add(post,c);
		c.gridx = 3;
		add(back,c);
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panel s = new panel();
				setVisible(false);
			}
        });
		
		//post listener here
		post.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//add code here....
				
				String calstatus = Status.getText();
				boolean facebook = fb.isSelected();
				boolean twitter = tw.isSelected();
				boolean linkedin =Lin.isSelected();
				
				if(facebook){
					JOptionPane.showMessageDialog(null,"You have post your status on your Facebook", "successful", JOptionPane.INFORMATION_MESSAGE);
				}
				if(twitter){
					JOptionPane.showMessageDialog(null,"You have post your status on your Twitter", "successful", JOptionPane.INFORMATION_MESSAGE);
				}
				if(linkedin){
					JOptionPane.showMessageDialog(null,"You have post your status on your LinkedLi", "successful", JOptionPane.INFORMATION_MESSAGE);
				}
				panel s = new panel();
				setVisible(false);
			}
        });
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		
	}
	

}


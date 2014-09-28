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
import java.io.FileOutputStream;
import java.io.IOException;


class due_day extends JFrame implements ActionListener{
	//name date time repeat
	JTextField name = new JTextField(5);
	JTextField datey = new JTextField(4);
	JTextField datem = new JTextField(2);
	JTextField dated = new JTextField(2);
	JTextField time = new JTextField("Time");
	JCheckBox repeat = new JCheckBox();
	JLabel namelb = new JLabel("Name:");
	JLabel datelb = new JLabel("Date:");
	JLabel timelb = new JLabel("Time:");
	JTextField timeh = new JTextField(2);
	JTextField timem = new JTextField(2);
	JLabel repeatlb = new JLabel("Repeat Weekly ");
	JButton add = new JButton("add");
	JButton back = new JButton("back");
	static ImageIcon background;
	
	public due_day(){
		super("Add Due Dates");
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
		add(namelb,c);
		c.gridx = 1;
		add(name,c);
		name.setText("Name");
		c.gridx = 0;
		c.gridy = 1;
		add(datelb,c);
		c.gridx = 1;
		add(datey,c);
		datey.setText("year");
		c.gridx = 2;
		add(datem,c);
		datem.setText("mo");
		c.gridx = 3;
		add(dated,c);
		dated.setText("dy");
		c.gridx = 0;
		c.gridy = 2;
		add(timelb,c);
		timeh.setText("hr");
		timem.setText("min");
		c.gridx = 1;
		add(timeh,c);
		c.gridx = 2;
		add(timem,c);
		c.gridx = 0;
		c.gridy = 3;
		add(repeatlb,c);
		c.gridx = 1;
		add(repeat,c);
		c.gridx = 1;
		c.gridy = 4;
		add(add,c);
		c.gridy = 5;
		add(back,c);
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				study s = new study();
				setVisible(false);
			}
        });
		
		//add listener here
		add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String duename = name.getText();
				String duedatey = datey.getText();
				String duedatem = datem.getText();
				String duedated = dated.getText();
				String duetimeh = timeh.getText();
				String duetimem = timem.getText();
				boolean duerepeat = repeat.isSelected();
				
				Time duetime = new Time(duedatey, duedatem, duedated, duetimeh, duetimem);
				Job newjob = new Job(duename, duetime, duerepeat);
				
				try {
			    	FileOutputStream f=new FileOutputStream("dueday",true);
			    	String output = "\r\n"+newjob.toString();
			        f.write(output.getBytes());
					f.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				study s = new study();
				setVisible(false);
			}
        });
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		
	}
	

}


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

//stime == start time
//etime == end time

class activity extends JFrame implements ActionListener{
	JTextField name = new JTextField(5);
	JTextField datey = new JTextField(4);
	JTextField datem = new JTextField(2);
	JTextField dated = new JTextField(2);
	JLabel namelb = new JLabel("Name:");
	JLabel datelb = new JLabel("Date:");
	JLabel stimelb = new JLabel("Start Time:");
	JLabel etimelb = new JLabel("End Time:");
	JTextField stimeh = new JTextField(2);
	JTextField stimem = new JTextField(2);
	JTextField etimeh = new JTextField(2);
	JTextField etimem = new JTextField(2);
	JButton add = new JButton("add");
	JButton back = new JButton("back");
	
	JLabel mon = new JLabel("Mon");
	JLabel tues = new JLabel("Tues");
	JLabel wed = new JLabel("Wed");
	JLabel thur = new JLabel("Thurs");
	JLabel fri = new JLabel("Fri");
	
	JCheckBox moncb = new JCheckBox();
	JCheckBox tuescb = new JCheckBox();
	JCheckBox wedcb = new JCheckBox();
	JCheckBox thurcb = new JCheckBox();
	JCheckBox fricb = new JCheckBox();
	static ImageIcon background;

	public activity(){
		super("Add Activity");
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
		add(mon,c);
		c.gridx = 1;
		add(tues,c);
		c.gridx = 2;
		add(wed,c);
		c.gridx = 3;
		add(thur,c);
		c.gridx = 4;
		add(fri,c);
		c.gridx = 0;
		c.gridy = 3;
		add(moncb,c);
		c.gridx = 1;
		add(tuescb,c);
		c.gridx = 2;
		add(wedcb,c);
		c.gridx = 3;
		add(thurcb,c);
		c.gridx = 4;
		add(fricb,c);
		c.gridx = 0;
		c.gridy = 4;
		add(stimelb,c);
		stimeh.setText("hr");
		stimem.setText("min");
		etimeh.setText("hr");
		etimem.setText("min");
		c.gridx = 1;
		add(stimeh,c);
		c.gridx = 2;
		add(stimem,c);
		c.gridx = 0;
		c.gridy = 5;
		add(etimelb,c);
		c.gridx = 1;
		add(etimeh,c);
		c.gridx = 2;
		add(etimem,c);
		c.gridx = 1;
		c.gridy = 6;
		add(add,c);
		c.gridy = 7;
		add(back,c);
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				event s = new event();
				setVisible(false);
			}
        });
		
		//add listener here
		add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String actName = name.getText();
				String actdatey = datey.getText();
				String actdatem = datem.getText();
				String actdated = dated.getText();
				String actstimeh = stimeh.getText();
				String actstimem = stimem.getText();
				String actetimeh = etimeh.getText();
				String actetimem = etimem.getText();
				Time actstime = new Time(actdatey, actdatem,actdated, actstimeh, actstimem);
				Time actetime = new Time(actdatey, actdatem, actdated, actetimeh, actetimem);
				Job newact = new Job(actName, actstime, actetime, false);
				
				try {
			    	FileOutputStream f=new FileOutputStream("job",true);
			    	String output = "\r\n"+newact.toString();
			        f.write(output.getBytes());
					f.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				event s = new event();
				setVisible(false);
			}
        });
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		
	}
	

}



package inlupp1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class valuablesReg extends JFrame{
	
	private ArrayList<Things> allThings = new ArrayList<>();
	
	public valuablesReg(){
		super("Register");
		
		JPanel south = new JPanel();
		add(south, BorderLayout.SOUTH);
		JButton newButton = new JButton ("Add");
		south.add(newButton);
		newButton.addActionListener(new NewList());
		
		JButton showButton = new JButton ("Show");
		south.add(showButton);
		
		JPanel right = new JPanel();
		right.setLayout(new BoxLayout(right, BoxLayout.Y_AXIS));
		add(right, BorderLayout.EAST);
		right.add(new JLabel("Show which"));
		JRadioButton allButton = new JRadioButton("All");
		right.add(allButton);
		JRadioButton 
		
		setLayout(new BorderLayout());
		JPanel north = new JPanel();
		north.add(new JButton("Open"));
		north.add(new JLabel("File"));
		north.add(new JTextField(12));
		north.add(new JRadioButton("Name", false));
		north.add(new JRadioButton("Value", false));
		add(north,BorderLayout.NORTH);
		JPanel south = new JPanel();
		south.add(new JComboBox(comboVal));
		JList li = new JList(listVal);
		li.setVisibleRowCount(2);
		south.add(new JScrollPane(li));
		add(south, BorderLayout.SOUTH);
		add(new JScrollPane(new JTextArea(str)),BorderLayout.CENTER);
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setVisible(true);	
	}
	

	public static void main(String[] args) {
		JFrame window = new Program();
	}
}

package inlupp1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Program extends JFrame {
	
	private ArrayList<Valuable> all = new ArrayList<>();
	
	public Program(){
		JPanel south = new JPanel();
		add(south, BorderLayout.SOUTH);
		JButton newButton = new JButton("New");
		south.add(newButton);
		newButton.addActionListener(new NewList());
		
		JButton showButton = new JButton ("Show");
		south.add(showButton);
		
		JPanel right = new JPanel();
		right.setLayout(new BoxLayout(right, BoxLayout.Y_AXIS));
		add(right, (BorderLayout.EAST));
		right.add(new JLabel("Show whom"));
		
		JTextArea display = new JTextArea();
		JScrollPane scroll = new JScrollPane(display);
		add(scroll, BorderLayout.CENTER);
		display.setEditable(false);
		
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	class NewList implements ActionListener{
	public void actionPerformed(ActionEvent ave) {
		int answer = JOptionPane.showConfirmDialog(null, "are you with me?");
		if (answer !=JOptionPane.OK_OPTION)
			return;
	}
	}

	
	
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class  LAB9P2 extends JFrame{
	Label l;
	LAB9P2(){
		super("JTabel Demo");
		
		String[] heading = {"Name","Course","Rollno"};
		String[][] data = { {"abc","CSE","12"},
					{"xyz","CSE","13"},
					{"mno","CSE","14"},
					};
					
		JTable jt = new JTable(data,heading);
		JScrollPane sp = new JScrollPane(jt);
		add(sp);
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
	public static void main(String...args){
		new LAB9P2();
	}
}

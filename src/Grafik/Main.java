package Grafik;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("table");
		frame.setSize(new Dimension(600, 400));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridBagLayout());
		
		Table tm = new Table();
		JTable table = new JTable(tm);
		JScrollPane tableScroll = new JScrollPane(table);
		tableScroll.setPreferredSize(new Dimension(600, 400));
		
		frame.add(tableScroll, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0));
		
		
		frame.setVisible(true);
		frame.pack();
		
		
	/*	ConnectionDB connect = new ConnectionDB("localhost", "SYSDBA", "masterkey", "D:/bd/GRAFIK.fdb");
		connect.initProperties();
		connect.init();
		ResultSet res = connect.query("SELECT * from DEP");
		connect.closeConnection();
*/
	}

}

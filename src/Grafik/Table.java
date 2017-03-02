package Grafik;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class Table extends AbstractTableModel {
	
	private static final long serialVersionUID = -2865708774564268676L;
	
	private int columnCount = 4;
	private ArrayList<String []> dataArrayList;
	
	public Table(){
		dataArrayList = new ArrayList<String []>();
		for(int i = 0; i < dataArrayList.size(); i++){
			dataArrayList.add(new String[getColumnCount()]);
	}
	}

	
	@Override
	public int getRowCount() {
		return dataArrayList.size();
    }

	@Override
	public int getColumnCount() {
		return columnCount;
	}
	
	@Override
	public String getColumnName(int columnIndex){
		switch(columnIndex){
		case 0: return "id";
		case 1: return "title";
		case 2: return "isbn";
		case 3: return "description";
		}
		return "";
	}

		

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		String []rows = dataArrayList.get(rowIndex);
		return rows[columnIndex];
	}
	
	public void addData(String []row){
		String []rowTable = new String[getColumnCount()];
		rowTable = row;
		dataArrayList.add(rowTable);
	}

}

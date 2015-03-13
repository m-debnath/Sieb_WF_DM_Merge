import javax.swing.table.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class MyTableCellRenderer extends DefaultTableCellRenderer {
    //@Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		String s = table.getModel().getValueAt(row, 1).toString();

		if (s.equals("Error Exception")) {
			setForeground(Color.RED);
		} else {
			setForeground(null);
		}
		return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
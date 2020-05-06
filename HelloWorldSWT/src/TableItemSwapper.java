import java.util.Objects;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

public class TableItemSwapper {

	public static void main(Composite group5, Shell shell, String[] args) {
Text g5_textField1 = new Text(group5, SWT.BORDER);    
	    
	    Button button1 = new Button(group5, SWT.PUSH);
	    button1.setText("B1");	
	    
	    Button button2 = new Button(group5, SWT.PUSH);
	    button2.setText("B2");	
	    
	    Button button3 = new Button(group5, SWT.PUSH);
	    button3.setText("B3");	
	    
	    Table table = new Table(group5, SWT.NONE);
	    String[] titles = { "Col 1", "Col 2"};

	    for (int loopIndex = 0; loopIndex < titles.length; loopIndex++) {
	      TableColumn column = new TableColumn(table, SWT.NULL);
	      column.setText(titles[loopIndex]);
	    }
	    
	    
	    for (int loopIndex = 0; loopIndex < titles.length; loopIndex++) {
	    	table.getColumn(loopIndex).pack();
	      }

	    
	    
	    button1.addSelectionListener(new SelectionAdapter() {
	    	 
            @Override
            public void widgetSelected(SelectionEvent e) {
                String temp_name = g5_textField1.getText();
                TableItem item = new TableItem(table, SWT.NULL);
                item.setText(0, temp_name);
            }
        });
	    
	    button2.addSelectionListener(new SelectionAdapter() {
	    	 
            @Override
            public void widgetSelected(SelectionEvent e) {
                int current_index = table.getSelectionIndex();
                TableItem current_item = table.getItem(current_index);
                String temp_text = current_item.getText(0);
                
                if (!Objects.equals(temp_text, "")) {
                	current_item.setText(1, temp_text);                    
                    current_item.setText(0, "");
                }                
            }
        });
	    
	    button3.addSelectionListener(new SelectionAdapter() {
	    	 
            @Override
            public void widgetSelected(SelectionEvent e) {
            	int current_index = table.getSelectionIndex();
                TableItem current_item = table.getItem(current_index);
                String temp_text = current_item.getText(1);
                
                if (!Objects.equals(temp_text, "")) {
                	current_item.setText(0, temp_text);                    
                    current_item.setText(1, "");
                } 
            }
        });
		
	}
}

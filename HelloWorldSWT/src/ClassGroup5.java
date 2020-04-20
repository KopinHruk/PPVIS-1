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

public class ClassGroup5 {

	public static void main(Composite group5, Shell shell, String[] args) {
Text g5_textField1 = new Text(group5, SWT.BORDER);    
	    
	    Button g5_button1 = new Button(group5, SWT.PUSH);
	    g5_button1.setText("B1");	
	    
	    Button g5_button2 = new Button(group5, SWT.PUSH);
	    g5_button2.setText("B2");	
	    
	    Button g5_button3 = new Button(group5, SWT.PUSH);
	    g5_button3.setText("B3");	
	    
	    Table g5_table = new Table(group5, SWT.NONE);
	    String[] titles = { "Col 1", "Col 2"};

	    for (int loopIndex = 0; loopIndex < titles.length; loopIndex++) {
	      TableColumn column = new TableColumn(g5_table, SWT.NULL);
	      column.setText(titles[loopIndex]);
	    }
	    
	    //for (int loopIndex = 0; loopIndex < 24; loopIndex++) {
	     //   TableItem item = new TableItem(g5_table, SWT.NULL);
	     //   item.setText("Item " + loopIndex);
	    //    item.setText(0, "Item " + loopIndex);
	    //    item.setText(1, "Yes");
	    //  }
	    
	    for (int loopIndex = 0; loopIndex < titles.length; loopIndex++) {
	    	g5_table.getColumn(loopIndex).pack();
	      }

	    
	    
	    g5_button1.addSelectionListener(new SelectionAdapter() {
	    	 
            @Override
            public void widgetSelected(SelectionEvent e) {
                String temp_name = g5_textField1.getText();
                TableItem item = new TableItem(g5_table, SWT.NULL);
                item.setText(0, temp_name);
            }
        });
	    
	    g5_button2.addSelectionListener(new SelectionAdapter() {
	    	 
            @Override
            public void widgetSelected(SelectionEvent e) {
                int current_index = g5_table.getSelectionIndex();
                TableItem current_item = g5_table.getItem(current_index);
                String temp_text = current_item.getText(0);
                
                if (!Objects.equals(temp_text, "")) {
                	current_item.setText(1, temp_text);                    
                    current_item.setText(0, "");
                }                
            }
        });
	    
	    g5_button3.addSelectionListener(new SelectionAdapter() {
	    	 
            @Override
            public void widgetSelected(SelectionEvent e) {
            	int current_index = g5_table.getSelectionIndex();
                TableItem current_item = g5_table.getItem(current_index);
                String temp_text = current_item.getText(1);
                
                if (!Objects.equals(temp_text, "")) {
                	current_item.setText(0, temp_text);                    
                    current_item.setText(1, "");
                } 
            }
        });
		
	}
}

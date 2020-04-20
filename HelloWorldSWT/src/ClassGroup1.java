import java.util.Objects;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class ClassGroup1 {

	public static void main(Composite group1, Shell shell, String[] args) {
		Button g1_button1 = new Button(group1, SWT.PUSH);
	    g1_button1.setText("B1");
	    
	    Combo g1_combo = new Combo(group1, SWT.SIMPLE );
	    
	    Text g1_textField1 = new Text(group1, SWT.BORDER);
	    
	    
	    MessageBox g1_dialog = new MessageBox(shell, SWT.ICON_QUESTION | SWT.OK);
	    g1_dialog.setText("opaaa..");
	    g1_dialog.setMessage("диалоговое окно о невозможности добавления введенного текста. ");
	    
	    
	    
	    g1_button1.addSelectionListener(new SelectionAdapter() {
	    	 
            @Override
            public void widgetSelected(SelectionEvent e) {
                String temp_text = g1_textField1.getText();
                String[] list_of_items = g1_combo.getItems();
                boolean check = false;
                
                for (String element : list_of_items) {
                    if (Objects.equals(element, temp_text)) {
                    	
                    	check = true;
                    }
                }
                
                if (!check) g1_combo.add(temp_text);
                else g1_dialog.open();
            }
        });
		
	}
}

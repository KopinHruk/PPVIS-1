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
		Button button = new Button(group1, SWT.PUSH);
	    button.setText("B1");
	    
	    Combo combo = new Combo(group1, SWT.SIMPLE );
	    
	    Text textField = new Text(group1, SWT.BORDER);
	    
	    
	    MessageBox dialog = new MessageBox(shell, SWT.ICON_QUESTION | SWT.OK);
	    dialog.setText("opaaa..");
	    dialog.setMessage("диалоговое окно о невозможности добавления введенного текста. ");
	    
	    
	    
	    button.addSelectionListener(new SelectionAdapter() {
	    	 
            @Override
            public void widgetSelected(SelectionEvent e) {
                String temp_text = textField.getText();
                String[] list_of_items = combo.getItems();
                boolean check = false;
                
                for (String element : list_of_items) {
                    if (Objects.equals(element, temp_text)) {
                    	
                    	check = true;
                    }
                }
                
                if (!check) combo.add(temp_text);
                else dialog.open();
            }
        });
		
	}
}

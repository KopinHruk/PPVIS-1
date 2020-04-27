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

public class ClassGroup3 {

	public static void main(Composite group3, Shell shell, String[] args) {
		Button button = new Button(group3, SWT.PUSH);
	    button.setText("B1");
	    
	    Text textField = new Text(group3, SWT.BORDER);
	    
	    Button radio1 = new Button(group3, SWT.RADIO);
	    radio1.setText("R1");
	    Button radio2 = new Button(group3, SWT.RADIO);
	    radio2.setText("R2");
	    Button radio3 = new Button(group3, SWT.RADIO);
	    radio3.setText("R3");
	    
	    MessageBox dialog = new MessageBox(shell, SWT.ICON_QUESTION | SWT.OK);
	    dialog.setText("opaaa..");
	    dialog.setMessage("If a JRadioButton name is entered that does not exist, an error dialog should be displayed.");
	    
	    
	    button.addSelectionListener(new SelectionAdapter() {
	    	 
            @Override
            public void widgetSelected(SelectionEvent e) {
                String temp_name = textField.getText();
                
                
                if (Objects.equals(radio1.getText(), temp_name)) {
                	radio1.setSelection(true);
                	radio2.setSelection(false);
                	radio3.setSelection(false);
                	
                } else if (Objects.equals(radio2.getText(), temp_name)) {
                	radio1.setSelection(false);
                	radio2.setSelection(true);
                	radio3.setSelection(false);
                	
                } else if (Objects.equals(radio3.getText(), temp_name)) {
        			radio1.setSelection(false);
        			radio2.setSelection(false);
        			radio3.setSelection(true);
                	
                } else {
                	dialog.open();
                }
                
            }
        });
		
	}
}

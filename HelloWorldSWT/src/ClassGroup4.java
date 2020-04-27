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

public class ClassGroup4 {

	public static void main(Composite group4, Shell shell, String[] args) {
Text g4_textField1 = new Text(group4, SWT.BORDER);    
	    
	    Button button = new Button(group4, SWT.PUSH);
	    button.setText("B1");	    

	    Button radio1 = new Button(group4, SWT.CHECK);
	    radio1.setText("CH1");
	    Button radio2 = new Button(group4, SWT.CHECK);
	    radio2.setText("CH2");
	    Button radio3 = new Button(group4, SWT.CHECK);
	    radio3.setText("CH3");
	    
	    MessageBox dialog = new MessageBox(shell, SWT.ICON_QUESTION | SWT.OK);
	    dialog.setText("opaaa..");
	    dialog.setMessage("If a JCheckBox name is entered that does not exist, an error dialog should be displayed.");
	    
	    
	    button.addSelectionListener(new SelectionAdapter() {
	    	 
            @Override
            public void widgetSelected(SelectionEvent e) {
                String temp_name = g4_textField1.getText();
                
                
                if (Objects.equals(radio1.getText(), temp_name)) {
                	radio1.setSelection(!radio1.getSelection());
                	
                } else if (Objects.equals(radio2.getText(), temp_name)) {
                	radio2.setSelection(!radio2.getSelection());
                	
                } else if (Objects.equals(radio3.getText(), temp_name)) {
        			radio3.setSelection(!radio3.getSelection());
                	
                } else {
                	dialog.open();
                }
                
            }
        });
		
	}
}

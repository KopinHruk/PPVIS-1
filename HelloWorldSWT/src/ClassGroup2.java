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

public class ClassGroup2 {

	public static void main(Composite group2, Shell shell, String[] args) {
		 Button g2_button1 = new Button(group2, SWT.PUSH);
		    g2_button1.setText("B1");
		    
		    Button g2_button2 = new Button(group2, SWT.PUSH);
		    g2_button2.setText("B2");
		    

		    Text g2_textField1 = new Text(group2, SWT.BORDER);
		    
		  
		    g2_button1.addSelectionListener(new SelectionAdapter() {
		    	 
	            @Override
	            public void widgetSelected(SelectionEvent e) {
	                String temp_text = g2_textField1.getText();
	                g2_button2.setText(temp_text);
	            }
	        });
		    
		    g2_button2.addSelectionListener(new SelectionAdapter() {
		    	 
	            @Override
	            public void widgetSelected(SelectionEvent e) {
	                String temp_text1 = g2_button1.getText();
	                String temp_text2 = g2_button2.getText();
	                g2_button2.setText(temp_text1);
	                g2_button1.setText(temp_text2);
	            }
	        });
		
	}
}

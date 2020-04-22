import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class ClassGroup2 {

	public static void main(Composite group2, Shell shell, String[] args) {
		 Button button1 = new Button(group2, SWT.PUSH);
		    button1.setText("B1");
		    
		    Button button2 = new Button(group2, SWT.PUSH);
		    button2.setText("B2");
		    

		    Text textField = new Text(group2, SWT.BORDER);
		    
		  
		    button1.addSelectionListener(new SelectionAdapter() {
		    	 
	            @Override
	            public void widgetSelected(SelectionEvent e) {
	                String temp_text = textField.getText();
	                button2.setText(temp_text);
	            }
	        });
		    
		    button2.addSelectionListener(new SelectionAdapter() {
		    	 
	            @Override
	            public void widgetSelected(SelectionEvent e) {
	                String temp_text1 = button1.getText();
	                String temp_text2 = button2.getText();
	                button2.setText(temp_text1);
	                button1.setText(temp_text2);
	            }
	        });
		
	}
}

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class TextSwapper {

	public static void main(Composite group2, Shell shell, String[] args) {
		 Button button1 = new Button(group2, SWT.PUSH);
		    button1.setText("B1");
		    
		    Button button2 = new Button(group2, SWT.PUSH);
		    button2.setText("B2");
		    

		    Text textField = new Text(group2, SWT.BORDER);
		    
		  
		    button1.addSelectionListener(new SelectionAdapter() {
		    	 
	            @Override
	            public void widgetSelected(SelectionEvent e) {
	                String tempText = textField.getText();
	                button2.setText(tempText);
	            }
	        });
		    
		    button2.addSelectionListener(new SelectionAdapter() {
		    	 
	            @Override
	            public void widgetSelected(SelectionEvent e) {
	                String tempText1 = button1.getText();
	                String tempText2 = button2.getText();
	                button2.setText(tempText1);
	                button1.setText(tempText2);
	            }
	        });
		
	}
}

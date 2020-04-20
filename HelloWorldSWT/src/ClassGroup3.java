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
		Button g3_button1 = new Button(group3, SWT.PUSH);
	    g3_button1.setText("B1");
	    
	    Text g3_textField1 = new Text(group3, SWT.BORDER);
	    
	    Button g3_radio1 = new Button(group3, SWT.RADIO);
	    g3_radio1.setText("R1");
	    Button g3_radio2 = new Button(group3, SWT.RADIO);
	    g3_radio2.setText("R2");
	    Button g3_radio3 = new Button(group3, SWT.RADIO);
	    g3_radio3.setText("R3");
	    
	    MessageBox g3_dialog = new MessageBox(shell, SWT.ICON_QUESTION | SWT.OK);
	    g3_dialog.setText("opaaa..");
	    g3_dialog.setMessage("Если введено имя JRadioButton, которого не существует, то должно быть выведено диалоговое окно с ошибкой. ");
	    
	    
	    g3_button1.addSelectionListener(new SelectionAdapter() {
	    	 
            @Override
            public void widgetSelected(SelectionEvent e) {
                String temp_name = g3_textField1.getText();
                
                //Yeah it is the most fascinating code ever!
                
                if (Objects.equals(g3_radio1.getText(), temp_name)) {
                	g3_radio1.setSelection(true);
                	g3_radio2.setSelection(false);
                	g3_radio3.setSelection(false);
                	
                } else if (Objects.equals(g3_radio2.getText(), temp_name)) {
                	g3_radio1.setSelection(false);
                	g3_radio2.setSelection(true);
                	g3_radio3.setSelection(false);
                	
                } else if (Objects.equals(g3_radio3.getText(), temp_name)) {
        			g3_radio1.setSelection(false);
        			g3_radio2.setSelection(false);
        			g3_radio3.setSelection(true);
                	
                } else {
                	g3_dialog.open();
                }
                
            }
        });
		
	}
}

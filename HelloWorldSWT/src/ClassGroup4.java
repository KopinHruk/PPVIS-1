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
	    
	    Button g4_button1 = new Button(group4, SWT.PUSH);
	    g4_button1.setText("B1");	    

	    Button g4_radio1 = new Button(group4, SWT.CHECK);
	    g4_radio1.setText("CH1");
	    Button g4_radio2 = new Button(group4, SWT.CHECK);
	    g4_radio2.setText("CH2");
	    Button g4_radio3 = new Button(group4, SWT.CHECK);
	    g4_radio3.setText("CH3");
	    
	    MessageBox g4_dialog = new MessageBox(shell, SWT.ICON_QUESTION | SWT.OK);
	    g4_dialog.setText("opaaa..");
	    g4_dialog.setMessage("Если введено имя JCheckBox, которого не существует, то должно быть выведено диалоговое окно с ошибкой. ");
	    
	    
	    g4_button1.addSelectionListener(new SelectionAdapter() {
	    	 
            @Override
            public void widgetSelected(SelectionEvent e) {
                String temp_name = g4_textField1.getText();
                
                //Yeah it is the most fascinating code ever!
                
                if (Objects.equals(g4_radio1.getText(), temp_name)) {
                	g4_radio1.setSelection(!g4_radio1.getSelection());
                	
                } else if (Objects.equals(g4_radio2.getText(), temp_name)) {
                	g4_radio2.setSelection(!g4_radio2.getSelection());
                	
                } else if (Objects.equals(g4_radio3.getText(), temp_name)) {
        			g4_radio3.setSelection(!g4_radio3.getSelection());
                	
                } else {
                	g4_dialog.open();
                }
                
            }
        });
		
	}
}

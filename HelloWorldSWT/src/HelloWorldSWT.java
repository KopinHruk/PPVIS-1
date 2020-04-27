import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class HelloWorldSWT {

	public static void main(String[] args) {
		Display display = new Display();
	    final Shell shell = new Shell(display);

	    shell.setSize(400, 800);
	    shell.setLayout(new RowLayout());

	    shell.setText("Variant 17");

	    Composite allGroups = new Composite(shell, SWT.NONE);
	    
	    Composite group1 = new Composite(allGroups, SWT.BORDER);
	    Composite group2 = new Composite(allGroups, SWT.BORDER);
	    Composite group3 = new Composite(allGroups, SWT.BORDER);
	    Composite group4 = new Composite(allGroups, SWT.BORDER);
	    Composite group5 = new Composite(allGroups, SWT.BORDER);
	    Composite group6 = new Composite(allGroups, SWT.BORDER);
	    
	    
	    GridLayout eachGroupLayout = new GridLayout();
	    GridLayout allGroupsLayout = new GridLayout ();	    
	    
	    eachGroupLayout.numColumns = 4;
	    
	    allGroupsLayout.numColumns = 1;
	    
	    allGroups.setLayout(allGroupsLayout);
	    group1.setLayout(eachGroupLayout);
	    group2.setLayout(eachGroupLayout);
	    group3.setLayout(eachGroupLayout);
	    group4.setLayout(eachGroupLayout);
	    group5.setLayout(eachGroupLayout);
	    group6.setLayout(eachGroupLayout);	    


	    ClassGroup1.main(group1, shell, args);	    
	    ClassGroup2.main(group2, shell, args);	  
	    ClassGroup3.main(group3, shell, args);
	    ClassGroup4.main(group4, shell, args);
	    ClassGroup5.main(group5, shell, args);  		    
	    LastGroup LastGroupObject = new LastGroup();
	    LastGroupObject.main(group6, shell, display, args);    
	    
	    shell.open();
	    
	    while (!shell.isDisposed()) {
	      if (!display.readAndDispatch())
	        display.sleep();
	    }
	    display.dispose();
	}

}

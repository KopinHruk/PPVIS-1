import java.util.Objects;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

public class HelloWorldSWT {

	public static void main(String[] args) {
		Display display = new Display();
	    final Shell shell = new Shell(display);
	    //Random rand = new Random(); 
	   // int rand_int1 = rand.nextInt(2); 
	    //int rand_int2 = rand.nextInt(2); 
	    shell.setSize(400, 800);
	    shell.setLayout(new RowLayout());

	    shell.setText("Variant 17");

	    Composite all_groups = new Composite(shell, SWT.NONE);
	    
	    Composite group1 = new Composite(all_groups, SWT.BORDER);
	    Composite group2 = new Composite(all_groups, SWT.BORDER);
	    Composite group3 = new Composite(all_groups, SWT.BORDER);
	    Composite group4 = new Composite(all_groups, SWT.BORDER);
	    Composite group5 = new Composite(all_groups, SWT.BORDER);
	    Composite group6 = new Composite(all_groups, SWT.BORDER);
	    
	    
	    GridLayout each_group_Layout = new GridLayout();
	    GridLayout all_groups_Layout = new GridLayout ();	    
	    
	    each_group_Layout.numColumns = 4;
	    
	    all_groups_Layout.numColumns = 1;
	    
	    all_groups.setLayout(all_groups_Layout);
	    group1.setLayout(each_group_Layout);
	    group2.setLayout(each_group_Layout);
	    group3.setLayout(each_group_Layout);
	    group4.setLayout(each_group_Layout);
	    group5.setLayout(each_group_Layout);
	    group6.setLayout(each_group_Layout);
	    
	    


	   //GROUP1111111111111111111111111111
	    
	    
	    //ClassGroup1 myObject = new ClassGroup1();
	    ClassGroup1.main(group1, shell, args);
	    
	    //GROUP2222222222222222222222222222222222
	    
	    ClassGroup2.main(group2, shell, args);
	   
	    
	  //GROUP3333333333333333333333333333333333
	    
	    ClassGroup3.main(group3, shell, args);
	    
	  //GROUP44444444444444444444444444444444444444444444 
	    
	    ClassGroup4.main(group4, shell, args);

	    
	    //GROUP5555555555555555555555555555555555555555555

	    ClassGroup5.main(group5, shell, args);
	    
	    
	    //LAST group...
	    
	    
	    
	    LastGroup.main(group6, shell, display, args);
	    
	    
	    
	    
	    //EEEEEEEEEENNNNNNNNNNNDDDDDDDDDDDDDD
	    
	    shell.open();
	    
	    //Runnable runnable = new Runnable() {
	    //    public void run() {
	         // animate();
	    //      display.timerExec(500, this);
	    //    }
	    //  };
	    //  display.timerExec(500, runnable);
	    
	    while (!shell.isDisposed()) {
	      if (!display.readAndDispatch())
	        display.sleep();
	    }
	    display.dispose();
	}

}


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

public class LastGroup {
    private  int tableHeight;
    private  int tableWidth;
    private  Table table;
    private  int column;
    private  int str;
    private  int add;

    public  void main(Composite group6, Shell shell, Display display, String[] argv) {

        Text text1 = new Text(group6, SWT.BORDER);
        text1.setBounds(50, 50, 100, 30);
        Text text2 = new Text(group6, SWT.BORDER);
        text2.setBounds(200, 50, 100, 30);
        Button button1 = new Button(group6, SWT.PUSH);
        Button button2 = new Button(group6, SWT.PUSH);
        Button button3 = new Button(group6, SWT.PUSH);
        button1.setText("Button1");
        button1.setBounds(50, 100, 60, 20);
        button2.setText("Button2");
        button2.setBounds(50, 150, 60, 20);
        button3.setText("Button3");
        button3.setBounds(50, 200, 60, 20);
        add = 1;


        final Runnable[] timer = new Runnable[1];
        button1.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
            if (table != null) {
            		table.dispose();
            	};
                table = new Table(shell, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
                table.setRedraw(true);
                table.setLinesVisible(true);
                table.setHeaderVisible(true);
                tableWidth = Integer.parseInt(text2.getText());
                tableHeight = Integer.parseInt(text1.getText());
                for (int i = 0; i < tableWidth+1; i++) {
                    TableColumn column = new TableColumn(table, SWT.NONE);
                    if (i == 0) {
                    	column.setText("");
                    } else {
                    	column.setText(Integer.toString(i));
                    };
                }
                for (int i = 0; i < tableHeight; ++i) {
                    TableItem item = new TableItem(table, SWT.NONE);
                    table.getItem(i).setText(0, Integer.toString(i));
                }

                for (int i = 0; i < tableWidth+1; i++) {
                    table.getColumn(i).pack();
                }
                table.setBounds(200, 100, 300, 300);
                column = (int) ((Math.random() * tableWidth)+1);
                str = (int) (Math.random() * tableHeight);
                table.getItem(str).setText(column, "t");
                
                shell.layout();
            }
        });
        
        button2.addSelectionListener(new SelectionAdapter() {
            final int time = 500;

            @Override
            public void widgetSelected(SelectionEvent e) {
                timer[0] = new Runnable() {
                    public void run() {
                        table.getItem(str).setText(column, "");
                        if (add == 1) {
                            if (column + 1 == tableWidth+1) {
                                add *= -1;
                                if (str + 1 == tableHeight) {
                                    str = 0;
                                    column = 1;
                                    add *= -1;
                                } else {
                                    str += 1;
                                }
                            } else {
                                column += add;
                            }
                        } else {
                            if (column - 1 == 0) {
                                add *= -1;
                                if (str + 1 == tableHeight) {
                                    str = 0;
                                } else {
                                    str += 1;
                                }
                            } else {
                                column += add;
                            }
                        }
                        table.getItem(str).setText(column, "t");
                        display.timerExec(time, this);
                    }
                };
                display.timerExec(time, timer[0]);

            }


        });

        button3.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                display.timerExec(-1, timer[0]);
            }
        });

        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {

                display.sleep();
            }
        }
        display.dispose();
    }
}



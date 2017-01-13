import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JFrame {

	JButton button1, button2, button3, button4;
	
	public Button(InventorySystem system)
	{
		initUI(system);
		
	}

	public void initUI(InventorySystem system){
		setTitle("Orders Button");
		setSize(300,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		createButtons();
		button1.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AddItemButton addItem = new AddItemButton(system);
				addItem.setVisible(true);
			}
		
			
		});
		
		button2.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				RemoveWindow removeItem = new RemoveWindow(system);
				removeItem.setVisible(true);
				//system.removeItem();
				
			}
			
			
			
			
		});
		
		button3.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				system.showOrders();
				
			}
			
			
			
		});
		
		button4.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				system.showPurchaseOrders();
			}
			
			
		});
		
		Container container = this.getContentPane();
		
		JPanel panel1 = new JPanel(new GridLayout(2,2));
		
		
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		
		container.add(panel1);
	}
	
	
	public void createButtons(){
		button1 = new JButton("Add Item to Inventory");
		button2 = new JButton("Remove Item from Inventory");
		button3 = new JButton("View Customer Orders");
		button4 = new JButton("View Purchase Orders");
	}
	
	
}
cheeky

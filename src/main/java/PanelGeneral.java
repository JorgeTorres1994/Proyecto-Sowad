import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelGeneral extends JFrame implements ActionListener{
	JLabel eti1, eti2, eti3;
	JTextField txtnombre, txtedad;
	JButton boton1;
	JPanel panel;
	
	PanelGeneral() {
		// TODO Auto-generated constructor stub
		
		eti1 = new JLabel("Captura de datos");
		eti1.setBounds(20, 30, 200, 20);
		
		eti2 = new JLabel("Nombre: ");
		eti2.setBounds(40, 80, 180, 20);
		
		eti3 = new JLabel("Edad: ");
		eti3.setBounds(40, 120, 80, 20);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(100, 80, 180, 20);
		
		txtedad = new JTextField();
		txtedad.setBounds(100, 120, 80, 20);	
		
		boton1 = new JButton();
		boton1.setBounds(200, 180, 80, 120);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		panel.add(eti1);
		panel.add(eti2);
		panel.add(eti3);
		panel.add(txtnombre);
		add(panel);
		setSize(400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		PanelGeneral p = new PanelGeneral();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}

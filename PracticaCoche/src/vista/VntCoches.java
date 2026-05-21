package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JPasswordField;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTable;
import javax.swing.JCheckBox;

public class VntCoches extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VntCoches frame = new VntCoches();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VntCoches() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtMarca = new JTextField();
		txtMarca.setText("MARCAS");
		txtMarca.setBounds(106, 24, 86, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setText("MODELOS");
		txtModelo.setBounds(10, 24, 86, 20);
		contentPane.add(txtModelo);
		txtModelo.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(264, 24, 30, 20);
		contentPane.add(spinner);
		
		JLabel lblNewLabel = new JLabel("CONSUMO");
		lblNewLabel.setBounds(202, 27, 58, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmisiones = new JLabel("EMISIONES");
		lblEmisiones.setBounds(304, 27, 58, 17);
		contentPane.add(lblEmisiones);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(372, 24, 30, 20);
		contentPane.add(spinner_1);
		
		JLabel lblCali = new JLabel("CALIF.ENERG");
		lblCali.setBounds(412, 27, 66, 17);
		contentPane.add(lblCali);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setBounds(488, 24, 30, 20);
		contentPane.add(spinner_1_1);
		
		table = new JTable();
		table.setBounds(21, 106, 697, 392);
		contentPane.add(table);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("TODO");
		chckbxNewCheckBox.setBounds(654, 23, 58, 23);
		contentPane.add(chckbxNewCheckBox);

	}
}

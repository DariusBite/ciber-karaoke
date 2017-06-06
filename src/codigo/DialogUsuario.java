package codigo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DialogUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	private DefaultTableModel modelo;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogUsuario dialog = new DialogUsuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogUsuario() {
		setBounds(100, 100, 607, 641);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblApellidoPaterno = new JLabel("Apellido Paterno");
		lblApellidoPaterno.setBounds(10, 42, 94, 14);
		contentPanel.add(lblApellidoPaterno);
		
		JLabel lblApellidoMaterno = new JLabel("Apellido Materno");
		lblApellidoMaterno.setBounds(10, 67, 94, 14);
		contentPanel.add(lblApellidoMaterno);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(10, 92, 70, 14);
		contentPanel.add(lblNombres);
		
		JLabel lblTipoEmpleado = new JLabel("Tipo Empleado");
		lblTipoEmpleado.setBounds(10, 117, 81, 14);
		contentPanel.add(lblTipoEmpleado);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 143, 46, 14);
		contentPanel.add(lblUsuario);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 168, 46, 14);
		contentPanel.add(lblPassword);
		
		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setBounds(10, 200, 46, 14);
		contentPanel.add(lblTurno);
		
		textField = new JTextField();
		textField.setBounds(116, 39, 86, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(114, 64, 86, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(116, 89, 86, 20);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(113, 114, 89, 20);
		contentPanel.add(comboBox);
		
		textField_3 = new JTextField();
		textField_3.setBounds(114, 140, 86, 20);
		contentPanel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(116, 165, 86, 20);
		contentPanel.add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(116, 197, 84, 20);
		contentPanel.add(comboBox_1);
		
		JButton btnGrabar = new JButton("Grabar");
		btnGrabar.setBounds(251, 17, 89, 23);
		contentPanel.add(btnGrabar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(251, 46, 89, 23);
		contentPanel.add(btnEditar);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(10, 17, 46, 14);
		contentPanel.add(lblNewLabel);
		
		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		textField_5.setBounds(116, 8, 86, 20);
		contentPanel.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(251, 83, 89, 23);
		contentPanel.add(btnConsultar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(251, 113, 89, 23);
		contentPanel.add(btnEliminar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(251, 143, 89, 23);
		contentPanel.add(btnListar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 239, 414, 309);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		modelo = new DefaultTableModel();
		modelo.addColumn("ID");
		modelo.addColumn("Apellido Paterno");
		modelo.addColumn("Apellido Materno");
		modelo.addColumn("Nombres");
		modelo.addColumn("Tipo Empleado");
		modelo.addColumn("Usuario");
		modelo.addColumn("Password");
		modelo.addColumn("Turno");
		table.setModel(modelo);
		
		modelo.setRowCount(0);
		Object[] fila={00001,"Fernandez","Luque","Alvaro Juan","Doctor","afernandez","123456","Noche"};
		modelo.addRow(fila);
		
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}

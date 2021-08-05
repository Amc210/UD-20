package Ejercicio4;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;

public class Ejercicio4 extends JFrame {

	private JPanel contentPane;
	private JTextField operando1;
	private JTextField operando2;
	private JTextField resultado;
	private JButton resta;
	private JButton suma;
	private JButton multi;
	private JButton div;
	private JButton about;
	private JButton salir;
	private JLabel operador1M;
	private JLabel operador2M;
	private JLabel resultadoM;

	/**
	 * Create the frame.
	 */
	public Ejercicio4() {
		// contenedor
		setTitle("Mini Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 375);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		// mensaje
		operador1M = new JLabel("Operador 1:");
		operador1M.setBounds(53, 34, 87, 13);
		contentPane.add(operador1M);

		operador2M = new JLabel("Operador 2:");
		operador2M.setBounds(53, 63, 87, 13);
		contentPane.add(operador2M);

		resultadoM = new JLabel("Resultado:");
		resultadoM.setBounds(53, 92, 87, 13);
		contentPane.add(resultadoM);

		// operando1
		operando1 = new JTextField();
		operando1.setBounds(150, 31, 96, 19);
		contentPane.add(operando1);

		// operando2
		operando2 = new JTextField();
		operando2.setBounds(150, 60, 96, 19);
		contentPane.add(operando2);

		// resultado
		resultado = new JTextField();
		resultado.setBounds(150, 89, 96, 19);
		contentPane.add(resultado);

		// suma
		suma = new JButton("+");
		suma.setBounds(311, 27, 75, 27);
		contentPane.add(suma);
		suma.addActionListener(new ActionListener() { // Cuando clique mostrara la suma
			public void actionPerformed(ActionEvent e) {
				String oper1 = operando1.getText();
				String oper2 = operando2.getText();
				int num1 = Integer.parseInt(oper1);
				int num2 = Integer.parseInt(oper2);
				int resul = num1 + num2;
				String total = String.valueOf(resul);
				resultado.setText(total);
			}
		});

		// resta
		resta = new JButton("-");
		resta.setBounds(311, 60, 75, 27);
		contentPane.add(resta);
		resta.addActionListener(new ActionListener() { // Cuando clique mostrara la resta
			public void actionPerformed(ActionEvent e) {
				String oper1 = operando1.getText();
				String oper2 = operando2.getText();
				int num1 = Integer.parseInt(oper1);
				int num2 = Integer.parseInt(oper2);
				int resul = num1 - num2;
				String total = String.valueOf(resul);
				resultado.setText(total);
			}
		});
		// multiplicacion
		multi = new JButton("X");
		multi.setBounds(311, 92, 75, 27);
		contentPane.add(multi);
		multi.addActionListener(new ActionListener() { // Cuando clique mostrara la multiplicación
			public void actionPerformed(ActionEvent e) {
				String oper1 = operando1.getText();
				String oper2 = operando2.getText();
				int num1 = Integer.parseInt(oper1);
				int num2 = Integer.parseInt(oper2);
				int resul = num1 * num2;
				String total = String.valueOf(resul);
				resultado.setText(total);
			}
		});

		// division
		div = new JButton("/");
		div.setBounds(311, 122, 75, 27);
		contentPane.add(div);
		div.addActionListener(new ActionListener() { // Cuando clique mostrara la division
			public void actionPerformed(ActionEvent e) {
				String oper1 = operando1.getText();
				String oper2 = operando2.getText();
				int num1 = Integer.parseInt(oper1);
				int num2 = Integer.parseInt(oper2);
				int resul = num1 / num2;
				String total = String.valueOf(resul);
				resultado.setText(total);
			}
		});
		// Saldra de la aplicacion
		salir = new JButton("Salir");
		salir.setBounds(311, 186, 75, 27);
		contentPane.add(salir);
		salir.addActionListener(new ActionListener() { // Cuando clique saldra
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		// mostrara informacion
		about = new JButton("About");
		about.setBounds(311, 152, 75, 32);
		contentPane.add(about);
		about.addActionListener(new ActionListener() { // Cuando clique mostrara la informacion
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Mini calculadora :)");
			}
		});

	}
}

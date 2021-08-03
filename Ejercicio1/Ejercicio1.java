package Ejercicio1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ejercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nombre;
	private JLabel mensaje;

	/**
	 * Create the frame.
	 */
	public Ejercicio1() {
		// Contenedor
		setTitle("Saludador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 259);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		// mensaje
		mensaje = new JLabel("Introduce un nombre a saludar");
		mensaje.setBounds(40, 20, 500, 20);
		contentPane.add(mensaje);

		// preguntar nombre
		nombre = new JTextField();
		nombre.setBounds(40, 50, 99, 26);
		contentPane.add(nombre);

		// Boton
		JButton boton = new JButton("Saludar");
		contentPane.add(boton, BorderLayout.SOUTH);
		boton.setBounds(40, 90, 89, 23);
		boton.addActionListener(new ActionListener() { // Cuando clique mostrara el saludo con el nombre
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "¡Hola " + nombre.getText() + "!");
			}
		});

	}

}

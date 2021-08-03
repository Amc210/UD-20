package Ejercicio2;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Ejercicio2 extends JFrame {

	private static final long serialVersionUID = 8496624968073375903L;
	private JPanel contentPane;
	private JLabel mensaje;
	private JTextField titulo;
	private JComboBox<Object> menu;

	/**
	 * Create the frame.
	 */
	public Ejercicio2() {
		// contenedor
		setTitle("Peliculas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 239);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		// mensaje
		mensaje = new JLabel("Escribe el titulo de una pelicula");
		mensaje.setBounds(20, 20, 190, 20);
		contentPane.add(mensaje);

		// preguntar titulo
		titulo = new JTextField();
		titulo.setBounds(40, 50, 99, 26);
		contentPane.add(titulo);

		// Mensaje
		JLabel listaPeliculas = new JLabel("Peliculas");
		listaPeliculas.setBounds(294, 24, 68, 13);
		contentPane.add(listaPeliculas);

		// Menu desplegable
		menu = new JComboBox<>();
		menu.setBounds(257, 51, 141, 22);
		contentPane.add(menu);

		menu.addItem("La historia interminable");//He añadido unos datos de muestra
		menu.addItem("Los juegos del hambre");

		// Boton
		JButton boton = new JButton("Añadir");
		boton.setBounds(50, 86, 85, 21);
		contentPane.add(boton);
		boton.addActionListener(new ActionListener() { // Cuando clique mostrara el nombre introducido en la lista
			public void actionPerformed(ActionEvent e) {
				menu.addItem(titulo.getText());
			}
		});

	}
}

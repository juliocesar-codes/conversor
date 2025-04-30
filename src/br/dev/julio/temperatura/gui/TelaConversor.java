package br.dev.julio.temperatura.gui;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import br.dev.julio.temperatura.model.Temperatura;

public class TelaConversor {

	private JLabel labelRotularCampo;
	private JTextField textEntradaCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahrenheit;
	private JLabel labelResultado;
	private JLabel labelErro;
	
	public void criarTelaTemperatura(){
		
		
		JFrame tela = new JFrame();
		tela.setTitle("Tabuada");
		tela.setSize(400, 700);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setResizable(false);

		labelRotularCampo = new JLabel();
		labelRotularCampo.setText("Temperatura em graus celsius: ");
		labelRotularCampo.setBounds(20,20,300,30);
		
		textEntradaCelsius = new JTextField();
		textEntradaCelsius.setText("");
		textEntradaCelsius.setBounds(30, 20, 200, 60);
		
		buttonFahrenheit = new JButton();
		buttonFahrenheit.setText("FAHREINHEIT");
		buttonFahrenheit.setBounds(20, 200, 130, 40);
		
		buttonKelvin = new JButton();
		buttonKelvin.setText("KELVIN");
		buttonKelvin.setBounds(220, 150, 130, 40);
		
		labelResultado = new JLabel();
		labelResultado.setText(" ");
		labelResultado.setBounds(20, 110, 135, 30);
		
		labelErro = new JLabel();
		labelErro.setText("Ocorreu um erro no programa, insira um valor valido.");
		labelErro.setBounds(300, 110, 50, 30);
		
		tela.getContentPane().add(labelRotularCampo);
		tela.getContentPane().add(textEntradaCelsius);
		tela.getContentPane().add(buttonFahrenheit);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labelErro);
		
		buttonFahrenheit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Temperatura temperatura = new Temperatura();
				String celsius = textEntradaCelsius.getText();
				double contaCelsius = Double.valueOf(celsius);
				temperatura.setCelsius(contaCelsius);
				
				temperatura.mostrarConversao();
			
		
		}
		});
		tela.setVisible(true);
	}
}



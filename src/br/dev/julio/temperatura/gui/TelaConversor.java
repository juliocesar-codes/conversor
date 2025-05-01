package br.dev.julio.temperatura.gui;

import javax.swing.JTextField;
import br.dev.julio.temperatura.model.Temperatura;
import br.dev.julio.temperatura.TemperaturaApp;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;



public class TelaConversor {

	private JLabel labelRotularCampo;
	private JTextField textEntradaCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahrenheit;
	private JLabel labelResultado;
	private JLabel labelErro;
	
	private Color corlabelErro;
	
	public void criarTelaTemperatura(){
		
		
		JFrame tela = new JFrame();
		tela.setTitle("Conversor de Temperatura");
		tela.setSize(400, 350);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setResizable(false);

		labelRotularCampo = new JLabel();
		labelRotularCampo.setText("Temperatura em graus celsius: ");
		labelRotularCampo.setBounds(20,20,300,30);
		
		textEntradaCelsius = new JTextField();
		textEntradaCelsius.setText("");
		textEntradaCelsius.setBounds(20, 45, 340, 30);
		
		buttonFahrenheit = new JButton();
		buttonFahrenheit.setText("FAHREINHEIT");
		buttonFahrenheit.setBounds(20, 80, 150, 40);
		
		buttonKelvin = new JButton();
		buttonKelvin.setText("KELVIN");
		buttonKelvin.setBounds(200, 80, 160, 40);
		
		labelResultado = new JLabel();
		labelResultado.setText("");
		labelResultado.setBounds(90, 150, 300, 30);
		
		labelErro = new JLabel();
		labelErro.setText("");
		labelErro.setBounds(35, 150, 350, 30);
		corlabelErro = new Color(255,0,0);
		labelErro.setForeground(corlabelErro);
		
		Font fonteResultado = new Font("Arial", Font.BOLD, 24);
		labelResultado.setFont(fonteResultado);
		
		
		
		tela.getContentPane().add(labelRotularCampo);
		tela.getContentPane().add(textEntradaCelsius);
		tela.getContentPane().add(buttonFahrenheit);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labelErro);

		
		buttonFahrenheit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String valorCelsius = textEntradaCelsius.getText();				
				
				try {
					Temperatura temperatura = new Temperatura();
					double celsius = Double.parseDouble(valorCelsius);
					temperatura.setCelsius(celsius);

					double fahreinheit = temperatura.converterParaFahrenheit();

					labelResultado.setText(fahreinheit + " FAHREINHEIT!");
					labelErro.setText(null);
					textEntradaCelsius.requestFocus();

				} catch (Exception ex) {
					
					labelErro.setText("O valor inserido é inválido, insira apenas números (0-9)");
					textEntradaCelsius.setText(null);
					textEntradaCelsius.requestFocus();
				}
			}
		});
		
buttonKelvin.addActionListener(new ActionListener() {
			
	@Override
	public void actionPerformed(ActionEvent e) {
		String valorCelsius = textEntradaCelsius.getText();				
		
		try {
			Temperatura temperatura = new Temperatura();
			double celsius = Double.parseDouble(valorCelsius);
			temperatura.setCelsius(celsius);

			double kelvin = temperatura.converterParaKelvin();

			labelResultado.setText(kelvin + " KELVIN!");
			labelErro.setText(null);
			textEntradaCelsius.requestFocus();

		} catch (NumberFormatException ex) {

			labelErro.setText("O valor inserido é inválido, insira apenas números (0-9)");
			textEntradaCelsius.setText(null);
			textEntradaCelsius.requestFocus();		}
	}
});
		
		tela.setVisible(true);
	}
}



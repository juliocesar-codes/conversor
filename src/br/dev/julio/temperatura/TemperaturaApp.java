package br.dev.julio.temperatura;

import br.dev.julio.temperatura.gui.TelaConversor;
import br.dev.julio.temperatura.model.Temperatura;


public class TemperaturaApp {

	public static void main(String[] args) {
		
		Temperatura t1 = new Temperatura();
		t1.setCelsius(26);
		t1.mostrarConversao();
		
		TelaConversor tela = new TelaConversor();
		tela.criarTelaTemperatura();
		
	}

}

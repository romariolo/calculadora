package br.com.cod3r.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{
	
	public Calculadora() {
		
		organizarLayout();
		
		
		setSize(232, 322);//Largura e altura
		setDefaultCloseOperation(EXIT_ON_CLOSE);//Ao fechar a janela, para aplicação
		setVisible(true);//Aparecer uma janela ao rodar
		setLocationRelativeTo(null);//Abrir a janela no centro da tela

	}

	private void organizarLayout() {

		setLayout(new BorderLayout());//Organiza em norte, sul, leste, oeste e centro
		
		Display display = new Display();	
		display.setPreferredSize(new Dimension(233, 60));
		add(display, BorderLayout.NORTH);//Colocando o display no norte
		//O método adicionar recebemos por herança, extends Jrame
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new Calculadora();
		
	}
}

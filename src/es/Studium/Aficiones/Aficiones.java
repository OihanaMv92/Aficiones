package es.Studium.Aficiones;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class Aficiones extends Frame implements WindowListener, ActionListener
{
	Checkbox uno = new Checkbox("Correr");
	  Checkbox dos = new Checkbox("Nadar");
	  Checkbox tres = new Checkbox("Andar");
	  Checkbox cuatro = new Checkbox("Leer");
	  Checkbox cinco = new Checkbox("Ir al Cine");
	  Checkbox seis = new Checkbox("Bailar");
	  Checkbox siete = new Checkbox("Fútbol");
	  Checkbox ocho = new Checkbox("Tenis");
	  Checkbox nueve = new Checkbox("Baloncesto");
	  Checkbox diez = new Checkbox("Deportes de Vela");

	  Button btn_comprobar = new Button("Comprobar");

	  String resultado = new String("");

	  public Aficiones() {
	    setLayout(new FlowLayout());
	    setTitle("Aficiones");
	    add(uno);
	    add(dos);
	    add(tres);
	    add(cuatro);
	    add(cinco);
	    add(seis);
	    add(siete);
	    add(ocho);
	    add(nueve);
	    add(diez);
	    add(btn_comprobar);
	    // Añadir el Listener al botón
	    btn_comprobar.addActionListener(this);
	    // Añadir el Listener a la ventana
	    addWindowListener(this);
	    setSize(350, 150);
	    setVisible(true);
	  }
	public static void main(String[] args)
	{
		new Aficiones();
	}
	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
	public void actionPerformed(ActionEvent we)
	{
		resultado = "";
		if(uno.getState()==true)
		{
			resultado = resultado + "Correr\n";
		}
		if(dos.getState()==true)
		{
			resultado = resultado + "Nadar\n";
		}
		if(tres.getState()==true)
		{
			resultado = resultado + "Andar\n";
		}
		if(cuatro.getState()==true)
		{
			resultado = resultado + "Leer\n";
		}
		if(cinco.getState()==true)
		{
			resultado = resultado + "Ir al Cine\n";
		}
		if(seis.getState()==true)
		{
			resultado = resultado + "Bailar\n";
		}
		if(siete.getState()==true)
		{
			resultado = resultado + "Fútbol\n";
		}
		if(ocho.getState()==true)
		{
			resultado = resultado + "Tenis\n";
		}
		if(nueve.getState()==true)
		{
			resultado = resultado + "Baloncesto\n";
		}
		if(diez.getState()==true)
		{
			resultado = resultado + "Deportes de vela\n";
		}
		System.out.println(resultado);
	}
}

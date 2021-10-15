package mvc;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;


public class ClaseVista extends Frame
{
	private static final long serialVersionUID = 1L; 
	 
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
	
	Button comprobar = new Button("Comprobar");
	
	public ClaseVista()  { 
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
		add(comprobar);
		
		setSize(350,150); 
		setResizable(false);
		setVisible(true);
	}
}

package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ClaseControlador implements ActionListener, WindowListener {
	/* Declaramos dos objetos que vamos a controlar */
	ClaseVista objVista; 
	ClaseModelo objModelo;
 
	/* Constructor */
	public ClaseControlador(ClaseVista objVista, ClaseModelo objModelo) {
		this.objVista = objVista;
		this.objModelo = objModelo; 
 
		/* Añadimos los Listener para que escuchen */ // siempre del objeto vista que es de donde hereda Esto es de clase vista// Añadir el Listener al botón comprobar.addActionListener(this); añadimos el objVista
		objVista.comprobar.addActionListener(this);
		objVista.addWindowListener(this); 
	}
 
	public void actionPerformed(ActionEvent evento) { 
		if(objVista.comprobar.equals(evento.getSource())) {
			try {
/* Obtenemos los datos de la Vista mediante el objeto objVista y hacemos uso de la función del objeto objModelo */
			String resultado= "";				
			if(objVista.uno.getState()==true) {
				resultado = objModelo.correr(resultado);
			}
			if(objVista.dos.getState()==true) {
				resultado = objModelo.nadar(resultado);
			}
			if(objVista.tres.getState()==true) {
				resultado = objModelo.andar(resultado);
			}
			if(objVista.cuatro.getState()==true) {
				resultado = objModelo.leer(resultado);
			}
			if(objVista.cinco.getState()==true) {
				resultado = objModelo.iralcine(resultado);
			}
			if(objVista.seis.getState()==true) {
				resultado = objModelo.bailar(resultado);
			}
			if(objVista.siete.getState()==true)	{
				resultado = objModelo.futbol(resultado);
			}
			if(objVista.ocho.getState()==true) {
				resultado = objModelo.tenis(resultado);
			}
			if(objVista.nueve.getState()==true)	{
				resultado = objModelo.baloncesto(resultado);
			}
			if(objVista.diez.getState()==true) {
			resultado = objModelo.deportesdevela(resultado);
			}
	/* Mostramos resultados en la consola del objeto objModelo */
				System.out.println(resultado);
			}
			catch(Exception e) {
				e.printStackTrace(); 
			}
		}
		
		}
	
	public void windowActivated(WindowEvent we){} 
	public void windowClosed(WindowEvent we){} 
	public void windowClosing(WindowEvent we) {
		System.exit(0); 
	} 
	public void windowDeactivated(WindowEvent we){} 
	public void windowDeiconified(WindowEvent we){} 
	public void windowIconified(WindowEvent we){} 
	public void windowOpened(WindowEvent we){} 
}
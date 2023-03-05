package modelo;

import javax.swing.ImageIcon;

public class Guerrero extends Personaje{
	public Guerrero(String nombre, Posicion posicion) {
		super(nombre, posicion);
		this.vitalidad = 500;
		this.alcanceDeAtaque=40;
		this.danioDeAtaque=10;
		this.imagen = new ImageIcon(getClass().getResource("/images/"+this.getClass().getSimpleName()+".png")).getImage();
	}

	@Override
	public String toString() {
		return "Guerrero ["+super.toString()+"]";
	}
	
}
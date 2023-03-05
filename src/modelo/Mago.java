package modelo;

import javax.swing.ImageIcon;

public class Mago extends Personaje{
	protected int cantidadMagia;
	protected int danioAtaqueMagico;
	public Mago(String nombre, Posicion posicion) {
		super(nombre, posicion);
		this.vitalidad = 300;
		this.alcanceDeAtaque = 40;
		this.danioDeAtaque=3;
		this.cantidadMagia=5000;
		this.danioAtaqueMagico=10;
		this.imagen = new ImageIcon(getClass().getResource("/images/"+this.getClass().getSimpleName()+".png")).getImage();
	}
	
	@Override
	public boolean atacar(Personaje adversario) {
		boolean respuesta = false;
		if (cantidadMagia >= 500) {
			adversario.recibeDanio(danioAtaqueMagico);
			this.cantidadMagia-=500;
			respuesta = true;
		}else {
			respuesta = super.atacar(adversario);
		}
		return respuesta;
	}
	
	public void recuperaMagia(int cantidad) {
		this.cantidadMagia+=cantidad;
	}
	
	public boolean teletransportarse(Posicion nuevaPos) {
		boolean rta=false;
		if(this.cantidadMagia>=2000) {
			rta=true;
			this.posicion=nuevaPos;
			this.cantidadMagia -=2000;
		}
		return rta;
	}
	
	public boolean curar() {
		boolean rta=false;
		if(this.cantidadMagia>=1000) {
			rta=true;
			this.vitalidad+=100;
			this.cantidadMagia-=1000;
		}
		return rta;
	}
	
	public boolean curar(Personaje objetivo) {
		boolean rta=false;
		if(this.cantidadMagia>=1000) {
			rta=true;
			objetivo.vitalidad+=100;
			this.cantidadMagia-=1000;
		}
		return rta;
	}

	@Override
	public String toString() {
		return "Mago ["+super.toString()+" cantidadMagia=" + cantidadMagia + ", danioAtaqueMagico=" + danioAtaqueMagico + "]";
	}
	
}
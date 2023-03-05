package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Juego {
	private ArrayList<Personaje> personajes = new ArrayList<Personaje>();
	public void agregarPersonaje(Personaje personaje) {
		this.personajes.add(personaje);
	}
	public void eliminarPersonaje(Personaje personaje) {
		this.personajes.remove(personaje);;
	}
	public Iterator<Personaje> getPersonajes() {
		return this.personajes.iterator();
	}
	public ArrayList<Personaje> getAllPersonajes() {
		return this.personajes;
	}
	
	//metodos genericos clase personaje
	public String atacar(Personaje personaje, Personaje personaje2) {
		String msj=personaje2.getNombre() + " esta fuera del rango de ataque de "+ personaje.getNombre() +"\n";
		if(personaje.atacar(personaje2)) {
			msj=personaje.getNombre() + " ataco a " + personaje2.getNombre() + "\n";
			if(personaje2.isMuerto()) {
				msj+=personaje2.getNombre() + " murio\n";
			}
		}
		return msj;
	}
	
	public String mover(Personaje personaje, int x, int y) {
		personaje.mover(x, y);
		return personaje.getNombre() + " se desplazo a "+ personaje.getPosicion() + "\n";
	}
	
	//metodos especificos clase mago
	public String curar(Mago mago) {
		String msj=mago.getNombre() + " no tiene puntos de magia suficiente para curarse\n";
		if (mago.curar()) {
			msj=mago.getNombre()+ " se curo\n";
		}
		return msj;
	}
	
	public String curar(Mago mago, Personaje personaje2) {
		String msj=mago.getNombre() + " no tiene puntos de magia suficiente para curar a "+personaje2.getNombre()+"\n";
		if(mago.curar(personaje2)) {
			msj=mago.getNombre() + " curo a "+personaje2.getNombre() +"\n";
		}
		return msj;
	}
	
	public String teletransportar(Mago personaje, Posicion posicion) {
		String msj=personaje.getNombre() + " no tiene puntos de magia suficiente para teletransportarse\n";
		if (personaje.teletransportarse(posicion)) {
			msj=personaje.getNombre() + " se teletransporto a " + personaje.getPosicion() + "\n";
		}
		return msj;
	}
	
	
}

package modelo;

public class Posicion {
	private double posX;
	private double posY;

	public Posicion(double posX, double posY) {
		this.posX = posX;
		this.posY = posY;
	}
	public double getPosX() {
		return posX;
	}
	public double getPosY() {
		return posY;
	}
	public void setXY(double posX, double posY) {
		this.posX=posX;
		this.posY=posY;
	}
	public void incrementaPos(double valorX, double valorY) {
		posX+=valorX;
		posY+=valorY;
	}
	public double distancia(Posicion objetivo) {
		return Math.sqrt((Math.pow((posX - objetivo.posX), 2) + (Math.pow((posY - objetivo.posY), 2))));
	}
	@Override
	public String toString() {
		return " posX=" + posX + ", posY=" + posY;
	}
	
	
}
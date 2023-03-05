package vista;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import modelo.Personaje;

@SuppressWarnings("serial")
public class Dibujo extends JLabel
{
	private Personaje p;
	public Dibujo(Personaje p)
	{
		super();		
		this.p = p;
		this.setIcon(new ImageIcon(p.getImagen()));
		this.setBounds((int)p.getPosX(), (int)p.getPosY(), p.getImagen().getWidth(null), p.getImagen().getHeight(null));
		
	}
	public void seleccion() {
		this.setBorder(new RoundedBorder(Color.RED, 20));
		this.setSize(110,120);
	}
	public void desSeleccion() {
		this.setBorder(null);
	}
	public Personaje getP() {
		return p;
	}
	@Override
	public String toString() {
		return "Dibujo [p=" + p + "]";
	}
	

}
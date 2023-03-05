package vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class PanelMapa extends JPanel

{
	private Image fondo;
	private String r="/images/";
	public PanelMapa(String r)
	{
		super();
		
		this.r +=r;
		fondo = new ImageIcon(getClass().getResource(this.r)).getImage();
	}

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for (int i = 0; i <= this.getHeight(); i += this.fondo.getHeight(null))
		{
			for (int j = 0; j <= this.getWidth(); j += this.fondo.getWidth(null))
				g.drawImage(fondo, j, i, null);
		}
		
	}



}
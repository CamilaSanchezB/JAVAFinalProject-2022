package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import modelo.*;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollBar;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;


@SuppressWarnings("serial")
public class Ventana extends JFrame implements ActionListener, ListSelectionListener, MouseListener{

	private JPanel contentPane;
	private JPanel panel;
	private Juego juego = new Juego();
	private DefaultListModel<Personaje> modeloLista=new DefaultListModel<Personaje>();
	private PanelMapa mapPane;
	private JPanel panel_2;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JScrollPane scrollPane_1;
	private JList<Personaje> listIzq;
	private JList<Personaje> listDer;
	private JPanel panelCDerAr1;
	private JPanel panel_6;
	private JLabel lblPjNombre;
	private JPanel panel_7;
	private JTextField textFieldPjNombre;
	private JPanel panel_8;
	private JLabel lblX;
	private JPanel panel_9;
	private JTextField textFieldPjX;
	private JPanel panel_10;
	private JLabel lblY;
	private JPanel panel_11;
	private JTextField textFieldPjY;
	private JPanel panel_12;
	private JLabel lblNewLabel;
	private JPanel panel_13;
	private JComboBox<String> comboBox;
	private JPanel panel_14;
	private JPanel panel_4;
	private JButton btnAgregar;
	private JPanel panel_5;
	private JButton btnEliminar;
	private JPanel panelCDerAb_2;
	private JPanel panelAtBoton;
	private JButton btnAtaque;
	private JPanel panel_15;
	private JButton btnCurar;
	private JPanel panelDesplazamientoForm;
	private JPanel panel_16;
	private JLabel lblDesplazamientoX;
	private JPanel panel_17;
	private JTextField textFieldDX;
	private JPanel panel_18;
	private JLabel lblDesplazamientoY;
	private JPanel panel_19;
	private JTextField textFieldDY;
	private JPanel panel2Sur;
	private JPanel panel_20;
	private JButton btnDesplazamientoTp;
	private JPanel panel_21;
	private JButton btnDesplazamientoMover;
	private JPanel panelIzq;
	private JScrollBar scrollBar;
	private ArrayList<Dibujo>dibujos = new ArrayList<Dibujo>();
	private int c=0;
	private ArrayList<Integer>pos = new ArrayList<Integer>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 991, 626);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);
		
		this.panel = new JPanel();
		this.contentPane.add(this.panel, BorderLayout.CENTER);
		this.panel.setLayout(new BorderLayout(0, 0));
		
		this.panelIzq=new JPanel();
		this.panel.add(this.panelIzq, BorderLayout.CENTER);
		this.panelIzq.setLayout(new BorderLayout(0, 0));
		
		
		this.panel_2 = new JPanel();
		this.panel.add(this.panel_2, BorderLayout.WEST);
		this.panel_2.setLayout(new BorderLayout(0, 0));
		
		this.scrollPane_1 = new JScrollPane();
		this.panel_2.add(this.scrollPane_1, BorderLayout.NORTH);
		
		this.listIzq = new JList<Personaje>();
		this.listIzq.setEnabled(false);
		this.listIzq.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.listIzq.setFont(new Font("Verdana", Font.PLAIN, 12));
		this.listIzq.setModel(modeloLista);
		this.listDer = new JList<Personaje>();
		this.listDer.setModel(modeloLista);
		this.scrollPane_1.setViewportView(listIzq);
		this.scrollPane_1.setPreferredSize(new Dimension(500, 150));
		
		this.scrollPane = new JScrollPane();
		this.scrollPane.setPreferredSize(new Dimension(this.panelIzq.getWidth(), 130));
		this.panelIzq.add(this.scrollPane, BorderLayout.SOUTH);
		
		this.textArea = new JTextArea();
		this.textArea.setEditable(false);
		this.scrollPane.setViewportView(this.textArea);
		
		this.scrollBar = new JScrollBar();
		this.scrollPane.setRowHeaderView(this.scrollBar);
		
		
		this.panelCDerAr1 = new JPanel();
		this.panelCDerAr1.setBorder(new LineBorder(new Color(0, 0, 0)));
		this.panelCDerAr1.setPreferredSize(new Dimension(10, 180));
		this.panel_2.add(this.panelCDerAr1, BorderLayout.CENTER);
		this.panelCDerAr1.setLayout(new GridLayout(0, 2, 0, 0));
		
		
		this.panel_6 = new JPanel();
		this.panelCDerAr1.add(this.panel_6);
		
		this.lblPjNombre = new JLabel("Nombre:");
		this.panel_6.add(this.lblPjNombre);
		
		this.panel_7 = new JPanel();
		this.panelCDerAr1.add(this.panel_7);
		
		this.textFieldPjNombre = new JTextField();
		this.textFieldPjNombre.setColumns(10);
		this.panel_7.add(this.textFieldPjNombre);
		
		this.panel_8 = new JPanel();
		this.panelCDerAr1.add(this.panel_8);
		
		this.lblX = new JLabel("X:");
		this.panel_8.add(this.lblX);
		
		this.panel_9 = new JPanel();
		this.panelCDerAr1.add(this.panel_9);
		
		this.textFieldPjX = new JTextField();
		this.textFieldPjX.setColumns(10);
		this.panel_9.add(this.textFieldPjX);
		
		this.panel_10 = new JPanel();
		this.panelCDerAr1.add(this.panel_10);
		
		this.lblY = new JLabel("Y:");
		this.panel_10.add(this.lblY);
		
		this.panel_11 = new JPanel();
		this.panelCDerAr1.add(this.panel_11);
		
		this.textFieldPjY = new JTextField();
		this.textFieldPjY.setColumns(10);
		this.panel_11.add(this.textFieldPjY);
		
		this.panel_12 = new JPanel();
		this.panelCDerAr1.add(this.panel_12);
		
		this.lblNewLabel = new JLabel("Clase:");
		this.lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		this.panel_12.add(this.lblNewLabel);
		
		this.panel_13 = new JPanel();
		this.panelCDerAr1.add(this.panel_13);
		
		this.comboBox = new JComboBox<String>();
		this.panel_13.add(this.comboBox);
		this.comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Arquero", "Caballero", "Guerrero", "Mago"}));
		
		this.panel_4 = new JPanel();
		this.panelCDerAr1.add(this.panel_4);
		
		this.btnAgregar = new JButton("Agregar");
		this.btnAgregar.addActionListener(this);
		this.btnAgregar.setPreferredSize(new Dimension(85, 23));
		this.panel_4.add(this.btnAgregar);
		
		this.panel_5 = new JPanel();
		this.panelCDerAr1.add(this.panel_5);
		
		this.btnEliminar = new JButton("Eliminar");
		this.btnEliminar.setEnabled(false);
		this.btnEliminar.addActionListener(this);
		this.panel_5.add(this.btnEliminar);
        
		this.panel2Sur = new JPanel();
		this.panel2Sur.setPreferredSize(new Dimension(10, 180));
		this.panel_2.add(panel2Sur, BorderLayout.SOUTH);
		this.panel2Sur.setLayout(new BorderLayout(0, 0));
		
		this.panelCDerAb_2 = new JPanel();
		this.panelCDerAb_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		this.panelCDerAb_2.setPreferredSize(new Dimension(10, 50));
		this.panel2Sur.add(this.panelCDerAb_2, BorderLayout.NORTH);
		
		this.panelCDerAb_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.panelAtBoton = new JPanel();
		this.panelCDerAb_2.add(this.panelAtBoton);
		this.panelAtBoton.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_14 = new JPanel();
		this.panelAtBoton.add(this.panel_14);
		
		this.btnAtaque = new JButton("Atacar");
		this.btnAtaque.setEnabled(false);
		this.btnAtaque.addActionListener(this);
		this.panel_14.add(this.btnAtaque);
		this.btnAtaque.setPreferredSize(new Dimension(120, 30));
		
		this.panel_15 = new JPanel();
		this.panelAtBoton.add(this.panel_15);
		
		this.btnCurar = new JButton("Curar");
		this.btnCurar.setEnabled(false);
		this.btnCurar.addActionListener(this);
		this.panel_15.add(this.btnCurar);

		this.btnCurar.setPreferredSize(new Dimension(120, 30));
		
		
		this.panelDesplazamientoForm = new JPanel();
		this.panelDesplazamientoForm.setBorder(new LineBorder(new Color(0, 0, 0)));
		this.panel2Sur.add(this.panelDesplazamientoForm, BorderLayout.CENTER);
		this.panelDesplazamientoForm.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_16 = new JPanel();
		this.panelDesplazamientoForm.add(this.panel_16);
		
		this.lblDesplazamientoX = new JLabel("X:");
		this.panel_16.add(this.lblDesplazamientoX);
		
		this.panel_17 = new JPanel();
		this.panelDesplazamientoForm.add(this.panel_17);
		
		this.textFieldDX = new JTextField();
		this.textFieldDX.setColumns(10);
		this.panel_17.add(this.textFieldDX);
		
		this.panel_18 = new JPanel();
		this.panelDesplazamientoForm.add(this.panel_18);
		
		this.lblDesplazamientoY = new JLabel("Y:");
		this.panel_18.add(this.lblDesplazamientoY);
		
		this.panel_19 = new JPanel();
		this.panelDesplazamientoForm.add(this.panel_19);
		
		this.textFieldDY = new JTextField();
		this.textFieldDY.setText("");
		this.textFieldDY.setColumns(10);
		this.panel_19.add(this.textFieldDY);
		
		this.panel_20 = new JPanel();
		this.panelDesplazamientoForm.add(this.panel_20);
		
		this.btnDesplazamientoTp = new JButton("Teletransportar");
		this.btnDesplazamientoTp.setMargin(new Insets(2, 6, 2, 6));
		this.btnDesplazamientoTp.setEnabled(false);
		this.btnDesplazamientoTp.addActionListener(this);
		this.panel_20.add(this.btnDesplazamientoTp);
		
		this.panel_21 = new JPanel();
		this.panelDesplazamientoForm.add(this.panel_21);
		
		this.btnDesplazamientoMover = new JButton("Mover");
		this.btnDesplazamientoMover.setEnabled(false);
		this.btnDesplazamientoMover.setMargin(new Insets(2, 32, 2, 32));
		this.btnDesplazamientoMover.addActionListener(this);
		this.panel_21.add(this.btnDesplazamientoMover);
		
		this.listIzq.addListSelectionListener(this);
		this.listDer.addListSelectionListener(this);
		this.listIzq.setSelectionModel(new DefaultListSelectionModel());
		
		this.inicializar();
		
		
	}
	private void inicializar() {
		this.juego.agregarPersonaje(new Arquero("Dua Lipa", new Posicion(100,100)));
		this.juego.agregarPersonaje(new Caballero("Harry Styles", new Posicion(80,40)));
		this.juego.agregarPersonaje(new Guerrero("Taylor Swift", new Posicion(200,300)));
		this.juego.agregarPersonaje(new Mago("Ed Sheeran", new Posicion(0,500)));
		this.juego.agregarPersonaje(new Arquero("Adele", new Posicion(1000,260)));
		this.juego.agregarPersonaje(new Caballero("Elton John", new Posicion(567,85)));
		this.juego.agregarPersonaje(new Guerrero("Sam Smith", new Posicion(290,680)));
		this.juego.agregarPersonaje(new Mago("Niall Horan", new Posicion(1200,70)));
		this.juego.agregarPersonaje(new Mago("Miley Cyrus", new Posicion(1000,600)));
		this.mapPane = new PanelMapa("pasto.png");
		this.mapPane.addMouseListener(this);
		this.mapPane.setLayout(null);
		this.panelIzq.add(this.mapPane, BorderLayout.CENTER);

		actualizaListas();
		
		LoadLabels();
	}
	protected void actualizaListas() {
		this.modeloLista.clear();
		Iterator<Personaje>it=this.juego.getPersonajes();
		while(it.hasNext()) {
			this.modeloLista.addElement(it.next());	
		}
	}
	
	 protected void LoadLabels(){
		for(int i=0; i<this.juego.getAllPersonajes().size();i++) {
			this.dibujos.add(label(this.juego.getAllPersonajes().get(i)));
			this.mapPane.add(dibujos.get(i));
		}
	 }
       
    protected Dibujo label(Personaje x){
        final Dibujo l;
           l = new Dibujo (x);
           l.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
           
           l.addMouseListener(new java.awt.event.MouseAdapter() {
        	
           @Override
           public void mouseClicked(java.awt.event.MouseEvent evt) { 
        	   if(c==0) {
        		   l.seleccion();
        		   listIzq.setSelectedIndex(dibujos.indexOf(l));
        		   pos.add(dibujos.indexOf(l));
        	   }else if(c!=0 && c<2){
        		   l.seleccion();
        		   listDer.setSelectedIndex(dibujos.indexOf(l));
        		   pos.add(dibujos.indexOf(l));
        	   }
        	   c++;          	   
        	   
           }
           });

           return l;
       }
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		if(this.listIzq.getSelectedValue()!=null && this.listDer.getSelectedValue()!=null) {
			this.btnAtaque.setEnabled(true);
		}else {
			this.btnAtaque.setEnabled(false);
		}
		if(this.listIzq.getSelectedValue()!=null) {
		
			this.btnDesplazamientoMover.setEnabled(true);	
			this.btnEliminar.setEnabled(true);
			if(this.listIzq.getSelectedValue().getClass().getSimpleName().equalsIgnoreCase("Mago")) {
				this.btnCurar.setEnabled(true);
				this.btnDesplazamientoTp.setEnabled(true);
			}else {
				this.btnCurar.setEnabled(false);
				this.btnDesplazamientoTp.setEnabled(false);
			}
		}else {
	
			this.btnDesplazamientoMover.setEnabled(false);
			this.btnEliminar.setEnabled(false);
		}

				
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == this.btnAgregar) {
			do_btnAgregar_actionPerformed(e);
		}
		if (e.getSource() == this.btnDesplazamientoMover) {
			do_btnDesplazamientoMover_actionPerformed(e);
		}
		if (e.getSource() == this.btnDesplazamientoTp) {
			do_btnDesplazamientoTp_actionPerformed(e);
		}
		if (e.getSource() == this.btnCurar) {
			do_btnCurar_actionPerformed(e);
		}
		if (e.getSource() == this.btnAtaque) {
			do_btnAtaque_actionPerformed(e);
		}
		if (e.getSource() == comboBox) {
			comboBox.getSelectedIndex();
		}
	}
	protected void do_btnAtaque_actionPerformed(ActionEvent e) {
		String msj = this.juego.atacar(this.listIzq.getSelectedValue(), this.listDer.getSelectedValue());
		this.textArea.append(msj);
		if(this.juego.getAllPersonajes().get(this.listDer.getSelectedIndex()).isMuerto()) {
			this.juego.eliminarPersonaje(this.listDer.getSelectedValue());
		}
		this.limpiarListas();
		this.actualizaListas();
		this.limpiarSeleccion();
		actualizaDibujo();
	}
	protected void do_btnCurar_actionPerformed(ActionEvent e) {
		String msj="";
		if(this.listDer.getSelectedValue() != null) {
			msj=this.juego.curar((Mago) this.listIzq.getSelectedValue(), this.listDer.getSelectedValue());
		}else {
			msj=this.juego.curar((Mago) this.listIzq.getSelectedValue());
		}
		this.textArea.append(msj);
		this.limpiarListas();
		this.actualizaListas();
		this.limpiarSeleccion();
	}
	protected void do_btnDesplazamientoTp_actionPerformed(ActionEvent e) {
		Posicion pos = new Posicion(Integer.parseInt(this.textFieldDX.getText()), Integer.parseInt(this.textFieldDY.getText()));
		String msj=this.juego.teletransportar((Mago) this.listIzq.getSelectedValue(), pos);
		this.textArea.append(msj);
		this.limpiarListas();
		this.limpiarSeleccion();
		this.actualizaDibujo();
	}
	protected void do_btnDesplazamientoMover_actionPerformed(ActionEvent e) {
		this.textArea.append(this.juego.mover(this.listIzq.getSelectedValue(), Integer.parseInt(this.textFieldDX.getText()), Integer.parseInt(this.textFieldDY.getText())));
		this.limpiarListas();
		this.actualizaListas();
		this.limpiarSeleccion();
		this.actualizaDibujo();
	}
	
	protected void do_btnAgregar_actionPerformed(ActionEvent e) {
		this.limpiarListas();
		String nombre=this.textFieldPjNombre.getText();
		int x= Integer.parseInt(this.textFieldPjX.getText());
		int y=Integer.parseInt(this.textFieldPjY.getText());
		switch(comboBox.getSelectedIndex()) {
		case 0:
			juego.agregarPersonaje(new Arquero(nombre, new Posicion(x, y)));
		break;
		case 1:
			juego.agregarPersonaje(new Caballero(nombre, new Posicion(x, y)));
		break;
		case 2:
			juego.agregarPersonaje(new Guerrero(nombre, new Posicion(x, y)));
		break;
		case 3:
			juego.agregarPersonaje(new Mago(nombre, new Posicion(x, y)));
		break;
		}
		this.textArea.append("Se agrego a "+ nombre + "\n");
		this.actualizaListas();
		this.limpiarSeleccion();
		this.actualizaDibujo();
	}
	
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		this.textArea.append("Se elimino a " + this.listIzq.getSelectedValue().getNombre() + "\n");
		this.juego.eliminarPersonaje(this.listIzq.getSelectedValue());
		this.limpiarListas();
		this.limpiarSeleccion();
		this.actualizaListas();
		this.actualizaDibujo();
	}
	public void actualizaDibujo() {
		this.mapPane.removeAll();
		this.mapPane.revalidate();
		this.mapPane.repaint();
		this.dibujos.clear();
		this.LoadLabels();
	}
	private void limpiarListas() {
		// TODO Auto-generated method stub
		this.listIzq.clearSelection();
		this.listDer.clearSelection();
		this.btnCurar.setEnabled(false);
		this.btnDesplazamientoTp.setEnabled(false);
	}
	public void limpiarSeleccion() {
		this.c=0;
		if(this.pos!=null) {
			for(int i=0; i<this.pos.size();i++) {
				this.dibujos.get(pos.get(i)).desSeleccion();
			}
		}
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == this.mapPane) {
			do_mapPane_mouseClicked(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void do_mapPane_mouseClicked(MouseEvent e) {
		this.limpiarSeleccion();
		this.pos.clear();
		this.limpiarListas();
	}
}

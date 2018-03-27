	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JTextField;
	import javax.swing.JToggleButton;

	public class ProstyKalkulator extends JFrame implements ActionListener {

		private JTextField tKonsola;
		private JToggleButton bDodaj;
		private JToggleButton bOdejmij;
		private JToggleButton bPodziel;
		private JToggleButton bPomnoz;
		private JButton bCancel;
		private JButton bRownaSie;
		private JButton bJeden;
		private JButton bDwa;
		private JButton bTrzy;
		private JButton bCztery;
		private JButton bPiec;
		private JButton bSzesc;
		private JButton bSiedem;
		private JButton bOsiem;
		private JButton bDziewiec;
		private JButton bZero;
		StringBuffer liczba = new StringBuffer();
		String temp;
		Double wynik;
		boolean dodaj;
		boolean odejmij;
		boolean podziel;
		boolean pomnoz;
		Object zrodlo;
		
		public ProstyKalkulator() {
				
			setSize(300,400);
			setTitle("KALKULATOR");
			setLayout(null);
			
			tKonsola = new JTextField();
			tKonsola.setBounds(30, 30, 225, 40);
			tKonsola.setFont(new Font("Arial", Font.PLAIN, 20));
			add(tKonsola);
			
			bJeden = new JButton("1");
			bJeden.setBounds(30, 88, 42, 42); 
			add(bJeden);
			bJeden.addActionListener(this);
			
			bDwa= new JButton("2");
			bDwa.setBounds(91, 88, 42, 42); 
			add(bDwa);
			bDwa.addActionListener(this);
			
			bTrzy = new JButton("3");
			bTrzy.setBounds(152, 88, 42, 42); 
			add(bTrzy);
			bTrzy.addActionListener(this);		
			
			bCztery = new JButton("4");
			bCztery.setBounds(30, 155, 42, 42); 
			add(bCztery);
			bCztery.addActionListener(this);
			
			bPiec = new JButton("5");
			bPiec.setBounds(91, 155, 42, 42); 
			add(bPiec);
			bPiec.addActionListener(this);
			
			bSzesc = new JButton("6");
			bSzesc.setBounds(152, 155, 42, 42); 
			add(bSzesc);
			bSzesc.addActionListener(this);
			
			bSiedem = new JButton("7");
			bSiedem.setBounds(30, 223, 42, 42); 
			add(bSiedem);
			bSiedem.addActionListener(this);
			
			bOsiem = new JButton("8");
			bOsiem.setBounds(91, 223, 42, 42); 
			add(bOsiem);
			bOsiem.addActionListener(this);
			
			bDziewiec = new JButton("9");
			bDziewiec.setBounds(152, 223, 42, 42); 
			add(bDziewiec);
			bDziewiec.addActionListener(this);
	
			bZero= new JButton("0");
			bZero.setBounds(91, 290, 42, 42);
			add(bZero);
			bZero.addActionListener(this);
			
			bDodaj = new JToggleButton("+");
			bDodaj.setBounds(213, 88, 42, 42);			
			add(bDodaj);
			bDodaj.addActionListener(this);
			
			bOdejmij = new JToggleButton("-");
			bOdejmij.setBounds(213, 155, 42, 42);
			add(bOdejmij);
			bOdejmij.addActionListener(this);
			
			bPomnoz = new JToggleButton("x");
			bPomnoz.setBounds(213, 223, 42, 42);
			add(bPomnoz);
			bPomnoz.addActionListener(this);
			
			bPodziel = new JToggleButton("/");
			bPodziel.setBounds(213, 290, 42, 42);
			add(bPodziel);
			bPodziel.addActionListener(this);
			
			bCancel = new JButton("c");
			bCancel.setBounds(30, 290, 42, 42);
			add(bCancel);
			bCancel.addActionListener(this);
			
			bRownaSie = new JButton("=");
			bRownaSie.setBounds(152, 290, 42, 42);
			add(bRownaSie);
			bRownaSie.addActionListener(this);
			
		}	
		
		public static void main(String[] args) {
			
			ProstyKalkulator kalkulator = new ProstyKalkulator();
			kalkulator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			kalkulator.setVisible(true);
			
		}

		public void klawiatura() {
			
			if (zrodlo==bJeden) {
				
				liczba.append("1");
				tKonsola.setText(liczba.toString());
				
			}	else if	(zrodlo==bDwa) {
					
				liczba.append("2");
				tKonsola.setText(liczba.toString());
				
			}	else if	(zrodlo==bTrzy) {
					
				liczba.append("3");
				tKonsola.setText(liczba.toString());
				
			}	else if	(zrodlo==bCztery) {
					
				liczba.append("4");
				tKonsola.setText(liczba.toString());
				
			}	else if	(zrodlo==bPiec) {
					
				liczba.append("5");
				tKonsola.setText(liczba.toString());
								
			}	else if	(zrodlo==bSzesc) {
					
				liczba.append("6");
				tKonsola.setText(liczba.toString());
					
			}	else if	(zrodlo==bSiedem)	{
					
				liczba.append("7");
				tKonsola.setText(liczba.toString());
					
			}	else if	(zrodlo==bOsiem)	{
					
				liczba.append("8");
				tKonsola.setText(liczba.toString());
					
			}	else if	(zrodlo==bDziewiec) {
					
				liczba.append("9");
				tKonsola.setText(liczba.toString());
					
				
			}	else if	(zrodlo==bZero)		{
					
				liczba.append("0");
				tKonsola.setText(liczba.toString());	
				
			}
			
		}
		public void actionPerformed (ActionEvent e) {
			
			zrodlo = e.getSource();				
			klawiatura();
			
			try {	
				
				if	(zrodlo==bDodaj)	{
					
					tKonsola.setText("+");
					bDodaj.setSelected(true);
					bOdejmij.setSelected(false);
					bPomnoz.setSelected(false);
					bPodziel.setSelected(false);
					temp = liczba.toString();
					liczba = new StringBuffer();
					klawiatura();
				
				}	else if	(zrodlo==bOdejmij)	{
					
					tKonsola.setText("-");
					bDodaj.setSelected(false);
					bOdejmij.setSelected(true);
					bPomnoz.setSelected(false);
					bPodziel.setSelected(false);
					temp = liczba.toString();
					liczba = new StringBuffer();
					klawiatura();
				
				}	else if	(zrodlo==bPomnoz)	{
					
					tKonsola.setText("*");
					bDodaj.setSelected(false);
					bOdejmij.setSelected(false);
					bPomnoz.setSelected(true);
					bPodziel.setSelected(false);
					temp = liczba.toString();
					liczba = new StringBuffer();
					klawiatura();
				
				}	else if	(zrodlo==bPodziel)	{
					
					tKonsola.setText("/");
					bDodaj.setSelected(false);
					bOdejmij.setSelected(false);
					bPomnoz.setSelected(false);
					bPodziel.setSelected(true);
					temp = liczba.toString();
					liczba = new StringBuffer();
					klawiatura();
				
				}	else if (zrodlo==bCancel)	{
				
					tKonsola.setText("");				
					liczba = new StringBuffer();
					wynik = 0.0;
					bDodaj.setSelected(false);
					bOdejmij.setSelected(false);
					bPomnoz.setSelected(false);
					bPodziel.setSelected(false);
				
				}	else if (zrodlo==bRownaSie)	{
					
					if (bDodaj.isSelected()==true) {
						
						wynik = (Double.parseDouble(temp)) + (Double.parseDouble(liczba.toString()));
						tKonsola.setText(wynik.toString());
						
					}	else if (bOdejmij.isSelected()==true) {
						
						wynik = (Double.parseDouble(temp)) - (Double.parseDouble(liczba.toString()));
						tKonsola.setText(wynik.toString());
						
					}	else if (bPomnoz.isSelected()==true) {
						
						wynik = (Double.parseDouble(temp)) * (Double.parseDouble(liczba.toString()));
						tKonsola.setText(wynik.toString());
						
					}	else if (bPodziel.isSelected()==true) {
						
						wynik = (Double.parseDouble(temp)) / (Double.parseDouble(liczba.toString()));
						tKonsola.setText(wynik.toString());
						
					}	
					
				}
				
		}	catch (Exception NumberFormatException)	{
			
					tKonsola.setText("Zly format rozkazu");
					
		}
	}
}
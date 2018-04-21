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
		StringBuffer dzialanie = new StringBuffer();
		StringBuffer temp = new StringBuffer();
		Double wynik;
		boolean dodaj;
		boolean odejmij;
		boolean podziel;
		boolean pomnoz;
		Object zrodlo;
		
		public ProstyKalkulator() {
				
			setSize(390,460);
			setTitle("KALKULATOR");
			setLayout(null);
			setResizable(false);
			
			tKonsola = new JTextField();
			tKonsola.setBounds(30, 30, 315, 40);
			tKonsola.setFont(new Font("Arial", Font.PLAIN, 20));
			add(tKonsola);
			
			bJeden = new JButton("1");
			bJeden.setBounds(30, 148, 42, 42); 
			add(bJeden);
			bJeden.addActionListener(this);
			
			bDwa= new JButton("2");
			bDwa.setBounds(121, 148, 42, 42); 
			add(bDwa);
			bDwa.addActionListener(this);
			
			bTrzy = new JButton("3");
			bTrzy.setBounds(212, 148, 42, 42); 
			add(bTrzy);
			bTrzy.addActionListener(this);		
			
			bCztery = new JButton("4");
			bCztery.setBounds(30, 215, 42, 42); 
			add(bCztery);
			bCztery.addActionListener(this);
			
			bPiec = new JButton("5");
			bPiec.setBounds(121, 215, 42, 42); 
			add(bPiec);
			bPiec.addActionListener(this);
			
			bSzesc = new JButton("6");
			bSzesc.setBounds(212, 215, 42, 42); 
			add(bSzesc);
			bSzesc.addActionListener(this);
			
			bSiedem = new JButton("7");
			bSiedem.setBounds(30, 283, 42, 42); 
			add(bSiedem);
			bSiedem.addActionListener(this);
			
			bOsiem = new JButton("8");
			bOsiem.setBounds(121, 283, 42, 42); 
			add(bOsiem);
			bOsiem.addActionListener(this);
			
			bDziewiec = new JButton("9");
			bDziewiec.setBounds(212, 283, 42, 42); 
			add(bDziewiec);
			bDziewiec.addActionListener(this);
	
			bZero= new JButton("0");
			bZero.setBounds(121, 350, 42, 42);
			add(bZero);
			bZero.addActionListener(this);
			
			bDodaj = new JToggleButton("+");
			bDodaj.setBounds(303, 148, 42, 42);			
			add(bDodaj);
			bDodaj.addActionListener(this);
			
			bOdejmij = new JToggleButton("-");
			bOdejmij.setBounds(303, 215, 42, 42);
			add(bOdejmij);
			bOdejmij.addActionListener(this);
			
			bPomnoz = new JToggleButton("x");
			bPomnoz.setBounds(303, 283, 42, 42);
			add(bPomnoz);
			bPomnoz.addActionListener(this);
			
			bPodziel = new JToggleButton("/");
			bPodziel.setBounds(303, 350, 42, 42);
			add(bPodziel);
			bPodziel.addActionListener(this);
			
			bCancel = new JButton("c");
			bCancel.setBounds(30, 350, 42, 42);
			add(bCancel);
			bCancel.addActionListener(this);
			
			bRownaSie = new JButton("=");
			bRownaSie.setBounds(212, 350, 42, 42);
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
				dzialanie.append("1");
				tKonsola.setText(dzialanie.toString());
				
			}	else if	(zrodlo==bDwa) {
					
				liczba.append("2");
				dzialanie.append("2");
				tKonsola.setText(dzialanie.toString());
				
			}	else if	(zrodlo==bTrzy) {
					
				liczba.append("3");
				dzialanie.append("3");
				tKonsola.setText(dzialanie.toString());
				
			}	else if	(zrodlo==bCztery) {
					
				liczba.append("4");
				dzialanie.append("4");
				tKonsola.setText(dzialanie.toString());
				
			}	else if	(zrodlo==bPiec) {
					
				liczba.append("5");
				dzialanie.append("5");
				tKonsola.setText(dzialanie.toString());
								
			}	else if	(zrodlo==bSzesc) {
					
				liczba.append("6");
				dzialanie.append("6");
				tKonsola.setText(dzialanie.toString());
					
			}	else if	(zrodlo==bSiedem)	{
					
				liczba.append("7");
				dzialanie.append("7");
				tKonsola.setText(dzialanie.toString());
					
			}	else if	(zrodlo==bOsiem)	{
					
				liczba.append("8");
				dzialanie.append("8");
				tKonsola.setText(dzialanie.toString());
					
			}	else if	(zrodlo==bDziewiec) {
					
				liczba.append("9");
				dzialanie.append("9");
				tKonsola.setText(dzialanie.toString());
					
				
			}	else if	(zrodlo==bZero)		{
					
				liczba.append("0");
				dzialanie.append("0");
				tKonsola.setText(dzialanie.toString());
				
			}
			
		}
		
		public void actionPerformed (ActionEvent e) {
			
			zrodlo = e.getSource();				
			klawiatura();
			
			try {	
				
				if	(zrodlo==bDodaj)	{
					
					bDodaj.setSelected(true);
					dzialanie.append(" + ");
					temp = liczba;
					liczba = new StringBuffer();
					tKonsola.setText(dzialanie.toString());
					klawiatura();
				
				}	else if	(zrodlo==bOdejmij)	{
					
					bOdejmij.setSelected(true);
					dzialanie.append(" - ");
					temp = liczba;
					liczba = new StringBuffer();
					tKonsola.setText(dzialanie.toString());
					klawiatura();
				
				}	else if	(zrodlo==bPomnoz)	{
					
					bPomnoz.setSelected(true);;
					dzialanie.append(" x ");
					temp = liczba;
					liczba = new StringBuffer();
					tKonsola.setText(dzialanie.toString());
					klawiatura();
				
				}	else if	(zrodlo==bPodziel)	{
					
					bPodziel.setSelected(true);
					dzialanie.append(" / ");
					temp = liczba;
					liczba = new StringBuffer();
					tKonsola.setText(dzialanie.toString());
					klawiatura();
				
				}	else if (zrodlo==bCancel)	{
				
					tKonsola.setText("");				
					liczba = new StringBuffer();
					dzialanie = new StringBuffer();
					wynik = 0.0;
					bDodaj.setSelected(false);
					bOdejmij.setSelected(false);
					bPomnoz.setSelected(false);
					bPodziel.setSelected(false);
				
				}	else if (zrodlo==bRownaSie)	{
					
					dzialanie.append(" = ");
					
					if (bDodaj.isSelected()==true) {
						
						wynik = (Double.parseDouble(temp.toString())) + (Double.parseDouble(liczba.toString()));
						String wynikBezZera = wynik.toString();
							if (wynikBezZera.charAt(wynikBezZera.length()-1)==48) {
								tKonsola.setText(dzialanie.append(wynikBezZera.substring(0,wynikBezZera.length()-2)).toString());
							
							}	else {	tKonsola.setText(dzialanie.append(wynik).toString());}						
						
					}	else if (bOdejmij.isSelected()==true) {
						
						wynik = (Double.parseDouble(temp.toString())) - (Double.parseDouble(liczba.toString()));
						String wynikBezZera = wynik.toString();
							if (wynikBezZera.charAt(wynikBezZera.length()-1)==48) {
								tKonsola.setText(dzialanie.append(wynikBezZera.substring(0,wynikBezZera.length()-2)).toString());
							
							}	else {	tKonsola.setText(dzialanie.append(wynik).toString());}						
						
					}	else if (bPomnoz.isSelected()==true) {
						
						wynik = (Double.parseDouble(temp.toString())) * (Double.parseDouble(liczba.toString()));
						String wynikBezZera = wynik.toString();
							if (wynikBezZera.charAt(wynikBezZera.length()-1)==48) {
								tKonsola.setText(dzialanie.append(wynikBezZera.substring(0,wynikBezZera.length()-2)).toString());
							
							}	else {	tKonsola.setText(dzialanie.append(wynik).toString());}
						
					}	else if (bPodziel.isSelected()==true) {
						
						wynik = (Double.parseDouble(temp.toString())) / (Double.parseDouble(liczba.toString()));
						String wynikBezZera = wynik.toString();
							if (wynikBezZera.charAt(wynikBezZera.length()-1)==48) {
								tKonsola.setText(dzialanie.append(wynikBezZera.substring(0,wynikBezZera.length()-2)).toString());
							
							}	else {	tKonsola.setText(dzialanie.append(wynik).toString());}
						
						
					}
					
					liczba = new StringBuffer();
					dzialanie = new StringBuffer();
					wynik = 0.0;
					bDodaj.setSelected(false);
					bOdejmij.setSelected(false);
					bPomnoz.setSelected(false);
					bPodziel.setSelected(false);
					
				}
				
		}	catch (Exception NumberFormatException)	{
			
					tKonsola.setText("Zly format rozkazu.");
					liczba = new StringBuffer();
					dzialanie = new StringBuffer();
					wynik = 0.0;
					bDodaj.setSelected(false);
					bOdejmij.setSelected(false);
					bPomnoz.setSelected(false);
					bPodziel.setSelected(false);
					
		}
	}
}
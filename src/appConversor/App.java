package appConversor;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class App {
	
	public static void main(String[] args) {
	
	String menuPrincipal = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.QUESTION_MESSAGE, null, 
			new Object[] {"Conversor de Monedas", "Conversor de Temperatura", "Salir"}, "Elegir").toString();

	
	if (menuPrincipal == "Salir") {
		JOptionPane.showMessageDialog(null, "Programa Cerrado");
		System.exit(0);
		}
	
	if (menuPrincipal == "Conversor de Temperatura") {
		DecimalFormat formatearValores = new DecimalFormat("#.##");
		boolean continuarPrograma = true;
		while (continuarPrograma) {
			String [] menuTemperatura = {"Celsius a Fahrenheit", 
											"Celsius a Kelvin", 
											"Fahrenheit a Celsius",
											"Fahrenheit a Kelvin",
											"Kelvin a Celsius", 
											"Kelvin a Fahrenheit"};
			
			String opcionesT = (String) JOptionPane.showInputDialog(null, "Eliga una opción", "Conversor de moneda",JOptionPane.QUESTION_MESSAGE, null,
					menuTemperatura, menuTemperatura[0]);
			
			String input = JOptionPane.showInputDialog(null, "Ingrese una cantidad:");
			double valor = 0;
			
			try {
				valor = Double.parseDouble(input);
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor No valido");
				App.main(args);

			}
			
			if(opcionesT.equals("Celsius a Fahrenheit")) {
				double fahrenheit = (valor *1.8) + 32;
				JOptionPane.showMessageDialog(null, 
						valor + " grados Celsius son: " + formatearValores.format(fahrenheit) + " Fahrenheit.");
			
			}else if(opcionesT.equals("Celsius a Kelvin")) {
				double kelvin = valor + 273.15;
				JOptionPane.showMessageDialog(null, 
						valor + " grados Celsius son: " + formatearValores.format(kelvin) + " Kelvin.");
			
			}else if(opcionesT.equals("Fahrenheit a Celsius")) {
				double celsius = (valor - 32)/1.8;
				JOptionPane.showMessageDialog(null, 
						valor + " grados Fahrenheit son: " + formatearValores.format(celsius) + " Celsius.");
			
			}else if(opcionesT.equals("Fahrenheit a Kelvin")) {
				double kelvin = ((valor - 32)/1.8)+273.15;
				JOptionPane.showMessageDialog(null, 
						valor + " grados Fahrenheit son: " + formatearValores.format(kelvin) + " Kelvin.");
			
			}else if(opcionesT.equals("Kelvin a Celsius")) {
				double celsius = valor - 273.15;
				JOptionPane.showMessageDialog(null, 
						valor + " grados Kelvin son: " + formatearValores.format(celsius) + " Celsius.");
				
			}else if(opcionesT.equals("Kelvin a Fahrenheit")) {
				double fahrenheit = ((valor - 273.15)*1.8)+32;
				JOptionPane.showMessageDialog(null, 
						valor + " grados Kelvin son: " + formatearValores.format(fahrenheit) + " Fahrenheit.");
			
			
			}
			
			int confirma = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operación?", "Confirmar", 
					JOptionPane.YES_NO_CANCEL_OPTION);
				if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
					continuarPrograma = false;
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					}
		}	
	}
	
	if (menuPrincipal == "Conversor de Monedas") {
		DecimalFormat formatearDivisas = new DecimalFormat("#.##");
		boolean continuarPrograma = true;
		while (continuarPrograma) {
			String [] menuDivisas = {"Pesos a dolares", 
										"Pesos a euros",
										"Dolares a pesos", 
										"Dolares a euros", 
										"Euros a pesos",
										"Euros a dolares" 
										
			};
			String opcionesD = (String) JOptionPane.showInputDialog(null, "Eliga una opción", "Conversor de moneda",JOptionPane.QUESTION_MESSAGE, null,
					menuDivisas, menuDivisas[0]);
			
					String input = JOptionPane.showInputDialog(null, "Ingrese una cantidad:");
					double valor = 0;
										
					try {
						valor = Double.parseDouble(input);
					}catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Valor No valido");
						App.main(args);
					}
					
					if(opcionesD.equals("Pesos a dolares")) {
						double pesosADolares = valor / 18.81;
						JOptionPane.showMessageDialog(null, 
								valor + " pesos mexicanos son: " + formatearDivisas.format(pesosADolares) + " dolares.");
						
					}else if(opcionesD.equals("Pesos a euros")) {
						double pesosAEuro = valor / 20.17;
						JOptionPane.showMessageDialog(null, 
								valor + " pesos mexicanos son: " + formatearDivisas.format(pesosAEuro) + " euros." );
						
					}else if(opcionesD.equals("Dolares a pesos")) {
						double dolaresAPesos = valor * 18.81;
						JOptionPane.showMessageDialog(null, 
								valor + " dolares son: " + formatearDivisas.format(dolaresAPesos) + " pesos." );
						
					}else if(opcionesD.equals("Dolares a euros")) {
						double dolaresAEuros = valor * 0.93;
						JOptionPane.showMessageDialog(null, 
								valor + " dolares son: " + formatearDivisas.format(dolaresAEuros) + " euros." );	
						
					
					}else if(opcionesD.equals("Euros a pesos")) {
						double eurosAPesos = valor * 20.17;
						JOptionPane.showMessageDialog(null, 
								valor + " euros son: " + formatearDivisas.format(eurosAPesos) + " pesos." );
						
					}else if(opcionesD.equals("Euros a dolares")) {
						double eurosADolares = valor / 0.93;
						JOptionPane.showMessageDialog(null, 
								valor + " euros son: " + formatearDivisas.format(eurosADolares) + " dolares." );
						
					}
					
					int confirma = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operación?", "Confirmar", 
							JOptionPane.YES_NO_CANCEL_OPTION);
						if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
							continuarPrograma = false;
							JOptionPane.showMessageDialog(null, "Programa finalizado");
							}
														
			}
		}
	}
}

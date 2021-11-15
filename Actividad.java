package Practicas;

import javax.swing.JOptionPane;

public class  Actividad {
	
	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		System.out.println(nombre);
		
		String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
		System.out.println(apellido);
		
		String hobbie = JOptionPane.showInputDialog("Ingrese su hobbie");
		System.out.println(hobbie);
		
		String edad = JOptionPane.showInputDialog("Ingrese su edad");
		System.out.println(edad);
		
		String editorFavorito  = JOptionPane.showInputDialog("Ingrese su editor de codigo favorito");
		System.out.println(editorFavorito);
		
		String sistemaOperativo = JOptionPane.showInputDialog("Ingrese su sistema operativo");
		System.out.println(sistemaOperativo);
		
	}
	
}
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("dame marca");
		String marcar = teclado.nextLine();
		
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/juanchi_motors_2026", "root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class bdCoches {
	public static Connection coches(String[] args) {
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/db_articulos", "root","");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error del programa, no se pudo acceder a la Base de Datos");
			e.printStackTrace();
		}
		return conexion;
	}
}

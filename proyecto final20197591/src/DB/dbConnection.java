package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnection {
	public static void main(String[] args) throws Exception {
            // ------ Configuracion del driver nuevo --- //
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/proyecto20197591";
		String username = "root";
		String password = "123456";
            /// ----- No tocar ---- //
                
               
                // Empezar acá abajo //

		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null) {
			System.out.println("Base de datos conectada con éxito");
		} else {
			System.out.println("Error al intentar conectar la base de datos");
		}
	}
}
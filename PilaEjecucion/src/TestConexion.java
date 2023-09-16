
public class TestConexion {

	public static void main(String[] args) throws Exception {
		try (Conexion con = new Conexion()){
			con.leerDatos();
		}catch (IllegalStateException e) {
			// TODO: handle exception
			System.out.println("ejecutando catch");
			e.printStackTrace();
		}
		/*Conexion con = null;
		try {
			con = new Conexion();
			con.leerDatos();
			//con.cerrar();
		}catch (IllegalStateException ex) {
			// TODO: handle exception
			//System.out.println("recibiendo exception");
			ex.printStackTrace();
			//con.cerrar();
			}
		finally {
			System.out.println("ejecuntando finally");
			if(con != null) {
				con.cerrar();
			}
		}*/
	}
}

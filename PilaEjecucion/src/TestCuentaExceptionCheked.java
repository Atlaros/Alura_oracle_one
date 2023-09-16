
public class TestCuentaExceptionCheked {
	
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		try {
			cuenta.deposita();
		} catch (MiException e) {
			// TODO: handle exception
			//System.out.println("exception atrapada");
			e.printStackTrace();
		}
		
	}
}

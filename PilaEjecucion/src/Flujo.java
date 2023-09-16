public class Flujo {

  public static void main(String[] args) {
    System.out.println("Inicio main");
    metodo1();
    System.out.println("Fin main");
  }
  private static void metodo1(){
    System.out.println("Inicio metodo1");
    try {
    	metodo2();
    } catch (MiException me) {
    	me.printStackTrace();
		// TODO: handle exception
	}
    System.out.println("Fin metodo1");
  }
  private static void metodo2() throws MiException {
    System.out.println("Inicio metodo2");
    //for(int i = 1; i <= 5; i++){
     // System.out.println(i);
      
      //try {//es como decir itneta esto
    	  //if (i==3) {
    	 // int num = 0;
    	 // int resultado = i/num;
    	  //System.out.println(resultado);
    	 // }
    	 // String test = null;
    	 // System.out.println(test.toString());
     // } catch(ArithmeticException | NullPointerException exception) {//es como decir atrapa esto
    	 // System.out.println("atrapo Exception ");
    	 // System.out.println(exception.getMessage());
    	  //exception.printStackTrace();
    //ArithmeticException ae = new ArithmeticException();
    throw new MiException("MI excepcion fue lanzada"); //ae ;//lanza
     // }
   // }
    //System.out.println("Fin metodo2");
  }
}

public class EjemploCiclosFor {

	public static void main(String[] args) {
		
		//   variable           condicion      ejecutar al FINAL
		for (int contador = 0; contador <=10 ; contador++) {
			System.out.println(contador);
			//apartir del segundo ciclo for, este ignora la variable declarada dentro del aprentesis. pasa directamente  a la coondicion que este caso es el contador <= 10. mientras condicion y sea true repetira el ciclo
			//la variable contador solo existe dentro del scope del for, si la quire llama afuera nos dara un error
			//cuadno nos sirve usar la variable for? cuando la variable que va ser incrementada no la ncesitemos fuera del constesto de for.
		}
	}
}

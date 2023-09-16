public class ejemploCiclos2 {
    public static void main(String[] args) {
		
		int contador = 0;
		int total = 0;
		while(contador <= 10) { 
            //int total = 0;// por elcance de las varibles total siempre va valer cero, esta dentro del bloque del while, empieza con cero siemrpre
            total = total + contador;
			//System.out.println(total);
			contador++;
            // si quisierams el resultado final, sacmos sysout de total afuera del while, ya que total esta declarada afuera del bloque
		}
		System.out.println(total);// el bloque funciona incrementado el valor de total sumando los nuevos del 0 al 10,  una vez que la condicion se cumple (da false) nos devuelve nuevo valor de total
	}
}


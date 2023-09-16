
public class EjercicioMatriz {

	public static void main(String[] args) {
		
		for(int fila = 0; fila <= 10; fila++) {	
			//for (int columna = 0; columna <= 10; columna++)//con esta liena de codigo obtenemos una matriz cuadrada
			//for (int columna = 0; columna < fila; columna++) 
			for (int columna = 0; columna <= 10; columna++){
				if (columna > fila){
					break;//este brake solo alica para el scope donde esta conteneido.
				}
				System.out.print("*");//no colocamos el ln depsues de spring por que imprimiremos sucesivamente los caracteres
				System.out.print(" ");//agremos un espacio en blanco entre cada atesrisco
			}
			System.out.println();// mantenemos el ln para que se realice un salto entre los carecteres.
		}
		
	}
	
}

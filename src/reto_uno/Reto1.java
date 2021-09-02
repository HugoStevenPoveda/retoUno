package reto_uno;

import java.util.Scanner;

/*
* Recomendaciones Generales:
*
*    -> El método run() funcionará como nuestro método principal
*    -> No declarar objetos de tipo Scanner, utilizar el método read() para solicitar datos al usuario.
*    -> Si requiere utilizar varias clases, estas NO deben ser tipo public.
*/
class Reto1 {

	/**
	 * Este debe ser el único objeto de tipo Scanner en el código
	 */
	private final Scanner scanner = new Scanner(System.in);

	/**
	 * Este método es usado para solicitar datos al usuario
	 * 
	 * @return Lectura de la siguiente linea del teclado
	 */
	public String read() {
		return this.scanner.nextLine();
	}

	/**
	 * método principal
	 */
	public void run() {
		/*
		 * solución propuesta
		 */

		String numeros = read();
		// permite el crear un arreglo y los separa por " " en este caso
		String[] partes = numeros.split(" ");
		double masa = Double.parseDouble(partes[0]);
		double altura = Double.parseDouble(partes[1]);
		double edad = Double.parseDouble(partes[2]);

		if (0 < masa && masa < 150 && 0.1 < altura && altura < 2.5 && 0 < edad && edad < 110) {

			float imc = (float) (masa / Math.pow(altura, 2));
			String nivelRiesgo = " ";
			// permite generar un float con solo un decimal
			String resultado = String.format("%.1f", imc);
			resultado = resultado.replace(",", ".");
			imc = Float.parseFloat(resultado);

			if (imc <= 22 && edad < 45) {

				nivelRiesgo = "Bajo";
			}
			if (imc > 22 && edad >= 45) {

				nivelRiesgo = "Alto";
			}
			if (imc <= 22 && edad >= 45 || imc > 22 && edad < 45) {

				nivelRiesgo = "Medio";
			}

			System.out.print(imc);
			System.out.print(" ");
			System.out.print(nivelRiesgo);

		} else {
			System.out.println("ERROR");

		}

	}
}

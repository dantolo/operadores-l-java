package operadoresLogicos;

public class ejerciciosOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*&& operador And  devuelve true si ambas expresiones son verdaderas 
		|| operador or devuelve true si almenos una de las dos condiciones se cumple
		! operador not si la expresion booleana es flase devuelve true y viceversa */
		
		
		int anios = 12;
		
		boolean esInfante = true;
		
		boolean costoInfante = anios <= 12 && esInfante;
		
		System.out.println("Es peque " + costoInfante);
		
		
		
		// && and
		String cliente = "cliente123";
		String credenciales = "dantefifa123";
		
		boolean credencialCorrecta = cliente.equals("cliente123") && 		credenciales.equals("dantefifa123");
		
		System.out.println("Las credenciales si son validas " + credencialCorrecta);
		
		
		// || or
		
		
		double costoPasaje = 380.50;
		int edad = 60;
		boolean  credenInapam = false;
		
		boolean descuentoAdultoMayor = edad >= 60 || credenInapam; 
		
		System.out.println("tiene descuento? " + descuentoAdultoMayor + " " + costoPasaje);
		
		
		//!not
		
		
		boolean libres = true;
		boolean asientosConDescuento = !libres;
		
		
		System.out.println("Tenemos Asientos con descuento " + asientosConDescuento);
		
		// Constantes
        final int COSTO_BOLETO = 350;
        final int NUM_ASIENTOS = 62;
        final int ASIENTOS_ADULTOS_MAYORES = 4;
        final int ASIENTOS_ESTUDIANTES = 6;
        final double DESCUENTO_INAPAM = 0.35; // 35%
        final double DESCUENTO_ESTUDIANTES = 0.30; // 30%

        // Valores directos para simplificar el ejercicio
        int numBoletos = 60;
        int numAdultosMayores = 2;
        int numEstudiantes = 1;

        // Cálculo del total
        int asientosDisponibles = NUM_ASIENTOS - (ASIENTOS_ADULTOS_MAYORES + ASIENTOS_ESTUDIANTES);
        double total = 0;

        if (numBoletos <= asientosDisponibles) {
            total = numBoletos * COSTO_BOLETO;

            // Aplicar descuento a adultos mayores
            total -= numAdultosMayores * COSTO_BOLETO * DESCUENTO_INAPAM;

            // Aplicar descuento a estudiantes
            total -= numEstudiantes * COSTO_BOLETO * DESCUENTO_ESTUDIANTES;

            System.out.println("\nResumen de la compra:");
            System.out.println("Boletos normales: " + (numBoletos - numAdultosMayores - numEstudiantes));
            System.out.println("Boletos para adultos mayores: " + numAdultosMayores);
            System.out.println("Boletos para estudiantes: " + numEstudiantes);
            System.out.println("Total a pagar: $" + total);
        } else {
            System.out.println("\nLo siento, no hay suficientes asientos disponibles.");
        }
		
		
		
		
		
		
		

	}

}

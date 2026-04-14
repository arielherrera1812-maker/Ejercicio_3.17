import java.util.Scanner;

public class Sistema {

    Scanner sc;

    public void iniciarAplicacion() {
        Scanner input = new Scanner(System.in);

        System.out.println("=== REGISTRO MÉDICO DIGITAL ===");
        System.out.print("Ingresa tu primer nombre: ");
        String nombre = input.nextLine();
        System.out.print("Ingresa tu apellido: ");
        String apellido = input.nextLine();
        System.out.print("Ingresa tu sexo (M/F): ");
        String sexo = input.nextLine();
        System.out.print("Ingresa tu día de nacimiento (DD): ");
        int dia = input.nextInt();
        System.out.print("Ingresa tu mes de nacimiento (MM): ");
        int mes = input.nextInt();
        System.out.print("Ingresa tu año de nacimiento (YYYY): ");
        int anio = input.nextInt();
        System.out.print("Ingresa tu altura en centímetros (ej. 175): ");
        double altura = input.nextDouble();
        System.out.print("Ingresa tu peso en kilogramos (ej. 70.5): ");
        double peso = input.nextDouble();

        // Instanciamos el objeto usando el constructor
        PerfilMedico paciente = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);

        // Imprimimos el reporte completo
        imprimirReporte(paciente);
        input.close();
    }

    private void imprimirReporte(PerfilMedico paciente) {
        System.out.println("\n=====================================");
        System.out.println("        REPORTE DEL PACIENTE         ");
        System.out.println("=====================================");
        System.out.println("Nombre completo: " + paciente.getPrimerNombre() + " " + paciente.getApellido());
        System.out.println("Sexo: " + paciente.getSexo());
        System.out.println("Fecha de nacimiento: " + paciente.getDiaNacimiento() + "/" + paciente.getMesNacimiento() + "/" + paciente.getAnioNacimiento());
        System.out.println("Altura: " + paciente.getAlturaEnCentimetros() + " cm");
        System.out.println("Peso: " + paciente.getPesoEnKilogramos() + " kg");
        System.out.println("Edad actual: " + paciente.calcularEdad() + " años");
        System.out.println("-------------------------------------");
        System.out.println("Frecuencia Cardíaca Máxima: " + paciente.calcularFrecuenciaCardiacaMaxima() + " bpm");
        System.out.println("Rango Frecuencia Esperada (50% - 85%): " + paciente.calcularRangoFrecuenciaEsperada());
        System.out.printf("Índice de Masa Corporal (BMI): %.2f\n", paciente.calcularBMI());
        System.out.println("-------------------------------------");
        // Tabla de referencia
        System.out.println("\nVALORES DE REFERENCIA BMI:");
        System.out.println("Bajo peso:  menos de 18.5");
        System.out.println("Normal:     entre 18.5 y 24.9");
        System.out.println("Sobrepeso:  entre 25 y 29.9");
        System.out.println("Obeso:      30 o más");
        System.out.println("=====================================");
    }


}

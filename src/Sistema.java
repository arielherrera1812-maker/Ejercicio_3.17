import java.util.Scanner;

public class Sistema {

    Scanner sc;

    public Sistema(){
        sc = new Scanner(System.in);
    }

    public PerfilMedico perfilMedico(){
        System.out.print("Ingrese el nombre del paciente: ");
        String nombre = sc.next();
        System.out.print("Ingrese su apellido: ");
        String apellido = sc.next();
        System.out.print("Ingrese su género: ");
        String sexo = sc.next();
        System.out.print("Ingrese su año de nacimiento: ");
        int anio = sc.nextInt();
        System.out.print("Ingrese su mes de nacimiento: ");
        int mes = sc.nextInt();
        System.out.print("Ingrese el día de nacimiento: ");
        int dia = sc.nextInt();
        System.out.print("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();
        System.out.print("Ingrese su peso en Kg: ");
        double peso = sc.nextDouble();

        PerfilMedico paciente = new PerfilMedico(nombre, apellido, sexo, anio, dia ,mes, altura,peso);
        return paciente;
    }

    public void imprimirReporte(){
        System.out.println("-------------------------REPORTE PACIENTE-------------------------");
    }

}

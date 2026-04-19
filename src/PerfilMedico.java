public class PerfilMedico {
    private String primerNombre;
    private String apellido;
    private String sexo;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private double alturaEnCentimetros;
    private double pesoEnKilogramos;

    public PerfilMedico(String primerNombre, String apellido, String sexo, int diaNacimiento, int mesNacimiento, int anioNacimiento, double alturaEnCentimetros, double pesoEnKilogramos) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.alturaEnCentimetros = alturaEnCentimetros;
        this.pesoEnKilogramos = pesoEnKilogramos;
    }




    public int calcularEdad() {

        int anioActual = 2026;
        int mesActual = 4;
        int diaActual = 15;

        int fechaActualDias = anioActual * 365 + mesActual * 30 + diaActual;
        int fechaNacimientoDias = this.anioNacimiento * 365 + this.mesNacimiento * 30 + this.diaNacimiento;
        int edadDias = fechaActualDias - fechaNacimientoDias;

        int edad = edadDias / 365;
        return edad;

    }

    public int calcularFrecuenciaCardiacaMaxima() {

        int calcularFMC = 220 - calcularEdad();

        return calcularFMC;
    }

    public String calcularRangoFrecuenciaEsperada() {
        int max = calcularFrecuenciaCardiacaMaxima();
        double minEsperada = max * 0.50;
        double maxEsperada = max * 0.85;
        return String.format("%.2f - %.2f latidos por minuto", minEsperada, maxEsperada);
    }

    public double calcularBMI() {
        double alturaEnMetros = alturaEnCentimetros / 100.0;
        double bmiCalculado = pesoEnKilogramos / Math.pow(alturaEnMetros,2);
        return bmiCalculado;
    }


    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public double getAlturaEnCentimetros() {
        return alturaEnCentimetros;
    }

    public void setAlturaEnCentimetros(double alturaEnCentimetros) {
        this.alturaEnCentimetros = alturaEnCentimetros;
    }

    public double getPesoEnKilogramos() {
        return pesoEnKilogramos;
    }

    public void setPesoEnKilogramos(double pesoEnKilogramos) {
        this.pesoEnKilogramos = pesoEnKilogramos;
    }
}


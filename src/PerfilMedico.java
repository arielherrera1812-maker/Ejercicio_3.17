public class PerfilMedico {
    private String nombre;
    private String apellido;
    private String sexo;
    private int anio;
    public int mes;
    public int dia;
    public Double altura;
    public Double peso;


    public PerfilMedico(String nombre, String apellido, String sexo, int anio, int mes, int dia, Double altura, Double peso){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.altura = altura;
        this.peso = peso;

    }

    public int CalcularEdad(int anio, int mes, int dia ){
        int anioActual = 2026;
        int mesActual = 4;
        int diaActual =14;

        int fechaActualDias = anioActual * 365 + mesActual * 30 + diaActual;
        int fechaNacimientoDias = this.anio * 365 + this.mes * 30 + this.dia;
        int edadDias = fechaActualDias - fechaNacimientoDias;

        int edad = edadDias/365;
        return edad;
    }

    //la fórmula para calcular su frecuencia cardiaca máxima en pulsos por minuto es 220 menos su edad en años
    public int CalcularFCardiaca(int edad){
        int frecuenciaCMaxima = 220 - edad;
        return frecuenciaCMaxima;

    }
    public int FrecuenciaCardiacaEsperada(int frecuenciaCMaxima){
        int frecuenciaCEsperada = frecuenciaCMaxima/2;
        return frecuenciaCEsperada;

    }

    public Double MasaC(Double peso, Double altura){
        Double alturaCuadrado = Math.pow(altura,2);
        Double masaC = peso/alturaCuadrado;
        return masaC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}


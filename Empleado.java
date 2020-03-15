package Ej2;
public class Empleado {
    String nombre;
    String nif;
    int edad;
    boolean casado;
    double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String nif, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.nif = nif;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }
    //<editor-fold defaultstate="collapsed" desc="getters y setters">
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
//</editor-fold>

    public String edad(){
        String valor="a";
        if(edad<=21)
            valor="Principiante";
        else if(edad>=22 && edad<=35)
            valor="Intermedio";
        else if(edad>35)
           valor="Senior";
        return valor;
    }
    public double aumentarsalario(int porcentaje){
        double salarioaumentado,salariofinal;
        salarioaumentado=salario*porcentaje/100;
        salariofinal=salarioaumentado+salario;
        return salariofinal;
    }

    @Override
    public String toString() {
        return "Empleado:" + "\nnombre=" + nombre + "\nnif=" + nif + "\nedad=" + edad + "\ncasado=" + casado + "\nsalario=" + salario +"\nnivel= "+edad()+"\nsalario actualizado con un 10%= "+aumentarsalario(10)+'}';
    }
    
    
    
}

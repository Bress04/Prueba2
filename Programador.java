package Ej2;
public class Programador extends Empleado {
    int lineascodigo;
    String lenguajedominante;

    public Programador() {
    }
    

    public Programador(int lineascodigo, String lenguajedominante, String nombre, String nif, int edad, boolean casado, double salario) {
        super(nombre, nif, edad, casado, salario);
        this.lineascodigo = lineascodigo;
        this.lenguajedominante = lenguajedominante;
    }
    
//<editor-fold defaultstate="collapsed" desc="getters y setters">
      public int getLineascodigo() {
        return lineascodigo;
    }

    public void setLineascodigo(int lineascodigo) {
        this.lineascodigo = lineascodigo;
    }

    public String getLenguajedominante() {
        return lenguajedominante;
    }

    public void setLenguajedominante(String lenguajedominante) {
        this.lenguajedominante = lenguajedominante;
    }
//</editor-fold>

    @Override
    public String toString() {
        return super.toString()+"\nProgramador{" + "\nlineascodigo=" + lineascodigo + "\nlenguajedominante=" + lenguajedominante + '}';
    }
  
    
    
    

   
    
    
}

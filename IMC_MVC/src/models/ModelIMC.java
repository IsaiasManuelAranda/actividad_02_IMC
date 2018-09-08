
package models;


public class ModelIMC {
   private double altura;
   private double peso;
   private double result;
   

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
   
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double resultado(){
       this.result = this.peso / ((this.altura/100) * (this.altura/100));
        return this.result;         
    }
}

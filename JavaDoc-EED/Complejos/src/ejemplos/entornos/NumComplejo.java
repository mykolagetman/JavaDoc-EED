package ejemplo.entornos;
/**
 * Programa que hace operaciones con numeros complejos.
 *
 * @author Niko Getman
 * @version 2.0.0
 */
public class NumComplejo {
  private double pReal;
  private double pImaginaria;

  /**
   * Constructor vacio.
   */
  public NumComplejo(){

  }

  /**
   * Constructor.
   * @param pReal: Parte Real.
   * @param pImaginaria: Parte Imaginaria.
   */
  public NumComplejo(double pReal, double pImaginaria){
    this.pReal=pReal;
    this.pImaginaria=pImaginaria;
  }

  /**
   * Getter
   * @return pReal: Devuelve la parte real.
   */
  public double getpReal() {
    return pReal;
  }

  /**
   * Setter
   * @param pReal: Devuelve la parte real.
   */
  public void setpReal(double pReal) {
    this.pReal = pReal;
  }

  /**
   * Getter
   * @return pImaginaria: Valor de la parte Imaginaria.
   */
  public double getpImaginaria() {
    return pImaginaria;
  }

  /**
   * Setter
   * @param pImaginaria: Devuelve la parte imaginaria.
   */
  public void setpImaginaria(double pImaginaria) {
    this.pImaginaria = pImaginaria;
  }

  /**
   * Calcula la suma de dos numero complejos.
   * @param c1 Numero 1
   * @param c2 Numero 2
   * @return resultado de la operacion de suma.
   */
  public static NumComplejo sumarComplejos (NumComplejo c1, NumComplejo c2){
    NumComplejo result = new NumComplejo();

    result.setpReal(c1.getpReal()+c2.getpReal());
    result.setpImaginaria(c1.getpImaginaria()+c2.getpImaginaria());

    return result;
  }

  /**
   * Calcula la resta de dos numero complejos.
   * @param c1 Numero 1
   * @param c2 Numero 2
   * @return resultado de la resta.
   */
  public static NumComplejo restarComplejos (NumComplejo c1, NumComplejo c2){
    NumComplejo result = new NumComplejo();

    result.setpReal(c1.getpReal()-c2.getpReal());
    result.setpImaginaria(c1.getpImaginaria()-c2.getpImaginaria());

    return result;
  }

  /**
   * Calcula la multiplicacion de dos numero complejos.
   * @param c1 Numero 1
   * @param c2 Numero 2
   * @return resultado de la multiplicacion
   */
  public static NumComplejo multiplicarComplejos (NumComplejo c1, NumComplejo c2){
    NumComplejo result = new NumComplejo();

    double a=c1.getpReal();
    double b=c1.getpImaginaria();
    double c=c2.getpReal();
    double d=c2.getpImaginaria();

    result.setpReal((a*c)-(b*d));
    result.setpImaginaria((a*d)+(b*c));

    return result;
  }

  /**
   * Calcula la division de dos numero complejos.
   * @param c1 Numero 1
   * @param c2 Numero 2
   * @return resultado de la division.
   */
  public  static NumComplejo dividirComplejos (NumComplejo c1, NumComplejo c2){
    NumComplejo result = new NumComplejo();

    double a=c1.getpReal();
    double b=c1.getpImaginaria();
    double c=c2.getpReal();
    double d=c2.getpImaginaria();

    double dividendoReal = (a*c)+(b*d);
    double dividendoImaginario = (b*c)-(a*d);
    double divisor = (Math.pow(c, 2)+Math.pow(d, 2));

    result.setpReal(dividendoReal/divisor);
    result.setpImaginaria(dividendoImaginario/divisor);

    return result;
  }

  /**
   * Calcula el modulo de dos numero complejos.
   * @return modulo de numero complejo.
   */
  public static double modulo (NumComplejo numComplejo){
    double real =  numComplejo.getpReal();
    double imaginaria = numComplejo.getpImaginaria();

    return Math.sqrt(Math.pow(real, 2)+Math.pow(imaginaria, 2));
  }

  /**
   * toString para mostrar por pantalla la pReal y pImaginaria.
   * @return muestra la salida formateada.
   */
  @Override
  public String toString(){

    String mostrar="";
    if (pReal!=0){
      mostrar+=pReal;
    }
    if (pImaginaria>=0){
      mostrar=mostrar+"+"+pImaginaria+"i";
    }else {
      mostrar=mostrar+"-"+(pImaginaria*(-1))+"i";
    }
    return mostrar;
  }
}
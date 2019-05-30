package ejemplos.entornos;

/**
 * Operaciones con numeros complejos: ProgramaComplejos.
 * 
 * @author Niko Getman
 * @version 2.0.0
 */
public class ProgramaComplejos {
	
	/**
	 * El metodo principal.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args){
		
		NumComplejo num1=new NumComplejo(2,3);
		NumComplejo num2=new NumComplejo(2,1);
		NumComplejo res=new NumComplejo();
		
		System.out.println("Programa que opera con numeros complejos");
		System.out.println("========================================");
		
		System.out.println("Suma:");
		res=NumComplejo.sumarComplejos(num1,num2);
		System.out.println(res);
		
		System.out.println("Resta:");
		res=NumComplejo.restarComplejos(num1,num2);
		System.out.println(res);
		
		System.out.println("Multiplicacion:");
		res=NumComplejo.multiplicarComplejos(num1,num2);
		System.out.println(res);
		
		System.out.println("Division:");
		res=NumComplejo.dividirComplejos(num1,num2);
		System.out.println(res);
	}

}

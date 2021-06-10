import java.util.*;
public class Ejercicio7{
	public static void main(String args[]){
		Scanner read = new Scanner(System.in);

		float sumacero=0;
		float sumapar=0;
		float sumaimpar=0;

		float promediopar;
		float promedioimpar;
		float promediocero;


		for (int i = 0 ;i<15 ;i++ ) {

			int numero = (int)(Math.random()*36);

			if (numero==0) {
				sumacero++;
														
			}else if (numero%2==0) {
				sumapar++;				
				
			}else{
				sumaimpar++;

			}			
			System.out.print(" # "+numero);

		}
		

		promediopar = (sumapar/15)*100;
		promedioimpar = (sumaimpar/15)*100;
		promediocero = (sumacero/15)*100;						
		
		System.out.println("");
		System.out.println(sumacero);
		System.out.println(sumapar);
		System.out.println(sumaimpar);
		System.out.println("par : "+promediopar);
		System.out.println("impar : "+promedioimpar);
		System.out.println("cero : "+promediocero);		

		double suma = (promediopar+promedioimpar+promediocero);

		System.out.println("suma: "+suma);
	}

}
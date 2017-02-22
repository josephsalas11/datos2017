package modelaje;

public class Program 
{
	public static void main(String[] args) 
	{
		// crear una instancia
		// NombreClass nombreVariable = new metodoConstructor
		
		Semaforo semaforo1 = new Semaforo();
		Semaforo semaforo2 = new Semaforo("Verde", (short)30);
		
		semaforo2 = semaforo1;

	}

}

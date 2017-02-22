package modelaje;

public class Semaforo 
{
	private boolean Encendido;
	private String Estado;
	private short TiempoVerde;
	private short TiempoRojo;
	private short TiempoAmarillo;
	
	public Semaforo()
	{
		Estado="Rojo";
		encender();
	}
	
	public Semaforo(String pEstadoActual)
	{
		Estado = pEstadoActual;
	}
	
	public Semaforo(short pTiempoVerde, String pEstadoActual)
	{
		this.Estado = pEstadoActual;
		this.TiempoVerde = pTiempoVerde;
	}
	
	public Semaforo(String pEstadoActual, short pTiempoVerde)
	{
		this.Estado = pEstadoActual;
		this.TiempoVerde = pTiempoVerde;		
	}	

	public Semaforo(String pEstadoActual, short pTVerde, short pTRojo, short pTAmarillo)
	{
		this.Estado = pEstadoActual;
		this.TiempoAmarillo = pTAmarillo;
		this.TiempoRojo = pTRojo;
		this.TiempoVerde = pTVerde;
	}	
	
	public void cambiarColor()
	{
		
	}
	
	public void encender() 
	{
		Encendido = true;
	}
	
	public void apagar()
	{
		Encendido = false;
	}
	
	
}

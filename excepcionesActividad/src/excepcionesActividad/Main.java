package excepcionesActividad;

public class Main {
	public static generadorExcepciones ejercicio3;
	public static void excepcionNull()
	{
		try
		{
			ejercicio3.simpleExcepcion();
		}
		catch( NullPointerException e )
		{
			e.printStackTrace();
			System.out.println( "Este es una excepcion de tipo: NullPointer Exception" );
		}
	}
	public static void main( String args[] )
	{
		generadorExcepciones ejercicio1 = new generadorExcepciones();
		
		//ejercicio1.simpleExcepcion();
		//ejercicio1.arregloExcepcion();
		excepcionNull();
	}
}

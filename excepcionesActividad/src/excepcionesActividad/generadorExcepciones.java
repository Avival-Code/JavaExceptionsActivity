package excepcionesActividad;

public class generadorExcepciones {
	public void arregloExcepcion()
	{
		int [] arreglo = new int[ 10 ];
		for( int i = 0; i < 10; i++ )
			arreglo[ i ] = i;
		
		try
		{
			System.out.println( arreglo[ 11 ] );
		}
		catch( ArrayIndexOutOfBoundsException e )
		{
			e.printStackTrace();
			System.out.println( "Esta es una excepcion de tipo: ArrayIndexOutOfBounds." );
		}
	}
	public void simpleExcepcion()
	{
		try
		{
			throw new Exception( "Esta es una exception simple dentro de un bloque try." );
		}
		catch( Exception e )
		{
			e.printStackTrace();
			System.out.println( e.getMessage() );
		}
	}
}

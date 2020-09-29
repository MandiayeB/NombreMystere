package nombremystere;

public abstract class NombreMystere {
	
	protected int secret[];
	protected int tentative;

	public NombreMystere() {
		
		secret = new int[4];
		
		for ( int i = 0; i < secret.length; i++ ) {
			
			secret[i] = 0 + ( int )( Math.random() * ( ( 9 ) + 1 ) );
			
		}
		
	}
	
}

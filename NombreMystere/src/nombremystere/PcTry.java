package nombremystere;

public class PcTry {
	
	public PcTry ( int[] proposition ) {
		
		Compare compare = new Compare();
		compare.secret = proposition;
		int tentative[] = new int[4];
		tentative[0] = 0 + (int) (Math.random() * ((9) + 1));
		int essai = tentative[0];
		
		for (int i = 1; i < 4; i++) {
			
			essai = essai*10;
			tentative[i] = 0 + (int) (Math.random() * ((9) + 1));
			essai += tentative[i];

		}
		
		while ( compare.tentative > 0 ) {
			
			System.out.println(essai);
			compare.verif(essai);
			
			for ( int i = 0; i < compare.sign.length; i++ ) {
				
				if ( compare.sign[i] == "+" ) {
					
					tentative[i] = tentative[i] + 1;
							
				} else if ( compare.sign[i] == "-" ) {
					
					tentative[i] = tentative[i] - 1;
							
				}
				
			}
			essai = tentative[0];
			
			for (int i = 1; i < 4; i++) {
				
				essai = essai*10;
				essai += tentative[i];

			}
			
		}
		
		
		
	}
	
}

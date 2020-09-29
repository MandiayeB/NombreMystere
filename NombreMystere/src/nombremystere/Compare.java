package nombremystere;

public class Compare extends NombreMystere {
	
	String sign[];
	
	public Compare() {
		
		super();
		tentative = 10;
		sign = new String[4];
		
	}
	
	public void verif ( int proposition ) {
		
		String[] compare = Integer.toString(proposition).split("");
		String response = "";
		int count;
		
		if ( tentative > 0 ) {
			
			count = 0;
			
			for ( int i = 0; i < secret.length; i++ ) {
				
				if ( Integer.parseInt( compare[i] ) == secret[i] ) {
					
					response += "=";
					sign[i] = "=";
					count ++;
					
				} else if ( Integer.parseInt( compare[i] ) > secret[i] ) {
					
					response += "-";
					sign[i] = "-";
					
				} else if ( Integer.parseInt( compare[i] ) < secret[i] ) {
					
					response += "+";
					sign[i] = "+";
					
				}
				
			}
			
			if ( count == 4 ) {
				
				tentative = 0;
				response = "Victoire !\n"; 
				
			} else {
			
				tentative--;
				
				if ( tentative == 0 ) {
					
					String  nombre = "";
					
					for ( int y = 0; y < secret.length; y++ ) {
						
						nombre += String.valueOf(secret[y]);
						
					}
					
					response = "Défaite... Le nombre était : " + nombre + "\n";
					
				}
			
			}
			
		}
		
		System.out.println(response + "\n" );
	}
	
	public int[] convert ( int proposition ) {
		
		String[] compare = Integer.toString(proposition).split("");
		int list[] = new int[compare.length];
		
		for ( int i = 0; i < compare.length; i++ ) {
			
			list[i] = Integer.parseInt( compare[i] ); 
			
		}
		return list;
		
	}
	
}

package nombremystere;
import java.util.Scanner;

public class EntryPoint {

	public static void main(String[] args) {
		
		Compare compare = new Compare();
		Scanner scanner = new Scanner(System.in);
		boolean bool = true;
		
		do {
			
			System.out.println("\nChoisissez un mode de jeu :");
			System.out.println("1) L'ordinateur génère un nombre mystère et vous devez le deviner");
			System.out.println("2) Vous indiquez un nombre mystère et l'ordinateur doit le deviner");

			int res = scanner.nextInt();

			if (res == 1) {
				
				while ( compare.tentative > 0 ) {
					
					System.out.println("Devinez un nombre à 4 chiffres");
					System.out.println("Nombre de tentatives restantes : " + compare.tentative);
					int proposition = scanner.nextInt();
					compare.verif(proposition);
					
					
				}
				compare.tentative = 10;
				
			} else if (res == 2) {
				
				System.out.println("Proposez un nombre à 4 chiffres, l'ordinateur essaiera de le deviner");
				int proposition = scanner.nextInt();
				new PcTry(compare.convert(proposition));
				
			}

			System.out.println("Que voulez-vous faire ?");
			System.out.println("1) Rejouer au même mode");
			System.out.println("2) Lancer un autre mode");
			System.out.println("3) Quitter l'application");
			int choice = scanner.nextInt();
			
			if ( choice == 1 ) {
				
				
				
			} else if ( choice == 3 ) {
				
				bool = false;
				
			}
			
		} while ( bool );
		
		scanner.close();

	}

}

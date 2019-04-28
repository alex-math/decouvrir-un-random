package decouvrir_un_random;

import java.util.Scanner;

public class DecouvrirUnRandom {

	public static void main(String[] args) {
		System.out.println("Saurez-vous trouver le nombre mystère, situé entre 1 et 100 ?");
		System.out.println("A vous de jouer ! Donnez-moi un nombre...");
		int nombreAleatoire = 1 + (int)(Math.random() * 99 + 1);
		Scanner sc = new Scanner(System.in);
		int nombrePropose = sc.nextInt();
		while (nombrePropose != nombreAleatoire) {
			if (nombrePropose < nombreAleatoire) {
				System.out.println("Trop petit ! Une autre proposition ?");
				nombrePropose = sc.nextInt();
			}
			else {
				System.out.println("Trop grand ! Une autre proposition ?");
				nombrePropose = sc.nextInt();
			}	
		}
		System.out.println("Félicitation !!! " +nombreAleatoire+ " était le nombre mystère. On joue encore ?");
	}

}

package decouvrir_un_random;

public class DecouvrirUnRandom {

	public static void main(String[] args) {
		System.out.println("Saurez-vous trouver le chiffre mystère, situé entre 1 et 10 ?");
		System.out.println("A vous de jouer ! Donnez-moi un chiffre...");
		int nombreAleatoire = 1 + (int)(Math.random() * 9 + 1);
		System.out.println(nombreAleatoire);

	}

}

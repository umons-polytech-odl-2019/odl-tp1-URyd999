package exercise1;

public class Exercise1 {
	static Person createPerson(String name, int age) {
		// Ajoutez les champs name et age à la classe Person./
		// Créez un constructeur public permettant d'initialiser ces valeurs au moment de la construction./
		// Créez des getters publics pour lire ces valeurs une fois la classe construite.
		Person INDV= new Person(name, age);


		return INDV;
	}

	public static void main(String[] args) {
		// Considérant que cette classe est démarrée en ligne de commande avec un premier paramètre donnant le nom
		// et un second donnant l'âge (nombre entier), créez un objet Person sur base de ceux-ci.
		// Ecrivez ensuite le nom et l'âge de cette personne sur la sortie standard.

		String name= args[0];
		String age= args[1];
		int Age= Integer.parseInt(age);

		Person INDV=createPerson(name,Age);
		System.out.println(INDV.getName()+ INDV.getAge());



	}
}

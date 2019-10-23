package exercise2;

class Person {

	private int age;
	private static int totalAge=0;
	private static int populationsize=0;

	public Person(int age){
		this.age= age;
		totalAge += this.age;
		populationsize++;
	}



	public static int computePopulationSize(){
		return populationsize;
	}
	public static int computeAveragePopulationAge(){
		return (totalAge/populationsize);
	}
	public static void resetPopulation(){
		totalAge=0;
		populationsize=0;
	}
}

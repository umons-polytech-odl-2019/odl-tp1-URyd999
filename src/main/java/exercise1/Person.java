package exercise1;

class Person {
	private String name;
	private int age;


	public Person(String name, int age){

			this.name= name;
			this.age= age;

	}
	public String getName(){

		return this.name;
	}
	public int getAge(){

		return this.age;
	}
	public void  Setname(String name){

		this.name=  name;
	}
	public void Setage(int age){

		this.age= age;
	}

}

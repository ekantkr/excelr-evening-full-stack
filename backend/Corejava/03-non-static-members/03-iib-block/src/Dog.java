class Dog
{
	String name, breed, gender, nature;
	int age;
	double height, weight;

	Dog(String name, String breed, String gender, String nature, int age, double, height, double weight)
	{
		this.name = name;
		this.breed = breed;
		this.gender = gender;
		this.nature = nature;
		this.height = height;
		this.weight = weight;
	}

	public static void main(String[] args) 
	{
		Dog charlie =  new Dog ("Charlie", "Labrador", "male", "Animal", 6, 2.5, 6.4);
		System.out.println("Your dog Details: " + "Dog Name:" + charlie.name + "," + "dog breeed:" + 
			Charlie.breed + "," + "Dog gender: " + Charlie.gender + "," + "Dog Nature: " + Charlie.nature +
			"," + " Dog Age: " + Charlie.age + "," + "Dog Name: " + Charlie.height + ","
			+ "Dog Name: " + Charlie.weight);

			System.out.println("_______________________________________________________________");

			Dog baby =  new Dog ("baby", "Indian periah", "Female", "Animal", 3, 2.0, 5.3);
		System.out.println("Your dog Details: " + "Dog Name:" + baby.name + "," + "dog breeed:" + 
			baby.breed + "," + "Dog gender: " + baby.gender + "," + "Dog Nature: " + baby.nature +
			"," + " Dog Age: " + baby.age + "," + "Dog Name: " + baby.height + ","
			+ "Dog Name: " + baby.weight);

			System.out.println("________________________________________________________________");

			Dog baby =  new Dog ("Ruby", "Indian periah", "Female", "Animal", 2, 2.5, 6.0);
		System.out.println("Your dog Details: " + "Dog Name:" + baby.name + "," + "dog breeed:" + 
			baby.breed + "," + "Dog gender: " + baby.gender + "," + "Dog Nature: " + baby.nature +
			"," + " Dog Age: " + baby.age + "," + "Dog Name: " + baby.height + ","
			+ "Dog Name: " + baby.weight);

	}
}

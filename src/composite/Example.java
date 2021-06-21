package composite;

public class Example {
	
	public static void main(String[] args) {
		Composite chile = new Composite();
		City santiago = new City(6300000);
		City serena = new City(201000);
		City vina = new City(289000);
		
		chile.add(santiago);
		chile.add(serena);
		chile.add(vina);
		
		Composite southAmerica = new Composite();
		southAmerica.add(chile);
		
		System.out.println(southAmerica.getValue());
	}

}

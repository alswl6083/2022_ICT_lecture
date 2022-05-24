package polyEx;

import Animal.Animal;
import Extend.Human;
import Extend.Tiger;
import Extend.Eagle;

public class main {
	public static void main(String[] args) {
		Animal animal = new Animal();
		
		animal.move();
		animal.moveAnimal(new Human());
		animal.moveAnimal(new Tiger());
		animal.moveAnimal(new Eagle());
		
	}
}

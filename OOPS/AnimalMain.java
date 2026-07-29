package OOPS;

class Animal {
	
	void eat() {
		System.out.println("Animal is eating");
	}
}

class Lion extends Animal {
	
	void roar() {
		System.out.println("Lion roars");
	}
}

class Cub extends Lion {
	
	void play() {
		System.out.println("Cub is Playing");
	}
}

public class AnimalMain {
	public static void main(String[] args) {
		Cub c = new Cub();
		c.eat();
		c.roar();
		c.play();
	}

}

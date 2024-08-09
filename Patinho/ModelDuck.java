package Patinho;

public class ModelDuck extends Duck{
	public ModelDuck () {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	public void display() {
		System.out.println("Sou um pato Modelo");
	}
}

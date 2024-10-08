package Patinho;

public class MiniDuckSim {
	
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		Dispositivo disp = new Dispositivo();
		disp.quack();
	}
}

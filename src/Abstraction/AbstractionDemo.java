package Abstraction;

abstract class Bike{
	abstract void run();
}
class honda extends Bike{
	public void run() {
		System.out.println("Honda is running");
	}
}


public class AbstractionDemo {

	public static void main(String[] args) {
	honda ho=new honda();
	ho.run();

	}

}

package Inheritance;

class Addition{
	public void add(int a,int b) {
		System.out.println("Addition Of Two Number is:-"+(a+b));
	}
}
class Subraction extends Addition{
	public void sub(int a,int b) {
		System.out.println("Subraction Of Two Number:-"+(a-b));
	}
}
class Multiplication extends Subraction{
	public void mul(int a,int b) {
		System.out.println("Multiplecation Of Two Number:-"+(a*b));
	}
}
class Division extends Multiplication{
	public void div(int a,int b) {
		System.out.println("Division Of Two Number:-"+(a/b));
	}
	public void callAllMethod() {
		add(10, 20);
		sub(10, 20);
		mul(10, 20);
		div(10, 20);
	}
}

public class inheritanceDemo {
	public static void main(String[] args) {
		Division a=new Division();
		a.callAllMethod();
	}

}

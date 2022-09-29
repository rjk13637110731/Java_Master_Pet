public class Test{
	public static void main(String[] args){
		Master m = new Master();
		Pet p1 = new Dog();
		Pet p2 = new Cat();
		Pet p3 = new YingWu();

		m.feed(p1);
		m.feed(p2);
		m.feed(p3);
	}
}
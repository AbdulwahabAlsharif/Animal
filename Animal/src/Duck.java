
public class Duck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String beakColor = "yellow";
		Animal myZoo = new Animal(3,"Male");
		System.out.println(myZoo.age +" "+myZoo.gender);

	}
	public void swim() {
		System.out.println("Duck is good in swimming");
	}
	public void quack() {
		System.out.println("Duck can quack");
	}

}

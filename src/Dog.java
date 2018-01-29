
public class Dog {
	String name; 
	String color;
	public Dog(String color, String name){
		this.color=color;
		this.name=name;
	}
public static void main(String[] args) {
	Dog max = new Dog("brown","dave");
	System.out.println(max.name + " "+ max.color);
	
}
}

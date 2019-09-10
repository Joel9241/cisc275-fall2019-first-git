import java.util.*;
class Dog extends Animal{
	public String toString(){
		return name;
	}
	public Dog(String name, int legs){
		this.name = name;
		this.legs = legs;
	}
	public static void main(String[] args){
		System.out.println("Hello World");
		ArrayList<Dog> dogArrayList = new ArrayList<Dog>();
		Dog dog1 = new Dog("Hero", 3);
		Dog dog2 = new Dog("Hero", 4);
		Dog dog3 = new Dog("Zeus", 4);
		dogArrayList.add(dog1);
		dogArrayList.add(dog2);
		dogArrayList.add(dog3);
		Iterator itr = dogArrayList.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}

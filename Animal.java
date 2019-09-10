import java.util.Comparator;
public class Animal implements Comparable<Animal>{
	String name;
	int legs;
	
	public int compareTo(Animal a){
		return (this.name).compareTo(a.name);
	}

	public int getLegs(){
		return this.legs;
	}
	private static class AnimalCompare {
		static final Comparator<Animal> NAME_ORDER = new Comparator<Animal>(){
			public int compare(Animal a1, Animal a2){
				if (a1.compareTo(a2) == 0){
					if (a1.legs > a2.legs){
						return 1;
					}
					else if (a1.legs < a2.legs){
						return -1;
					}
					else{
						return 0;
					}
				}
				return a1.compareTo(a2);
			}
		};
	}
}



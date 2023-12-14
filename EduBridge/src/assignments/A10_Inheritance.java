package assignments;


class Books {
	// method of the parent class
	String bname;
	public void read() {
		System.out.println("I like reading books");
	}
}

// inherit from Books
class Autobiography extends Books {

	//  method in child class
	public void autobiography() {
		System.out.println("Biography: - " + bname);
	}
}

//inherit from Books
class Comics extends Books {

	//  method in child class
	public void comics() {
		System.out.println("Comics: - " + bname);
	}
}

public class A10_Inheritance {
	public static void main(String[] args) {
		// create an object of the Autobiography
		Autobiography s1 = new Autobiography();

		// create an object of the Comics
		Comics s2 = new Comics();

		// call method of parent class
		// using object of subclass
		s1.read();


		// access field of parent class
		s1.bname = "B. R. Ambedkar";
		s1.autobiography();
		// access field of parent class
		s2.bname = "Marvel";
		s2.comics();



	}
}
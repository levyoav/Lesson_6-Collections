package comparableExample;

//In order to be able to sort a list of objects of this class using the
//'java.util.Collections.sort(List)' method, the class must implement Comparable
//and override the 'compareTo(Object)' method.
public class Person implements Comparable {

	//Attributes
	private int id;
	private String name;
	private int age;

	//CTOR
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	//Methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	//The implementation of the compareTo(Object) method should contain an internal sorting logic 
	//by natural order. Natural ordering should be consistent with equals() method. Here, the 
	//comparison is done according to the Person id which is an int. Hence, the natural order is 
	//of an int type.
	public int compareTo(Object o) {

		Person other = (Person) o;

		if (this.id < other.id) {
			return -1;
		} else if (this.id > other.id) {
			return 1;
		} else {
			return 0;
		}

		//The compateTo method returns a positive value, negative value or 0 if this object is greater than,
		//smaller than or equal to the given object respectively. According to that assumption, one might choose to simply 
		//return the DIFFERENCE between the ids of the 2 objects (as commented below) instead of the implementation above.
		//This is a BAD PRACTICE, since if for example this objeCt would have a very large POSITIVE number as the id, and the
		//given object has a very large NEGATIVE number, the difference as implemented here would generate a VERY VERY large 
		//number, which could lead to OVERFLOW in the returned int value.
//		return this.id - other.id;
	}

}

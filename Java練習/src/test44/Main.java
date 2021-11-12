package test44;

class User {

	String name;
	String rank;
	char seibetu;
	int age;
	int uriage;

	void input(String inputName, char inputSeibetu, int inputAge, int inputUriage) {
		name = inputName;
		seibetu = inputSeibetu;
		age = inputAge;
		uriage = inputUriage;
	}

	void rank() {
		if (uriage > 1000) {
			rank = "小金持ち";
		} else {
			rank = "貧乏人";
		}
	}

	void output() {
		System.out.println(name);
		System.out.println(seibetu);
		System.out.println(age);
		System.out.println(uriage);
		System.out.println(rank);
	}

}

public class Main {

	public static void main(String[] args) {

		User user1 = new User();

		user1.input("名前",'男',20, 5000);
		user1.rank();
		user1.output();

	}

}

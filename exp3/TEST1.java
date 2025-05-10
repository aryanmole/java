import java.util.*;

class Student {
	int roll;
	Scanner sc = new Scanner(System.in);

	public void getroll() {
		System.out.println("Enter roll no=");
		roll = sc.nextInt();
	}

	public void setroll() {
		System.out.println("Roll no=" + roll);
	}
}

class Test extends Student {
	int sub1, sub2;

	public void getmarks() {
		System.out.println("Enter sub1 and sub2 marks=");
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
	}

	public void setmarks() {
		System.out.println("Sub1=" + sub1);
		System.out.println("Sub2=" + sub2);
	}
}

interface Sports {
	int smarks = 10;

	void display();
}

class Result extends Test implements Sports {
	int t;

	public void display() {
		System.out.println("Grace marks=" + smarks);
	}

	public int tot() {
		return t = sub1 + sub2 + smarks;
	}

	public void total() {
		System.out.println("Total marks=" + t);
	}
}

public class TEST1 {
	public static void main(String[] args) {
		Result r = new Result();

		r.getroll();
		r.setroll();

		r.getmarks();
		r.setmarks();

		r.display();
		r.tot();     // calculates total
		r.total();   // prints total
	}
}


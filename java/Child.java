// public class Parent {
//     public Parent() {
//         System.out.println("Parent Constructor");
//     }
//     public void run(){
//         System.out.println("parent run");
//     }
//     static {
//         System.out.println("Parent static block");
//     }
//     {
//         System.out.println("Parent initialisation  block");
//     }
// }

public class Child extends Parent {
	public void run() {
		System.out.println("child run");
	}

	{
		System.out.println("Child initialisation block");
	}
	static {
		System.out.println("Child static block");
	}

	public Child() {
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println();
		Child c = new Child();
		System.out.println();
		p.run();
	}
}

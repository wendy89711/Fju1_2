import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Write your name:");
		String name = scanner.next();
		System.out.println("Hey! "+name +",welcome to the Java world!");
		scanner.close();

	}

}

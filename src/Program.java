
/**
 * Note that Java console applications need to be run through the java runtime
 * by running "java -jar JarFile.jar" in the command line. Java console
 * applications can not be previewed in the Compilr IDE, only applets can.
 */
public class Program {
	/**
	 * This is the main entry point for the application
	 */

	public static void main(String args[]) {
		String result;
		System.out.println("Welcome to the Movie Store");
		Customer c1 = new Customer("joe");
		c1.addRental(new Rental(new Movie("movie1", 1), 10));
		c1.addRental(new Rental(new Movie("movie2", 2), 5));
		System.out.println("Let's get the Statement");
		result = c1.statement();
		System.out.println(result);
	}
}

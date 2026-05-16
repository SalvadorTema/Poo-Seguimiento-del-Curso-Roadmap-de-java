package type.casting;

public class Ejemplo {

	public static void main(String[] args) {
		typeCastingIntToDouble();
		typeCastingDoubleToInt();
		typeCastingIntToString();
		typeCastingStringToInt(); 
	}
	public static void typeCastingIntToDouble() {
		System.out.println("De entero a Double");
		
		 // create int type variable
		
	    int num = 50;

	    System.out.println("The integer value: " + num);

	    // convert into double type

	    double data = num;

	    System.out.println("The double value: " + data);
	}
	public static void typeCastingDoubleToInt() {
		System.out.println("\nDe Double a entero");
		
		   // create double type variable

	    double num = 50.55;

	    System.out.println("The double value: " + num);

	    // convert into int type

	    int data = (int)num;

	    System.out.println("The integer value: " + data);
	}
	public static void typeCastingIntToString() {
		System.out.println("\nDe Entero a String");
		
		 // create int type variable

	    int num = 50;

	    System.out.println("The integer value is: " + num);

	    // convert int to string type

	    String data = String.valueOf(num);

	    System.out.println("The string value is: " + data);
	}
	public static void typeCastingStringToInt() {
		System.out.println("\nDe String a Entero");
		
		 // create string type variable

	    String data = "50";

	    System.out.println("The string value is: " + data);

	    // convert string variable to int

	    int num = Integer.parseInt(data);

	    System.out.println("The integer value is: " + num);
	}

}

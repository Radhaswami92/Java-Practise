package AccessMoifiersConcept;

public class ClassBOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassAOperations obj = new ClassAOperations();
		obj.i = 123; // The variable I can be accessed because ClassAOperations is in the same
						// package and
						// the modifier is the default modifier
						// The variable i with default access modifier could not have been accessible
						// if the package would have been different for the current class.
						// If the package is diferent then the variable has to be public access modifier

		obj.SamplePrivateMethod();

		// This is throwing error because private method or variable is not accessible
		// outside the same class
		// It will remain inaccessible even if any class extends the private method
		// class

		obj.SampleProtectedMethod("Hello");

		// If the protected method or variable in a class is in the same package then we
		// can simply create object of the parent class and call the protected method or
		// variable but this is not applied to the class outside the package

	}

}

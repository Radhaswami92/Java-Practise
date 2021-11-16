package AccessMoifiersConcept;

public class ClassAOperations {

	int i = 0;

	public int count = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Once the method or variable declared as private, it cannot be accessed
	// outside the class .

	private void SamplePrivateMethod() {

		System.out.println("I am Private");

	}

	protected void SampleProtectedMethod(String s) {

		System.out.println("I am Protected");

	}

}

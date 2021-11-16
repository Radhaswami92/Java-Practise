package AccessModifierDiffPackage;

import AccessMoifiersConcept.ClassAOperations;

public class ClassXOperation extends ClassAOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassAOperations obj = new ClassAOperations();
		obj.i = 143; // It is throwing error because the modifer for the variable i in
						// ClassAOperations
						// is not marked as public OR the package has to be same for the current class

		obj.count = 456; // It is accessible because the modifier is public for the 'count' variabe

		obj.SamplePrivateMethod();

		// This is throwing error because private method or variable is not accessible
		// outside the same class

		obj.SampleProtectedMethod("sample");

		// This is throwing error because the protected member cannot be accessed in a
		// class belongs to other package by creating object of the parent class
		// It is possible only when the class in the other package inherit the parent or
		// the package has to be same for both the parent and child class
		// class by using extend keyword and then create object of the child class and
		// can be used to call the protected member. See the example below

		ClassXOperation child = new ClassXOperation();
		child.SampleProtectedMethod("sample");

		// It is not throwing error because the child class has inherited the property
		// of the parent class

	}

}

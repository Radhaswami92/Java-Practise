package Oopsconcept;

public class ChildAbstractClassConcept extends AbstractConceptClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChildAbstractClassConcept call=new ChildAbstractClassConcept();
		call.SeleniumWebDriver();
		call.makeProperty();
		call.WhichBrowser();
		
		
	//	AbstractConceptClass obj=new AbstractConceptClass();
		//It will throw an error because we cannot instantiate the abstract class
		
	}

	@Override
	public void WhichBrowser() {
		// TODO Auto-generated method stub
		System.out.println("I have successfully launched google chrome browser");
	}

}

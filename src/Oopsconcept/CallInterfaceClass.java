package Oopsconcept;

public class CallInterfaceClass implements SeleniumMainFunction,SeleniumMainInterface2{

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		SeleniumMainFunction object=new CallInterfaceClass();
		object.commonutiliies();
		object.launchbrowser();
		object.webdrivercall();
		
		CallInterfaceClass object2=new CallInterfaceClass();
		object2.login();
		
		SeleniumMainInterface2 object3=new CallInterfaceClass();
		object3.Takescreenshot();
		object3.takedatafromexcel();
		
		
		
	}

	@Override
	public void webdrivercall() {
		// TODO Auto-generated method stub
		
		System.out.println("I have successfully called the webdriver");
		
		
	}

	@Override
	public void launchbrowser() {
		// TODO Auto-generated method stub
		System.out.println("I have successfully launched the browser");
	}

	@Override
	public void commonutiliies() {
		// TODO Auto-generated method stub
		System.out.println("I have successfully called the common functions");
	}
	
	public void login() 
	{
		System.out.println("I have successfully logged in");	
		
	}

	@Override
	public void Takescreenshot() {
		// TODO Auto-generated method stub
		
		System.out.println("I have successfully takenscreenshot");
		
	}

	@Override
	public void takedatafromexcel() {
		// TODO Auto-generated method stub
		System.out.println("I have successfully taken data from excel");
	}

}

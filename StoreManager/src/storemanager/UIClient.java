package storemanager;

import service.Greeting;

public class UIClient {

	private Greeting greeting;

	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}

	public void start(){
		System.out.println(greeting.hi("¡ÿ»£"));
	}
}

package service.impl;

import service.Greeting;

public class GreetingImpl implements Greeting {

	@Override
	public String hi(String name) {
		return "hi " + name;
	}

}

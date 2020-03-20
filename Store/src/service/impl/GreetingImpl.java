package service.impl;

import service.Greeting;

public class GreetingImpl implements Greeting {

	@Override
	public String hi(String name) {
		return "hi " + name;
	}

	public void start(){
		System.out.println("GreetingImpl Bean을 만들었습니다.");
	}
}

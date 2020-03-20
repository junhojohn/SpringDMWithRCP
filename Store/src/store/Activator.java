package store;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import service.Greeting;
import service.impl.GreetingImpl;

/**
 * service.Greeting을 제공하는 Provider 클래스: Store							<br>
 */
public class Activator implements BundleActivator {

	/**
	 * Store 번들이 시작되면 불리는 콜백 메서드.			<br>
	 * 시작될 때 서비스에 service.Greeting을 등록한다. 	<br>
	 */
	public void start(BundleContext context) throws Exception {
		System.out.println("Store 번들을 가동 했습니다.");
		String className = Greeting.class.getName();
		context.registerService(className, new GreetingImpl(), null);
		System.out.println("GreetingImpl 객체를" + className + "으로 서비스 레지스트리에 등록했습니다.");
	}
	
	/**
	 * Store 번들이 멈추면 불리는 콜백 메서드.		<br>
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("Store 번들을 멈췄습니다.");
	}

}

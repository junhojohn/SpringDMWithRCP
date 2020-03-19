package storemanager;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import service.Greeting;
import service.impl.GreetingImpl;

public class Activator implements BundleActivator {

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		System.out.println("StoreManager 번들 가동했습니다.");
		Greeting greeting = new GreetingImpl();
		System.out.println(greeting.hi("준호"));
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("StoreManager 번들 멈춥니다.");
	}

}

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
		System.out.println("StoreManager ���� �����߽��ϴ�.");
		Greeting greeting = new GreetingImpl();
		System.out.println(greeting.hi("��ȣ"));
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("StoreManager ���� ����ϴ�.");
	}

}

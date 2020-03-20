package store;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import service.Greeting;
import service.impl.GreetingImpl;

/**
 * service.Greeting�� �����ϴ� Provider Ŭ����: Store							<br>
 */
public class Activator implements BundleActivator {

	/**
	 * Store ������ ���۵Ǹ� �Ҹ��� �ݹ� �޼���.			<br>
	 * ���۵� �� ���񽺿� service.Greeting�� ����Ѵ�. 	<br>
	 */
	public void start(BundleContext context) throws Exception {
		System.out.println("Store ������ ���� �߽��ϴ�.");
		String className = Greeting.class.getName();
		context.registerService(className, new GreetingImpl(), null);
		System.out.println("GreetingImpl ��ü��" + className + "���� ���� ������Ʈ���� ����߽��ϴ�.");
	}
	
	/**
	 * Store ������ ���߸� �Ҹ��� �ݹ� �޼���.		<br>
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("Store ������ ������ϴ�.");
	}

}

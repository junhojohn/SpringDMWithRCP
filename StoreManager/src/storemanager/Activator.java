package storemanager;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	
	public void start(BundleContext context) throws Exception {
        System.out.println("StoreMaganer ���� �����߽��ϴ�.");
	}
	
	public void stop(BundleContext context) throws Exception {
		System.out.println("StoreMaganer ���� ����ϴ�.");
	}
}






//public class Activator implements BundleActivator {
//	
//	/**
//	 * service.Greeting�� �Һ��ϴ� Client Ŭ����: StoreManager						<br>
//	 * export������ service.impl ��Ű�� �� GreetingImpl �ν��Ͻ� ������ �������� �� �� ����.			<br>
//	 * service ��Ű���� Greeting �������̽��� ���� ���� GreetingImpl �� �����ϴ� ���� �����ε�,		<br>
//	 * �̰��� �����Ϸ���, MANIFEST.MF�� runtime���� "org.osgi.util.tracker"�� import �ؾ� 	<br>
//	 * GreetingImpl ��ü�� context���� ���񽺸� ������ �� �ִ�.								<br>
//	 */
//	private ServiceTracker greetingServiceTracker;
//	
//	/**
//	 * org.osgi.util.tracker ��Ű���� ServiceTracker Ŭ������ Ȯ���� Ŭ����
//	 * @author junhojohn
//	 *
//	 */
//	public static class GreetingServiceTracker extends ServiceTracker{
//		
//		public GreetingServiceTracker(BundleContext context) {
//			super(context, Greeting.class.getName(), null);
//		}
//		
//		/**
//		 * service.Greeting�� �����ϴ� Store ������ ���۵ǰ� && ���񽺰� ��ϵǾ��� ���� �ݹ�ȴ�.
//		 */
//		public Object addingService(ServiceReference reference){
//			Greeting greeting = (Greeting)context.getService(reference);
//			System.out.println(greeting.hi("��ȣ"));
//			return greeting;
//		}
//	}
//	
//	/**
//	 * Store_1.0.0.jar ���� service��Ű���� ����(Export)��Ű�� StoreManager���� service�� �������� ��(Import)	<br>
//	 * Store ������ ACTIVE ���°� �� �� Ư�� ���񽺸� ����ϵ��� ��												<br>
//	 * export������ service.impl ��Ű�� �� GreetingImpl �ν��Ͻ� ������ �������� �� �� ����.							<br>
//	 * service ��Ű���� Greeting �������̽��� ���� ���� GreetingImpl �� �����ϴ� ���� �����ε�,						<br>
//	 * �̰��� �����Ϸ���, MANIFEST.MF�� runtime���� "org.osgi.util.tracker"�� import �ؾ� 					<br>
//	 * GreetingImpl ��ü�� context���� ���񽺸� ������ �� �ִ�.
//	 */
//	public void start(BundleContext context) throws Exception {
//        System.out.println("StoreMaganer ���� �����߽��ϴ�.");
//        greetingServiceTracker = new GreetingServiceTracker(context);
//        greetingServiceTracker.open();
//	}
//	
//	/**
//	 * Store_1.0.0.jar ���� service��Ű���� ����(Export)��Ű�� StoreManager���� service�� �������� ��(Import)
//	 */
//	public void stop(BundleContext context) throws Exception {
//		System.out.println("StoreMaganer ���� ����ϴ�.");
//		greetingServiceTracker.close();
//		greetingServiceTracker = null;
//		System.out.println("Service Tracker �ݽ��ϴ�.");
//	}
//}






///**
// * Store_1.0.0.jar ���� service��Ű���� service.impl��Ű�� �Ѵ� ����(Export) ��Ű�� StoreManager���� �Ѵ� �������� ��(Import)
// */
//public class Activator implements BundleActivator {
//
//	/**
//	 * Store_1.0.0.jar ���� service��Ű���� service.impl��Ű�� �Ѵ� ����(Export) ��Ű�� StoreManager���� �Ѵ� �������� ��(Import)
//	 */
//	public void start(BundleContext context) throws Exception {
//        System.out.println("StoreMaganer ���� �����߽��ϴ�.");
//        Greeting greeting = new GreetingImpl();
//        System.out.println(greeting.hi("�⼱"));
//	}
//	
//	/**
//	 * Store_1.0.0.jar ���� service��Ű���� service.impl��Ű�� �Ѵ� ����(Export) ��Ű�� StoreManager���� �Ѵ� �������� ��(Import)
//	 */
//	public void stop(BundleContext context) throws Exception {
//		System.out.println("StoreMaganer ���� ����ϴ�.");
//	}
//
//}

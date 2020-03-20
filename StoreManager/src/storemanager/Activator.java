package storemanager;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	
	public void start(BundleContext context) throws Exception {
        System.out.println("StoreMaganer 번들 가동했습니다.");
	}
	
	public void stop(BundleContext context) throws Exception {
		System.out.println("StoreMaganer 번들 멈춥니다.");
	}
}






//public class Activator implements BundleActivator {
//	
//	/**
//	 * service.Greeting을 소비하는 Client 클래스: StoreManager						<br>
//	 * export제외한 service.impl 패키지 내 GreetingImpl 인스턴스 생성은 컴파일을 할 수 없다.			<br>
//	 * service 패키지의 Greeting 인터페이스만 노출 시켜 GreetingImpl 에 접근하는 것이 목적인데,		<br>
//	 * 이것이 가능하려면, MANIFEST.MF의 runtime에서 "org.osgi.util.tracker"를 import 해야 	<br>
//	 * GreetingImpl 객체를 context에서 서비스를 가져올 수 있다.								<br>
//	 */
//	private ServiceTracker greetingServiceTracker;
//	
//	/**
//	 * org.osgi.util.tracker 패키지의 ServiceTracker 클래스를 확장한 클래스
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
//		 * service.Greeting을 제공하는 Store 번들이 시작되고 && 서비스가 등록되었을 때만 콜백된다.
//		 */
//		public Object addingService(ServiceReference reference){
//			Greeting greeting = (Greeting)context.getService(reference);
//			System.out.println(greeting.hi("준호"));
//			return greeting;
//		}
//	}
//	
//	/**
//	 * Store_1.0.0.jar 에서 service패키지만 노출(Export)시키고 StoreManager에서 service만 가져왔을 때(Import)	<br>
//	 * Store 번들이 ACTIVE 상태가 될 때 특정 서비스를 등록하도록 함												<br>
//	 * export제외한 service.impl 패키지 내 GreetingImpl 인스턴스 생성은 컴파일을 할 수 없다.							<br>
//	 * service 패키지의 Greeting 인터페이스만 노출 시켜 GreetingImpl 에 접근하는 것이 목적인데,						<br>
//	 * 이것이 가능하려면, MANIFEST.MF의 runtime에서 "org.osgi.util.tracker"를 import 해야 					<br>
//	 * GreetingImpl 객체를 context에서 서비스를 가져올 수 있다.
//	 */
//	public void start(BundleContext context) throws Exception {
//        System.out.println("StoreMaganer 번들 가동했습니다.");
//        greetingServiceTracker = new GreetingServiceTracker(context);
//        greetingServiceTracker.open();
//	}
//	
//	/**
//	 * Store_1.0.0.jar 에서 service패키지만 노출(Export)시키고 StoreManager에서 service만 가져왔을 때(Import)
//	 */
//	public void stop(BundleContext context) throws Exception {
//		System.out.println("StoreMaganer 번들 멈춥니다.");
//		greetingServiceTracker.close();
//		greetingServiceTracker = null;
//		System.out.println("Service Tracker 닫습니다.");
//	}
//}






///**
// * Store_1.0.0.jar 에서 service패키지와 service.impl패키지 둘다 노출(Export) 시키고 StoreManager에서 둘다 가져왔을 때(Import)
// */
//public class Activator implements BundleActivator {
//
//	/**
//	 * Store_1.0.0.jar 에서 service패키지와 service.impl패키지 둘다 노출(Export) 시키고 StoreManager에서 둘다 가져왔을 때(Import)
//	 */
//	public void start(BundleContext context) throws Exception {
//        System.out.println("StoreMaganer 번들 가동했습니다.");
//        Greeting greeting = new GreetingImpl();
//        System.out.println(greeting.hi("기선"));
//	}
//	
//	/**
//	 * Store_1.0.0.jar 에서 service패키지와 service.impl패키지 둘다 노출(Export) 시키고 StoreManager에서 둘다 가져왔을 때(Import)
//	 */
//	public void stop(BundleContext context) throws Exception {
//		System.out.println("StoreMaganer 번들 멈춥니다.");
//	}
//
//}

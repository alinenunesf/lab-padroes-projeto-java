package one.digitalinnovation.gof.sigleton;


/** Singleton "Lazy Holder"
 * 
 * @author alinenunesf
 */
public class SingletonLazyHolder {

	private static class InstanceHolder {
		private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}

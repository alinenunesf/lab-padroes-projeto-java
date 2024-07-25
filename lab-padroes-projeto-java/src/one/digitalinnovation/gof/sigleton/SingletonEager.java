package one.digitalinnovation.gof.sigleton;

/** Singleton "apressado".
 * 
 * @author alinenunesf
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
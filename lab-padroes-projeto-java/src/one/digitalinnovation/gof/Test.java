package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.sigleton.SingletonEager;
import one.digitalinnovation.gof.sigleton.SingletonLazy;
import one.digitalinnovation.gof.sigleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Robo;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;

public class Test {
	
	public static void main(String[] args) {
		
		// Testes relacionados ao Design Pattern Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		
		robo.setComportamento(defensivo);
		robo.mover();
		
		robo.setComportamento(agressivo);
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Aline", "50763680");
		
	}
}

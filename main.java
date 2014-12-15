/**
 * 
 */
package fr.letzner.patterns;

import fr.letzner.patterns.businessDelegate.TestBusinessDelegate;
import fr.letzner.patterns.compositeEntity.TestCompositeEntity;
import fr.letzner.patterns.dataAccessObject.TestDataAccessObject;
import fr.letzner.patterns.frontController.TestFrontController;
import fr.letzner.patterns.gof.behavioral.chainOfResponsibility.TestChainOfResponsibility;
import fr.letzner.patterns.gof.behavioral.command.TestCommand;
import fr.letzner.patterns.gof.behavioral.interpreter.TestInterpreter;
import fr.letzner.patterns.gof.behavioral.iterator.TestIterator;
import fr.letzner.patterns.gof.behavioral.mediator.TestMediator;
import fr.letzner.patterns.gof.behavioral.memento.TestMemento;
import fr.letzner.patterns.gof.behavioral.nullObject.TestNullObject;
import fr.letzner.patterns.gof.behavioral.observer.TestObserver;
import fr.letzner.patterns.gof.behavioral.state.TestState;
import fr.letzner.patterns.gof.behavioral.strategy.TestStrategy;
import fr.letzner.patterns.gof.behavioral.template.TestTemplate;
import fr.letzner.patterns.gof.behavioral.visitor.TestVisitor;
import fr.letzner.patterns.gof.creational.builder.TestBuilder;
import fr.letzner.patterns.gof.creational.factory.TestFactory;
import fr.letzner.patterns.gof.creational.prototype.TestPrototype;
import fr.letzner.patterns.gof.creational.singleton.SingleObject;
import fr.letzner.patterns.gof.structural.adapter.TestAdapter;
import fr.letzner.patterns.gof.structural.bridge.TestBridge;
import fr.letzner.patterns.gof.structural.composite.TestComposite;
import fr.letzner.patterns.gof.structural.decorator.TestDecorator;
import fr.letzner.patterns.gof.structural.facade.TestFacade;
import fr.letzner.patterns.gof.structural.filter.TestFilter;
import fr.letzner.patterns.gof.structural.flyWeight.TestFlyWeight;
import fr.letzner.patterns.gof.structural.proxy.TestProxy;
import fr.letzner.patterns.interceptingFilter.TestInterceptiongFilter;
import fr.letzner.patterns.mvc.TestMvc;
import fr.letzner.patterns.serviceLocator.TestServiceLocator;
import fr.letzner.patterns.transferObject.TestTransferObject;



/**
 * @author Stefan Letzner
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 1. Factory
		System.out.println("\n--> Creational --> Factory");
		TestFactory.test();
		
		// 2. Singleton
		System.out.println("\n--> Creational --> Singleton");
		SingleObject.getInstance().showMessage();
		
		// 3. Builder
		System.out.println("\n--> Creational --> Builder");
		TestBuilder.test();
		
		// 4. Prototype
		System.out.println("\n--> Creational --> Prototype");
		TestPrototype.test();
		
		// 5. Adapter
		System.out.println("\n--> Structural --> Adapter");
		TestAdapter.test();
		
		// 6. Bridge
		System.out.println("\n--> Structural --> Bridge");
		TestBridge.test();
		
		// 7. Filter
		System.out.println("\n--> Structural --> Filter");
		TestFilter.test();
		
		// 8. Composite
		System.out.println("\n--> Structural --> Composite");
		TestComposite.test();
		
		// 9. Decorator
		System.out.println("\n--> Structural --> Decorator");
		TestDecorator.test();
		
		// 10. Facade
		System.out.println("\n--> Structural --> Facade");
		TestFacade.test();
		
		// 11. Fly Weight
		System.out.println("\n--> Structural --> Fly Weight");
		TestFlyWeight.test();
		
		// 12. Proxy
		System.out.println("\n--> Structural --> Proxy");
		TestProxy.test();
		
		// 13. Chain of responsibility
		System.out.println("\n--> Behavioral --> Chain of responsibility");
		TestChainOfResponsibility.test();
		
		// 14. Command
		System.out.println("\n--> Behavioral --> Command");
		TestCommand.test();
		
		// 15. Interpreter
		System.out.println("\n--> Behavioral --> Interpreter");
		TestInterpreter.test();
		
		// 16. Iterator
		System.out.println("\n--> Behavioral --> Iterator");
		TestIterator.test();
		
		// 17. Mediator
		System.out.println("\n--> Behavioral --> Mediator");
		TestMediator.test();
		
		// 18. Memento
		System.out.println("\n--> Behavioral --> Memento");
		TestMemento.test();
		
		// 19. Observer
		System.out.println("\n--> Behavioral --> Observer");
		TestObserver.test();
		
		// 20. State
		System.out.println("\n--> Behavioral --> State");
		TestState.test();
		
		// 21. Null object
		System.out.println("\n--> Behavioral --> Null Object");
		TestNullObject.test();
		
		// 22. Strategy
		System.out.println("\n--> Behavioral --> Strategy");
		TestStrategy.test();
		
		// 23. Template
		System.out.println("\n--> Behavioral --> Template");
		TestTemplate.test();
		
		// 24. Visitor
		System.out.println("\n--> Behavioral --> Visitor");
		TestVisitor.test();
		
		// 25. MVC
		System.out.println("\n--> MVC");
		TestMvc.test();
		
		// 26. Business Delegate
		System.out.println("\n--> Business Delegate");
		TestBusinessDelegate.test();
		
		// 27. Composite Entity
		System.out.println("\n--> Composite Entity");
		TestCompositeEntity.test();
		
		// 28. Composite Entity
		System.out.println("\n--> Data Access Object");
		TestDataAccessObject.test();
		
		// 28. Front Controller
		System.out.println("\n--> Front Controller");
		TestFrontController.test();
		
		// 29. Interceptiong Filter
		System.out.println("\n--> Interceptiong Filter");
		TestInterceptiongFilter.test();
		
		// 30. Service Locator
		System.out.println("\n--> Service Locator");
		TestServiceLocator.test();
		
		// 31. Transfer Object
		System.out.println("\n--> Transfer Object");
		TestTransferObject.test();
	}

}

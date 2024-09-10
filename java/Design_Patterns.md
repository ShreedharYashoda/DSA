The Gang of Four (GoF) design patterns are a set of 23 design patterns that were introduced by Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides in their seminal book "Design Patterns: Elements of Reusable Object-Oriented Software". These patterns are divided into three categories: Creational, Structural, and Behavioral. They provide proven solutions to common software design problems and promote best practices in object-oriented design.

### Creational Patterns
Creational patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.

1. **Singleton**
   Ensures a class has only one instance and provides a global point of access to it.
   ```java
   public class Singleton {
	   private static Singleton instance;
	   private Singleton() {}
	   public static Singleton getInstance() {
		   if (instance == null) {
			   instance = new Singleton();
		   }
		   return instance;
	   }
   }
   ```

2. **Factory Method**
   Defines an interface for creating an object, but lets subclasses alter the type of objects that will be created.
   ```java
   public abstract class Creator {
	   public abstract Product factoryMethod();
   }
   public class ConcreteCreator extends Creator {
	   @Override
	   public Product factoryMethod() {
		   return new ConcreteProduct();
	   }
   }
   ```

3. **Abstract Factory**
   Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
   ```java
   public interface GUIFactory {
	   Button createButton();
	   Checkbox createCheckbox();
   }
   public class WinFactory implements GUIFactory {
	   public Button createButton() {
		   return new WinButton();
	   }
	   public Checkbox createCheckbox() {
		   return new WinCheckbox();
	   }
   }
   ```

4. **Builder**
   Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
   ```java
   public class Product {
	   private String partA;
	   private String partB;
	   // getters and setters
   }
   public interface Builder {
	   void buildPartA();
	   void buildPartB();
	   Product getResult();
   }
   public class ConcreteBuilder implements Builder {
	   private Product product = new Product();
	   public void buildPartA() {
		   product.setPartA("PartA");
	   }
	   public void buildPartB() {
		   product.setPartB("PartB");
	   }
	   public Product getResult() {
		   return product;
	   }
   }
   ```

5. **Prototype**
   Specifies the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.
   ```java
   public abstract class Prototype implements Cloneable {
	   public Prototype clone() throws CloneNotSupportedException {
		   return (Prototype) super.clone();
	   }
   }
   public class ConcretePrototype extends Prototype {
	   private String field;
	   // getters and setters
   }
   ```

### Structural Patterns
Structural patterns deal with object composition, typically identifying simple ways to realize relationships between different objects.

1. **Adapter**
   Converts the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
   ```java
   public interface Target {
	   void request();
   }
   public class Adaptee {
	   public void specificRequest() {
		   // implementation
	   }
   }
   public class Adapter implements Target {
	   private Adaptee adaptee;
	   public Adapter(Adaptee adaptee) {
		   this.adaptee = adaptee;
	   }
	   public void request() {
		   adaptee.specificRequest();
	   }
   }
   ```

2. **Bridge**
   Decouples an abstraction from its implementation so that the two can vary independently.
   ```java
   public interface Implementor {
	   void operationImpl();
   }
   public class ConcreteImplementorA implements Implementor {
	   public void operationImpl() {
		   // implementation
	   }
   }
   public abstract class Abstraction {
	   protected Implementor implementor;
	   public Abstraction(Implementor implementor) {
		   this.implementor = implementor;
	   }
	   public abstract void operation();
   }
   public class RefinedAbstraction extends Abstraction {
	   public RefinedAbstraction(Implementor implementor) {
		   super(implementor);
	   }
	   public void operation() {
		   implementor.operationImpl();
	   }
   }
   ```

3. **Composite**
   Composes objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.
   ```java
   public interface Component {
	   void operation();
   }
   public class Leaf implements Component {
	   public void operation() {
		   // implementation
	   }
   }
   public class Composite implements Component {
	   private List<Component> children = new ArrayList<>();
	   public void add(Component component) {
		   children.add(component);
	   }
	   public void operation() {
		   for (Component component : children) {
			   component.operation();
		   }
	   }
   }
   ```

4. **Decorator**
   Attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
   ```java
   public interface Component {
	   void operation();
   }
   public class ConcreteComponent implements Component {
	   public void operation() {
		   // implementation
	   }
   }
   public class Decorator implements Component {
	   protected Component component;
	   public Decorator(Component component) {
		   this.component = component;
	   }
	   public void operation() {
		   component.operation();
	   }
   }
   public class ConcreteDecorator extends Decorator {
	   public ConcreteDecorator(Component component) {
		   super(component);
	   }
	   public void operation() {
		   super.operation();
		   // additional functionality
	   }
   }
   ```

5. **Facade**
   Provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
   ```java
   public class Subsystem1 {
	   public void operation1() {
		   // implementation
	   }
   }
   public class Subsystem2 {
	   public void operation2() {
		   // implementation
	   }
   }
   public class Facade {
	   private Subsystem1 subsystem1;
	   private Subsystem2 subsystem2;
	   public Facade() {
		   subsystem1 = new Subsystem1();
		   subsystem2 = new Subsystem2();
	   }
	   public void operation() {
		   subsystem1.operation1();
		   subsystem2.operation2();
	   }
   }
   ```

6. **Flyweight**
   Uses sharing to support large numbers of fine-grained objects efficiently.
   ```java
   public interface Flyweight {
	   void operation(String extrinsicState);
   }
   public class ConcreteFlyweight implements Flyweight {
	   public void operation(String extrinsicState) {
		   // implementation
	   }
   }
   public class FlyweightFactory {
	   private Map<String, Flyweight> flyweights = new HashMap<>();
	   public Flyweight getFlyweight(String key) {
		   if (!flyweights.containsKey(key)) {
			   flyweights.put(key, new ConcreteFlyweight());
		   }
		   return flyweights.get(key);
	   }
   }
   ```

7. **Proxy**
   Provides a surrogate or placeholder for another object to control access to it.
   ```java
   public interface Subject {
	   void request();
   }
   public class RealSubject implements Subject {
	   public void request() {
		   // implementation
	   }
   }
   public class Proxy implements Subject {
	   private RealSubject realSubject;
	   public void request() {
		   if (realSubject == null) {
			   realSubject = new RealSubject();
		   }
		   realSubject.request();
	   }
   }
   ```

### Behavioral Patterns
Behavioral patterns are concerned with algorithms and the assignment of responsibilities between objects.

1. **Chain of Responsibility**
   Avoids coupling the sender of a request to its receiver by giving more than one object a chance to handle the request.
   ```java
   public abstract class Handler {
	   protected Handler successor;
	   public void setSuccessor(Handler successor) {
		   this.successor = successor;
	   }
	   public abstract void handleRequest(Request request);
   }
   public class ConcreteHandler1 extends Handler {
	   public void handleRequest(Request request) {
		   if (request.getType().equals("Type1")) {
			   // handle request
		   } else if (successor != null) {
			   successor.handleRequest(request);
		   }
	   }
   }
   ```

2. **Command**
   Encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations.
   ```java
   public interface Command {
	   void execute();
   }
   public class ConcreteCommand implements Command {
	   private Receiver receiver;
	   public ConcreteCommand(Receiver receiver) {
		   this.receiver = receiver;
	   }
	   public void execute() {
		   receiver.action();
	   }
   }
   public class Receiver {
	   public void action() {
		   // implementation
	   }
   }
   ```

3. **Interpreter**
   Given a language, defines a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.
   ```java
   public interface Expression {
	   int interpret();
   }
   public class Number implements Expression {
	   private int number;
	   public Number(int number) {
		   this.number = number;
	   }
	   public int interpret() {
		   return number;
	   }
   }
   ```

4. **Iterator**
   Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
   ```java
   public interface Iterator {
	   boolean hasNext();
	   Object next();
   }
   public interface Aggregate {
	   Iterator createIterator();
   }
   public class ConcreteAggregate implements Aggregate {
	   private List<Object> items = new ArrayList<>();
	   public Iterator createIterator() {
		   return new ConcreteIterator(items);
	   }


   }
   ```

5. **Mediator**
   Defines an object that encapsulates how a set of objects interact.
   ```java
   public interface Mediator {
	   void notify(Component sender, String event);
   }
   public class ConcreteMediator implements Mediator {
	   private Component1 component1;
	   private Component2 component2;
	   public void setComponent1(Component1 component1) {
		   this.component1 = component1;
	   }
	   public void setComponent2(Component2 component2) {
		   this.component2 = component2;
	   }
	   public void notify(Component sender, String event) {
		   if (sender == component1 && event.equals("A")) {
			   component2.doSomething();
		   }
	   }
   }
   ```

6. **Memento**
   Without violating encapsulation, captures and externalizes an object's internal state so that the object can be restored to this state later.
   ```java
   public class Memento {
	   private String state;
	   public Memento(String state) {
		   this.state = state;
	   }
	   public String getState() {
		   return state;
	   }
   }
   public class Originator {
	   private String state;
	   public void setState(String state) {
		   this.state = state;
	   }
	   public Memento saveStateToMemento() {
		   return new Memento(state);
	   }
	   public void getStateFromMemento(Memento memento) {
		   state = memento.getState();
	   }
   }
   ```

7. **Observer**
   Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
   ```java
   public interface Observer {
	   void update();
   }
   public interface Subject {
	   void attach(Observer observer);
	   void detach(Observer observer);
	   void notifyObservers();
   }
   public class ConcreteSubject implements Subject {
	   private List<Observer> observers = new ArrayList<>();
	   public void attach(Observer observer) {
		   observers.add(observer);
	   }
	   public void detach(Observer observer) {
		   observers.remove(observer);
	   }
	   public void notifyObservers() {
		   for (Observer observer : observers) {
			   observer.update();
		   }
	   }
   }
   ```

8. **State**
   Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.
   ```java
   public interface State {
	   void handle(Context context);
   }
   public class ConcreteStateA implements State {
	   public void handle(Context context) {
		   context.setState(new ConcreteStateB());
	   }
   }
   public class ConcreteStateB implements State {
	   public void handle(Context context) {
		   context.setState(new ConcreteStateA());
	   }
   }
   public class Context {
	   private State state;
	   public Context(State state) {
		   this.state = state;
	   }
	   public void setState(State state) {
		   this.state = state;
	   }
	   public void request() {
		   state.handle(this);
	   }
   }
   ```

9. **Strategy**
   Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
   ```java
   public interface Strategy {
	   void execute();
   }
   public class ConcreteStrategyA implements Strategy {
	   public void execute() {
		   // implementation
	   }
   }
   public class ConcreteStrategyB implements Strategy {
	   public void execute() {
		   // implementation
	   }
   }
   public class Context {
	   private Strategy strategy;
	   public Context(Strategy strategy) {
		   this.strategy = strategy;
	   }
	   public void setStrategy(Strategy strategy) {
		   this.strategy = strategy;
	   }
	   public void executeStrategy() {
		   strategy.execute();
	   }
   }
   ```

10. **Template Method**
	Defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
	```java
	public abstract class AbstractClass {
		public final void templateMethod() {
			stepOne();
			stepTwo();
			stepThree();
		}
		protected abstract void stepOne();
		protected abstract void stepTwo();
		protected void stepThree() {
			// default implementation
		}
	}
	public class ConcreteClass extends AbstractClass {
		protected void stepOne() {
			// implementation
		}
		protected void stepTwo() {
			// implementation
		}
	}
	```

11. **Visitor**
	Represents an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.
	```java
	public interface Visitor {
		void visitConcreteElementA(ConcreteElementA element);
		void visitConcreteElementB(ConcreteElementB element);
	}
	public class ConcreteVisitor implements Visitor {
		public void visitConcreteElementA(ConcreteElementA element) {
			// implementation
		}
		public void visitConcreteElementB(ConcreteElementB element) {
			// implementation
		}
	}
	public interface Element {
		void accept(Visitor visitor);
	}
	public class ConcreteElementA implements Element {
		public void accept(Visitor visitor) {
			visitor.visitConcreteElementA(this);
		}
	}
	public class ConcreteElementB implements Element {
		public void accept(Visitor visitor) {
			visitor.visitConcreteElementB(this);
		}
	}
	```

These patterns are widely recognized and used in software engineering to solve common design problems and to make code more flexible, reusable, and maintainable. Each pattern describes a problem, a solution, and the consequences of the solution.
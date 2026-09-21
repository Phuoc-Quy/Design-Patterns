interface AbstractFactory {
  AbstractProductA createProductA();
  AbstractProductB createProductB();
}

class ConcreteFactory1 implements AbstractFactory {

  @Override
  AbstractProductA createProductA() {
    return new ConcreteProductA1();
  }

  @Override
  AbstractProductB createProductB() {
    return new ConcreteProductB1();
  }

}

class ConcreteFactory2 implements AbstractFactory {

    @Override
    AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }
    
    @Override
    AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
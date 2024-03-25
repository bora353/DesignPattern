package org.example.template;

abstract class AbstractClass {
    
    final void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
        hook();
    }

    private void concreteOperation() {
        // concreteOperation() 메서드 코드
    }

    abstract void primitiveOperation1();
    abstract void primitiveOperation2();

    void hook(){}
}

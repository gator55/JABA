package com.ciklum.javatrain.observer;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 8/2/13
 * Time: 5:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyEvent<T> {
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    MyEvent(T object) {
        setObject(object);
    }

/*    private Operation operation;

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public MyEvent(Operation operation) {
        setOperation(operation);
    }*/
}

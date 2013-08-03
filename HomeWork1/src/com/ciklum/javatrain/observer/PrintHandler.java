package com.ciklum.javatrain.observer;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 8/2/13
 * Time: 4:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrintHandler<T> implements MyHandler<T> {
    public T getO() {
        return o;
    }

    public void setO(T o) {
        this.o = o;
    }

    private T o;

    @Override
    public Class<T> getType() {
        return (Class<T>) getO().getClass();
    }

    @Override
    public void handle(MyEvent event) {
        //Operation operation = event.getOperation();

        //System.out.print("operation: " + operation);
        System.out.println("ph");
    }

    PrintHandler(T object){
        setO(object);
    }
}

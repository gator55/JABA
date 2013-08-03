package com.ciklum.javatrain.observer;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 8/2/13
 * Time: 4:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrintHandler implements MyHandler {
    public Class getType() {
        return this.getClass();
    }

    @Override
    public void handle(MyEvent event) {
        Operation operation = event.getOperation();

        System.out.println("operation: " + operation);
    }
}

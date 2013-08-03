package com.ciklum.javatrain.observer;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 8/2/13
 * Time: 4:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrintUserHandler implements MyHandler<User> {
    @Override
    public Class<User> getType() {
        return User.class;
    }

    @Override
    public void handle(MyEvent event) {
        //Operation operation = event.getOperation();

        //System.out.print("operation: " + operation);
        System.out.print("printUserHandler");
        System.out.println();
    }
}

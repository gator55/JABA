package com.ciklum.javatrain.observer;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 8/3/13
 * Time: 11:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrintLnUserHandler implements MyHandler<User> {

    @Override
    public Class<User> getType() {
        return User.class;
    }

    @Override
    public void handle(MyEvent event) {
        User user = (User) event.getObject();
        System.out.println("Handler, " + user.getUsername());
    }
}

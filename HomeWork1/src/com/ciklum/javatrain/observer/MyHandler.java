package com.ciklum.javatrain.observer;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 8/2/13
 * Time: 3:39 PM
 * To change this template use File | Settings | File Templates.
 */
public interface MyHandler<T> {
    void handle(MyEvent<T> event);

    Class<T> getType();
}

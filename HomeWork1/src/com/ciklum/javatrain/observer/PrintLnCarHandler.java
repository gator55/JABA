package com.ciklum.javatrain.observer;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 8/7/13
 * Time: 12:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrintLnCarHandler implements MyHandler<Car> {

    @Override
    public Class<Car> getType() {
        return Car.class;
    }

    @Override
    public void handle(MyEvent event) {
        Car car = (Car) event.getObject();
        System.out.println("Handler, " + car.getModel());
    }
}

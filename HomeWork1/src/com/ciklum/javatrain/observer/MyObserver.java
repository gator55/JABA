package com.ciklum.javatrain.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 8/2/13
 * Time: 3:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyObserver {
    private Map<Class, List<MyHandler>> handlers = new HashMap();

    public void subscribe(MyHandler handler) {
        List<MyHandler> handlersList = handlers.get(handler.getType());
        System.out.println(handler.getType());
        if (handlersList == null) {
            handlersList = new ArrayList<MyHandler>();
            handlers.put(handler.getType(), handlersList);
        }
        handlersList.add(handler);
    }

    public void fireEvent(MyEvent event) {
        Class type = event.getObject().getClass();
        System.out.println(type);

        List<MyHandler> handlersList = handlers.get(type);
        if (handlersList != null) {
            System.out.println("fireEvent");
            for (MyHandler handler : handlersList) {
                handler.handle(event);
            }
        }
    }
}

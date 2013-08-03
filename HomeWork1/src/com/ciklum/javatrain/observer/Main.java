package com.ciklum.javatrain.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 8/2/13
 * Time: 3:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        String name = "user1";
        MyObserver observer = new MyObserver();
        MyHandler printUserHandler = new PrintUserHandler();
        observer.subscribe(printUserHandler);

        MyHandler printLnUserHandler = new PrintLnUserHandler();
        observer.subscribe(printLnUserHandler);

        System.out.println("Please enter your name:");
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            name = bufferRead.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        User user1 = new User();
        user1.setName(name);

        MyEvent<User> event = new MyEvent<User>(user1);
        observer.fireEvent(event);

    }
}

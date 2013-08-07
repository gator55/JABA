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
        String email = "test@test.net";

        MyObserver observer = new MyObserver();

        MyHandler printLnUserHandler = new PrintLnUserHandler();
        observer.subscribe(printLnUserHandler);

        //String username = "piven.oleg@gmail.com";
        //String password = "***";
        String username = request("Please enter username for smtp authentication:");
        String password = request("Please enter password for smtp authentication:");

        MyHandler sendMailHandler = new SendMailHandler(username, password);
        observer.subscribe(sendMailHandler);

        name = request("Please enter your name:");
        email = request("Please enter your email:");

        User user1 = new User();
        user1.setUsername(name);
        user1.setEmail(email);

        MyEvent<User> event = new MyEvent<User>(user1);
        observer.fireEvent(event);


        MyHandler printLnCarHandler = new PrintLnCarHandler();
        observer.subscribe(printLnCarHandler);
        Car car = new Car();
        car.setModel("Ferrari");
        MyEvent<Car> eventCar = new MyEvent<Car>(car);
        observer.fireEvent(eventCar);

    }

    private static String request(String msg){
        System.out.println(msg);
        String s = null;

        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            s = bufferRead.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}

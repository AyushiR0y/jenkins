// App.java (feature/greeting-update branch)
package org.example;

public class App {
    public String getGreeting() {
        return "Greetings from the Feature Branch!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}

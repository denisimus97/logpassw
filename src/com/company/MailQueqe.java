package com.company;
import java.util.LinkedList;

public class MailQueqe {
    private LinkedList<Human> queue;

    public MailQueqe() {
        this.queue = new LinkedList<>();
    }

    public void offer(Human human) {
        if (human.isPensioner()) {
            queue.addFirst(human);
        } else {
            queue.addLast(human);
        }
    }

    public Human peek() {
        if (queue.size() > 0)
            return queue.getFirst();

        return null;
    }

    public Human pool() {
        Human temp = null;
        if (queue.size() > 0) {
            temp = queue.getFirst();
            queue.removeFirst();
        }

        return temp;
    }
}

class Human {
    private String name;
    private int age;
    private static int PENSIONER_AGE = 65;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isPensioner() {
        return age > PENSIONER_AGE;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

package com.company;

public class Main {
    public static void main(String[] args) {
        MailQueqe a = new MailQueqe();

        a.offer(new Human("Kot", 58));
        a.offer(new Human("Vlad", 11));
        a.offer(new Human("Pensioner 1", 708));
        a.offer(new Human("Den", 18));
        a.offer(new Human("Pensioner 2", 78));
        a.offer(new Human("Pensioner 3", 783));

        Human temp;
        while ((temp = a.pool()) != null) {
            System.out.println(temp.getName());
        }

    }
}

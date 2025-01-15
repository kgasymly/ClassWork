package ru.itis403;
import java.util.Random;

public class MainDynamicLinckedList {
    public static void main(String[] args) {
        /*
         *
         * 1. Построить динамический связный список из 30 случайных элементов, вывести 17
         * */

        Node first = new Node(5);
        Node current = first;
        System.out.println("17-ые элементы: ");
        for(int i = 1; i < 30; i++) {
            Random random = new Random();
            add(first, random.nextInt(100));
        }
        for(int i = 0; i < 16; i++) {
            current = current.next;
        }
        System.out.println(current.value);

        current = first;

        System.out.println("Содержимое списка: ");

        for(int i = 0; i < 30; i++) {
            System.out.print(current.value + " ");
            current = current.next;
        }

        System.out.println();
        System.out.println("Обратное содержимое списка: ");
        int countCheck = -1;
        for(int i = 0; i < 30; i++) {
            current = first;
            countCheck++;
            for(int j = 0; j < 30; j++) {
                current = current.next;
                if(j == 28-countCheck) {
                    System.out.print(current.value + " ");
                }
            }
        }
        System.out.print(" " + first.value);
//        current = first;
//        printReverse(current);
    }

    public static Node findLast(Node first) {
        Node current = first;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    public static void add(Node first, int value) {
        Node last = findLast(first);
        Node newElem = new Node(value);

        last.next = newElem;
    }

    public static void printReverse(Node node) {
        if (node == null) {
            return;
        }

        printReverse(node.next);
        System.out.print(node.value + " ");
    }

}
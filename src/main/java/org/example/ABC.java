package org.example;

public class ABC {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.a();
        b.b();
        c.c();

        C c2 = new C();

        c2.a();
        c2.b();
        c2.c();
    }
}
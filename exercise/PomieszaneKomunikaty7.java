package exercise;

class A {
    int izm = 7;

    void m1()   {
        System.out.println("A - m1, ");
    }
    void m2()   {
        System.out.println("A - m2, ");
    }
    void m3()   {
        System.out.println("A - m3, ");
    }
}
class B extends A   {
    void m1() {
        System.out.println("B - m1, ");
    }
}
class C extends B   {
    @Override
    void m3() {
        System.out.println("C - m3, " + (izm + 6));
    }
}
public class PomieszaneKomunikaty7 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
        a2.m1();
        a2.m2();
        a2.m3();
    }
}


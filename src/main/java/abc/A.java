package abc;

class A {

    String s ="-";

    protected A() {
        this("d");
        s += "a";
    }

    private A(String e) {
        super();
        s += "d";
    }
}

class B extends A {

    B() {
        super();
        s += "b";
    }
}

class C extends B {
    C() {
        super();
        s += "c";
    }

    public static void main(String... boo) {
        System.out.println(new C().s);
    }
}
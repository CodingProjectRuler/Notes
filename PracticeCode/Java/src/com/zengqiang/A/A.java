package com.zengqiang.A;

public class A extends A1 {
    public static A getInstance() {return new A2();}
    public void a() {}
}

//对于 class的类，包外根本不能看到A1这个类型，所以不能访问任何成员，包括static成员
//可用通过继承一个public类或者被继承来实现访问
class A1 {
    public static int a = 1;

    public void a1() {
        System.out.println("i am a1 of A1");
    }
}

class A2 extends  A {
    public static int a = 1;

    public void a() {
        System.out.println("i am a2 of A2");
    }
}

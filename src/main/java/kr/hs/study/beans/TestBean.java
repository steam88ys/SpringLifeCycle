package kr.hs.study.beans;

public class TestBean {

    public TestBean() {
        System.out.println("TestBean1의 기본생성자");
    }
    public void init_method() {
        System.out.println("init method");
    }

    public void destory_method() {
        System.out.println("destory method");
    }

}

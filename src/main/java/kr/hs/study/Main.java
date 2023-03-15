package kr.hs.study;

import kr.hs.study.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        TestBean t1 = ctx.getBean("t", TestBean.class); // 메서드 호출

        System.out.println(t1);
        t1.init_method();
        t1.destory_method();

        ctx.close();

    }
}
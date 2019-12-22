package com.xiyan;

import static org.junit.Assert.assertTrue;

import com.hello.Hello;
import com.hello.HelloImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void helloImplTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = (Hello) applicationContext.getBean("helloImpl");
        applicationContext.getClass().getMethod("close").invoke(applicationContext);
        hello.sayHello("xiyan");
    }
}

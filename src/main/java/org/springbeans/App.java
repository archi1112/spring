package org.springbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//          to call the destroy method we need abstractapllcontext as register function is in this
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student) context.getBean("student1");
        System.out.println(student);
        Student student2 = (Student) context.getBean("student2");
        System.out.println(student2);
        context.registerShutdownHook();
    }
}

package com.tutorialspoint;

import org.springframework.beans.BeansException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml")) {
         // Let us raise a start event.
         context.start();
  
         HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
         obj.getMessage();

         // Let us raise a stop event.
         context.stop();
      } catch (BeansException e) {
         e.printStackTrace();
      }
   }
}

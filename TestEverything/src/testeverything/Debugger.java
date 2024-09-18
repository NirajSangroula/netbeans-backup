/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeverything;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

/**
 *
 * @author Niraj Sangroula
 */
public class Debugger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
         JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
  // Compiling the code
  int result = compiler.run(null, null, null, 
     "C:\\Users\\sangr\\Documents\\NetBeansProjects\\TestEverything\\src\\testeverything\\Employee.java");
  System.out.println("result " + result);
  // Giving the path of the class directory where class file is generated..
  File classesDir = new File("C:\\Users\\sangr\\Documents\\NetBeansProjects\\TestEverything\\src\\testeverything");
  // Load and instantiate compiled class.
  URLClassLoader classLoader;
   // Loading the class 
   classLoader = URLClassLoader.newInstance(new URL[] { classesDir.toURI().toURL() });
   Class<?> cls;
   
   cls = Class.forName("org.test.Employee", true, classLoader);
  
   Employee instance = (Employee)cls.newInstance();
   instance.display();
    }
    
}

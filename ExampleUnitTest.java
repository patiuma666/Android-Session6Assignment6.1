package com.example.iis5.loginscreen;

import android.provider.ContactsContract;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
//Local unit tests run on the local JVM.
//has this is the Example unitTest which will be tests the java
  //  Different variations of assert() methods are available in Assert.java class of
//Junit framework.
public class  ExampleUnitTest {
    //to test any application we use the annotation called @Test
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);//as if we inserted the values assertEquals we change the assert value incase of 4 as 5 it shows that the test is failed
    }// as its actual valueis 4
    //Assert() methods are used to compare the actual output with the expected
   // output in the test cases.

    @Test
    public void email_isValid() {
        assertEquals("Email not Valid", "patiuma666@gmail.com", "pati@uma666.com");
    }

}

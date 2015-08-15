package test.playsimple.in.test;

import android.util.Log;

/**
 * Created by siddhanthjain on 15/08/15.
 */
public class MyClass123 {

    public MyClass123() {
        Log.d(Constants.TAG, MyClass123.class.getName()
                      + "MyClass: constructor called.");
    }

    public void doSomething() {
        Log.d(Constants.TAG, MyClass123.class.getName()
                                   + "MyClass: doSomething() called.");
    }
}

package test.playsimple.in.test;

import android.app.Activity;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;

import test.playsimple.in.test.prototype.MyClassInterface;

/**
 * Created by siddhanthjain on 15/08/15.
 */
public class MyClass implements MyClassInterface {

    public MyClass() {
        Log.d(Constants.TAG, MyClass.class.getName()
                      + "MyClass: constructor called.");
    }

    public void doSomething() {
        Log.d(Constants.TAG, MyClass.class.getName()
                                   + "MyClass: doSomething() called.");
    }

    @Override
    public void adButton(LinearLayout linear, Activity activity) {
        Button tv = new Button(activity);
        tv.setText("check123");
        linear.addView(tv);
    }

}

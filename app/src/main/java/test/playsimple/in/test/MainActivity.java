package test.playsimple.in.test;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.LinearLayout;

import java.io.File;

import dalvik.system.DexClassLoader;
import test.playsimple.in.test.prototype.MyClassInterface;


public class MainActivity extends ActionBarActivity {


    @SuppressWarnings("unchecked")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {

//            createDir();
            final String libPath = Environment.getExternalStorageDirectory().toString() + "/"+Constants.TAG+"/dl.dex";
            Log.d(Constants.TAG, "file exists = "+fileExists(Constants.TAG+"/dl.dex"));
            final File tmpDir = getDir("dex", 0);

            final DexClassLoader classloader = new DexClassLoader(libPath, tmpDir.getAbsolutePath(), null, this.getClass().getClassLoader());
            final Class<Object> classToLoad = (Class<Object>) classloader.loadClass("test.playsimple.in.test.MyClass");

            final Object myInstance  = classToLoad.newInstance();
            MyClassInterface o1 = (MyClassInterface) myInstance;
            LinearLayout layout = (LinearLayout) this.findViewById(R.id.bottomLayer);
            o1.adButton(layout, this);

//            final Method doSomething = classToLoad.getMethod("doSomething");
//            doSomething.invoke(myInstance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean fileExists(String fileName) {

        File output = new File(Environment.getExternalStorageDirectory(), fileName);
        Log.d("dl", "checking for path "+output.getAbsolutePath());
        if (output.exists()) {
            return true;
        }
        return false;
    }



    public static String createDir() {
        String dirPath = Environment.getExternalStorageDirectory().toString()
                + "/." + Constants.TAG + "/";
        File f = new File(dirPath);
        if (!f.isDirectory()) {
            f.mkdir();
        }
        return dirPath;
    }


}

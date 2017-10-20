package com.syezon.ffmpeg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
        System.loadLibrary("libavcodec");
        System.loadLibrary("libavdevice");
        System.loadLibrary("libavfilter");
        System.loadLibrary("libavformat");
        System.loadLibrary("libavutil");
        System.loadLibrary("libpostproc");
        System.loadLibrary("libswresample");
        System.loadLibrary("libswscale");
        System.loadLibrary("libx264");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}

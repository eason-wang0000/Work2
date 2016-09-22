package cn.edu.gdmec.s07150745.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate() called with: " + "我创建");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called with: " + "我是onStart");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG, "onPostResume() called with: "+"我是onSume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called with: "+"我是onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called with: "+"我是onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart() called with: "+"我是onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called with: "+"我是onDestroy");
    }
}

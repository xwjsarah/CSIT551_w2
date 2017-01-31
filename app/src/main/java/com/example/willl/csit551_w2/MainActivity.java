package com.example.willl.csit551_w2;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;

import static com.example.willl.csit551_w2.utils.Utils.APP_TAG;

public class MainActivity extends AppCompatActivity {

    private TextView textview;
    private TextView textview2;
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = (TextView) findViewById(R.id.textView2); // find the view
        textview2 = (TextView) findViewById(R.id.textView3);
        button = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new mylsnr()

        /*{
            @Override
            public void onClick(View v) {
                textview.setText("someword");
            }

        }*/);

        button2.setOnClickListener(new mylsnr());

        Log.i(APP_TAG, "use the >> onCreat>> method");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(APP_TAG, "use the >> onStart>> method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(APP_TAG, "use the >> onResume>> method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(APP_TAG, "use the >> onPause>> method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(APP_TAG, "use the >> onStop>> method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(APP_TAG, "use the >> onDestroy>> method");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(APP_TAG, "use the >> onRestart>> method");

    }
    class mylsnr implements View.OnClickListener {

        public void onClick(View view) {
            if (view.getId() == R.id.button1) {
                textview.setText("test1");
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            } else if (view.getId() == R.id.button2) {
                textview2.setText("change me");
            }
        }
    }
}
   /* public void clikeme (View view)
    {
       textview2.setText("change2");

    } */


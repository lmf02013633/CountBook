

package com.example.minfeng1_countbook;
/**
 * Created by Minfeng Liu on 2017/10/2.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        count++;
            TextView text=(TextView)findViewById(R.id.textView);
            text.setText("Number of counters: "+ count);
    }
}


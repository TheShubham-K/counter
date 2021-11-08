package com.shubham.counter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button nxt, prev;
    private int count;

    {
        count = 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nxt = findViewById(R.id.next_btn);
        prev = findViewById(R.id.previous_btn);


        nxt.setOnClickListener(v ->{

            count = count + 1;

            updateCount(count);

        });

        prev.setOnClickListener(v ->{
            if(count >0) {
                count = count -1;
            }
            else {
                count = 0;
            }
            updateCount(count);

        });
    }

    private void updateCount(int count){

        my_fragment frag = new my_fragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction();

        Bundle data = new Bundle();
        data.putString("count", "Counter = "+ count);
        frag.setArguments(data);
        fragmentTransaction.replace(R.id.my_fragment, frag).commit();
    }

}
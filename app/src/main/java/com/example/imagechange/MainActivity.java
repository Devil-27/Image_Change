package com.example.imagechange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static com.example.imagechange.R.drawable.amit1;

public class MainActivity extends AppCompatActivity {
    Button b1;
    ImageView iv;
    boolean flag=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        iv=(ImageView)findViewById(R.id.imageView3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            switch(view.getId())
            {
                case R.id.button:
                {
                    if(flag)
                    {
                        iv.setImageResource(R.drawable.logo);
                        flag=false;
                    }
                    else
                    {
                        iv.setImageResource(amit1);
                        flag=true;
                    }
                    return;
                }
            }
        }
    });
  }
}
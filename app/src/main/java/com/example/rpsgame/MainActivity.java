package com.example.rpsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String options[]={"Rock","Paper","Scissor"};
    int uopt;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
    }

    public void rock(View view) {
        uopt=0;
        Toast.makeText(this,"you opted"+options[uopt],Toast.LENGTH_SHORT).show();
    }

    public void paper(View view) {
        uopt=1;
        Toast.makeText(this,"you opted"+options[uopt],Toast.LENGTH_SHORT).show();
    }

    public void scissor(View view) {
        uopt=2;
        Toast.makeText(this,"you opted"+options[uopt],Toast.LENGTH_SHORT).show();
    }

    public void play(View view) {
        Random r= new Random();
        int copt=r.nextInt(3);
       if (uopt==copt){
           tv.setText("Game Draw !!!Because you opted"+options[uopt]+"and System opted "+options[copt]);

       }
       else if(copt==0&&uopt==1||copt==1&&uopt==2||copt==2&&uopt==0)
       {
           tv.setText("you WON!!!Because you opted "+options[uopt]+"and System opted "+options[copt]);
       }
        else
       {
           tv.setText("you Lose!!!Because you opted "+options[uopt]+"and System opted "+options[copt]);
       }

    }

}

package com.example.coffee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView q1,q2,q3,resul;
    private CheckBox cream,choc;
    private Button ad1,ad2,ad3,su1,su2,su3,tot;
    private int tota,qu1,qu2,qu3,price1=10,price2=20,price3=30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ad1=(Button) findViewById(R.id.add1);
        ad2=(Button) findViewById(R.id.add2);
        ad3=(Button) findViewById(R.id.add3);
        su1=(Button) findViewById(R.id.sub1);
        su2=(Button) findViewById(R.id.sub2);
        su3=(Button) findViewById(R.id.sub3);
        tot=(Button)findViewById(R.id.total);
        cream=(CheckBox) findViewById(R.id.w_c);
        choc=(CheckBox) findViewById(R.id.choco);
        q1=(TextView) findViewById(R.id.quantity1);
        q2=(TextView) findViewById(R.id.quantity2);
        q3=(TextView) findViewById(R.id.quantity3);
        resul=(TextView) findViewById(R.id.result);
        ad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(qu1>=10){
                    qu1=10;
                    Toast.makeText(MainActivity.this,"Let other have Tea",Toast.LENGTH_SHORT).show();
                }
                else{
                    qu1++;
                    q1.setText(qu1+"");
                }
            }
        });
        ad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(qu2>=10){
                    qu2=10;
                    Toast.makeText(MainActivity.this,"Let other have coffee",Toast.LENGTH_SHORT).show();
                }
                else{
                    qu2++;
                    q2.setText(qu2+"");
                }
            }
        });
        ad3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(qu3>=10){
                    qu3=10;
                    Toast.makeText(MainActivity.this,"Let other have Soft drink",Toast.LENGTH_SHORT).show();
                }
                else{
                    qu3++;
                    q3.setText(qu3+"");
                }
            }
        });
        su1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(qu1<=0)
                {
                    qu1=0;
                    Toast.makeText(MainActivity.this,"No imaginary Tea",Toast.LENGTH_SHORT).show();
                }
                else{
                    --qu1;
                    q1.setText(qu1+"");
                }
            }
        });
        su2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(qu2<=0)
                {
                    qu2=0;
                    Toast.makeText(MainActivity.this,"No imaginary coffee",Toast.LENGTH_SHORT).show();
                }
                else{
                    --qu2;
                    q2.setText(qu2+"");
                }
            }
        });
        su3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(qu3<=0)
                {
                    qu3=0;
                    Toast.makeText(MainActivity.this,"No imaginary Soft drink",Toast.LENGTH_SHORT).show();
                }
                else{
                    --qu3;
                    q3.setText(qu3+"");
                }
            }
        });
        tot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tota=qu1*price1+qu2*price2+qu3*price3;
                if(tota>0) {
                    if (cream.isChecked()) {
                        tota += 10;
                    }
                    if (choc.isChecked())
                        tota += 10;
                }
                resul.setText(tota+"");
            }
        });
    }
}

package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    LinearLayout expenses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expenses = (LinearLayout) findViewById(R.id.expenses);
        for(int i=0;i<20;i++) {
            createExpense();
            createExpense();
        }
    }
    void createExpense(){
        LinearLayout l = new LinearLayout(this);
        LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,150);
        param.setMargins(2,2,2,2);
        l.setLayoutParams(param);
        l.setBackgroundColor(getResources().getColor(R.color.blue,getTheme()));
       // l.setBackground(ResourcesCompat.getDrawable(getResources(),R.drawable.shape_main,getTheme()));
        l.setOrientation(LinearLayout.HORIZONTAL);
        TextView desc = new TextView(this);
        desc.setText("hello");
        desc.setGravity(Gravity.CENTER_VERTICAL);
        TextView amount = new TextView(this);
        amount.setText("10000");
        amount.setGravity(Gravity.END);
        l.addView(desc);
        l.addView(amount);
        expenses.addView(l);

    }
    public void startAnalysis(View view){
        Intent i = new Intent(this, Analysis.class);
        startActivity(i);
    }
    public void startProfile(View view){
        Intent i = new Intent(this, Profile.class);
        startActivity(i);
    }

}
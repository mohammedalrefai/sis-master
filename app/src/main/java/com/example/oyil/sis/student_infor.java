package com.example.oyil.sis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class student_infor extends AppCompatActivity implements View.OnClickListener {
    private Button scholarship;
    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infor);

        set_up();
    }

    public void set_up(){
        scholarship = (Button) findViewById(R.id.scholarship_bt);
        back = (Button) findViewById(R.id.back_bt);

        scholarship.setOnClickListener(this);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.scholarship_bt:
                Intent scholarship_intent = new Intent(student_infor.this,scholarship.class);
                startActivity(scholarship_intent);
                break;
            case R.id.back_bt:
                Intent back_intent = new Intent(student_infor.this,sis.class);
                startActivity(back_intent);
                break;

        }
    }

}

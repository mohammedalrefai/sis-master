package com.example.oyil.sis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class scholarship extends AppCompatActivity implements View.OnClickListener {

    private Button log_out;
    private Button back;
    private TextView money_resource;
    private TextView scholarship_name;
    private TextView connection_assurance;
    private TextView scholarship_state;
    private TextView scholarship_period;
    private TextView scholarship_end;
    private TextView health_insurance;
    private TextView registration_balance;
    private TextView another_balance;
    private TextView tax_total;
    private TextView amount_wanted;
    private TextView scholarship_hours_after_registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scholarship);

        set_up();
    }

    public void set_up(){


        log_out = (Button) findViewById(R.id.log_out_bt);
        back = (Button) findViewById(R.id.back_bt);
        money_resource = (TextView) findViewById(R.id.money_resource_txt);
        scholarship_name = (TextView) findViewById(R.id.scholarship_name_txt);
        connection_assurance = (TextView) findViewById(R.id.connection_assurance_txt);
        scholarship_state = (TextView) findViewById(R.id.scholarship_state_txt);
        scholarship_period = (TextView) findViewById(R.id.scholarship_period_txt);
        scholarship_end = (TextView) findViewById(R.id.scholarship_end_txt);
        health_insurance = (TextView) findViewById(R.id.health_insurance_txt);
        registration_balance = (TextView) findViewById(R.id.registration_balance_txt);
        another_balance = (TextView) findViewById(R.id.another_balance_txt);
        tax_total = (TextView) findViewById(R.id.tax_total_txt);
        amount_wanted = (TextView) findViewById(R.id.amount_wanted_txt);
        scholarship_hours_after_registration = (TextView) findViewById(R.id.scholarship_hours_after_registration_txt);

        log_out.setOnClickListener(this);
        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.log_out_bt:
                Intent log_out_intent = new Intent(scholarship.this,scholarship.class);
                startActivity(log_out_intent);
                break;
            case R.id.back_bt:
                Intent google_services_intent = new Intent(scholarship.this,student_infor.class);
                startActivity(google_services_intent);
                break;

        }
    }
}

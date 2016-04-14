package com.fitconductors.traintracks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AddAppointmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_appointment);

        // Client dropdown list
        Spinner clientDropdown = (Spinner)findViewById(R.id.spinner_dropdown);
        String[] clientArray = new String[]{"1", "2", "three", "test"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, clientArray);
        clientDropdown.setAdapter(adapter);


    }
}

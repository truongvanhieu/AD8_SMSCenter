package com.example.hieutruongvan.ad8_smscenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView myListView;
    private MyArrayAdapter myAdaper;
    private EditText et_FieldNumber;

    private ArrayList<Field> fieldArrayListData = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myListView = (ListView) findViewById(R.id.lv_config);
        et_FieldNumber = (EditText) findViewById(R.id.et_numberrow);

        fieldArrayListData = new ArrayList<>();

        myAdaper = new MyArrayAdapter(this, R.layout.layout_config, fieldArrayListData);
        myListView.setAdapter(myAdaper);
        myListView.setOnItemClickListener(this);
        et_FieldNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    int number = Integer.parseInt(et_FieldNumber.getText().toString());
                    for(int i = 0; i < number; i++){
                        fieldArrayListData.add(new Field("SoBaoDanh", "String"));
                    }
                }catch (Exception e) {
                    System.out.println("Error");
                }


                myAdaper.notifyDataSetChanged();
            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}

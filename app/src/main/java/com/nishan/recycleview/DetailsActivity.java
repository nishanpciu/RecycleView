package com.nishan.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
ImageView imgFlag;
TextView txtName,txtdecs;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        imgFlag=findViewById(R.id.img_country_flag);
        txtName=findViewById(R.id.txtName);
txtdecs=findViewById(R.id.txt_desc);
        String getName=getIntent().getExtras().getString("name");
        int getflag=getIntent().getExtras().getInt("flag");
        txtName.setText(getName);
        imgFlag.setImageResource(getflag);

        if(getName.equals("Bangladesh")){
            txtdecs.setText(R.string.bd);
        }
    }
}

package patient.arrow.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class Staff_Activity extends AppCompatActivity {
     TextView useridd;ListView ls;ImageButton search,add_patient,signout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_);
        ActionBar ab=getSupportActionBar();
        ab.setDisplayShowHomeEnabled(true);
        useridd=(TextView)findViewById(R.id.d_id);
        String user=getIntent().getStringExtra("user_id");
        if(user!=null)
        {
            useridd.setText(user);
        }
        search=(ImageButton)findViewById(R.id.searchh);
        add_patient=(ImageButton)findViewById(R.id.ap);
        signout=(ImageButton)findViewById(R.id.signout);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),Search.class);
                startActivity(intent);
            }
        });

        add_patient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),Add_Patient.class);
                startActivity(intent);
            }
        });

        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),Sign_In.class);
                startActivity(intent);
            }
        });
    }
}

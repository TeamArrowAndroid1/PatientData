package patient.arrow.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Patient_activity extends AppCompatActivity {
     TextView docid,nurseid,pid,pname,bp,chol,heartb,temp,date;ImageButton dreq,nreq,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_activity);
        docid=(TextView)findViewById(R.id.d_id);
        nurseid=(TextView)findViewById(R.id.n_id);
        pid=(TextView)findViewById(R.id.p_id);
        pname=(TextView)findViewById(R.id.p_name);
        bp=(TextView)findViewById(R.id.bp);
        chol=(TextView)findViewById(R.id.cho);
        heartb=(TextView)findViewById(R.id.heart);
        temp=(TextView)findViewById(R.id.temp);
        date=(TextView)findViewById(R.id.date);

        dreq=(ImageButton)findViewById(R.id.dreq);
        dreq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto: +14169490361"));
                startActivity(intent);
            }
        });
        nreq=(ImageButton)findViewById(R.id.nreq);
        nreq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto: +14169490361"));
                startActivity(intent);
            }
        });
        back=(ImageButton)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),Sign_In.class);
                startActivity(intent);
            }
        });

    }
}

package patient.arrow.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class Sign_In extends AppCompatActivity {
      EditText user,pswd;Spinner spinner;ArrayAdapter<CharSequence> adapter;
      ImageButton signin;String catgry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__in);
        spinner=(Spinner)findViewById(R.id.spi);
        adapter=ArrayAdapter.createFromResource(this,R.array.as,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                catgry=parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        user=(EditText)findViewById(R.id.user);
        pswd=(EditText)findViewById(R.id.pswd);
        signin=(ImageButton)findViewById(R.id.sign_in);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String userr=user.getText().toString();
                String pswdd=pswd.getText().toString();
                if(!userr.isEmpty() && !pswdd.isEmpty() && (catgry.equals("Doctor") || catgry.equals("Nurse") ))
                {
                    Intent intent=new Intent(getBaseContext(),Staff_Activity.class);
                    intent.putExtra("user_id",userr);
                    startActivity(intent);
                }
                else if(!userr.isEmpty() && !pswdd.isEmpty() && catgry.equals("Patient"))
                {
                    Intent intent=new Intent(getBaseContext(),Patient_activity.class);
                    intent.putExtra("user_id",userr);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(Sign_In.this, "Please fill both user & pswd", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

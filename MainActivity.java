package id.ac.id.telkomuniversity.tass.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login, forgot;
    EditText username, passwd;

    String isiUsername = "USERNAME"; //nampungisi
    String isiPassword = "PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        forgot = findViewById(R.id.forgotpass);
        username = findViewById(R.id.username);
        passwd = findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String uname = username.getText().toString();
                    String pass = passwd.getText().toString();
                    if (uname == null && uname == " " && pass == null && pass == " "){
                        Toast.makeText(getApplication(), "Please enter the Username or Password", Toast.LENGTH_SHORT);
                    }else{
                        Intent i = new Intent(MainActivity.this, MainActivity2.class);
                        i.putExtra(isiUsername, uname);
                        i.putExtra(isiPassword, pass);
                        startActivity(i);
                    }
            }
        });

        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(i);
            }
        });
    }
}
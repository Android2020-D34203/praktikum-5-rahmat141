package id.ac.id.telkomuniversity.tass.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView Vusername, Vpassword;
    String username, password;
    String isiUsername = "USERNAME";
    String isiPassword = "PASSWORD";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Vusername = findViewById(R.id.uname);
        Vpassword = findViewById(R.id.pass);

        Bundle isi = getIntent().getExtras();
        username = isi.getString(isiUsername);
        password = isi.getString(isiPassword);
        Vusername.setText(username);
        Vpassword.setText(password);
    }
}
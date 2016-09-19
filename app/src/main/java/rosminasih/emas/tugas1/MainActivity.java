package rosminasih.emas.tugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button submit;
    EditText nama, email,nim, angkatan;
    TextView Tnama, Temail, Tnim, Tangkatan;
    String Snama, Semail, Snim, Sangkatan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = (Button) findViewById(R.id.btnSubmit);
        nama = (EditText)findViewById(R.id.inama);
        email = (EditText)findViewById(R.id.iemail);
        nim = (EditText) findViewById(R.id.inim);
        angkatan = (EditText)findViewById(R.id.iangkatan);

        Tnama = (TextView)findViewById(R.id.nama);
        Temail = (TextView)findViewById(R.id.email);
        Tnim = (TextView) findViewById(R.id.nim);
        Tangkatan = (TextView) findViewById(R.id.angkatan);
        submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        Snama = nama.getText().toString();
        Semail = email.getText().toString();
        Snim = nim.getText().toString();
        Sangkatan = angkatan.getText().toString();

        Tnama.setText("NAMA : "+Snama);
        Tnim.setText("NIM  : "+Snim);
        Temail.setText("EMAIL   : "+Semail);
        Tangkatan.setText("ANGKATAN : "+Sangkatan);

        nama.setVisibility(View.INVISIBLE);
        email.setVisibility(View.INVISIBLE);
        nim.setVisibility(View.INVISIBLE);
        angkatan.setVisibility(View.INVISIBLE);
        submit.setVisibility(View.INVISIBLE);
    }
}

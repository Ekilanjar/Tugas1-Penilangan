package myapplication.example.com.tugas1form;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nama, plat, sanksi;
    TextView nama_pelanggar, nomor_plat, sanksip;
    Button btnsimpan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = findViewById(R.id.nama);
        plat = findViewById(R.id.plat);
        sanksi = findViewById(R.id.sanksi);
        nama_pelanggar = findViewById(R.id.nama_pelanggar);
        nomor_plat = findViewById(R.id.nomor_plat);
        sanksip = findViewById(R.id.sanksip);
        btnsimpan = findViewById(R.id.simpan_button);

        btnsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namap, platp, psanksi;

                namap = nama.getText().toString().trim();
                platp = plat.getText().toString().trim();
                psanksi = sanksi.getText().toString().trim();

                nama_pelanggar.setText(namap);
                nomor_plat.setText(platp);
                sanksip.setText(psanksi);
            }
        });
    }
}
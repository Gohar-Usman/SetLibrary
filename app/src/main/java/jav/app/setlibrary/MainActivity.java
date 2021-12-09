package jav.app.setlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.toaster.ToastMessageLastTry;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastMessageLastTry.s(this,"cccccccccccccccccccccccccccccccccccc");
        Toast.makeText(this, "dddddd", Toast.LENGTH_SHORT).show();
    }
}
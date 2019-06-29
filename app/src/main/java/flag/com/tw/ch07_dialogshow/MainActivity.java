package flag.com.tw.ch07_dialogshow;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new AlertDialog.Builder(this).setMessage("交談窗示範教學\n" + "請按返回鍵返回").setTitle("歡迎").setIcon(android.R.drawable.presence_away).setCancelable(true).show();

    }
}

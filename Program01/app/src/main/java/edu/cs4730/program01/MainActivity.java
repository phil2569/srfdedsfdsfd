package edu.cs4730.program01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
        public static final String MESSAGE = "yourName";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessage.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = "Hello " + editText.getText().toString();
        Log.v("MAIN_ACTIVITY", message);
        intent.putExtra(MESSAGE, message);
        startActivity(intent);
    }
}

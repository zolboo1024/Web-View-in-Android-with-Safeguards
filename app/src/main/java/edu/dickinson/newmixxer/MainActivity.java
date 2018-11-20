package edu.dickinson.newmixxer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/**
 * Created by Zolboo Erdenebaatar 11/19/2018
 * This Class is the entry point of the application.   
 * Just for an example, this Activity creates a button
 * when pressed, opens up the WebView. 
 */
public class MainActivity extends AppCompatActivity {
    Button signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logIn= (Button) findViewById(R.id.logIn);
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            // This method calls the Browser class which basically contains the 
            // the implementation of the Actual WebView.
            public void onClick(View view) {
                Intent browserIntent = new Intent(getApplicationContext(), Browser.class);
                browserIntent.putExtra("url", "https://www.google.com");
                startActivity(browserIntent);
            }
        });
    }
}

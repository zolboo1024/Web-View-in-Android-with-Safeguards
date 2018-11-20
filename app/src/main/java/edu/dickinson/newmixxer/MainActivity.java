package edu.dickinson.newmixxer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/**
 * Created by Zolboo Erdenebaatar 11/19/2018
 *
 */
public class MainActivity extends AppCompatActivity {
    Button signUp;
    Button logIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signUp= (Button) findViewById(R.id.signUp);
        logIn= (Button) findViewById(R.id.logIn);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(getApplicationContext(), Browser.class);
                browserIntent.putExtra("url", "https://mixxertestdev.dickinson.edu/user/register");
                startActivity(browserIntent);
            }
        });
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(getApplicationContext(), Browser.class);
                browserIntent.putExtra("url", "https://mixxertestdev.dickinson.edu/user/login");
                startActivity(browserIntent);
            }
        });
    }
}

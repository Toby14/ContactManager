package com.example.contactmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String USER_NAME = "com.example.contactmanager.USER_NAME";
    private EditText mUsername;
    private EditText mPassword;
    private TextView wrongInput;
    private TextView toRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsername = findViewById(R.id.userName_editText);
        mPassword = findViewById(R.id.pass_editText);
        wrongInput = findViewById(R.id.display_wrong_input);

        toRegister = findViewById(R.id.register_textView);
        toRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

//        // When I create the frag object, it already has the reference to its layout.
//        MyFragment frag = new MyFragment();
//
//        // Add the object frag to the container
//        getSupportFragmentManager().beginTransaction()
//                .add(R.id.myContainer, frag)
//                .commit(); // commit the transaction.


    }

    public void login(View view) {

        Intent intent = new Intent(this, ProfileActivity.class);

        if (mUsername.getText().toString().equals("Tinh")
                && mPassword.getText().toString().equals("1234")) {
            String copyUsername = mUsername.getText().toString();
//        Toast.makeText(this, "Login clicked" + "**" + copyUsername + "**", Toast.LENGTH_SHORT).show();

            intent.putExtra(USER_NAME, copyUsername);
            startActivity(intent);

        }
        else {
            wrongInput.setText("Username or Password is not correct. Please try again.");
        }

    }
}

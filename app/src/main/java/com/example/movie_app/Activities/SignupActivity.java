package com.example.movie_app.Activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.movie_app.R;

public class SignupActivity extends AppCompatActivity {

    ActivitySignupBinding binding;
    DatabaseHelper databaseHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        databaseHelper = new DatabaseHelper(this);

        binding.signupButton.setOnClickListener(new View.OnClickListener(){
          @Override
            public void onClick(View view) {
              String username = binding.signupUsername.getText().toString();
              String password = binding.signupPassword.getText().toString();
              String confirmPassword = binding.signupConfirm.getText().toString();

              if (username.equals("")) || password.equals("")) || confirmPassword.equals(""))
              Toast make.Text(SignupActivity.this, Tost)
          }
        });



    }
}

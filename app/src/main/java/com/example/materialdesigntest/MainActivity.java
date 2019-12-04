package com.example.materialdesigntest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity implements NavigationHost{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container,new LoginFragment())
                    .commit();
        }
    }


    @Override
    public void navigateTo(Fragment fragment, boolean addToBackstack) {
        FragmentTransaction fgTransaction = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container,fragment);

        if(addToBackstack){
            fgTransaction.addToBackStack(null);
        }

        fgTransaction.commit();
    }
}

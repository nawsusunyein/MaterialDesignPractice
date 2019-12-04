package com.example.materialdesigntest;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    TextInputLayout passwordInputLayout;
    TextInputEditText passwordEditText;
    MaterialButton btnSave;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login,container,false);
                passwordInputLayout = (TextInputLayout) view.findViewById(R.id.inputPasswordLayout);
        passwordEditText = (TextInputEditText) view.findViewById(R.id.txtInputPassword);
        btnSave = (MaterialButton) view.findViewById(R.id.btnLogin);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(isPasswordValid(passwordEditText.getText()))){
                    passwordInputLayout.setError("Password is empty or less than 8");
                }else{
                    passwordInputLayout.setError(null);
                    ((NavigationHost) getActivity()).navigateTo(new ProductGridFragment(),false);
                }
            }
        });
        return view;
    }

    private boolean isPasswordValid(@NonNull Editable text){
        return text != null && text.length() >= 8 ;
    }

}

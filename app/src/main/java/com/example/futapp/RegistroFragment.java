package com.example.futapp;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroFragment extends Fragment {


    private EditText usuarioEditText, contrasenyaEditText, nombreEditText, emailEditText;
    private Button registrarButton;


    public RegistroFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_registro, container, false);
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        usuarioEditText = view.findViewById(R.id.usuario_Registro);
        contrasenyaEditText = view.findViewById(R.id.contraseña_registro);
        emailEditText = view.findViewById(R.id.email_registro);
        nombreEditText = view.findViewById(R.id.nombre_registro);
        registrarButton = view.findViewById(R.id.boton_registrar);

        registrarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.inicioFragment);
            }
        });

    }
}

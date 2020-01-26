package com.example.futapp;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class IniciarSesionFragment extends Fragment {

    private Button iniciarSesionButton;
    private EditText usuarioEditText , contrasenyaEditText;
    private Button botonRegistro;

    public IniciarSesionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_iniciar_sesion, container, false);
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        usuarioEditText= view.findViewById(R.id.edit_Text_Usuario);
        contrasenyaEditText = view.findViewById(R.id.edit_Text_contraseña);
        iniciarSesionButton = view.findViewById(R.id.boton_iniciar_sesion);
        botonRegistro = view.findViewById(R.id.registrarse);

        botonRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.registroFragment);
            }
        });

        iniciarSesionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.inicioFragment);
            }
        });

    }
}

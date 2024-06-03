package com.teste.navigation.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.Button;

import com.teste.navigation.fragments.R;
import com.teste.navigation.fragments.fragment.ContatosFragment;
import com.teste.navigation.fragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonConversas,buttonContatos;
    private ConversasFragment conversasFragment;
    private ContatosFragment contatosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonContatos = findViewById(R.id.buttonContatos);
        buttonConversas = findViewById(R.id.buttonConversas);

        contatosFragment = new ContatosFragment();

        //configurar nossos fragmentos
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo,contatosFragment);

    }
}
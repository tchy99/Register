package com.example.apptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private EditText nom;
    private EditText prenom;
    private Spinner typeContact;
    private EditText Email;
    private EditText Adresse;
    private EditText Telephone;
    private static final String TAG = "MY ACTIVITY";


    Contact contacts = new Contact();
    String[] Sexe = {"Homme", "Femme"};
    String[] ListeTypeContact = {"Famille", "Amis", "Collègue", "Entreprise", "Fournisseur", "Client", "Université", "Église"};

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spino = findViewById(R.id.nomTypeContact);
        spino.setOnItemSelectedListener(this);
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_spinner_item, ListeTypeContact);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spino.setAdapter(ad);


        Spinner spin = findViewById(R.id.sexe);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter ade = new ArrayAdapter(this, android.R.layout.simple_spinner_item, Sexe);
        ade.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(ade);


        mButton = (Button) findViewById(R.id.btnSubmit);

        View.OnClickListener bClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nom = findViewById(R.id.Nom);
                prenom = findViewById(R.id.Prenom);
                Spinner spino = findViewById(R.id.nomTypeContact);
                Spinner spin = findViewById(R.id.sexe);
                Email = findViewById(R.id.Email);
                Adresse = findViewById(R.id.adresse);
                Telephone = findViewById(R.id.numTel);
                
                Log.d(TAG,"Nom: " + contacts.setNom(nom.getText().toString()));
                Log.d(TAG,"Prénom: " + contacts.setPrenom(prenom.getText().toString()));
                Log.d(TAG, "Sexe: "+ contacts.setSexe(spin.getSelectedItem().toString()));
                Log.d(TAG,"Type Contact : "+contacts.setTypeContact(spino.getSelectedItem().toString()));
                Log.d(TAG,"Email: " + contacts.setEmail(Email.getText().toString()));
                Log.d(TAG,"Adresse: " + contacts.setAdresse(Adresse.getText().toString()));
                Log.d(TAG, "Telephone :"+ contacts.setTelephone(Telephone.getText().toString()));


            }


        };

        mButton.setOnClickListener(bClick);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(), ListeTypeContact[i], Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), Sexe[i], Toast.LENGTH_LONG).show();
    }


    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }




}
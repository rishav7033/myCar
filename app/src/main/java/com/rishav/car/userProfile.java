package com.rishav.car;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class userProfile extends AppCompatActivity {

    TextView nameT,name,emailT,email,dobT,dob,phoneT,phone;
    ImageView profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_user_profile );

        nameT = findViewById( R.id.nameT );
        name = findViewById( R.id.name );
        emailT = findViewById( R.id.emailT );
        email = findViewById( R.id.email );
        dobT = findViewById( R.id.dobT );
        dob = findViewById( R.id.dob );
        phoneT = findViewById( R.id.phoneT );
        phone = findViewById( R.id.phone );

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/breeserif_regular.ttf");
        nameT.setTypeface(typeface);
        emailT.setTypeface(typeface);
        dobT.setTypeface(typeface);
        phoneT.setTypeface(typeface);

        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/acme_regular.ttf");
        name.setTypeface(typeface1);
        email.setTypeface(typeface1);
        dob.setTypeface(typeface1);
        phone.setTypeface(typeface1);

        name.setText(getIntent().getStringExtra("Name"));
        email.setText(getIntent().getStringExtra("Email"));
        dob.setText(getIntent().getStringExtra("DOB"));
        phone.setText(getIntent().getStringExtra("Phone"));
    }

}

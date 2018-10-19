package com.rishav.car;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    String nameV,emailV,phoneV,dobV;
    TextView nameHEADER,emailHEADER,nameProfile,emailProfile,dobProfile,phoneProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* FloatingActionButton fab =  findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView =  findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
/*
        nameV = getIntent().getStringExtra("Name");
        emailV = getIntent().getStringExtra("Email");
        phoneV = getIntent().getStringExtra("Phone");
        dobV = getIntent().getStringExtra("DOB");

        nameHEADER = findViewById(R.id.nameUser);
        emailHEADER = findViewById(R.id.emailUser);
        nameProfile = findViewById(R.id.name);
        emailProfile = findViewById(R.id.email);
        dobProfile = findViewById(R.id.dob);
        phoneProfile = findViewById(R.id.phone);

        nameHEADER.setText(nameV);
        emailHEADER.setText(emailV);*/
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else  {
           // super.onBackPressed();
            new AlertDialog.Builder(this).setTitle("Exit")
                    .setMessage("Are you sure?")
                    .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            Intent intent = new Intent(Intent.ACTION_MAIN);
                            intent.addCategory(Intent.CATEGORY_HOME);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(intent);
                            finish();
                        }
                    }).setNegativeButton("no", null).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_temp) {
            Intent h= new Intent(getApplicationContext(), Temperature.class);
            startActivity(h);
            // Handle the camera action
        } else if (id == R.id.nav_Battery)
        {
            Intent h=new Intent(getApplicationContext(),Battery.class);
            startActivity(h);

        } else if (id == R.id.nav_runtime) {
            Intent h=new Intent(getApplicationContext(),RunTime.class);
            startActivity(h);

        } else if (id == R.id.nav_location) {
            Intent h=new Intent(getApplicationContext(),Location.class);
            startActivity(h);

        } else if (id == R.id.mail)
        {

        } else if (id == R.id.num) {

        }
        else if (id == R.id.us) {

        }
        else if (id == R.id.imageView){
        }

        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void goToProfile(View view) {

        Intent intent = new Intent( getApplicationContext(),userProfile.class );
       /* intent.putExtra("Name",nameV);
        intent.putExtra("Email",emailV);
        intent.putExtra("DOB",dobV);
        intent.putExtra("Phone",phoneV);*/
        startActivity( intent );
    }





}
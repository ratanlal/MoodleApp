package com.example.moodleapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.service.autofill.Dataset;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LoginScreen extends AppCompatActivity {
    User user = new User();
   /* DatabaseReference database = FirebaseDatabase.getInstance().getReference();
    DatabaseReference ref = database.child("profiles");*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        TextView login_screen_Text1 = (TextView)findViewById(R.id.login_screen_Text1);
        TextView login_screen_Text2 = (TextView)findViewById(R.id.login_screen_Text2);
        TextView login_screen_Text3 = (TextView)findViewById(R.id.login_screen_Text3);

        FloatingActionButton fab_login = (FloatingActionButton) findViewById(R.id.fab_login);
        fab_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    // function request for login
    public void login(){
        String usr, pwd;
        EditText username =(EditText) findViewById(R.id.Username_EditText);
        EditText password = (EditText) findViewById(R.id.Password_EditText);
        /*String url = "";
        url+= username.getText() + "&password=" + password.getText();
        if(network.NetworkCheck(this)){
            network.sendStringrequest(url,new ImplementListener(this),getApplicationContext());
        }
        else{
            showSnackbar("Connect to the internet");
        }
*/

        usr= String.valueOf(username.getText());
        pwd = String.valueOf(password.getText());
        //Log.e("usr=",usr);
        //Log.e("pwd=",pwd);
        userauthentication(usr,pwd);
    }
    // function for authentication of user (check response )
    public void userauthentication(String usr, String pwd){
       // Log.e("usrid=",user.userid);
        //Log.e("pswd=",user.password);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        //try {
            if ( user.userid.equals(usr) && user.password.equals(pwd)){
                Intent intent = new Intent(LoginScreen.this, MainActivity.class);
                startActivity(intent);
               // Log.e("entered","entered in if");
               /* CourseListFragment courseListFragment = CourseListFragment.newInstance();
                transaction.replace(R.id.course_list_fragment, courseListFragment);
                transaction.addToBackStack(null);
                transaction.commit();*/

            }
            else{
                showSnackbar("Invalid Password or username");
            }
       /* } catch (Exception e) {
            raiseAlert("Oops", "Server behaved unusually");
        }*/
    }

    public void raiseAlert(String Title, String Description){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle(Title);
        alertDialogBuilder.setMessage(Description);
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
    public void showSnackbar(String s){
        Snackbar snackbar = Snackbar
                .make(findViewById(android.R.id.content), s, Snackbar.LENGTH_LONG);
        snackbar.show();
    }

}
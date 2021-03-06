package com.mss.quiz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    TextView AnsText1,AnsText2,AnsText3,AnsText4,AnsText5;
    Button btn1,btn2,btn3,btn4,btn5;
    RadioGroup question1,question2,question3,question4,question5;
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    BottomNavigationView button;


    String Q1Ans="Bangladesh", UserAns1 ="";
    String Q2Ans="bd", UserAns2 ="";
    String Q3Ans="1971", UserAns3 ="";
    String Q4Ans="Taka", UserAns4 ="";
    String Q5Ans="Kabadi", UserAns5 ="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnsText1 = findViewById(R.id.AnsText1);
        AnsText2 = findViewById(R.id.AnsText2);
        AnsText3 = findViewById(R.id.AnsText3);
        AnsText4 = findViewById(R.id.AnsText4);
        AnsText5 = findViewById(R.id.AnsText5);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

        question1 = findViewById(R.id.question1);
        question2 = findViewById(R.id.question2);
        question3 = findViewById(R.id.question3);
        question4 = findViewById(R.id.question4);
        question5 = findViewById(R.id.question5);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.nav);

        button = findViewById(R.id.button);


        question1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.Q1option1:
                        UserAns1 = "Pakistan";
                        break;
                    case R.id.Q1option2:
                        UserAns1 = "Bangladesh";
                        break;
                    case R.id.Q1option3:
                        UserAns1 = "China";
                        break;
                    case R.id.Q1option4:
                        UserAns1 = "India";
                        break;

                }
            }
        });

        //Questions Start..............

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Q1Ans.equals(UserAns1)){
                    AnsText1.setText("Correct Answer");
                    AnsText1.setTextColor(Color.GREEN);
                }else{
                    AnsText1.setText("Wrong Answer");
                    AnsText1.setTextColor(Color.RED);
                }
            }
        });


        question2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.Q2option1:
                        UserAns2 = "in";
                        break;
                    case R.id.Q2option2:
                        UserAns2 = "uk";
                        break;
                    case R.id.Q2option3:
                        UserAns2 = "pk";
                        break;
                    case R.id.Q2option4:
                        UserAns2 = "bd";
                        break;

                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Q2Ans.equals(UserAns2)){
                    AnsText2.setText("Correct Answer");
                    AnsText2.setTextColor(Color.GREEN);
                }else{
                    AnsText2.setText("Wrong Answer");
                    AnsText2.setTextColor(Color.RED);
                }
            }
        });


        question3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.Q3option1:
                        UserAns3 = "1971";
                        break;
                    case R.id.Q3option2:
                        UserAns3 = "1970";
                        break;
                    case R.id.Q3option3:
                        UserAns3 = "1972";
                        break;
                    case R.id.Q3option4:
                        UserAns3 = "1973";
                        break;

                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Q3Ans.equals(UserAns3)){
                    AnsText3.setText("Correct Answer");
                    AnsText3.setTextColor(Color.GREEN);
                }else{
                    AnsText3.setText("Wrong Answer");
                    AnsText3.setTextColor(Color.RED);
                }
            }
        });


        question4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.Q4option1:
                        UserAns4 = "Rupee";
                        break;
                    case R.id.Q4option2:
                        UserAns4 = "Dollar";
                        break;
                    case R.id.Q4option3:
                        UserAns4 = "Taka";
                        break;
                    case R.id.Q4option4:
                        UserAns4 = "Diner";
                        break;

                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Q4Ans.equals(UserAns4)){
                    AnsText4.setText("Correct Answer");
                    AnsText4.setTextColor(Color.GREEN);
                }else{
                    AnsText4.setText("Wrong Answer");
                    AnsText4.setTextColor(Color.RED);
                }
            }
        });


        question5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.Q5option1:
                        UserAns5 = "Cricket";
                        break;
                    case R.id.Q5option2:
                        UserAns5 = "Kabadi";
                        break;
                    case R.id.Q5option3:
                        UserAns5 = "Hockey";
                        break;
                    case R.id.Q5option4:
                        UserAns5 = "Football";
                        break;

                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Q5Ans.equals(UserAns5)){
                    AnsText5.setText("Correct Answer");
                    AnsText5.setTextColor(Color.GREEN);
                }else{
                    AnsText5.setText("Wrong Answer");
                    AnsText5.setTextColor(Color.RED);
                }
            }
        });

        //.................Questions End


        //DrawerLayout Start.............

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(MainActivity.this,drawerLayout,toolbar,R.string.Open,R.string.Close);
        drawerLayout.addDrawerListener(toggle);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()) {
                    case R.id.home:
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.account:
                        Toast.makeText(MainActivity.this, "Account", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.backup:
                        Toast.makeText(MainActivity.this, "Backup", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.setting:
                        Toast.makeText(MainActivity.this, "Setting", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.logout:
                        Toast.makeText(MainActivity.this, "Logout", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });

        //.............. DrawerLayout End

        // NavigationButton Start...........

        button.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.home:
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.backup:
                        Toast.makeText(MainActivity.this, "Backup", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.logout:
                        Toast.makeText(MainActivity.this, "Logout", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });







    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.home:
                Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                break;
            case R.id.account:
                Toast.makeText(MainActivity.this, "Account", Toast.LENGTH_SHORT).show();
                break;
            case R.id.backup:
                Toast.makeText(MainActivity.this, "Backup", Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting:
                Toast.makeText(MainActivity.this, "Setting", Toast.LENGTH_SHORT).show();
                break;
            case R.id.logout:
                Toast.makeText(MainActivity.this, "Logout", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
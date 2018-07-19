package com.example.raafe.gossip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class UserListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.ID_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(0xFFFFFFFF);

        final ArrayList<String> users = new ArrayList<>();
        users.add("User A");
        users.add("User B");
        users.add("User C");
        users.add("User D");
        users.add("User E");
        users.add("User F");
        users.add("User G");
        users.add("User H");
        users.add("User I");
        users.add("User J");
        users.add("User K");
        users.add("User L");

        final ListView listView = (ListView)findViewById(R.id.ID_userList);
        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, users);
        DataItemAdapter arrayAdapter = new DataItemAdapter(this, users);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(UserListActivity.this, ChatActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_homescreen, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.ID_settings:
                Intent intent = new Intent(UserListActivity.this, SettingsActivity.class);
                startActivity(intent);
                break;
            case R.id.ID_about:
                Intent intent2 = new Intent(UserListActivity.this, AboutActivity.class);
                startActivity(intent2);
                break;
            case R.id.ID_starredMsg:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

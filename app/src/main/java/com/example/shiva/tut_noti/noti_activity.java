package com.example.shiva.tut_noti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


/**
 * Created by Shiva on 20/01/2018.
 */

public class noti_activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.noti_activity);
        ListView listView=(ListView)findViewById(R.id.list);
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("articles").push();

        FirebaseListAdapter<Article> adapter = new FirebaseListAdapter<Article>(this,Article.class, android.R.layout.two_line_list_item,myRef) {
            @Override
            protected void populateView(View v, Article article, int position) {
                ((TextView)v.findViewById(android.R.id.text1)).setText(article.getName());
                ((TextView)v.findViewById(android.R.id.text2)).setText(article.getMessage());
            }
        };
        listView.setAdapter(adapter);
    }
}

package com.markit.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class CardViewActivity extends BaseActivity {

    private boolean loggedIn;
    private ListView cardListView;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference mDatabaseReference = database.getReference().child("items");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        cardListView = (ListView) findViewById(R.id.cardListView);

        FirebaseListAdapter<ItemObject> firebaseListAdapter = new FirebaseListAdapter<ItemObject>(
                this, ItemObject.class, R.layout.card_item, mDatabaseReference) {
            @Override
            protected void populateView(View v, ItemObject model, int position) {
                ((TextView) v.findViewById(R.id.title)).setText(model.getTitle());
                ((TextView) v.findViewById(R.id.price)).setText("$ " + model.getPrice());
                ((TextView) v.findViewById(R.id.uid)).setText(model.getUid());
            }
        };
        cardListView.setAdapter(firebaseListAdapter);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView hubPicture = (ImageView) findViewById(R.id.hub_image);
        hubPicture.setImageResource(R.drawable.sample_lmu_photo);
        hubPicture.setScaleType(ImageView.ScaleType.CENTER_CROP);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.nav_menu_button);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CardViewActivity.this, Profile.class));
            }
        });

        FloatingActionButton notifications = (FloatingActionButton) findViewById(R.id.notifications_button);
        notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DrawerLayout drawer = CardViewActivity.super.getDrawerLayout();
                drawer.openDrawer(GravityCompat.END);
                CardViewActivity.super.openNavDrawer();
            }
        });
    }


//    TODO this is the old school way of doing it, may want to upgrade
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_card_view, menu);
        MenuItem searchItem = menu.findItem(R.id.search_listings);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);

        searchView.setOnQueryTextListener(
                new SearchView.OnQueryTextListener() {
                    @Override
                    public boolean onQueryTextChange (String newText) {
                        //text has changed, apply filtering?

                        return false;
                    }

                    @Override
                    public boolean onQueryTextSubmit(String query) {

                        return false;
                    }

                }
        );

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
        if (id == R.id.profile) {
            startActivity(new Intent(CardViewActivity.this, Profile.class));
            return true;
        }
        if (id == R.id.watching) {
            startActivity(new Intent(CardViewActivity.this, FavoritesListView.class));
            return true;
        }
        if (id == R.id.change_hub) {
            return true;
        }
        if (id == R.id.edit_tags) {
            Intent tagPage = new Intent(CardViewActivity.this, Profile.class);
            tagPage.putExtra("ARG_SECTION_NUMBER", 2);
            startActivity(tagPage);
            return true;
        }
        if (id == R.id.new_listing) {
            startActivity(new Intent(CardViewActivity.this, NewListing.class));
            return true;
        }
        if (id == R.id.chat) {
            startActivity(new Intent(CardViewActivity.this, ChatListView.class));
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean b) {
        loggedIn = b;
    }

}

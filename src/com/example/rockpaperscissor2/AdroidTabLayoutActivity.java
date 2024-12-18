package com.example.rockpaperscissor2;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


@SuppressWarnings("deprecation")
public class AdroidTabLayoutActivity extends TabActivity
{
	protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TabHost tabHost = getTabHost();
        
        //Tab for welcome
        TabSpec welspec = tabHost.newTabSpec("Welcome");
        
        //Setting Title and Icon for the tab
        welspec.setIndicator("Welcome", getResources().getDrawable(R.drawable.icon_welcome_tab));
        Intent welIntent = new Intent(this, WelcomeActivity.class);
        welspec.setContent(welIntent);
        
        
        //Tab for game
        TabSpec gamespec = tabHost.newTabSpec("Game");
        
        //Setting Title and Icon for the tab
        gamespec.setIndicator("Welcome", getResources().getDrawable(R.drawable.icon_game_tab));
        Intent gameIntent = new Intent(this, GameActivity.class);
        gamespec.setContent(gameIntent);
        
        
        //Tab for help
        TabSpec helpspec = tabHost.newTabSpec("Help");
        
        //Setting Title and Icon for the tab
        helpspec.setIndicator("Welcome", getResources().getDrawable(R.drawable.icon_help_tab));
        Intent helpIntent = new Intent(this, HelpActivity.class);
        helpspec.setContent(helpIntent);
        
        //Adding all TabSpec to TabHost
        tabHost.addTab(welspec);
        tabHost.addTab(gamespec);
        tabHost.addTab(helpspec);
        
    }
}

package com.example.activity;

import com.example.view.GameView;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Main extends Activity {

	private GameView gameview;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		gameview=(GameView) findViewById(R.id.gameview);
		
	}
}

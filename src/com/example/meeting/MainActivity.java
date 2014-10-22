package com.example.meeting;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements OnClickListener{
	TextView tv1;
	Button bt1,bt2,bt5;
	//int i=20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tv1=(TextView)findViewById(R.id.textView1) ;
    

        bt1=(Button)findViewById(R.id.lbt4) ;
        bt2=(Button)findViewById(R.id.button2) ;

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);


        
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
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
   	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	
   		switch(v.getId())
   		{
   		
   		case R.id.lbt4:
   			
   	        setContentView(R.layout.secondout);
   	        
   	        bt5=(Button)findViewById(R.id.button5) ;

   	        bt5.setOnClickListener(this);
   	        
   	        tv1=(TextView)findViewById(R.id.textView1) ;
   	     
	        tv1.setText("滿漢一桌全雞*1 \n\n傲人迷香咖啡*1");
	        
   			break;
   			
   		case R.id.button2:
   			
   	        setContentView(R.layout.thirdout);
   	        
   	        bt5=(Button)findViewById(R.id.button5) ;

	        bt5.setOnClickListener(this);
	        
   	        tv1=(TextView)findViewById(R.id.textView1) ;
   	        
   	        tv1.setText("餐點已送出 請期待");
   	        
   			break;
   			
   			
   			
   		case R.id.button5:
   	        setContentView(R.layout.activity_main);
	   	     tv1=(TextView)findViewById(R.id.textView1) ;
	   	    
	
	         bt1=(Button)findViewById(R.id.lbt4) ;
	         bt2=(Button)findViewById(R.id.button2) ;
	
	         bt1.setOnClickListener(this);
	         bt2.setOnClickListener(this);
   			break;

   		}
	}
    
    
    
}

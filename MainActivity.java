package com.example.figuras;

import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	 public double  dos,pi,a;
	  public double Base=0;
	  public double Altura=0;
	  public double cuad=0;
	  public double radio=0;
	  
	  public String strUserName;
	  public String strUserName2;
	  public EditText qBase,qAltura, Resultado,lado,rad;
	  EditText tex1;
	  EditText tex2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dos=2;
        pi=3.1416;
        a=0;
        qBase = (EditText) findViewById(R.id.editText1);
        qAltura = (EditText) findViewById(R.id.editText2);
        Resultado=(EditText)findViewById(R.id.editText4);
        
        
        lado=(EditText)findViewById(R.id.editText5);
        rad=(EditText)findViewById(R.id.editText3);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void triangulo(View view){
    	
   	 tex2=(EditText) findViewById(R.id.editText2);
	      strUserName = tex2.getText().toString();
	      
	      
	      if(TextUtils.isEmpty(strUserName)) {
	    	  tex2.setError("esta vacio");
	      }
	      
	      else{
	     Base = Double.parseDouble(qBase.getText().toString());
	     Altura = Double.parseDouble(qAltura.getText().toString());
	     Resultado.setText(Double.toString( Base * Altura / dos));
	      }
	     tex1=(EditText) findViewById(R.id.editText1);
		  tex1.setText("");
		  tex1=(EditText) findViewById(R.id.editText2);
		  tex1.setText("");
	}
   
   
   public void cuadradoo(View view){
   
   	tex1=(EditText) findViewById(R.id.editText5);
	      strUserName = tex1.getText().toString();
   	
	      if(TextUtils.isEmpty(strUserName)) {
	    	  tex1.setError("esta vacio");
	      } else{
	     cuad = Double.parseDouble(lado.getText().toString());
	     Resultado.setText(Double.toString( cuad * cuad ));
	     
	      }
   
	     tex1=(EditText) findViewById(R.id.editText5);
		  tex1.setText("");
		  }
   
   public void circo(View view){
	    
	      tex1=(EditText) findViewById(R.id.editText3);
	      strUserName = tex1.getText().toString();

	      if(TextUtils.isEmpty(strUserName)) {
	    	  tex1.setError("esta vacio");
	      } else{
	    	  radio = Double.parseDouble(rad.getText().toString());
	 	     Resultado.setText(Double.toString( pi * (radio * radio )));
	    		  
	               }
	      
	 
		     
	     tex1=(EditText) findViewById(R.id.editText3);
		  tex1.setText("");
	  
		  
		  
	}
   
   public void rectangulo(View view){
   	
		   Base = Double.parseDouble(qBase.getText().toString());
		     Altura = Double.parseDouble(qAltura.getText().toString());
		     Resultado.setText(Double.toString( Base * Altura )); 
		     
		  tex1=(EditText) findViewById(R.id.editText1);
		  tex1.setText("");
		  tex1=(EditText) findViewById(R.id.editText2);
		  tex1.setText("");
		  
	   
	}
    
}

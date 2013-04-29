package com.thunderlizard.postfixcalculator;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity 
{
	public static final String TAG = MainActivity.class.getSimpleName();
	private RPNCalculatorBrain mCalculatorBrain;
	private String mInputString;
	
	private TextView statusTextView;
	private Button number0Button;
	private Button number1Button;
	private Button number2Button;
	private Button number3Button;
	private Button number4Button;
	private Button number5Button;
	private Button number6Button;
	private Button number7Button;
	private Button number8Button;
	private Button number9Button;
	private Button operatorPlusButton;
	private Button operatorMinusButton;
	private Button operatorEqualsButton;
	private Button operatorSpaceButton;
	private Button operatorCButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		connectViewsToID();
		
		mCalculatorBrain = new RPNCalculatorBrain();
		mInputString = "";
		
		handleButtonTaps();
		
		applyButtonColors();
		       
	}

	private void applyButtonColors() {
		number0Button.getBackground().setColorFilter(0xFFCAE9EE, PorterDuff.Mode.MULTIPLY);
		number1Button.getBackground().setColorFilter(0xFFCAE9EE, PorterDuff.Mode.MULTIPLY);
		number2Button.getBackground().setColorFilter(0xFFCAE9EE, PorterDuff.Mode.MULTIPLY);
		number3Button.getBackground().setColorFilter(0xFFCAE9EE, PorterDuff.Mode.MULTIPLY);
		number4Button.getBackground().setColorFilter(0xFFCAE9EE, PorterDuff.Mode.MULTIPLY);
		number5Button.getBackground().setColorFilter(0xFFCAE9EE, PorterDuff.Mode.MULTIPLY);
		number6Button.getBackground().setColorFilter(0xFFCAE9EE, PorterDuff.Mode.MULTIPLY);
		number7Button.getBackground().setColorFilter(0xFFCAE9EE, PorterDuff.Mode.MULTIPLY);
		number8Button.getBackground().setColorFilter(0xFFCAE9EE, PorterDuff.Mode.MULTIPLY);
		number9Button.getBackground().setColorFilter(0xFFCAE9EE, PorterDuff.Mode.MULTIPLY);
		operatorCButton.getBackground().setColorFilter(0xFFA9B2B3, PorterDuff.Mode.MULTIPLY);
		operatorMinusButton.getBackground().setColorFilter(0xFFA9B2B3, PorterDuff.Mode.MULTIPLY);
		operatorPlusButton.getBackground().setColorFilter(0xFFA9B2B3, PorterDuff.Mode.MULTIPLY);
		operatorSpaceButton.getBackground().setColorFilter(0xFFA9B2B3, PorterDuff.Mode.MULTIPLY);
		operatorEqualsButton.getBackground().setColorFilter(0xFFA9B2B3, PorterDuff.Mode.MULTIPLY);
	}

	private void handleButtonTaps() 
	{
		number0Button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				mInputString = mInputString.concat("0");
				statusTextView.setText(mInputString);
				number0Button.playSoundEffect(SoundEffectConstants.CLICK);
			}
		});
		number1Button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				mInputString = mInputString.concat("1");
				statusTextView.setText(mInputString);
				number1Button.playSoundEffect(SoundEffectConstants.CLICK);
			}
		});
		number2Button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				mInputString = mInputString.concat("2");
				statusTextView.setText(mInputString);
				number2Button.playSoundEffect(SoundEffectConstants.CLICK);
			}
		});
		number3Button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				mInputString = mInputString.concat("3");
				statusTextView.setText(mInputString);
				number3Button.playSoundEffect(SoundEffectConstants.CLICK);
			}
		});
		number4Button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				mInputString = mInputString.concat("4");
				statusTextView.setText(mInputString);
				number4Button.playSoundEffect(SoundEffectConstants.CLICK);
			}
		});
		number5Button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				mInputString = mInputString.concat("5");
				statusTextView.setText(mInputString);
				number5Button.playSoundEffect(SoundEffectConstants.CLICK);
			}
		});
		number6Button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				mInputString = mInputString.concat("6");
				statusTextView.setText(mInputString);
				number6Button.playSoundEffect(SoundEffectConstants.CLICK);
			}
		});
		
		number7Button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				mInputString = mInputString.concat("7");
				statusTextView.setText(mInputString);
				number7Button.playSoundEffect(SoundEffectConstants.CLICK);
			}
		});
		number8Button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				mInputString = mInputString.concat("8");
				statusTextView.setText(mInputString);
				number8Button.playSoundEffect(SoundEffectConstants.CLICK);
			}
		});
		number9Button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				mInputString = mInputString.concat("9");
				statusTextView.setText(mInputString);
				number9Button.playSoundEffect(SoundEffectConstants.CLICK);
			}
		});
		operatorSpaceButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				mInputString = mInputString.concat(" ");
				statusTextView.setText(mInputString);
				operatorSpaceButton.playSoundEffect(SoundEffectConstants.CLICK);
			}
		});
		operatorMinusButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				mInputString = mInputString.concat(" - ");
				statusTextView.setText(mInputString);
				operatorMinusButton.playSoundEffect(SoundEffectConstants.CLICK);
			}
		});
		operatorPlusButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				mInputString = mInputString.concat(" + ");
				statusTextView.setText(mInputString);
				operatorPlusButton.playSoundEffect(SoundEffectConstants.CLICK);
			}
		});
		operatorCButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				mInputString = "";
				statusTextView.setText(mInputString);
				operatorCButton.playSoundEffect(SoundEffectConstants.CLICK);
			}
		});
		operatorEqualsButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				operatorEqualsButton.playSoundEffect(SoundEffectConstants.CLICK);
				//Calculate here
				String result = mCalculatorBrain.calculate(mInputString);
				if (result.equals("error1")) {
					Toast.makeText(MainActivity.this, "Illegal Reverse Polish Notation Input!", Toast.LENGTH_LONG).show();
				}
				else if (result.equals("error2")) {
					Toast.makeText(MainActivity.this, "Error. App developer is stupid :(", Toast.LENGTH_LONG).show();
				}
				else {
					Toast toast = Toast.makeText(MainActivity.this, mInputString + " = " + result, Toast.LENGTH_LONG);
					toast.setGravity(Gravity.CENTER, 0, 0);
					toast.show();
					mInputString = result;
					statusTextView.setText(mInputString);
				}
			}
		});
		
	}

	private void connectViewsToID() 
	{
		number0Button = (Button) findViewById(R.id.number0Button);
		number1Button = (Button) findViewById(R.id.number1Button);
		number2Button = (Button) findViewById(R.id.number2Button);
		number3Button = (Button) findViewById(R.id.number3Button);
		number4Button = (Button) findViewById(R.id.number4Button);
		number5Button = (Button) findViewById(R.id.number5Button);
		number6Button = (Button) findViewById(R.id.number6Button);
		number7Button = (Button) findViewById(R.id.number7Button);
		number8Button = (Button) findViewById(R.id.number8Button);
		number9Button = (Button) findViewById(R.id.number9Button);
		operatorEqualsButton = (Button) findViewById(R.id.operatorEqualsButton);
		operatorMinusButton = (Button) findViewById(R.id.operatorMinusButton);
		operatorPlusButton = (Button) findViewById(R.id.operatorPlusButton);
		operatorSpaceButton = (Button) findViewById(R.id.operatorSpaceButton);
		operatorCButton = (Button) findViewById(R.id.operatorCButton);
		statusTextView = (TextView) findViewById(R.id.statusTextView);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

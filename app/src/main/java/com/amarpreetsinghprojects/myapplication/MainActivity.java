package com.amarpreetsinghprojects.myapplication;

import android.os.PersistableBundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1,textView2,symbolTextView;
    private float result=0, num=0;
    private String symbol;
    private boolean symbolPresent=false;
    String TAG = "msg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView)findViewById(R.id.textView1);
        textView2 = (TextView)findViewById(R.id.textView2);
        symbolTextView = (TextView)findViewById(R.id.symbol_textView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        textView2.setText(""+num);
        /*if (result!=0){
            textView1.setText(""+result);
        }
        if (symbolPresent=true)
        {
            symbolTextView.setText(symbol);
        }*/
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("num", String.valueOf(num));
        outState.putString("result",String.valueOf(result));
        outState.putString("symbol",symbol);
        outState.putString("symbotPresent",String.valueOf(symbolPresent));
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        num = (float) savedInstanceState.get("num");
        result = (float)savedInstanceState.get("result");
        symbol = (String) savedInstanceState.get("symbol");
        symbolPresent = (boolean)savedInstanceState.get("symbolPresent");
    }

    public void button_one(View view){
            String text = (String) textView2.getText();
            if (text.equals("0.0")){
                textView2.setText("1");
            }
            else {
                textView2.setText(text+"1");
            }
    }

    public void button_two(View view){
        String text = (String) textView2.getText();
        if (text.equals("0.0")){
            textView2.setText("2");
        }
        else {
            textView2.setText(text+"2");
        }
    }

    public void button_three(View view){
        String text = (String) textView2.getText();
        if (text.equals("0.0")){
            textView2.setText("3");
        }
        else {
            textView2.setText(text+"3");
        }
    }

    public void button_four(View view){
        String text = (String) textView2.getText();
        if (text.equals("0.0")){
            textView2.setText("4");
        }
        else {
            textView2.setText(text+"4");
        }
    }

    public void button_five(View view){
        String text = (String) textView2.getText();
        if (text.equals("0.0")){
            textView2.setText("5");
        }
        else {
            textView2.setText(text+"5");
        }
    }

    public void button_six(View view){
        String text = (String) textView2.getText();
        if (text.equals("0.0")){
            textView2.setText("6");
        }
        else {
            textView2.setText(text+"6");
        }
    }

    public void button_seven(View view){
        String text = (String) textView2.getText();
        if (text.equals("0.0")){
            textView2.setText("7");
        }
        else {
            textView2.setText(text+"7");
        }
    }

    public void button_eight(View view){
        String text = (String) textView2.getText();
        if (text.equals("0.0")){
            textView2.setText("8");
        }
        else {
            textView2.setText(text+"8");
        }
    }

    public void button_nine(View view){
        String text = (String) textView2.getText();
        if (text.equals("0.0")){
            textView2.setText("9");
        }
        else {
            textView2.setText(text+"9");
        }
    }

    public void button_zero(View view){
        String text = (String) textView2.getText();
        if (!text.equals("0.0")){
            textView2.setText(text+"0");
        }
    }

    public void button_dot(View view){
        String text = (String) textView2.getText();
        if (text.equals("0.0")){
            textView2.setText("0.");
        }
        else {
            textView2.setText(text+".");
        }
    }

    public void button_plus(View view){


        String text = (String) textView2.getText();
        if (symbolPresent==false){
            Log.d(TAG, "button_plus: ");
            textView1.setText(text);
            result = Float.parseFloat(text);
            symbolTextView.setText(R.string.plus);
            symbolPresent=true;
            num=0;
            textView2.setText(""+num);
        }
        else{

            switch ((String)symbolTextView.getText())
            {
                case "+": num = Float.parseFloat(text);
                    result += num;
                    textView1.setText(""+result);
                    num=0;
                    textView2.setText(""+num);
                    symbolTextView.setText(R.string.plus);
                    break;
                case "-": num = Float.parseFloat(text);
                    result -= num;
                    textView1.setText(""+result);
                    num=0;
                    textView2.setText(""+num);
                    symbolTextView.setText(R.string.plus);
                    break;
                case "/": num = Float.parseFloat(text);
                    if (num!=0) {
                        result /= num;
                        textView1.setText("" + result);
                        num = 0;
                        textView2.setText(""+num);
                        symbolTextView.setText(R.string.plus);
                    }
                    else {
                        textView2.setText("Division by Zero not possible");
                        symbolTextView.setText("");
                    }
                    break;
                case "*": num = Float.parseFloat(text);
                    result *= num;
                    textView1.setText(""+result);
                    num=0;
                    textView2.setText(""+num);
                    symbolTextView.setText(R.string.plus);
                    break;
            }
        }
        symbol = "+";
    }

    public void button_minus(View view){
        String text = (String) textView2.getText();
        if (symbolPresent==false){
            textView1.setText(text);
            result = Float.parseFloat(text);
            symbolTextView.setText(R.string.minus);
            symbolPresent=true;
            num=0;
            textView2.setText(""+num);
        }
        else{

            switch ((String)symbolTextView.getText())
            {
                case "+": num = Float.parseFloat(text);
                    result += num;
                    textView1.setText(""+result);
                    num=0;
                    textView2.setText(""+num);
                    symbolTextView.setText(R.string.minus);
                    break;
                case "-": num = Float.parseFloat(text);
                    result -= num;
                    textView1.setText(""+result);
                    num=0;
                    textView2.setText(""+num);
                    symbolTextView.setText(R.string.minus);
                    break;
                case "/": num = Float.parseFloat(text);
                    if (num!=0) {
                        result /= num;
                        textView1.setText("" + result);
                        num = 0;
                        textView2.setText(""+num);
                        symbolTextView.setText(R.string.minus);
                    }
                    else {
                        textView2.setText("Division by Zero not possible");
                        symbolTextView.setText("");
                    }
                    break;
                case "*": num = Float.parseFloat(text);
                    result *= num;
                    textView1.setText(""+result);
                    num=0;
                    textView2.setText(""+num);
                    symbolTextView.setText(R.string.minus);
                    break;
            }
        }
        symbol = "-";
    }

    public void button_multiply(View view){
        String text = (String) textView2.getText();
        if (symbolPresent==false){
            textView1.setText(text);
            result = Float.parseFloat(text);
            symbolTextView.setText(R.string.multiply);
            symbolPresent=true;
            num=0;
            textView2.setText(""+num);
        }
        else{

            switch ((String)symbolTextView.getText())
            {
                case "+": num = Float.parseFloat(text);
                    result =+ num;
                    textView1.setText(""+result);
                    num=0;
                    textView2.setText(""+num);
                    symbolTextView.setText(R.string.multiply);
                    break;
                case "-": num = Float.parseFloat(text);
                    result -= num;
                    textView1.setText(""+result);
                    num=0;
                    textView2.setText(""+num);
                    symbolTextView.setText(R.string.multiply);
                    break;
                case "/": num = Float.parseFloat(text);
                    if (num!=0) {
                        result /= num;
                        textView1.setText("" + result);
                        num = 0;
                        textView2.setText(""+num);
                        symbolTextView.setText(R.string.multiply);
                    }
                    else {
                        textView2.setText("Division by Zero not possible");
                        symbolTextView.setText("");
                    }
                    break;
                case "*": num = Float.parseFloat(text);
                    result *= num;
                    textView1.setText(""+result);
                    num=0;
                    textView2.setText(""+num);
                    symbolTextView.setText(R.string.multiply);
                    break;
            }
        }
        symbol = "*";
    }

    public void button_divide(View view){
        String text = (String) textView2.getText();
        if (symbolPresent==false){
            textView1.setText(text);
            result = Float.parseFloat(text);
            symbolTextView.setText(R.string.divide);
            symbolPresent=true;
            num=0;
            textView2.setText(""+num);
        }
        else{

            switch ((String)symbolTextView.getText())
            {
                case "+": num = Float.parseFloat(text);
                    result += num;
                    textView1.setText(""+result);
                    num=0;
                    textView2.setText(""+num);
                    symbolTextView.setText(R.string.divide);
                    break;
                case "-": num = Float.parseFloat(text);
                    result -= num;
                    textView1.setText(""+result);
                    num=0;
                    textView2.setText(""+num);
                    symbolTextView.setText(R.string.divide);
                    break;
                case "/": num = Float.parseFloat(text);
                    if (num!=0) {
                        result /= num;
                        textView1.setText("" + result);
                        num = 0;
                        textView2.setText(""+num);
                        symbolTextView.setText(R.string.divide);
                    }
                    else {
                        textView2.setText("Division by Zero not possible");
                        symbolTextView.setText("");
                    }
                    break;
                case "*": num = Float.parseFloat(text);
                    result *= num;
                    textView1.setText(""+result);
                    num=0;
                    textView2.setText(""+num);
                    symbolTextView.setText(R.string.divide);
                    break;
            }
        }
        symbol = "/";
    }

    public void result(View view){

        String text = (String) textView2.getText();
        switch ((String)symbolTextView.getText())
        {
            case "+": num = Float.parseFloat(text);
                Log.d(TAG, "button_plus: "+num);
                result = result + num;
                textView2.setText(""+result);
                num=0;
                textView1.setText("");
                symbolTextView.setText("");
                break;
            case "-": num = Float.parseFloat(text);
                result -= num;
                textView2.setText(""+result);
                num=0;
                textView1.setText("");
                symbolTextView.setText("");
                break;
            case "/": num = Float.parseFloat(text);
                if (num!=0) {
                    result /= num;
                    textView2.setText("" + result);
                    num = 0;
                    textView1.setText("");
                    symbolTextView.setText("");
                }
                else {
                    textView2.setText("Division by Zero not possible");
                    symbolTextView.setText("");
                }
                break;
            case "*": num = Float.parseFloat(text);
                result *= num;
                textView2.setText(""+result);
                num=0;
                textView1.setText("");
                symbolTextView.setText("");
                break;
            default:
        }
        symbol = "";

    }

    public void reset(View view){
        num = 0;
        result = 0;
        textView2.setText("0.0");
        textView1.setText("");
        symbolTextView.setText("");
        symbol="";
        symbolPresent=false;
    }
}

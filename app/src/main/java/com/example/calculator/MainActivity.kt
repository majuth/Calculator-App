package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    private lateinit var display: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display = findViewById(R.id.textView);
        display.setShowSoftInputOnFocus(false);

        display.setOnClickListener(object: View.OnClickListener{
            override fun onClick(view: View?){
                if(getString(R.string.display).equals(display.getText().toString())){
                    display.setText("")
                }
            }

        })
    }

    private fun updateText(strToAdd: String){
        var oldStr: String = display.getText().toString();
        var cursorPos: Int = display.getSelectionStart();
        var leftStr: String = oldStr.substring(0, cursorPos);
        var rightStr: String = oldStr.substring(cursorPos);
        if(getString(R.string.display).equals(display.getText().toString())){
            display.setText(strToAdd);
            display.setSelection(cursorPos+1);
        }else{
            display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
            display.setSelection(cursorPos+1);
        }
    }

    fun zeroButton(view: View){
        updateText(strToAdd = "0");
    }

    fun oneButton(view: View){
        updateText(strToAdd = "1");
    }

    fun twoButton(view: View){
        updateText(strToAdd = "2");
    }

    fun threeButton(view: View){
        updateText(strToAdd = "3");
    }

    fun fourButton(view: View){
        updateText(strToAdd = "4");
    }

    fun fiveButton(view: View){
        updateText(strToAdd = "5");
    }

    fun sixButton(view: View){
        updateText(strToAdd = "6");
    }

    fun sevenButton(view: View){
        updateText(strToAdd = "7");
    }

    fun eightButton(view: View){
        updateText(strToAdd = "8");
    }

    fun nineButton(view: View){
        updateText(strToAdd = "9");
    }

    fun clearButton(view: View){
        display.setText("");
    }

    fun exponentButton(view: View){
        updateText(strToAdd = "^");
    }

    fun parenthesesButton(view: View){
    }

    fun divideButton(view: View){
        updateText(strToAdd = "÷");
    }

    fun multiplyButton(view: View){
        updateText(strToAdd = "×");
    }

    fun addButton(view: View){
        updateText(strToAdd = "+");
    }

    fun subtractButton(view: View){
        updateText(strToAdd = "-");
    }

    fun plusminusButton(view: View){
        updateText(strToAdd = "±");
    }

    fun decimalButton(view: View){
        updateText(strToAdd = ".");
    }

    fun equalButton(view: View){
        updateText(strToAdd = "=");
    }

    fun backspaceButton(view: View){

    }
}
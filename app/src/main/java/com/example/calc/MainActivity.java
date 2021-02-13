package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, button10, buttonadd, buttonsub, buttoneql, buttondiv,
            buttonmul, buttonclear, buttonpow, buttonmod;
    EditText result;

    float num1 = 0, num2 = 0;
    char action;
    boolean actionProvided = false, newCalculation = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setButtonsClickEvents();
    }

    public void disableButtons() {
        //disable action buttons
        buttonadd.setEnabled(false);
        buttonmul.setEnabled(false);
        buttondiv.setEnabled(false);
        buttonsub.setEnabled(false);
        buttonpow.setEnabled(false);
        buttonmod.setEnabled(false);
        button10.setEnabled(true);
    }
    public void enableButtons() {
        buttonadd.setEnabled(true);
        buttonmul.setEnabled(true);
        buttondiv.setEnabled(true);
        buttonsub.setEnabled(true);
        buttonpow.setEnabled(true);
        buttonmod.setEnabled(true);
        button10.setEnabled(true);
    }
    public void setButtonsClickEvents() {
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonadd = (Button) findViewById(R.id.buttonadd);
        buttonsub = (Button) findViewById(R.id.buttonsub);
        buttonmul = (Button) findViewById(R.id.buttonmul);
        buttondiv = (Button) findViewById(R.id.buttondiv);
        buttoneql = (Button) findViewById(R.id.buttoneql);
        buttonclear = findViewById(R.id.buttonC);
        buttonpow = findViewById(R.id.buttonpow);
        buttonmod = findViewById(R.id.buttonmod);

        result = (EditText) findViewById(R.id.edt1);

        button0.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(actionProvided || newCalculation) {
                            result.setText("0");
                            actionProvided = false;
                            newCalculation = false;
                        } else {
                            result.setText(result.getText() + "0");
                        }
                    }
                }
        );
        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(actionProvided || newCalculation) {
                            result.setText("1");
                            actionProvided = false;
                            newCalculation = false;
                        } else {
                            result.setText(result.getText() + "1");
                        }
                    }
                }
        );
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(actionProvided || newCalculation) {
                            result.setText("2");
                            actionProvided = false;
                            newCalculation = false;
                        } else {
                            result.setText(result.getText() + "2");
                        }
                    }
                }
        );
        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(actionProvided || newCalculation) {
                            result.setText("3");
                            actionProvided = false;
                            newCalculation = false;
                        } else {
                            result.setText(result.getText() + "3");
                        }
                    }
                }
        );
        button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(actionProvided || newCalculation) {
                            result.setText("4");
                            actionProvided = false;
                            newCalculation = false;
                        } else {
                            result.setText(result.getText() + "4");
                        }
                    }
                }
        );
        button5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(actionProvided || newCalculation) {
                            result.setText("5");
                            actionProvided = false;
                            newCalculation = false;
                        } else {
                            result.setText(result.getText() + "5");
                        }
                    }
                }
        );
        button6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(actionProvided || newCalculation) {
                            result.setText("6");
                            actionProvided = false;
                            newCalculation = false;
                        } else {
                            result.setText(result.getText() + "6");
                        }
                    }
                }
        );
        button7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(actionProvided || newCalculation) {
                            result.setText("7");
                            actionProvided = false;
                            newCalculation = false;
                        } else {
                            result.setText(result.getText() + "7");
                        }
                    }
                }
        );
        button8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(actionProvided || newCalculation) {
                            result.setText("8");
                            actionProvided = false;
                            newCalculation = false;
                        } else {
                            result.setText(result.getText() + "8");
                        }
                    }
                }
        );
        button9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(actionProvided || newCalculation) {
                            result.setText("9");
                            actionProvided = false;
                            newCalculation = false;
                        } else {
                            result.setText(result.getText() + "9");
                        }
                    }
                }
        );
        button10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(result.getText().toString().isEmpty() || newCalculation || actionProvided) {
                            result.setText("0.");
                            actionProvided = false;
                            newCalculation = false;
                        }
                        else
                            result.setText(result.getText() + ".");
                        button10.setEnabled(false);
                    }
                }
        );
        buttonadd.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        num1 = Float.parseFloat(result.getText().toString().isEmpty() ? "0" : result.getText().toString());
                        action = '+';
                        actionProvided = true;

                        disableButtons();
                    }
                }
        );
        buttonsub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        num1 = Float.parseFloat(result.getText().toString().isEmpty() ? "0" : result.getText().toString());
                        action = '-';
                        actionProvided = true;

                        disableButtons();
                    }
                }
        );
        buttondiv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        num1 = Float.parseFloat(result.getText().toString().isEmpty() ? "0" : result.getText().toString());
                        action = '/';
                        actionProvided = true;

                        disableButtons();
                    }
                }
        );
        buttonmul.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        num1 = Float.parseFloat(result.getText().toString().isEmpty() ? "0" : result.getText().toString());
                        action = '*';
                        actionProvided = true;

                        disableButtons();
                    }
                }
        );
        buttonmod.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        num1 = Float.parseFloat(result.getText().toString().isEmpty() ? "0" : result.getText().toString());
                        action = '%';
                        actionProvided = true;

                        disableButtons();
                    }
                }
        );
        buttonpow.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        num1 = Float.parseFloat(result.getText().toString().isEmpty() ? "0" : result.getText().toString());
                        action = '2';
                        actionProvided = true;

                        disableButtons();
                    }
                }
        );
        buttoneql.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        num2 = Float.parseFloat(result.getText().toString().isEmpty() ? "0" : result.getText().toString());
                        if(action == '+')
                            result.setText(Float.toString(num1 + num2));
                        else if(action == '-')
                            result.setText(Float.toString(num1 - num2));
                        else if(action == '*')
                            result.setText(Float.toString(num1 * num2));
                        else if(action == '/')
                            result.setText(Float.toString(num1 / num2));
                        else if(action == '%')
                            result.setText(Float.toString(num1 % num2));
                        else if(action == '2')
                            result.setText(Float.toString((float)Math.pow(num1, num2)));

                        newCalculation = true;
                        enableButtons();
                    }
                }
        );
        buttonclear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        result.setText("");
                        num1 = 0;
                        num2 = 0;
                        action = '0';
                        actionProvided = false;

                        enableButtons();
                    }
                }
        );
    }


}
package com.halasfilip.mycalculatorandroid;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {


    private Button zero, one, two, three, four, five, six, seven, eight, nine, add, substract, multiply, divide, bracketOpen, bracketClose, coma, equals, del, delAll;
    private TextView txtEquation, txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two =  findViewById(R.id.two);
        three = findViewById(R.id.three);
        four =  findViewById(R.id.four);
        five =  findViewById(R.id.five);
        six =  findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine =  findViewById(R.id.nine);
        add =  findViewById(R.id.add);
        substract =  findViewById(R.id.substract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        bracketOpen = findViewById(R.id.openBracket);
        bracketClose =  findViewById(R.id.closeBracket);
        coma =  findViewById(R.id.coma);
        equals =  findViewById(R.id.equals);
        del =  findViewById(R.id.clear);
        delAll =  findViewById(R.id.clearAll);
        txtEquation = findViewById(R.id.txtEquation);
        txtResult = findViewById(R.id.txtResult);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEquation.setText(txtEquation.getText() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEquation.setText(txtEquation.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEquation.setText(txtEquation.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEquation.setText(txtEquation.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEquation.setText(txtEquation.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEquation.setText(txtEquation.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEquation.setText(txtEquation.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEquation.setText(txtEquation.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEquation.setText(txtEquation.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEquation.setText(txtEquation.getText() + "9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEquation.setText(txtEquation.getText()+"+");
            }
        });
        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEquation.setText(txtEquation.getText()+"-");
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEquation.setText(txtEquation.getText()+"*");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEquation.setText(txtEquation.getText()+"/");
            }
        });
        bracketOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEquation.setText(txtEquation.getText()+"(");
            }
        });
        bracketClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEquation.setText(txtEquation.getText()+")");
            }
        });
        coma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEquation.setText(txtEquation.getText()+".");
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtEquation.length()>0) {
                    txtEquation.setText(txtEquation.getText().toString().substring(0, txtEquation.getText().length() - 1));
                }
            }
        });
        delAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEquation.setText(null);
            }
        });


        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(null);
                String data = txtEquation.getText().toString();
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
                try {
                    txtResult.setText(txtResult.getText().toString()+engine.eval(data));
                } catch (ScriptException e) {
                    e.printStackTrace();
                    txtResult.setText("Can't do that. Correct your equation");
                }


            }
        });

    }

}

package com.example.claculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main_Activity extends AppCompatActivity implements View.OnClickListener {

    TextView ResultTextView;


    Button AcOperatorButton;
    Button SignChangerOperatorButton;
    Button PercentageOperatorButton;
    Button DivisionOperatorButton;
    Button MultiplyOperatorButton;
    Button SubtractionOperatorButton;
    Button PlusOperatorButton;
    Button ResultOperatorButton;
    Button Dot_Operator_Button;

    Button CLeftOperatorButton;
    Button CRightOperatorButton;

    Button No0OperatorButton;
    Button No1OperatorButton;
    Button No2OperatorButton;
    Button No3OperatorButton;
    Button No4OperatorButton;
    Button No5OperatorButton;
    Button No6OperatorButton;
    Button No7OperatorButton;
    Button No8OperatorButton;
    Button No9OperatorButton;
    


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*--------------------Hooks-----------------*/

        ResultTextView = findViewById(R.id.Result_Text_View);

        AcOperatorButton = findViewById(R.id.Ac_Operator_Button);
        SignChangerOperatorButton = findViewById(R.id.Sign_Changer_Operator_Button);
        PercentageOperatorButton = findViewById(R.id.Percentage_Operator_Button);
        DivisionOperatorButton = findViewById(R.id.Division_Operator_Button);
        MultiplyOperatorButton = findViewById(R.id.Multiply_Operator_Button);
        SubtractionOperatorButton = findViewById(R.id.Subtraction_Operator_Button);
        PlusOperatorButton = findViewById(R.id.Plus_Operator_Button);
        ResultOperatorButton = findViewById(R.id.Result_Operator_Button);
        Dot_Operator_Button = findViewById(R.id.Dot_Operator_Button);

        CLeftOperatorButton = findViewById(R.id.C_Left_Operator_Button);
        CRightOperatorButton = findViewById(R.id.C_Right_Operator_Button);

        No0OperatorButton = findViewById(R.id.No_0_Operator_Button);
        No1OperatorButton = findViewById(R.id.No_1_Operator_Button);
        No2OperatorButton = findViewById(R.id.No_2_Operator_Button);
        No3OperatorButton = findViewById(R.id.No_3_Operator_Button);
        No4OperatorButton = findViewById(R.id.No_4_Operator_Button);
        No5OperatorButton = findViewById(R.id.No_5_Operator_Button);
        No6OperatorButton = findViewById(R.id.No_6_Operator_Button);
        No7OperatorButton = findViewById(R.id.No_7_Operator_Button);
        No8OperatorButton = findViewById(R.id.No_8_Operator_Button);
        No9OperatorButton = findViewById(R.id.No_9_Operator_Button);

    }

    @Override
    public void onClick(View v) {

        Button CurrentButton = (Button) v;
        String ButtonText = CurrentButton.getText().toString();


    }
}
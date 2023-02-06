package com.example.claculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main_Activity extends AppCompatActivity implements View.OnClickListener {
    String NewNumber = "";
    String OldNumber = "";
    String Op = "";
    float Result = 0.0f;

    boolean IsNewOpe = true;

    TextView ResultTextView, Project_Link;

    ImageView github_link;

    Button CLeftOperatorButton;
    Button CRightOperatorButton;

    Button PlusOperatorButton;
    Button SubtractionOperatorButton;
    Button MultiplyOperatorButton;
    Button DivisionOperatorButton;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*--------------------Hooks-----------------*/

        ResultTextView = findViewById(R.id.Result_Text_View);

        CLeftOperatorButton = findViewById(R.id.C_Left_Operator_Button);
        CRightOperatorButton = findViewById(R.id.C_Right_Operator_Button);

        PlusOperatorButton = findViewById(R.id.Plus_Operator_Button);
        SubtractionOperatorButton = findViewById(R.id.Subtraction_Operator_Button);
        MultiplyOperatorButton = findViewById(R.id.Multiply_Operator_Button);
        DivisionOperatorButton = findViewById(R.id.Division_Operator_Button);
        github_link = findViewById(R.id.github_link);
        Project_Link = findViewById(R.id.Project_Link);

        /*<------------Handle_Github_link_On_click_Listener--------->*/

        github_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/joymridha2004"));
                startActivity(intent);
            }
        });

        /*<------------Handle_Github_Project_Link_On_click_Listener--------->*/

        Project_Link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/joymridha2004/Calculator_Java_Application"));
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View v) {

        Button CurrentButton = (Button) v;
        String ButtonText = CurrentButton.getText().toString();


    }

    public void NumberEvent(View view) {

        if (ResultTextView.getText().toString().length() <= 5) {
            ResultTextView.setTextSize(100);
        } else if (ResultTextView.getText().toString().length() == 6) {
            ResultTextView.setTextSize(90);
        } else if (ResultTextView.getText().toString().length() == 7) {
            ResultTextView.setTextSize(80);
        } else if (ResultTextView.getText().toString().length() == 8) {
            ResultTextView.setTextSize(70);
        } else if (ResultTextView.getText().toString().length() >= 9 && !(ResultTextView.getText().toString().length() == 11)) {
            ResultTextView.setTextSize(45);
        } else if (ResultTextView.getText().toString().length() == 11) {
            Toast.makeText(getApplicationContext(), "Max Length 12 Digit", Toast.LENGTH_SHORT).show();
        }
        PlusOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
        PlusOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));
        SubtractionOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
        SubtractionOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));
        MultiplyOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
        MultiplyOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));
        DivisionOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
        DivisionOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));

        if (view.getId() == R.id.No_0_Operator_Button && !IsNewOpe || view.getId() != R.id.No_0_Operator_Button) {


            if (IsNewOpe) {
                ResultTextView.setText("");
                IsNewOpe = false;
            }

            String Number = ResultTextView.getText().toString();

            switch (view.getId()) {

                case R.id.No_0_Operator_Button: {
                    Number += "0";
                    break;
                }
                case R.id.No_1_Operator_Button: {
                    Number += "1";
                    break;
                }
                case R.id.No_2_Operator_Button: {
                    Number += "2";
                    break;
                }
                case R.id.No_3_Operator_Button: {
                    Number += "3";
                    break;
                }
                case R.id.No_4_Operator_Button: {
                    Number += "4";
                    break;
                }
                case R.id.No_5_Operator_Button: {
                    Number += "5";
                    break;
                }
                case R.id.No_6_Operator_Button: {
                    Number += "6";
                    break;
                }
                case R.id.No_7_Operator_Button: {
                    Number += "7";
                    break;
                }
                case R.id.No_8_Operator_Button: {
                    Number += "8";
                    break;
                }
                case R.id.No_9_Operator_Button: {
                    Number += "9";
                    break;
                }
                case R.id.Dot_Operator_Button: {
                    Number += ".";
                    break;
                }
                case R.id.Sign_Changer_Operator_Button: {
                    if (!ResultTextView.getText().toString().startsWith("-")) {
                        Number = "-" + Number;
                    } else {
                        Number = Number.replace("-", "");
                    }
                    break;
                }
            }
            ResultTextView.setText(Number);
        } else {
            ResultTextView.setText("0");
        }
    }

    public void OperatorEvent(View view) {

        IsNewOpe = true;
        OldNumber = ResultTextView.getText().toString();

        switch (view.getId()) {
            case R.id.Plus_Operator_Button: {
                PlusOperatorButton.setBackgroundResource(R.drawable.work_operator_button_shape);
                PlusOperatorButton.setTextColor(Color.parseColor("#FFFF9500"));
                Op = "+";
                SubtractionOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
                SubtractionOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));
                MultiplyOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
                MultiplyOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));
                DivisionOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
                DivisionOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));

                break;
            }
            case R.id.Subtraction_Operator_Button: {
                SubtractionOperatorButton.setBackgroundResource(R.drawable.work_operator_button_shape);
                SubtractionOperatorButton.setTextColor(Color.parseColor("#FFFF9500"));
                Op = "-";
                PlusOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
                PlusOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));
                MultiplyOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
                MultiplyOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));
                DivisionOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
                DivisionOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));

                break;
            }
            case R.id.Multiply_Operator_Button: {
                MultiplyOperatorButton.setBackgroundResource(R.drawable.work_operator_button_shape);
                MultiplyOperatorButton.setTextColor(Color.parseColor("#FFFF9500"));
                Op = "×";
                PlusOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
                PlusOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));
                SubtractionOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
                SubtractionOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));
                DivisionOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
                DivisionOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));

                break;
            }
            case R.id.Division_Operator_Button: {
                DivisionOperatorButton.setBackgroundResource(R.drawable.work_operator_button_shape);
                DivisionOperatorButton.setTextColor(Color.parseColor("#FFFF9500"));
                Op = "÷";
                PlusOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
                PlusOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));
                SubtractionOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
                SubtractionOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));
                MultiplyOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
                MultiplyOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));

                break;
            }
        }
    }

    public void EqualEvent(View view) {

        NewNumber = ResultTextView.getText().toString();
        Result = 0.0f;

        PlusOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
        PlusOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));
        SubtractionOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
        SubtractionOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));
        MultiplyOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
        MultiplyOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));
        DivisionOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
        DivisionOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));

        if ((NewNumber.equals(".") && OldNumber.equals(".") || (NewNumber.equals(".") || OldNumber.equals(".")))) {
            ResultTextView.setText("0");
            NewNumber = "0";
            OldNumber = "0";
            IsNewOpe = true;
            return;
        }

        if (Op.equals("+")) {
            Result = Float.parseFloat(OldNumber) + Float.parseFloat(NewNumber);
        } else if (Op.equals("-")) {
            Result = Float.parseFloat(OldNumber) - Float.parseFloat(NewNumber);
        } else if (Op.equals("×")) {
            Result = Float.parseFloat(OldNumber) * Float.parseFloat(NewNumber);
        } else if (Op.equals("÷")) {
            if (NewNumber.equals("0") && !OldNumber.equals("0")) {
                (Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT)).show();
                OldNumber = "0";
                NewNumber = "0";
                IsNewOpe = true;
            } else {
                Result = Float.parseFloat(OldNumber) / Float.parseFloat(NewNumber);
            }
        }


        Double d = 0.0;
        String FinalNumDouble = Result + d.toString();

        if (FinalNumDouble.length() <= 6) {
            ResultTextView.setTextSize(100);
        } else if (FinalNumDouble.length() == 7) {
            ResultTextView.setTextSize(90);
        } else if (FinalNumDouble.length() == 8) {
            ResultTextView.setTextSize(80);
        } else if (FinalNumDouble.length() == 9) {
            ResultTextView.setTextSize(70);
        } else if (FinalNumDouble.length() > 9 && FinalNumDouble.length() <= 14) {
            ResultTextView.setTextSize(45);
        } else if (FinalNumDouble.length() > 15 && FinalNumDouble.length() <= 20) {
            ResultTextView.setTextSize(30);
        } else if (FinalNumDouble.length() > 20) {
            ResultTextView.setTextSize(25);
        }

        ResultTextView.setText(Result + "");

    }

    public void AcEvent(View view) {
        ResultTextView.setText("0");
        ResultTextView.setTextSize(100);
        IsNewOpe = true;

        PlusOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
        PlusOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));
        SubtractionOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
        SubtractionOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));
        MultiplyOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
        MultiplyOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));
        DivisionOperatorButton.setBackgroundResource(R.drawable.operator_button_shape);
        DivisionOperatorButton.setTextColor(Color.parseColor("#FFFFFF"));
    }

    public void PercentageEvent(View view) {
        double No = Double.parseDouble(ResultTextView.getText().toString()) / 100;
        ResultTextView.setText(No + "");
        IsNewOpe = true;
    }

    public void clearEvent(View view) {
        if (ResultTextView.getText().toString().length() >= 2) {
            String ClearLastNumber = ResultTextView.getText().toString().substring(0, ResultTextView.getText().toString().length() - 1);
            ResultTextView.setText(ClearLastNumber);
        } else if (ResultTextView.getText().toString().length() == 1) {
            ResultTextView.setText("0");
            IsNewOpe = true;
        } else if (ResultTextView.getText().toString() == "0") {
            ResultTextView.setText("0");
            IsNewOpe = true;
        }

        if (ResultTextView.getText().toString().length() <= 6) {
            ResultTextView.setTextSize(100);
        } else if (ResultTextView.getText().toString().length() == 7) {
            ResultTextView.setTextSize(90);
        } else if (ResultTextView.getText().toString().length() == 8) {
            ResultTextView.setTextSize(80);
        } else if (ResultTextView.getText().toString().length() == 9) {
            ResultTextView.setTextSize(70);
        } else if (ResultTextView.getText().toString().length() > 9 && ResultTextView.getText().toString().length() <= 14) {
            ResultTextView.setTextSize(45);
        } else if (ResultTextView.getText().toString().length() > 15 && ResultTextView.getText().toString().length() <= 20) {
            ResultTextView.setTextSize(30);
        } else if (ResultTextView.getText().toString().length() > 20) {
            ResultTextView.setTextSize(25);
        }

    }
}
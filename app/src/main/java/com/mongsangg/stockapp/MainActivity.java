package com.mongsangg.stockapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.icu.text.NumberFormat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    LinearLayout layoutMain;
    LinearLayout layoutCheck;
    LinearLayout layoutInput1;
    LinearLayout layoutInput2;
    LinearLayout layoutInput3;
    LinearLayout layoutSave;

    Button companyListBtn;
    Button buyBtn;
    Button sellBtn;
    String selectedCompany = "없음";
    int indexCompany = 0;

    TextView priceTxt;


    Button countBtn2;
    Button priceBtn1;

    Button priceBtn;
    Button numberBtn;

    Button buttonBack1;
    Button buttonReset1;
    Button buttonSeven1;
    Button buttonEight1;
    Button buttonNine1;
    Button buttonPlus11;
    Button buttonFour1;
    Button buttonFive1;
    Button buttonSix1;
    Button buttonPlus21;
    Button buttonOne1;
    Button buttonTwo1;
    Button buttonThree1;
    Button buttonPlus31;
    Button buttonZeroZero1;
    Button buttonZero1;
    Button buttonZeroZeroZero1;
    Button buttonPlus41;
    Button buttonSubmit1;
    Button buttonCancle1;

    TextView fixPriceTxt1;
    TextView calPriceTxt1;
    TextView countTxt1;
    Button buttonUp1;
    Button buttonDown1;

    Integer countNum = 0;
    String countStr = "0";
    Integer valueX;
    NumberFormat nf = NumberFormat.getInstance();

    Integer check = 0;

    Button buttonFinal;
    Button buttonSave;

    Integer checkSave = 0;

    final String[] companies = {"관악전자", "서울자동차", "신림철강", "낙성대캐피탈", "녹두금융"};

    TextView textviewSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonFinal = (Button)findViewById(R.id.button_final);
        buttonSave = (Button)findViewById(R.id.button_save);
        textviewSave = (TextView) findViewById(R.id.textview_save);
        priceTxt = (TextView)findViewById(R.id.textview_price) ;
        layoutMain = (LinearLayout)findViewById(R.id.layout_main);
        layoutCheck = (LinearLayout)findViewById(R.id.layout_check);
        layoutInput1 = (LinearLayout)findViewById(R.id.layout_input1);
        layoutInput2 = (LinearLayout)findViewById(R.id.layout_input2);
        layoutInput3 = (LinearLayout)findViewById(R.id.layout_input3);
        layoutSave = (LinearLayout)findViewById(R.id.layout_save);
        companyListBtn = (Button)findViewById(R.id.button_companylist);
        companyListBtn.setText(selectedCompany);
        companyListBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("회사를 선택하세요")
                        .setSingleChoiceItems(companies, indexCompany, new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                selectedCompany = companies[which];
                                indexCompany = which;
                                companyListBtn.setText(selectedCompany);
                                switch (indexCompany){
                                    case 0:


                                        double random = Math.random();
                                        Integer value = (int)(random*1000000)+1500000;
                                        valueX = value;
                                        String s = nf.format(value);
                                        priceTxt.setText(s);
                                        fixPriceTxt1.setText(s);
                                        break;
                                    case 1:
                                        NumberFormat nf1 = NumberFormat.getInstance();

                                        double random1 = Math.random();
                                        Integer value1 = (int)(random1*100000)+100000;
                                        valueX = value1;
                                        String s1 = nf1.format(value1);
                                        priceTxt.setText(s1);
                                        fixPriceTxt1.setText(s1);
                                        break;
                                    case 2:
                                        NumberFormat nf2 = NumberFormat.getInstance();

                                        double random2 = Math.random();
                                        Integer value2 = (int)(random2*50000)+250000;
                                        String s2 = nf2.format(value2);
                                        valueX = value2;
                                        priceTxt.setText(s2);
                                        fixPriceTxt1.setText(s2);
                                        break;
                                    case 3:
                                        NumberFormat nf3 = NumberFormat.getInstance();

                                        double random3 = Math.random();
                                        Integer value3 = (int)(random3*30000)+30000;
                                        String s3 = nf3.format(value3);
                                        valueX = value3;
                                        priceTxt.setText(s3);
                                        fixPriceTxt1.setText(s3);
                                        break;
                                    case 4:
                                        NumberFormat nf4 = NumberFormat.getInstance();

                                        double random4 = Math.random();
                                        Integer value4 = (int)(random4*500000)+500000;
                                        String s4 = nf4.format(value4);
                                        valueX = value4;
                                        priceTxt.setText(s4);
                                        fixPriceTxt1.setText(s4);
                                        break;

                                }
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });



        buyBtn = (Button)findViewById(R.id.button_buy);
        buyBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                layoutMain.setBackgroundResource(R.drawable.back_1);
                layoutCheck.setVisibility(View.VISIBLE);
            }
        });

        sellBtn = (Button)findViewById(R.id.button_sell);
        sellBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                layoutMain.setBackgroundResource(R.drawable.back_2);
                layoutCheck.setVisibility(View.INVISIBLE);
                check = 1;
            }
        });

        priceBtn = (Button)findViewById(R.id.button_price);
        priceBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                layoutInput3.setVisibility(View.VISIBLE);
                layoutInput1.setVisibility(View.GONE);
                layoutInput2.setVisibility(View.GONE);
                check = 2;
            }
        });
        numberBtn = (Button)findViewById(R.id.button_number);
        numberBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                layoutInput1.setVisibility(View.VISIBLE);
                layoutInput2.setVisibility(View.GONE);
                layoutInput3.setVisibility(View.GONE);
                check = 1;

            }
        });

        countBtn2 = (Button)findViewById(R.id.button_count1);
        countBtn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                layoutInput1.setVisibility(View.VISIBLE);
                layoutInput1.setBackgroundResource(R.drawable.back_3);
                check = 1;
                countTxt1.setText("0");
                calPriceTxt1.setText("0");

            }
        });
        priceBtn1 = (Button)findViewById(R.id.button_price1);
        priceBtn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                layoutInput1.setVisibility(View.VISIBLE);
                layoutInput1.setBackgroundResource(R.drawable.back_4);
                check = 2;
                countTxt1.setText("0");
                calPriceTxt1.setText("0");

            }
        });

        buttonFinal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(MainActivity.this, "현금매수가 완료되었습니다.", Toast.LENGTH_SHORT);
                String s = textviewSave.getText() + "\n" + selectedCompany + " " + numberBtn.getText() + " 주가 매수되었습니다.";
                textviewSave.setText(s);
            }
        });

        buttonSave.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(checkSave == 0) {
                    layoutSave.setVisibility(View.VISIBLE);
                    checkSave = 1;
                }else if(checkSave == 1){
                    layoutSave.setVisibility(View.GONE);
                    checkSave = 0;
                }
            }
        });


        fixPriceTxt1 = (TextView)findViewById(R.id.textview_fixprice1);
        calPriceTxt1 = (TextView)findViewById(R.id.textview_calprice1);
        countTxt1 = (TextView)findViewById(R.id.textview_count1);
        buttonUp1 = (Button)findViewById(R.id.button_up1);
        buttonDown1 = (Button)findViewById(R.id.button_down1);


        buttonBack1 = (Button)findViewById(R.id.button_back1);
        buttonBack1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(countStr.length() >= 3) {
                    countStr = countStr.substring(0, countStr.length() - 1);
                }else if(countStr.length() == 1){
                    countStr = "0";
                }else if(countStr.length() == 2){
                    countStr = countStr.substring(0, countStr.length() -1);
                }
                Cal();

            }
        });
        buttonReset1 = (Button)findViewById(R.id.button_reset1);
        buttonReset1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                countStr = "0";
                countTxt1.setText(countStr);
                Integer a = Integer.parseInt(countStr)*valueX;
                calPriceTxt1.setText(nf.format(a));
            }
        });
        buttonSeven1 = (Button)findViewById(R.id.button_seven1);
        buttonSeven1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(countStr.equals("0")){
                    countStr="7";
                }else {
                    countStr += "7";
                }
                Cal();
            }
        });
        buttonEight1 = (Button)findViewById(R.id.button_eight1);
        buttonEight1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(countStr.equals("0")){
                    countStr="8";
                }else {
                    countStr += "8";
                }
                Cal();
            }
        });
        buttonNine1 = (Button)findViewById(R.id.button_nine1);
        buttonNine1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(countStr.equals("0")){
                    countStr="9";
                }else {
                    countStr += "9";
                }
                Cal();
            }
        });
        buttonPlus11 = (Button)findViewById(R.id.button_plus11);
        buttonPlus11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });
        buttonFour1 = (Button)findViewById(R.id.button_four1);
        buttonFour1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(countStr.equals("0")){
                    countStr="4";
                }else {
                    countStr += "4";
                }
                Cal();
            }
        });
        buttonFive1 = (Button)findViewById(R.id.button_five1);
        buttonFive1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(countStr.equals("0")){
                    countStr="5";
                }else {
                    countStr += "5";
                }
                Cal();
            }
        });
        buttonSix1 = (Button)findViewById(R.id.button_six1);
        buttonSix1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(countStr.equals("0")){
                    countStr="6";
                }else {
                    countStr += "6";
                }
                Cal();
            }
        });
        buttonPlus21 = (Button)findViewById(R.id.button_plus21);
        buttonPlus21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });
        buttonOne1 = (Button)findViewById(R.id.button_one1);
        buttonOne1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(countStr.equals("0")){
                    countStr="1";
                }else {
                    countStr += "1";
                }
                Cal();
            }
        });
        buttonTwo1 = (Button)findViewById(R.id.button_two1);
        buttonTwo1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(countStr.equals("0")){
                    countStr="2";
                }else {
                    countStr += "2";
                }
                Cal();
            }
        });
        buttonThree1 = (Button)findViewById(R.id.button_three1);
        buttonThree1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(countStr.equals("0")){
                    countStr="3";
                }else {
                    countStr += "3";
                }
                Cal();
            }
        });
        buttonPlus31 = (Button)findViewById(R.id.button_plus31);
        buttonPlus31.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });
        buttonZeroZero1 = (Button)findViewById(R.id.button_zerozero1);
        buttonZeroZero1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(countStr.equals("0")){
                    countStr="0";
                }else {
                    countStr += "00";
                }
                Cal();
            }
        });
        buttonZero1 = (Button)findViewById(R.id.button_zero1);
        buttonZero1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(countStr.equals("0")){
                    countStr="0";
                }else {
                    countStr += "0";
                }
                Cal();
            }
        });
        buttonZeroZeroZero1 = (Button)findViewById(R.id.button_zerozerozero1);
        buttonZeroZeroZero1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(countStr.equals("0")){
                    countStr="0";
                }else {
                    countStr += "000";
                }

            }
        });
        buttonSubmit1 = (Button)findViewById(R.id.button_submit1);
        buttonSubmit1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                numberBtn.setText(countTxt1.getText());
                layoutInput1.setVisibility(View.GONE);
            }
        });
        buttonCancle1 = (Button)findViewById(R.id.button_cancle1);
        buttonCancle1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                layoutInput1.setVisibility(View.GONE);
                countStr = "0";
            }
        });


    }

    public void Cal(){
        if(check == 1) {
            countTxt1.setText(countStr);
            Integer a = Integer.parseInt(countStr) * valueX;
            calPriceTxt1.setText(nf.format(a));
        }else if(check == 2){
            if(Integer.parseInt(countStr)/valueX >=1){
                calPriceTxt1.setText(nf.format(Integer.parseInt(countStr)));
                countTxt1.setText(Integer.toString(Integer.parseInt(countStr)/valueX));
            }
            else{
                calPriceTxt1.setText(nf.format(Integer.parseInt(countStr)));
                countTxt1.setText("0");
            }
        }
    }


}

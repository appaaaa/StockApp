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
import android.widget.CheckBox;
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
    String selectedCompany = "회사선택";
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

    Integer checkSellBuy = 1;

//// + dialog3
    TextView textviewCount3;
    Button buttonTick1;
    Button buttonTick2;
    Button buttonCurrent;
    Button buttonBack3;
    Button buttonReset3;
    Button buttonOne3;
    Button buttonTwo3;
    Button buttonThree3;
    Button buttonFour3;
    Button buttonFive3;
    Button buttonSix3;
    Button buttonSeven3;
    Button buttonEight3;
    Button buttonNine3;
    Button buttonZero3;
    Button buttonZeroZero3;
    Button buttonZeroZeroZero3;
    Button buttonSubmit3;
    Button buttonCancle3;

    Integer number3;
    Integer checkNumOk = 0;
    Integer checkPriceOk = 0;

    CheckBox checkbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkbox = (CheckBox)findViewById(R.id.checkbox1);
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
                numberBtn.setText("0");
                checkSellBuy = 1;
                check = 1;
            }
        });

        sellBtn = (Button)findViewById(R.id.button_sell);
        sellBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                layoutMain.setBackgroundResource(R.drawable.back_2);
                layoutCheck.setVisibility(View.INVISIBLE);
                numberBtn.setText("0");
                check = 1;
                checkSellBuy = 2;
            }
        });

        priceBtn = (Button)findViewById(R.id.button_price);
        priceBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(companyListBtn.getText().equals("회사선택")) {
                    Toast toast = Toast.makeText(MainActivity.this, "회사를 먼저 선택하세요.", Toast.LENGTH_SHORT);
                    toast.show();
                }else {
                    layoutInput3.setVisibility(View.VISIBLE);
                    layoutInput1.setVisibility(View.GONE);
                    layoutInput2.setVisibility(View.GONE);
                    textviewCount3.setText(nf.format(valueX));
                    number3 = valueX;
                }

            }
        });
        numberBtn = (Button)findViewById(R.id.button_number);
        numberBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(companyListBtn.getText().equals("회사선택")) {
                    Toast toast = Toast.makeText(MainActivity.this, "회사를 먼저 선택하세요.", Toast.LENGTH_SHORT);
                    toast.show();
                }else {
                    calPriceTxt1.setText("0");
                    countTxt1.setText("0");
                    countStr = "0";
                    layoutInput1.setVisibility(View.VISIBLE);
                    layoutInput2.setVisibility(View.GONE);
                    layoutInput3.setVisibility(View.GONE);
                    check = 1;
                }

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
                if(checkSellBuy == 1) {
                    if(checkNumOk == 1 && checkPriceOk == 1){
                        if(checkbox.isChecked()) {
                            String toastStr = selectedCompany + " " + numberBtn.getText() + " 주(주당 : " + priceBtn.getText() + "원)" + "가 매수되었습니다(미수)";
                            String s = textviewSave.getText() + "\n" + toastStr;
                            textviewSave.setText(s);
                            Toast toast = Toast.makeText(MainActivity.this, toastStr, Toast.LENGTH_SHORT);
                            toast.show();
                            checkNumOk = 0;
                            checkPriceOk = 0;
                            priceBtn.setText("0");
                            numberBtn.setText("0");
                        }else{
                            String toastStr = selectedCompany + " " + numberBtn.getText() + " 주(주당 : " + priceBtn.getText() + "원)" + "가 매수되었습니다.";
                            String s = textviewSave.getText() + "\n" + toastStr;
                            textviewSave.setText(s);
                            Toast toast = Toast.makeText(MainActivity.this, toastStr, Toast.LENGTH_SHORT);
                            toast.show();
                            checkNumOk = 0;
                            checkPriceOk = 0;
                            priceBtn.setText("0");
                            numberBtn.setText("0");
                        }
                    }
                    else if(checkNumOk == 1 && checkPriceOk != 1){
                        Toast toast = Toast.makeText(MainActivity.this, "가격을 입력하셔야 합니다.", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    else if(checkNumOk != 1&& checkPriceOk == 1){
                        Toast toast = Toast.makeText(MainActivity.this, "수량을 입력하셔야 합니다.", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    else{
                        Toast toast = Toast.makeText(MainActivity.this, "가격과 수량을 입력하셔야 합니다.", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }else if(checkSellBuy == 2){
                    if(checkNumOk == 1 && checkPriceOk == 1){
                        String toastStr = selectedCompany + " " + numberBtn.getText() + " 주(주당 : " + priceBtn.getText()+"원)" + "가 매도되었습니다.";
                        String s = textviewSave.getText() + "\n" + toastStr;
                        textviewSave.setText(s);
                        Toast toast = Toast.makeText(MainActivity.this, toastStr, Toast.LENGTH_SHORT);
                        toast.show();
                        checkNumOk = 0;
                        checkPriceOk = 0;
                        priceBtn.setText("0");
                        numberBtn.setText("0");
                    }
                    else if(checkNumOk == 1 && checkPriceOk != 1){
                        Toast toast = Toast.makeText(MainActivity.this, "가격을 입력하셔야 합니다.", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    else if(checkNumOk != 1&& checkPriceOk == 1){
                        Toast toast = Toast.makeText(MainActivity.this, "수량을 입력하셔야 합니다.", Toast.LENGTH_SHORT);
                        toast.show();
                    }else{
                        Toast toast = Toast.makeText(MainActivity.this, "가격과 수량을 입력하셔야 합니다.", Toast.LENGTH_SHORT);
                        toast.show();
                    }

                }

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
                Cal();

            }
        });
        buttonSubmit1 = (Button)findViewById(R.id.button_submit1);
        buttonSubmit1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                numberBtn.setText(countTxt1.getText());
                layoutInput1.setVisibility(View.GONE);
                countStr = "0";
                checkNumOk = 1;
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

////////////////////////////// dialog 3 ////////////////////////

        textviewCount3 = (TextView)findViewById(R.id.textview_count3);
        buttonTick1 = (Button)findViewById(R.id.button_tick1);
        buttonTick1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textviewCount3.setText(nf.format(number3+100));
                number3 = number3+100;
                countStr = number3.toString();
            }
        });
        buttonTick2 = (Button)findViewById(R.id.button_tick2);
        buttonTick2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textviewCount3.setText(nf.format(number3-100));
                number3 = number3-100;
                countStr = number3.toString();
            }
        });
        buttonCurrent = (Button)findViewById(R.id.button_current);
        buttonCurrent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textviewCount3.setText(nf.format(valueX));
                number3 = valueX;
                countStr = number3.toString();
            }
        });
        buttonBack3 = (Button)findViewById(R.id.button_back3);
        buttonBack3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(countStr.length() >= 3) {
                    countStr = countStr.substring(0, countStr.length() - 1);
                    number3 = Integer.parseInt(countStr);
                }else if(countStr.length() == 1){
                    countStr = "0";
                    number3 = Integer.parseInt(countStr);
                }else if(countStr.length() == 2){
                    countStr = countStr.substring(0, countStr.length() -1);
                    number3 = Integer.parseInt(countStr);
                }
                textviewCount3.setText(nf.format(number3));
            }
        });
        buttonReset3 = (Button)findViewById(R.id.button_reset3);
        buttonReset3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                countStr = "0";
                number3 = 0;
                textviewCount3.setText(countStr);
            }
        });
        buttonOne3 = (Button)findViewById(R.id.button_one3);
        buttonOne3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(countStr.equals("0")){
                    countStr="1";
                    number3 = Integer.parseInt(countStr);
                }else {
                    countStr += "1";
                    number3 = Integer.parseInt(countStr);
                }
                textviewCount3.setText(nf.format(number3));

            }
        });
        buttonTwo3 = (Button)findViewById(R.id.button_two3);
        buttonTwo3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(countStr.equals("0")){
                    countStr="2";
                    number3 = Integer.parseInt(countStr);
                }else {
                    countStr += "2";
                    number3 = Integer.parseInt(countStr);
                }
                textviewCount3.setText(nf.format(number3));
            }
        });
        buttonThree3 = (Button)findViewById(R.id.button_three3);
        buttonThree3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(countStr.equals("0")){
                    countStr="3";
                    number3 = Integer.parseInt(countStr);
                }else {
                    countStr += "3";
                    number3 = Integer.parseInt(countStr);
                }
                textviewCount3.setText(nf.format(number3));
            }
        });
        buttonFour3 = (Button)findViewById(R.id.button_four3);
        buttonFour3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(countStr.equals("0")){
                    countStr="4";
                    number3 = Integer.parseInt(countStr);
                }else {
                    countStr += "4";
                    number3 = Integer.parseInt(countStr);
                }
                textviewCount3.setText(nf.format(number3));
            }
        });
        buttonFive3 = (Button)findViewById(R.id.button_five3);
        buttonFive3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(countStr.equals("0")){
                    countStr="5";
                    number3 = Integer.parseInt(countStr);
                }else {
                    countStr += "5";
                    number3 = Integer.parseInt(countStr);
                }
                textviewCount3.setText(nf.format(number3));
            }
        });
        buttonSix3 = (Button)findViewById(R.id.button_six3);
        buttonSix3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(countStr.equals("0")){
                    countStr="6";
                    number3 = Integer.parseInt(countStr);
                }else {
                    countStr += "6";
                    number3 = Integer.parseInt(countStr);
                }
                textviewCount3.setText(nf.format(number3));
            }
        });
        buttonSeven3 = (Button)findViewById(R.id.button_seven3);
        buttonSeven3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(countStr.equals("0")){
                    countStr="7";
                    number3 = Integer.parseInt(countStr);
                }else {
                    countStr += "7";
                    number3 = Integer.parseInt(countStr);
                }
                textviewCount3.setText(nf.format(number3));
            }
        });
        buttonEight3 = (Button)findViewById(R.id.button_eight3);
        buttonEight3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(countStr.equals("0")){
                    countStr="8";
                    number3 = Integer.parseInt(countStr);
                }else {
                    countStr += "8";
                    number3 = Integer.parseInt(countStr);
                }
                textviewCount3.setText(nf.format(number3));
            }
        });
        buttonNine3 = (Button)findViewById(R.id.button_nine3);
        buttonNine3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(countStr.equals("0")){
                    countStr="9";
                    number3 = Integer.parseInt(countStr);
                }else {
                    countStr += "9";
                    number3 = Integer.parseInt(countStr);
                }
                textviewCount3.setText(nf.format(number3));
            }
        });
        buttonZero3 = (Button)findViewById(R.id.button_zero3);
        buttonZero3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(countStr.equals("0")){
                    countStr="0";
                    number3 = Integer.parseInt(countStr);
                }else {
                    countStr += "0";
                    number3 = Integer.parseInt(countStr);
                }
                textviewCount3.setText(nf.format(number3));
            }
        });
        buttonZeroZero3 = (Button)findViewById(R.id.button_zerozero3);
        buttonZeroZero3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(countStr.equals("0")){
                    countStr="0";
                    number3 = Integer.parseInt(countStr);
                }else {
                    countStr += "00";
                    number3 = Integer.parseInt(countStr);
                }
                textviewCount3.setText(nf.format(number3));
            }
        });
        buttonZeroZeroZero3 = (Button)findViewById(R.id.button_zerozerozero3);
        buttonZeroZeroZero3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(countStr.equals("0")){
                    countStr="0";
                    number3 = Integer.parseInt(countStr);
                }else {
                    countStr += "000";
                    number3 = Integer.parseInt(countStr);
                }
                textviewCount3.setText(nf.format(number3));
            }
        });
        buttonSubmit3 = (Button)findViewById(R.id.button_submit3);
        buttonSubmit3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                priceBtn.setText(textviewCount3.getText());
                layoutInput3.setVisibility(View.GONE);
                countStr = "0";
                number3 = Integer.parseInt(countStr);
                checkPriceOk = 1;
            }
        });
        buttonCancle3 = (Button)findViewById(R.id.button_cancle3);
        buttonCancle3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                layoutInput3.setVisibility(View.GONE);
                countStr = "0";
                number3 = Integer.parseInt(countStr);
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

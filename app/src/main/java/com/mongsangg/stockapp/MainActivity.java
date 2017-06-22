package com.mongsangg.stockapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    LinearLayout layoutInput1;
    Button companyListBtn;
    Button buyBtn;
    Button sellBtn;
    String selectedCompany = "없음";
    int indexCompany = 0;


    //// dialog_input1.xml
    Button testBtn;
    String testString;
    TextView testTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutInput1 = (LinearLayout)findViewById(R.id.layout_input1);
        companyListBtn = (Button)findViewById(R.id.button_companylist);
        companyListBtn.setText(selectedCompany);
        companyListBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                final String[] companies = {"한미약품", "삼성전자", "카카오", "네이버"};

                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("회사를 선택하세요")
                        .setSingleChoiceItems(companies, indexCompany, new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                selectedCompany = companies[which];
                                indexCompany = which;
                                companyListBtn.setText(selectedCompany);
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        testTxt = (TextView)findViewById(R.id.textview_test);

        buyBtn = (Button)findViewById(R.id.button_buy);
        buyBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                layoutInput1.setVisibility(View.VISIBLE);
            }
        });

        testBtn = (Button)findViewById(R.id.button_test);
        testBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                layoutInput1.setVisibility(View.GONE);
                testTxt.setText("수량이 입력되었습니다.");
            }
        });


    }


}

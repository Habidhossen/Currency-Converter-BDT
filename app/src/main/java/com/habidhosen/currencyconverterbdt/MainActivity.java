package com.habidhosen.currencyconverterbdt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button clearBtn, convertBtn;
    private EditText enterAmountEditText;
    private TextView euroTV, usDollarTV, australianDollarTV, canadianDollarTV, singaporeDollarTV, britishPoundTV, egyptianPoundTV, uaeDirhamTV,
                    qatariRiyalTV, saudiRiyalTv, omaniRiyalTv, bahrainiDinarTV, kuwaitiDinarTV, indianRupeeTV, pakistaniRupeeTV,
                    srilankanRupeeTV, nepaleseRupeeTV, myanmarKyatTV, japaneseYenTV, thailandbahtTV;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
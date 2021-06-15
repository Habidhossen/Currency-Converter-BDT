package com.habidhosen.currencyconverterbdt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button clearBtn, convertBtn;
    private EditText enterAmountEditText;
    private TextView euroTV, usDollarTV, australianDollarTV, canadianDollarTV, singaporeDollarTV, britishPoundTV, egyptianPoundTV, uaeDirhamTV,
            qatariRiyalTV, saudiRiyalTv, omaniRiyalTv, bahrainiDinarTV, kuwaitiDinarTV, indianRupeeTV, pakistaniRupeeTV,
            srilankanRupeeTV, nepaleseRupeeTV, myanmarKyatTV, japaneseYenTV, thailandbahtTV;

    private String EditTextinString;
    private Double EditTextinDouble, euro_Calculation, usDollar_Calculation, australianDollar_Calculation, canadianDollar_Calculation, singaporeDollar_Calculation,
            britishPound_Calculation, egyptianPound_Calculation, uaeDirham_Calculation, qatariRiyal_Calculation, saudiRiyal_Calculation, omaniRiyal_Calculation,
            bahrainiDinar_Calculation, kuwaitiDinar_Calculation, indianRupee_Calculation, pakistaniRupee_Calculation, srilankanRupee_Calculation, nepaleseRupee_Calculation,
            myanmarKyatr_Calculation, japaneseYen_Calculation, thailandBaht_calculation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*finding all Button, EditText and TextView*/
        clearBtn = findViewById(R.id.clearBtnId);
        convertBtn = findViewById(R.id.convertBtnId);
        enterAmountEditText = findViewById(R.id.enterAmountEditTextId);
        euroTV = findViewById(R.id.euroTVId);
        usDollarTV = findViewById(R.id.usDollarTVId);
        australianDollarTV = findViewById(R.id.australianTVId);
        canadianDollarTV = findViewById(R.id.canadianTVId);
        singaporeDollarTV = findViewById(R.id.singaporeTVId);
        britishPoundTV = findViewById(R.id.britishPoundTVId);
        egyptianPoundTV = findViewById(R.id.egyptianPoundTVId);
        uaeDirhamTV = findViewById(R.id.uaeDirhamTVId);
        qatariRiyalTV = findViewById(R.id.qatarRiyalTVId);
        saudiRiyalTv = findViewById(R.id.saudiRiyalTVId);
        omaniRiyalTv = findViewById(R.id.omaniRiyalTVId);
        bahrainiDinarTV = findViewById(R.id.bahrainiDinarTVId);
        kuwaitiDinarTV = findViewById(R.id.kuwaitiDinarTVId);
        indianRupeeTV = findViewById(R.id.indianRupeeTVId);
        pakistaniRupeeTV = findViewById(R.id.pakistanRupeeTVId);
        srilankanRupeeTV = findViewById(R.id.srilankanTVId);
        nepaleseRupeeTV = findViewById(R.id.nepaleseRupeeTVId);
        myanmarKyatTV = findViewById(R.id.myanmarKyatTVId);
        japaneseYenTV = findViewById(R.id.japaneseYenTVId);
        thailandbahtTV = findViewById(R.id.thailandbahtTVId);

        /*added listener on Convert Button*/
        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*EditText empty checking*/
                if (enterAmountEditText.length() == 0){
                    enterAmountEditText.setError("Enter value");
                    //Toast.makeText(MainActivity.this, "Enter a amount", Toast.LENGTH_SHORT).show();
                }
                else{
                    /*getting input and convert string to double from Edit Text*/
                    EditTextinString = enterAmountEditText.getText().toString(); //getting input from EditText like 0
                    EditTextinDouble = Double.parseDouble(EditTextinString); //convert input string to double like 0.00

                    /*BDT to Euro*/
                    euro_Calculation = EditTextinDouble * 0.0097; //calculation
                    euroTV.setText(String.format("%.2f", euro_Calculation)); //set result in TextView

                    /*BDT to US Dollar*/
                    usDollar_Calculation = EditTextinDouble * 0.012; //calculation
                    usDollarTV.setText(String.format("%.2f", usDollar_Calculation)); //set result in TextView

                    /*BDT to Australian Dollar*/
                    australianDollar_Calculation = EditTextinDouble * 0.015; //calculation
                    australianDollarTV.setText(String.format("%.2f", australianDollar_Calculation)); //set result in TextView

                    /*BDT to Canadian Dollar*/
                    canadianDollar_Calculation = EditTextinDouble * 0.014; //calculation
                    canadianDollarTV.setText(String.format("%.2f", canadianDollar_Calculation)); //set result in TextView

                    /*BDT to Singapore Dollar*/
                    singaporeDollar_Calculation = EditTextinDouble * 0.016; //calculation
                    singaporeDollarTV.setText(String.format("%.2f", singaporeDollar_Calculation)); //set result in TextView

                    /*BDT to British Pound*/
                    britishPound_Calculation = EditTextinDouble * 0.0084; //calculation
                    britishPoundTV.setText(String.format("%.2f", britishPound_Calculation)); //set result in TextView

                    /*BDT to Egyptian Pound*/
                    egyptianPound_Calculation = EditTextinDouble * 0.19; //calculation
                    egyptianPoundTV.setText(String.format("%.2f", egyptianPound_Calculation)); //set result in TextView

                    /*BDT to UAE Dirham*/
                    uaeDirham_Calculation = EditTextinDouble * 0.043; //calculation
                    uaeDirhamTV.setText(String.format("%.2f", uaeDirham_Calculation)); //set result in TextView

                    /*BDT to Qatari Riyal*/
                    qatariRiyal_Calculation = EditTextinDouble * 0.043; //calculation
                    qatariRiyalTV.setText(String.format("%.2f", qatariRiyal_Calculation)); //set result in TextView

                    /*BDT to Saudi Riyal*/
                    saudiRiyal_Calculation = EditTextinDouble *0.044; //calculation
                    saudiRiyalTv.setText(String.format("%.2f", saudiRiyal_Calculation)); //set result in TextView

                    /*BDT to Omani Riyal*/
                    omaniRiyal_Calculation = EditTextinDouble * 0.0045; //calculation
                    omaniRiyalTv.setText(String.format("%.2f", omaniRiyal_Calculation)); //set result in TextView

                    /*BDT to Bahraini Dinar*/
                    bahrainiDinar_Calculation = EditTextinDouble * 0.0044; //calculation
                    bahrainiDinarTV.setText(String.format("%.2f", bahrainiDinar_Calculation)); //set result in TextView

                    /*BDT to Kuwaiti Dinar*/
                    kuwaitiDinar_Calculation = EditTextinDouble * 0.0036; //calculation
                    kuwaitiDinarTV.setText(String.format("%.2f", kuwaitiDinar_Calculation)); //set result in TextView

                    /*BDT to Indian Rupee*/
                    indianRupee_Calculation = EditTextinDouble * 0.87; //calculation
                    indianRupeeTV.setText(String.format("%.2f", indianRupee_Calculation)); //set result in TextView

                    /*BDT to Pakistan Rupee*/
                    pakistaniRupee_Calculation = EditTextinDouble * 1.84; //calculation
                    pakistaniRupeeTV.setText(String.format("%.2f", pakistaniRupee_Calculation)); //set result in TextView

                    /*BDT to Sri lankan Rupee */
                    srilankanRupee_Calculation = EditTextinDouble * 2.34; //calculation
                    srilankanRupeeTV.setText(String.format("%.2f", srilankanRupee_Calculation)); //set result in TextView

                    /*BDT to Nepalese Rupee*/
                    nepaleseRupee_Calculation = EditTextinDouble * 1.38; //calculation
                    nepaleseRupeeTV.setText(String.format("%.2f", nepaleseRupee_Calculation)); //set result in TextView

                    /*BDT to Myanmar Kyat*/
                    myanmarKyatr_Calculation = EditTextinDouble * 19.42; //calculation
                    myanmarKyatTV.setText(String.format("%.2f", myanmarKyatr_Calculation)); //set result in TextView

                    /*BDT to Japanese Yen*/
                    japaneseYen_Calculation = EditTextinDouble * 1.30; //calculation
                    japaneseYenTV.setText(String.format("%.2f", japaneseYen_Calculation)); //set result in TextView

                    /*BDT to Thailand Baht*/
                    thailandBaht_calculation = EditTextinDouble * 0.37; //calculation
                    thailandbahtTV.setText(String.format("%.2f", thailandBaht_calculation)); //set result in TextView
                }
            }
        });

        /*added listener on Clear Button*/
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*Edit Text value clear*/
                enterAmountEditText.getText().clear(); //or you can use enterAmountEditText.setText("");

                /*all TextView's value clear*/
                euroTV.setText("0.00");
                usDollarTV.setText("0.00");
                australianDollarTV.setText("0.00");
                canadianDollarTV.setText("0.00");
                singaporeDollarTV.setText("0.00");
                britishPoundTV.setText("0.00");
                egyptianPoundTV.setText("0.00");
                uaeDirhamTV.setText("0.00");
                qatariRiyalTV.setText("0.00");
                saudiRiyalTv.setText("0.00");
                omaniRiyalTv.setText("0.00");
                bahrainiDinarTV.setText("0.00");
                kuwaitiDinarTV.setText("0.00");
                indianRupeeTV.setText("0.00");
                pakistaniRupeeTV.setText("0.00");
                srilankanRupeeTV.setText("0.00");
                nepaleseRupeeTV.setText("0.00");
                myanmarKyatTV.setText("0.00");
                japaneseYenTV.setText("0.00");
                thailandbahtTV.setText("0.00");

                /*Toast message show*/
                Toast.makeText(MainActivity.this, "Clear", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
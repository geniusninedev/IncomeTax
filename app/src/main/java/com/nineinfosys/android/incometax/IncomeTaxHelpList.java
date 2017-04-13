package com.nineinfosys.android.incometax;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;


import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nineinfosys.android.incometax.Incometax.IncomeTaxHelp;

public class IncomeTaxHelpList extends AppCompatActivity {

    ListView Ruleslistview;
    ArrayAdapter<String> adapter;
    String ruleslist[] = {"Rule - 1", "Rule - 2", "Rule - 2A", "Rule - 2B", "Rule - 2BA", "Rule - 2BB", "Rule - 2BBA", "Rule - 2BBB", "Rule - 2BC", "Rule - 2C",
            "Rule - 2CA", "Rule - 2D", "Rule - 2DA", "Rule - 2E", "Rule - 2F", "Rule - 3", "Rule - 3A","Rule - 4", "Rule - 5", "Rule - 5A",
            "Rule - 5AA", "Rule - 5AB", "Rule - 5AC", "Rule - 5AD", "Rule - 5B", "Rule - 5C", "Rule - 5D", "Rule - 5E","Rule - 5F","Rule - 6",
            "Rule - 6A", "Rule - 6AA", "Rule - 6AAA", "Rule - 6AAB", "Rule - 6AAC", "Rule - 6AAD", "Rule - 6AAE", "Rule - 6AAF", "Rule - 6AAG", "Rule - 6AAH",
            "Rule - 6AB", "Rule - 6ABA", "Rule - 6ABAA", "Rule - 6ABB", "Rule - 6AC", "Rule - 6B", "Rule - 6C", "Rule - 6D", "Rule - 6DD","Rule - 6DDA",
            "Rule - 6DDB", "Rule - 6DDC", "Rule - 6DDD", "Rule - 6E", "Rule - 6EA", "Rule - 6EB", "Rule - 6F", "Rule - 6G", "Rule - 6GA", "Rule - 6H",
            "Rule - 7", "Rule - 7A", "Rule - 7B", "Rule - 8", "Rule - 8A", "Rule - 8AA", "Rule - 8B", "Rule - 8C", "Rule - 8D", "Rule - 9",
            "Rule - 9A", "Rule - 9B", "Rule - 9C", "Rule - 10", "Rule - 10A", "Rule - 10AB", "Rule - 10B", "Rule - 10C", "Rule - 10CA", "Rule - 10D",
            "Rule - 10E", "Rule - 10F", "Rule - 10G", "Rule - 10H", "Rule - 10-I", "Rule - 10J", "Rule - 10K", "Rule - 10L", "Rule - 10M", "Rule - 10MA",
            "Rule - 10N", "Rule - 10-O", "Rule - 10P", "Rule - 10Q", "Rule - 10R", "Rule - 10RA", "Rule - 10S", "Rule - 10T", "Rule - 10TA", "Rule - 10TB",
            "Rule - 10TC", "Rule - 10TD", "Rule - 10TE", "Rule - 10TF", "Rule - 10TG", "Rule - 10TH", "Rule - 10THA", "Rule - 10THB", "Rule - 10THC", "Rule - 10THD",
            "Rule - 10U", "Rule - 10UA", "Rule - 10UB", "Rule - 10UC", "Rule - 10V", "Rule - 10VA", "Rule - 10VB", "Rule - 11", "Rule - 11A","Rule - 11AA",
            "Rule - 11B", "Rule - 11C", "Rule - 11D", "Rule - 11DD", "Rule - 11E", "Rule - 11EA", "Rule - 11EE", "Rule - 11F", "Rule - 11G", "Rule - 11H",
            "Rule - 11-I", "Rule - 11J", "Rule - 11K", "Rule - 11L", "Rule - 11M", "Rule - 11MA", "Rule - 11MAA","Rule - 11N", "Rule - 11-O", "Rule - 11-OA",
            "Rule - 11-OB", "Rule - 11P", "Rule - 11Q", "Rule - 11R", "Rule - 11S", "Rule - 11T", "Rule - 11U", "Rule - 11UA", "Rule - 11UB", "Rule - 11UC",
            "Rule - 12", "Rule - 12A", "Rule - 12B", "Rule - 12BA", "Rule - 12C", "Rule - 12CA", "Rule - 12CB", "Rule - 12CC", "Rule - 12D", "Rule - 12E",
            "Rule - 13", "Rule - 14", "Rule - 14A", "Rule - 14B", "Rule - 15", "Rule - 16", "Rule - 16A","Rule - 16B", "Rule - 16C", "Rule - 16CC",
            "Rule - 16D", "Rule - 16DD","Rule - 16E","Rule - 16F","Rule - 17","Rule - 17A","Rule - 17B", "Rule - 17C", "Rule - 17CA", "Rule - 17D",
            "Rule - 18", "Rule - 18A", "Rule - 18AA", "Rule - 18AAA", "Rule - 18AAAA", "Rule - 18AAAAA", "Rule - 18AAB", "Rule - 18B", "Rule - 18BB", "Rule - 18BBA",
            "Rule - 18BBB", "Rule - 18BBC", "Rule - 18BBD", "Rule - 18BBE", "Rule - 18C", "Rule - 18D", "Rule - 18DA", "Rule - 18DB", "Rule - 18DC", "Rule - 18DD",
            "Rule - 18DDA", "Rule - 18DE", "Rule - 19", "Rule - 19A", "Rule - 19AB", "Rule - 19AC", "Rule - 19AD", "Rule - 19AE", "Rule - 20", "Rule - 20A",
           "Rule - 20AB", "Rule - 21", "Rule - 21A", "Rule - 21AA", "Rule - 21AB", "Rule - 21AC", "Rule - 21B", "Rule - 22", "Rule - 23", "Rule - 24",
            "Rule - 24A", "Rule - 25", "Rule - 26", "Rule - 26A", "Rule - 26B", "Rule - 26C", "Rule - 27", "Rule - 28", "Rule - 28A", "Rule - 28AA",
            "Rule - 28AB", "Rule - 29", "Rule - 29A", "Rule - 29AA", "Rule - 29B", "Rule - 29C", "Rule - 29D", "Rule - 30", "Rule - 30A", "Rule - 31",
            "Rule - 31A", "Rule - 31AA", "Rule - 31AB", "Rule - 31AC", "Rule - 31ACA", "Rule - 31ACB", "Rule - 32", "Rule - 33", "Rule - 34", "Rule - 35",
            "Rule - 36", "Rule - 36A", "Rule - 37", "Rule - 37A", "Rule - 37AA", "Rule - 37B", "Rule - 37BA", "Rule - 37BB", "Rule - 37BC", "Rule - 37C",
            "Rule - 37CA", "Rule - 37CB", "Rule - 37D", "Rule - 37E", "Rule - 37EA", "Rule - 37F", "Rule - 37G", "Rule - 37H", "Rule - 37-I", "Rule - 37J",
            "Rule - 38", "Rule - 38A", "Rule - 39", "Rule - 40", "Rule - 40A", "Rule - 40B", "Rule - 40BA", "Rule - 40BB", "Rule - 40C", "Rule - 40D",
            "Rule - 40E", "Rule - 40F", "Rule - 41", "Rule - 42", "Rule - 43", "Rule - 44", "Rule - 44A", "Rule - 44B", "Rule - 44C", "Rule - 44CA",
            "Rule - 44D","Rule - 44E", "Rule - 44F", "Rule - 44G", "Rule - 44GA", "Rule - 44H", "Rule - 45", "Rule - 46", "Rule - 46A", "Rule - 47",
            "Rule - 48", "Rule - 48A", "Rule - 48B", "Rule - 48C", "Rule - 48D", "Rule - 48DD", "Rule - 48E", "Rule - 48F", "Rule - 48G", "Rule - 48H",
            "Rule - 48-I", "Rule - 48J", "Rule - 48K", "Rule - 48L", "Rule - 49", "Rule - 50", "Rule - 51", "Rule - 51A", "Rule - 52", "Rule - 53",
             "Rule - 54", "Rule - 55", "Rule - 56", "Rule - 57", "Rule - 58", "Rule - 59", "Rule - 60", "Rule - 61", "Rule - 62", "Rule - 63",
            "Rule - 64", "Rule - 65", "Rule - 66", "Rule - 67", "Rule - 67A", "Rule - 68", "Rule - 69", "Rule - 70", "Rule - 71", "Rule - 71A",
             "Rule - 72", "Rule - 73", "Rule - 74", "Rule - 75", "Rule - 76", "Rule - 77", "Rule - 78", "Rule - 79", "Rule - 80", "Rule - 81",
            "Rule - 82", "Rule - 83", "Rule - 84", "Rule - 85", "Rule - 86", "Rule - 87", "Rule - 88", "Rule - 89", "Rule - 90", "Rule - 91",
            "Rule - 92", "Rule - 93", "Rule - 94", "Rule - 95", "Rule - 96", "Rule - 97", "Rule - 98", "Rule - 99","Rule - 100", "Rule - 101",
            "Rule - 101A", "Rule - 102", "Rule - 103", "Rule - 104", "Rule - 105", "Rule - 106", "Rule - 107", "Rule - 108", "Rule - 109", "Rule - 110",
           "Rule - 111", "Rule - 111A", "Rule - 111AA", "Rule - 111AB", "Rule - 111B", "Rule - 112", "Rule - 112A", "Rule - 112B", "Rule - 112C", "Rule - 112D",
            "Rule - 112E", "Rule - 112F", "Rule - 113", "Rule - 114", "Rule - 114A", "Rule - 114AA", "Rule - 114B", "Rule - 114C", "Rule - 114D", "Rule - 114DA",
            "Rule - 114DB", "Rule - 114E","Rule - 114F", "Rule - 114G", "Rule - 114H", "Rule - 115", "Rule - 115A", "Rule - 116", "Rule - 117", "Rule - 117A",
            "Rule - 117B", "Rule - 117C", "Rule - 118", "Rule - 119", "Rule - 119A", "Rule - 120", "Rule - 121", "Rule - 121A", "Rule - 122", "Rule - 123",
            "Rule - 124", "Rule - 125", "Rule - 126", "Rule - 127", "Rule - 128", "Rule - 129", "Rule - New App I", "Rule - Old App I", "Rule - Old App I", "Rule - Old App",
            "Rule - App IA", "Rule - App III"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_tax_help_list1);


        Ruleslistview = (ListView) findViewById(R.id.list);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_income_tax_help_list1,R.id.textview2,  ruleslist);
        Ruleslistview.setAdapter(adapter);
       Ruleslistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent MemRef = new Intent(IncomeTaxHelpList.this, IncomeTaxHelp.class);
                MemRef.putExtra("key", position);
                startActivity(MemRef);

            }
        });

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder.setMessage("Are you sure you want to close Income Tax Ru?");
                alertDialogBuilder.setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {

                                finish();

                            }
                        });

                alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {


                    }
                });

                //Showing the alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
                return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    }
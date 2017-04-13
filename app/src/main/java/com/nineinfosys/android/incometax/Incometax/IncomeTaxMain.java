package com.nineinfosys.android.incometax.Incometax;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;


import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.nineinfosys.android.incometax.MainActivityDrawer;
import com.nineinfosys.android.incometax.R;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dev on 01-03-2017.
 */

public class IncomeTaxMain extends Fragment {
    private SeekBar mSeekBarX, mSeekBarY;
    private TextView tvX, tvY;
    private Typeface mTfRegular;
    private Typeface mTfLight;
    Spinner  genderspinner;
    final double BASE_VALUE = 250000;
    PieChart mChart;
    final double BASE_VALUE_SENIOR = 300000;
    final double BASE_VALUE_SUPER_SENIOR = 500000;
    EditText incometaxedittext, reliefedittext, surchargeedittext, educationedittext, higherandseceducationcessedittext,totalreliefedittext;
    double tax,st1,st2,st3,st4;
    IncomeTaxCalculator income;
    DecimalFormat f = new DecimalFormat("##.00");
    protected double[] mParties;
    double incomerelief ;
    double surchargeValue;
    double educationalcess ;
    double highereducationalcess ;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_main, null);
        ((MainActivityDrawer) getActivity()).toolbar.setTitle("Income Tax Calculator");

        MobileAds.initialize(getActivity(), getString(R.string.ads_app_id));
        AdView mAdView = (AdView) v.findViewById(R.id.adViewIncomeTax);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        Configuration config = getResources().getConfiguration();
        genderspinner = (Spinner) v.findViewById(R.id.genderspinnerid);
        incometaxedittext = (EditText) v.findViewById(R.id.incometaxedittextid);
        reliefedittext = (EditText) v.findViewById(R.id.incometaxreliefedittextid);
        reliefedittext.setEnabled(false);
        surchargeedittext = (EditText) v.findViewById(R.id.surchargeedittextid123);
        surchargeedittext.setEnabled(false);
        educationedittext = (EditText) v.findViewById(R.id.educationcessedittextid);
        educationedittext.setEnabled(false);
        higherandseceducationcessedittext = (EditText) v.findViewById(R.id.higherandseceducessedittextid);
        higherandseceducationcessedittext.setEnabled(false);
        totalreliefedittext = (EditText) v.findViewById(R.id.totalreliefedittextid);
        totalreliefedittext.setEnabled(false);
        Button buttonCalculte = (Button) v.findViewById(R.id.buttoncalculate);
        Button buttonhelp = (Button) v.findViewById(R.id.buttonhelp);

        ArrayList gender = new ArrayList();
        gender.add("Citizen");
        gender.add("seniorCitizen");
        gender.add("SeniorSuperCitizen");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, gender);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderspinner.setAdapter(dataAdapter);
        buttonCalculte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (incometaxedittext.getText().toString().equals("")) {
                    incometaxedittext.setError("Enter the Salary");
                } else {
                    String spinnerGender = genderspinner.getSelectedItem().toString().trim();
                    double edittextIncomeValue = Double.parseDouble(incometaxedittext.getText().toString().trim());
                    income = new IncomeTaxCalculator(edittextIncomeValue,spinnerGender);
                    double incomerelief = income.calculateIncomeTaxAfterRelief();
                    double surchargeValue = income.calculateSurcharge();
                    double educationalcess = income.calculateIncomeTaxAfterRelief() * 0.02;
                    double highereducationalcess = income.calculateIncomeTaxAfterRelief() * 0.01;
                    reliefedittext.setText(String.valueOf((f.format(incomerelief))));
                    educationedittext.setText(String.valueOf((f.format(educationalcess))));
                    surchargeedittext.setText(String.valueOf((f.format(surchargeValue))));
                    higherandseceducationcessedittext.setText(String.valueOf((f.format(highereducationalcess))));
                    totalreliefedittext.setText(String.valueOf((f.format(incomerelief + educationalcess + highereducationalcess + surchargeValue))));
                    dispalyPieChart(incomerelief, surchargeValue, educationalcess, highereducationalcess);
                    setData(2, 20);
                }
            }

        });

        buttonhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent helpref = new Intent(getActivity(),IncomeTaxHelp.class);
                startActivity(helpref);
            }
        });
        return  v;

    }

    private void dispalyPieChart(double st1, double st2,double st3,double st4) {
        this.st1=st1;
        this.st2=st2;
        this.st3=st3;
        this.st4=st4;
        mParties = new double[]{incomerelief, surchargeValue,educationalcess,highereducationalcess};
        mChart = (PieChart) getActivity().findViewById(R.id.chart1);
        mChart.setUsePercentValues(true);
        mChart.getDescription().setEnabled(false);
        mChart.setExtraOffsets(5, 10, 5, 5);

        mChart.setDragDecelerationFrictionCoef(0.95f);

        mChart.setCenterTextTypeface(mTfLight);
        mChart.setCenterText(generateCenterSpannableText());
        mChart.setDrawHoleEnabled(true);
        mChart.setHoleColor(Color.WHITE);

        mChart.setTransparentCircleColor(Color.WHITE);
        mChart.setTransparentCircleAlpha(110);

        mChart.setHoleRadius(55f);
        mChart.setTransparentCircleRadius(61f);

        mChart.setDrawCenterText(true);
        mChart.setRotationAngle(0);
        // enable rotation of the chart by touch
        mChart.setRotationEnabled(true);
        mChart.setHighlightPerTapEnabled(true);
        mChart.animateY(1400, Easing.EasingOption.EaseInOutQuad);
        // mChart.spin(2000, 0, 360);
        Legend l = mChart.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.VERTICAL);
        l.setTextSize(8f);
        mChart.setEntryLabelColor(Color.BLACK);
        mChart.setEntryLabelTypeface(mTfRegular);
        mChart.setEntryLabelTextSize(30f);
        mChart.setDrawSliceText(false);

    }


    private void setData(int count, double range) {
        double incomerelief = income.calculateIncomeTaxAfterRelief();
        double surchargeValue = income.calculateSurcharge();
        double educationalcess = income.calculateIncomeTaxAfterRelief() * 0.02;
        double highereducationalcess = income.calculateIncomeTaxAfterRelief() * 0.01;

        double mult = range;

        //ArrayList<PieEntry> entries = new ArrayList<PieEntry>();

        List<PieEntry> entries = new ArrayList<>();

        entries.add(new PieEntry((float) st1, "IncomeTaxRelief-" +f.format( incomerelief)));
        entries.add(new PieEntry((float) st2, "SurchargeValue-" + (f.format(surchargeValue))));
        entries.add(new PieEntry((float) st3, "EducationalCess-" + (f.format(educationalcess))));
        entries.add(new PieEntry((float) st4, "Higher&Secondary-" + (f.format(highereducationalcess))));
        PieDataSet dataSet = new PieDataSet(entries, "");
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(5f);
        ArrayList<Integer> colors = new ArrayList<Integer>();

        for (int c : ColorTemplate.JOYFUL_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.LIBERTY_COLORS)
            colors.add(c);

        for (int c : ColorTemplate.COLORFUL_COLORS)
            colors.add(c);

        for (int c : ColorTemplate.VORDIPLOM_COLORS)
            colors.add(c);

        for (int c : ColorTemplate.PASTEL_COLORS)
            colors.add(c);

        colors.add(ColorTemplate.getHoloBlue());

        dataSet.setColors(colors);
        //dataSet.setSelectionShift(0f);

        PieData data = new PieData(dataSet);
        data.setValueFormatter(new PercentFormatter());
        data.setValueTextSize(12f);
        data.setValueTextColor(Color.BLACK);
        data.setValueTypeface(mTfLight);
        mChart.setData(data);
    }
   private SpannableString generateCenterSpannableText() {

        SpannableString s = new SpannableString("Total Amount\n" +f.format((st4+st1+st2+st3)));
        return s;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
           // Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }


    }



}










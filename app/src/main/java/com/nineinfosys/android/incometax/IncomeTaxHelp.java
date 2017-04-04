package com.nineinfosys.android.incometax;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class IncomeTaxHelp extends AppCompatActivity {
    WebView Introwebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        Introwebview = (WebView) findViewById(R.id.help);
        WebSettings IntroWebSettings = Introwebview.getSettings();
        IntroWebSettings.setBuiltInZoomControls(true);
        IntroWebSettings.setJavaScriptEnabled(true);
        Introwebview.setWebViewClient(new IncomeTaxHelp.WebViewClient());
        //Introwebview.loadUrl("file:///android_res/raw/incometxhtml.html");
        int position = getIntent().getIntExtra("key", 0);
        if (position == 0) {
            Introwebview.loadUrl("file:///android_res/raw/rule1.html");
        } else if (position == 1) {
            Introwebview.loadUrl("file:///android_res/raw/rule2.html");
        }else if (position == 2) {
            Introwebview.loadUrl("file:///android_res/raw/rule3.html");
        }else if (position == 3) {
            Introwebview.loadUrl("file:///android_res/raw/rule4.html");
        }else if (position == 4) {
            Introwebview.loadUrl("file:///android_res/raw/rule5.html");
        }else if (position == 5) {
            Introwebview.loadUrl("file:///android_res/raw/rule6.html");
        }else if (position == 6) {
            Introwebview.loadUrl("file:///android_res/raw/rule7.html");
        }else if (position == 7) {
            Introwebview.loadUrl("file:///android_res/raw/rule8.html");
        }else if (position == 8) {
            Introwebview.loadUrl("file:///android_res/raw/rule9.html");
        }else if (position == 9) {
            Introwebview.loadUrl("file:///android_res/raw/rule10.html");
        }else if (position == 10) {
            Introwebview.loadUrl("file:///android_res/raw/rule11.html");
        }else if (position == 11) {
            Introwebview.loadUrl("file:///android_res/raw/rule12.html");
        }else if (position == 12) {
            Introwebview.loadUrl("file:///android_res/raw/rule13.html");
        }else if (position == 13) {
            Introwebview.loadUrl("file:///android_res/raw/rule14.html");
        }else if (position == 14) {
            Introwebview.loadUrl("file:///android_res/raw/rulee20.html");
        }else if (position == 15) {
            Introwebview.loadUrl("file:///android_res/raw/rule16.html");
        }else if (position == 16) {
            Introwebview.loadUrl("file:///android_res/raw/rule17.html");
        }else if (position == 17) {
            Introwebview.loadUrl("file:///android_res/raw/rule18.html");
        }else if (position == 18) {
            Introwebview.loadUrl("file:///android_res/raw/rulle20.html");
        }else if (position == 19) {
            Introwebview.loadUrl("file:///android_res/raw/rule19.html");
        }else if (position == 20) {
            Introwebview.loadUrl("file:///android_res/raw/rule21.html");
        }else if (position == 21) {
            Introwebview.loadUrl("file:///android_res/raw/rule22.html");
        }else if (position == 22) {
            Introwebview.loadUrl("file:///android_res/raw/rule23.html");
        }else if (position == 23) {
            Introwebview.loadUrl("file:///android_res/raw/rule24.html");
        }else if (position == 24) {
            Introwebview.loadUrl("file:///android_res/raw/rule25.html");
        }else if (position == 25) {
            Introwebview.loadUrl("file:///android_res/raw/rule26.html");
        }else if (position == 26) {
            Introwebview.loadUrl("file:///android_res/raw/rule27.html");
        }else if (position == 27) {
            Introwebview.loadUrl("file:///android_res/raw/rule28.html");
        }else if (position == 28) {
            Introwebview.loadUrl("file:///android_res/raw/rule29.html");
        }else if (position == 29) {
            Introwebview.loadUrl("file:///android_res/raw/rule30.html");
        }else if (position == 30) {
            Introwebview.loadUrl("file:///android_res/raw/rule31.html");
        }else if (position == 31) {
            Introwebview.loadUrl("file:///android_res/raw/rule32.html");
        }else if (position == 32) {
            Introwebview.loadUrl("file:///android_res/raw/rule33.html");
        }else if (position == 33) {
            Introwebview.loadUrl("file:///android_res/raw/rule34.html");
        }else if (position == 34) {
            Introwebview.loadUrl("file:///android_res/raw/rule35.html");
        }else if (position == 35) {
            Introwebview.loadUrl("file:///android_res/raw/rule36.html");
        }else if (position == 36) {
            Introwebview.loadUrl("file:///android_res/raw/rule37.html");
        }else if (position == 37) {
            Introwebview.loadUrl("file:///android_res/raw/rule38.html");
        }else if (position == 38) {
            Introwebview.loadUrl("file:///android_res/raw/rule39.html");
        }else if (position == 39) {
            Introwebview.loadUrl("file:///android_res/raw/rule40.html");
        }else if (position == 40) {
            Introwebview.loadUrl("file:///android_res/raw/rule41.html");
        }else if (position == 41) {
            Introwebview.loadUrl("file:///android_res/raw/rule42.html");
        }else if (position == 42) {
            Introwebview.loadUrl("file:///android_res/raw/rule43.html");
        }else if (position == 43) {
            Introwebview.loadUrl("file:///android_res/raw/rule44.html");
        }else if (position == 44) {
            Introwebview.loadUrl("file:///android_res/raw/rule45.html");
        }else if (position == 45) {
            Introwebview.loadUrl("file:///android_res/raw/rule46.html");
        }else if (position == 46) {
            Introwebview.loadUrl("file:///android_res/raw/rule47.html");
        }else if (position == 47) {
            Introwebview.loadUrl("file:///android_res/raw/rule48.html");
        }else if (position == 48) {
            Introwebview.loadUrl("file:///android_res/raw/rule49.html");
        }else if (position == 49) {
            Introwebview.loadUrl("file:///android_res/raw/rule50.html");
        }else if (position == 50) {
            Introwebview.loadUrl("file:///android_res/raw/rule51.html");
        }else if (position == 51) {
            Introwebview.loadUrl("file:///android_res/raw/rule52.html");
        }else if (position == 52) {
            Introwebview.loadUrl("file:///android_res/raw/rule53.html");
        }else if (position == 53) {
            Introwebview.loadUrl("file:///android_res/raw/rule54.html");
        }else if (position == 54) {
            Introwebview.loadUrl("file:///android_res/raw/rule55.html");
        }else if (position == 55) {
            Introwebview.loadUrl("file:///android_res/raw/rule56.html");
        }else if (position == 56) {
            Introwebview.loadUrl("file:///android_res/raw/rule57.html");
        }else if (position == 57) {
            Introwebview.loadUrl("file:///android_res/raw/rule58.html");
        }else if (position == 58) {
            Introwebview.loadUrl("file:///android_res/raw/rule59.html");
        }else if (position == 59) {
            Introwebview.loadUrl("file:///android_res/raw/rule60.html");
        }else if (position == 60) {
            Introwebview.loadUrl("file:///android_res/raw/rule61.html");
        }else if (position == 61) {
            Introwebview.loadUrl("file:///android_res/raw/rule62.html");
        }else if (position == 62) {
            Introwebview.loadUrl("file:///android_res/raw/rule63.html");
        }else if (position == 63) {
            Introwebview.loadUrl("file:///android_res/raw/rule64.html");
        }else if (position == 64) {
            Introwebview.loadUrl("file:///android_res/raw/rule65.html");
        }else if (position == 65) {
            Introwebview.loadUrl("file:///android_res/raw/rule66.html");
        }else if (position == 66) {
            Introwebview.loadUrl("file:///android_res/raw/rule67.html");
        }else if (position == 67) {
            Introwebview.loadUrl("file:///android_res/raw/rule68.html");
        }else if (position == 68) {
            Introwebview.loadUrl("file:///android_res/raw/rule69.html");
        }else if (position == 69) {
            Introwebview.loadUrl("file:///android_res/raw/rule70.html");
        }else if (position == 70) {
            Introwebview.loadUrl("file:///android_res/raw/rule71.html");
        }else if (position == 71) {
            Introwebview.loadUrl("file:///android_res/raw/rule72.html");
        }else if (position == 72) {
            Introwebview.loadUrl("file:///android_res/raw/rule73.html");
        }else if (position == 73) {
            Introwebview.loadUrl("file:///android_res/raw/rule74.html");
        }else if (position == 74) {
            Introwebview.loadUrl("file:///android_res/raw/rule75.html");
        }else if (position == 75) {
            Introwebview.loadUrl("file:///android_res/raw/rule76.html");
        }else if (position == 76) {
            Introwebview.loadUrl("file:///android_res/raw/rule77.html");
        }else if (position == 77) {
            Introwebview.loadUrl("file:///android_res/raw/rule78.html");
        }else if (position == 78) {
            Introwebview.loadUrl("file:///android_res/raw/rule79.html");
        }else if (position == 79) {
            Introwebview.loadUrl("file:///android_res/raw/rule80.html");
        }else if (position == 80) {
            Introwebview.loadUrl("file:///android_res/raw/rule81.html");
        }else if (position == 81) {
            Introwebview.loadUrl("file:///android_res/raw/rule82.html");
        }else if (position == 82) {
            Introwebview.loadUrl("file:///android_res/raw/rule83.html");
        }else if (position == 83) {
            Introwebview.loadUrl("file:///android_res/raw/rule84.html");
        }else if (position == 84) {
            Introwebview.loadUrl("file:///android_res/raw/rule85.html");
        }else if (position == 85) {
            Introwebview.loadUrl("file:///android_res/raw/rule86.html");
        }else if (position == 86) {
            Introwebview.loadUrl("file:///android_res/raw/rule87.html");
        }else if (position == 87) {
            Introwebview.loadUrl("file:///android_res/raw/rule88.html");
        }else if (position == 88) {
            Introwebview.loadUrl("file:///android_res/raw/rule89.html");
        }else if (position == 89) {
            Introwebview.loadUrl("file:///android_res/raw/rule90.html");
        }else if (position == 90) {
            Introwebview.loadUrl("file:///android_res/raw/rule91.html");
        }else if (position == 91) {
            Introwebview.loadUrl("file:///android_res/raw/rule92.html");
        }else if (position == 92) {
            Introwebview.loadUrl("file:///android_res/raw/rule93.html");
        }else if (position == 93) {
            Introwebview.loadUrl("file:///android_res/raw/rule94.html");
        }else if (position == 94) {
            Introwebview.loadUrl("file:///android_res/raw/rule95.html");
        }else if (position == 95) {
            Introwebview.loadUrl("file:///android_res/raw/rule96.html");
        }else if (position == 96) {
            Introwebview.loadUrl("file:///android_res/raw/rule97.html");
        }else if (position == 97) {
            Introwebview.loadUrl("file:///android_res/raw/rule98.html");
        }else if (position == 98) {
            Introwebview.loadUrl("file:///android_res/raw/rule99.html");
        }else if (position == 99) {
            Introwebview.loadUrl("file:///android_res/raw/rule100.html");
        }else if (position == 100) {
            Introwebview.loadUrl("file:///android_res/raw/rule101.html");
        }else if (position == 101) {
            Introwebview.loadUrl("file:///android_res/raw/rule102.html");
        }else if (position == 102) {
            Introwebview.loadUrl("file:///android_res/raw/rule103.html");
        }else if (position == 103) {
            Introwebview.loadUrl("file:///android_res/raw/rule104.html");
        }else if (position == 104) {
            Introwebview.loadUrl("file:///android_res/raw/rule105.html");
        }else if (position == 105) {
            Introwebview.loadUrl("file:///android_res/raw/rule106.html");
        }else if (position == 106) {
            Introwebview.loadUrl("file:///android_res/raw/rule107.html");
        }else if (position == 107) {
            Introwebview.loadUrl("file:///android_res/raw/rule108.html");
        }else if (position == 108) {
            Introwebview.loadUrl("file:///android_res/raw/rule109.html");
        }else if (position == 109) {
            Introwebview.loadUrl("file:///android_res/raw/rule110.html");
        }else if (position == 110) {
            Introwebview.loadUrl("file:///android_res/raw/rule111.html");
        }else if (position == 111) {
            Introwebview.loadUrl("file:///android_res/raw/rule112.html");
        }else if (position == 112) {
            Introwebview.loadUrl("file:///android_res/raw/rule113.html");
        }else if (position == 113) {
            Introwebview.loadUrl("file:///android_res/raw/rule114.html");
        }else if (position == 114) {
            Introwebview.loadUrl("file:///android_res/raw/rule115.html");
        }else if (position == 115) {
            Introwebview.loadUrl("file:///android_res/raw/rule116.html");
        }else if (position == 116) {
            Introwebview.loadUrl("file:///android_res/raw/rule117.html");
        }else if (position == 117) {
            Introwebview.loadUrl("file:///android_res/raw/rule118.html");
        }else if (position == 118) {
            Introwebview.loadUrl("file:///android_res/raw/rule119.html");
        }else if (position == 119) {
            Introwebview.loadUrl("file:///android_res/raw/rule120.html");
        }else if (position == 120) {
            Introwebview.loadUrl("file:///android_res/raw/rule121.html");
        }else if (position == 121) {
            Introwebview.loadUrl("file:///android_res/raw/rule122.html");
        }else if (position == 122) {
            Introwebview.loadUrl("file:///android_res/raw/rule123.html");
        }else if (position == 123) {
            Introwebview.loadUrl("file:///android_res/raw/rule124.html");
        }else if (position == 124) {
            Introwebview.loadUrl("file:///android_res/raw/rule125.html");
        }else if (position == 125) {
            Introwebview.loadUrl("file:///android_res/raw/rule126.html");
        }else if (position == 126) {
            Introwebview.loadUrl("file:///android_res/raw/rule127.html");
        }else if (position == 127) {
            Introwebview.loadUrl("file:///android_res/raw/rule128.html");
        }else if (position == 128) {
            Introwebview.loadUrl("file:///android_res/raw/rule129.html");
        }else if (position == 129) {
            Introwebview.loadUrl("file:///android_res/raw/rule130.html");
        }else if (position == 130) {
            Introwebview.loadUrl("file:///android_res/raw/rule131.html");
        }else if (position == 131) {
            Introwebview.loadUrl("file:///android_res/raw/rule132.html");
        }else if (position == 132) {
            Introwebview.loadUrl("file:///android_res/raw/rule133.html");
        }else if (position == 133) {
            Introwebview.loadUrl("file:///android_res/raw/rule134.html");
        }else if (position == 134) {
            Introwebview.loadUrl("file:///android_res/raw/rule135.html");
        }else if (position == 135) {
            Introwebview.loadUrl("file:///android_res/raw/rule136.html");
        }else if (position == 136) {
            Introwebview.loadUrl("file:///android_res/raw/rule137.html");
        }else if (position == 137) {
            Introwebview.loadUrl("file:///android_res/raw/rule138.html");
        }else if (position == 138) {
            Introwebview.loadUrl("file:///android_res/raw/rule139.html");
        }else if (position == 139) {
            Introwebview.loadUrl("file:///android_res/raw/rule140.html");
        }else if (position == 140) {
            Introwebview.loadUrl("file:///android_res/raw/rule141.html");
        }else if (position == 141) {
            Introwebview.loadUrl("file:///android_res/raw/rule142.html");
        }else if (position == 142) {
            Introwebview.loadUrl("file:///android_res/raw/rule143.html");
        }else if (position == 143) {
            Introwebview.loadUrl("file:///android_res/raw/rule144.html");
        }else if (position == 144) {
            Introwebview.loadUrl("file:///android_res/raw/rule145.html");
        }else if (position == 145) {
            Introwebview.loadUrl("file:///android_res/raw/rule146.html");
        }else if (position == 146) {
            Introwebview.loadUrl("file:///android_res/raw/rule147.html");
        }else if (position == 147) {
            Introwebview.loadUrl("file:///android_res/raw/rule148.html");
        }else if (position == 148) {
            Introwebview.loadUrl("file:///android_res/raw/rule149.html");
        }else if (position == 149) {
            Introwebview.loadUrl("file:///android_res/raw/rule150.html");
        }else if (position == 150) {
            Introwebview.loadUrl("file:///android_res/raw/rule151.html");
        }else if (position == 151) {
            Introwebview.loadUrl("file:///android_res/raw/rule152.html");
        }else if (position == 152) {
            Introwebview.loadUrl("file:///android_res/raw/rule153.html");
        }else if (position == 153) {
            Introwebview.loadUrl("file:///android_res/raw/rule154.html");
        }else if (position == 154) {
            Introwebview.loadUrl("file:///android_res/raw/rule155.html");
        }else if (position == 155) {
            Introwebview.loadUrl("file:///android_res/raw/rule156.html");
        }else if (position == 156) {
            Introwebview.loadUrl("file:///android_res/raw/rule157.html");
        }else if (position == 157) {
            Introwebview.loadUrl("file:///android_res/raw/rule158.html");
        }else if (position == 158) {
            Introwebview.loadUrl("file:///android_res/raw/rule159.html");
        }else if (position == 159) {
            Introwebview.loadUrl("file:///android_res/raw/rule160.html");
        }else if (position == 160) {
            Introwebview.loadUrl("file:///android_res/raw/rule161.html");
        }else if (position == 161) {
            Introwebview.loadUrl("file:///android_res/raw/rule162.html");
        }else if (position == 162) {
            Introwebview.loadUrl("file:///android_res/raw/rule163.html");
        }else if (position == 163) {
            Introwebview.loadUrl("file:///android_res/raw/rule164.html");
        }else if (position == 164) {
            Introwebview.loadUrl("file:///android_res/raw/rule165.html");
        }else if (position == 165) {
            Introwebview.loadUrl("file:///android_res/raw/rule166.html");
        }else if (position == 166) {
            Introwebview.loadUrl("file:///android_res/raw/rule167.html");
        }else if (position == 167) {
            Introwebview.loadUrl("file:///android_res/raw/rule168.html");
        }else if (position == 168) {
            Introwebview.loadUrl("file:///android_res/raw/rule169.html");
        }else if (position == 169) {
            Introwebview.loadUrl("file:///android_res/raw/rule170.html");
        }else if (position == 170) {
            Introwebview.loadUrl("file:///android_res/raw/rule171.html");
        }else if (position == 171) {
            Introwebview.loadUrl("file:///android_res/raw/rule172.html");
        }else if (position == 172) {
            Introwebview.loadUrl("file:///android_res/raw/rule173.html");
        }else if (position == 173) {
            Introwebview.loadUrl("file:///android_res/raw/rule174.html");
        }else if (position == 174) {
            Introwebview.loadUrl("file:///android_res/raw/rule175.html");
        }else if (position == 175) {
            Introwebview.loadUrl("file:///android_res/raw/rule176.html");
        }else if (position == 176) {
            Introwebview.loadUrl("file:///android_res/raw/rule177.html");
        }else if (position == 177) {
            Introwebview.loadUrl("file:///android_res/raw/rule178.html");
        }else if (position == 178) {
            Introwebview.loadUrl("file:///android_res/raw/rule179.html");
        }else if (position == 179) {
            Introwebview.loadUrl("file:///android_res/raw/rule180.html");
        }else if (position == 180) {
            Introwebview.loadUrl("file:///android_res/raw/rule181.html");
        }else if (position == 181) {
            Introwebview.loadUrl("file:///android_res/raw/rule182.html");
        }else if (position == 182) {
            Introwebview.loadUrl("file:///android_res/raw/rule183.html");
        }else if (position == 183) {
            Introwebview.loadUrl("file:///android_res/raw/rule184.html");
        }else if (position == 184) {
            Introwebview.loadUrl("file:///android_res/raw/rule185.html");
        }else if (position == 185) {
            Introwebview.loadUrl("file:///android_res/raw/rule186.html");
        }else if (position == 186) {
            Introwebview.loadUrl("file:///android_res/raw/rule187.html");
        }else if (position == 187) {
            Introwebview.loadUrl("file:///android_res/raw/rule188.html");
        }else if (position == 188) {
            Introwebview.loadUrl("file:///android_res/raw/rule189.html");
        }else if (position == 189) {
            Introwebview.loadUrl("file:///android_res/raw/rule190.html");
        }else if (position == 190) {
            Introwebview.loadUrl("file:///android_res/raw/rule191.html");
        }else if (position == 191) {
            Introwebview.loadUrl("file:///android_res/raw/rule192.html");
        }else if (position == 192) {
            Introwebview.loadUrl("file:///android_res/raw/rule193.html");
        }else if (position == 193) {
            Introwebview.loadUrl("file:///android_res/raw/rule194.html");
        }else if (position == 194) {
            Introwebview.loadUrl("file:///android_res/raw/rule195.html");
        }else if (position == 195) {
            Introwebview.loadUrl("file:///android_res/raw/rule196.html");
        }else if (position == 196) {
            Introwebview.loadUrl("file:///android_res/raw/rule197.html");
        }else if (position == 197) {
            Introwebview.loadUrl("file:///android_res/raw/rule198.html");
        }else if (position == 198) {
            Introwebview.loadUrl("file:///android_res/raw/rule199.html");
        }else if (position == 199) {
            Introwebview.loadUrl("file:///android_res/raw/rule200.html");
        }else if (position == 200) {
            Introwebview.loadUrl("file:///android_res/raw/rule201.html");
        }else if (position == 201) {
            Introwebview.loadUrl("file:///android_res/raw/rule202.html");
        }else if (position == 202) {
            Introwebview.loadUrl("file:///android_res/raw/rule203.html");
        }else if (position == 203) {
            Introwebview.loadUrl("file:///android_res/raw/rule204.html");
        }else if (position == 204) {
            Introwebview.loadUrl("file:///android_res/raw/rule205.html");
        }else if (position == 205) {
            Introwebview.loadUrl("file:///android_res/raw/rule206.html");
        }else if (position == 206) {
            Introwebview.loadUrl("file:///android_res/raw/rule207.html");
        }else if (position == 207) {
            Introwebview.loadUrl("file:///android_res/raw/rule208.html");
        }else if (position == 208) {
            Introwebview.loadUrl("file:///android_res/raw/rule209.html");
        }else if (position == 209) {
            Introwebview.loadUrl("file:///android_res/raw/rule210.html");
        }else if (position == 210) {
            Introwebview.loadUrl("file:///android_res/raw/rule211.html");
        }else if (position == 211) {
            Introwebview.loadUrl("file:///android_res/raw/rule212.html");
        }else if (position == 212) {
            Introwebview.loadUrl("file:///android_res/raw/rule213.html");
        }else if (position == 213) {
            Introwebview.loadUrl("file:///android_res/raw/rule214.html");
        }else if (position == 214) {
            Introwebview.loadUrl("file:///android_res/raw/rule215.html");
        }else if (position == 215) {
            Introwebview.loadUrl("file:///android_res/raw/rule216.html");
        }else if (position == 216) {
            Introwebview.loadUrl("file:///android_res/raw/rule217.html");
        }else if (position == 217) {
            Introwebview.loadUrl("file:///android_res/raw/rule218.html");
        }else if (position == 218) {
            Introwebview.loadUrl("file:///android_res/raw/rule219.html");
        }else if (position == 219) {
            Introwebview.loadUrl("file:///android_res/raw/rule220.html");
        }else if (position == 220) {
            Introwebview.loadUrl("file:///android_res/raw/rule221.html");
        }else if (position == 221) {
            Introwebview.loadUrl("file:///android_res/raw/rule222.html");
        }else if (position == 222) {
            Introwebview.loadUrl("file:///android_res/raw/rule223.html");
        }else if (position == 223) {
            Introwebview.loadUrl("file:///android_res/raw/rule224.html");
        }else if (position == 224) {
            Introwebview.loadUrl("file:///android_res/raw/rule225.html");
        }else if (position == 225) {
            Introwebview.loadUrl("file:///android_res/raw/rule226.html");
        }else if (position == 226) {
            Introwebview.loadUrl("file:///android_res/raw/rule227.html");
        }else if (position == 227) {
            Introwebview.loadUrl("file:///android_res/raw/rule228.html");
        }else if (position == 228) {
            Introwebview.loadUrl("file:///android_res/raw/rule229.html");
        }else if (position == 229) {
            Introwebview.loadUrl("file:///android_res/raw/rule230.html");
        }else if (position == 230) {
            Introwebview.loadUrl("file:///android_res/raw/rule231.html");
        }else if (position == 231) {
            Introwebview.loadUrl("file:///android_res/raw/rule232.html");
        }else if (position == 232) {
            Introwebview.loadUrl("file:///android_res/raw/rule233.html");
        }else if (position == 233) {
            Introwebview.loadUrl("file:///android_res/raw/rule234.html");
        }else if (position == 234) {
            Introwebview.loadUrl("file:///android_res/raw/rule235.html");
        }else if (position == 235) {
            Introwebview.loadUrl("file:///android_res/raw/rule236.html");
        }else if (position == 236) {
            Introwebview.loadUrl("file:///android_res/raw/rule237.html");
        }else if (position == 237) {
            Introwebview.loadUrl("file:///android_res/raw/rule238.html");
        }else if (position == 238) {
            Introwebview.loadUrl("file:///android_res/raw/rule239.html");
        }else if (position == 239) {
            Introwebview.loadUrl("file:///android_res/raw/rule240.html");
        }else if (position == 240) {
            Introwebview.loadUrl("file:///android_res/raw/rule241.html");
        }else if (position == 241) {
            Introwebview.loadUrl("file:///android_res/raw/rule242.html");
        }else if (position == 242) {
            Introwebview.loadUrl("file:///android_res/raw/rule243.html");
        }else if (position == 243) {
            Introwebview.loadUrl("file:///android_res/raw/rule244.html");
        }else if (position == 244) {
            Introwebview.loadUrl("file:///android_res/raw/rule245.html");
        }else if (position == 245) {
            Introwebview.loadUrl("file:///android_res/raw/rule246.html");
        }else if (position == 246) {
            Introwebview.loadUrl("file:///android_res/raw/rule247.html");
        }else if (position == 247) {
            Introwebview.loadUrl("file:///android_res/raw/rule248.html");
        }else if (position == 248) {
            Introwebview.loadUrl("file:///android_res/raw/rule249.html");
        }else if (position == 249) {
            Introwebview.loadUrl("file:///android_res/raw/rule250.html");
        }else if (position == 250) {
            Introwebview.loadUrl("file:///android_res/raw/rule251.html");
        }else if (position == 251) {
            Introwebview.loadUrl("file:///android_res/raw/rule252.html");
        }else if (position == 252) {
            Introwebview.loadUrl("file:///android_res/raw/rule254.html");
        }else if (position == 253) {
            Introwebview.loadUrl("file:///android_res/raw/rule253.html");
        }else if (position == 254) {
            Introwebview.loadUrl("file:///android_res/raw/rule255.html");
        }else if (position == 255) {
            Introwebview.loadUrl("file:///android_res/raw/rule256.html");
        }else if (position == 256) {
            Introwebview.loadUrl("file:///android_res/raw/rule257.html");
        }else if (position == 257) {
            Introwebview.loadUrl("file:///android_res/raw/rule258.html");
        }else if (position == 258) {
            Introwebview.loadUrl("file:///android_res/raw/rule259.html");
        }else if (position == 259) {
            Introwebview.loadUrl("file:///android_res/raw/rule260.html");
        }else if (position == 260) {
            Introwebview.loadUrl("file:///android_res/raw/rule261.html");
        }else if (position == 261) {
            Introwebview.loadUrl("file:///android_res/raw/rule262.html");
        }else if (position == 262) {
            Introwebview.loadUrl("file:///android_res/raw/rule263.html");
        }else if (position == 263) {
            Introwebview.loadUrl("file:///android_res/raw/rule264.html");
        }else if (position == 264) {
            Introwebview.loadUrl("file:///android_res/raw/rule265.html");
        }else if (position == 265) {
            Introwebview.loadUrl("file:///android_res/raw/rule266.html");
        }else if (position == 266) {
            Introwebview.loadUrl("file:///android_res/raw/rule267.html");
        }else if (position == 267) {
            Introwebview.loadUrl("file:///android_res/raw/rule268.html");
        }else if (position == 268) {
            Introwebview.loadUrl("file:///android_res/raw/rule269.html");
        }else if (position == 269) {
            Introwebview.loadUrl("file:///android_res/raw/rule270.html");
        }else if (position == 270) {
            Introwebview.loadUrl("file:///android_res/raw/rule271.html");
        }else if (position == 271) {
            Introwebview.loadUrl("file:///android_res/raw/rule272.html");
        }else if (position == 272) {
            Introwebview.loadUrl("file:///android_res/raw/rule273.html");
        }else if (position == 273) {
            Introwebview.loadUrl("file:///android_res/raw/rule274.html");
        }else if (position == 274) {
            Introwebview.loadUrl("file:///android_res/raw/rule275.html");
        }else if (position == 275) {
            Introwebview.loadUrl("file:///android_res/raw/rule276.html");
        }else if (position == 276) {
            Introwebview.loadUrl("file:///android_res/raw/rule277.html");
        }else if (position == 277) {
            Introwebview.loadUrl("file:///android_res/raw/rule278.html");
        }else if (position == 278) {
            Introwebview.loadUrl("file:///android_res/raw/rule279.html");
        }else if (position == 279) {
            Introwebview.loadUrl("file:///android_res/raw/rule280.html");
        }else if (position == 280) {
            Introwebview.loadUrl("file:///android_res/raw/rule281.html");
        }else if (position == 281) {
            Introwebview.loadUrl("file:///android_res/raw/rule282.html");
        }else if (position == 282) {
            Introwebview.loadUrl("file:///android_res/raw/rule283.html");
        }else if (position == 283) {
            Introwebview.loadUrl("file:///android_res/raw/rule284.html");
        }else if (position == 284) {
            Introwebview.loadUrl("file:///android_res/raw/rule285.html");
        }else if (position == 285) {
            Introwebview.loadUrl("file:///android_res/raw/rule286.html");
        }else if (position == 286) {
            Introwebview.loadUrl("file:///android_res/raw/rule287.html");
        }else if (position == 287) {
            Introwebview.loadUrl("file:///android_res/raw/rule288.html");
        }else if (position == 288) {
            Introwebview.loadUrl("file:///android_res/raw/rule289.html");
        }else if (position == 289) {
            Introwebview.loadUrl("file:///android_res/raw/rule290.html");
        }else if (position == 290) {
            Introwebview.loadUrl("file:///android_res/raw/rule291.html");
        }else if (position == 291) {
            Introwebview.loadUrl("file:///android_res/raw/rule292.html");
        }else if (position == 292) {
            Introwebview.loadUrl("file:///android_res/raw/rule293.html");
        }else if (position == 293) {
            Introwebview.loadUrl("file:///android_res/raw/rule294.html");
        }else if (position == 294) {
            Introwebview.loadUrl("file:///android_res/raw/rule295.html");
        }else if (position == 295) {
            Introwebview.loadUrl("file:///android_res/raw/rule296.html");
        }else if (position == 296) {
            Introwebview.loadUrl("file:///android_res/raw/rule297.html");
        }else if (position == 297) {
            Introwebview.loadUrl("file:///android_res/raw/rule298.html");
        }else if (position == 298) {
            Introwebview.loadUrl("file:///android_res/raw/rule299.html");
        }else if (position == 299) {
            Introwebview.loadUrl("file:///android_res/raw/rule300.html");
        }else if (position == 300) {
            Introwebview.loadUrl("file:///android_res/raw/rule301.html");
        }else if (position == 301) {
            Introwebview.loadUrl("file:///android_res/raw/rule302.html");
        }else if (position == 302) {
            Introwebview.loadUrl("file:///android_res/raw/rule303.html");
        }else if (position == 303) {
            Introwebview.loadUrl("file:///android_res/raw/rule304.html");
        }else if (position == 304) {
            Introwebview.loadUrl("file:///android_res/raw/rule305.html");
        }else if (position == 305) {
            Introwebview.loadUrl("file:///android_res/raw/rule306.html");
        }else if (position == 306) {
            Introwebview.loadUrl("file:///android_res/raw/rule307.html");
        }else if (position == 307) {
            Introwebview.loadUrl("file:///android_res/raw/rule308.html");
        }else if (position == 308) {
            Introwebview.loadUrl("file:///android_res/raw/rule309.html");
        }else if (position == 309) {
            Introwebview.loadUrl("file:///android_res/raw/rule310.html");
        }else if (position == 310) {
            Introwebview.loadUrl("file:///android_res/raw/rule311.html");
        }else if (position == 311) {
            Introwebview.loadUrl("file:///android_res/raw/rule312.html");
        }else if (position == 312) {
            Introwebview.loadUrl("file:///android_res/raw/rule313.html");
        }else if (position == 313) {
            Introwebview.loadUrl("file:///android_res/raw/rule314.html");
        }else if (position == 314) {
            Introwebview.loadUrl("file:///android_res/raw/rule315.html");
        }else if (position == 315) {
            Introwebview.loadUrl("file:///android_res/raw/rule316.html");
        }else if (position == 316) {
            Introwebview.loadUrl("file:///android_res/raw/rule317.html");
        }else if (position == 317) {
            Introwebview.loadUrl("file:///android_res/raw/rule318.html");
        }else if (position == 318) {
            Introwebview.loadUrl("file:///android_res/raw/rule319.html");
        }else if (position == 319) {
            Introwebview.loadUrl("file:///android_res/raw/rule320.html");
        }else if (position == 320) {
            Introwebview.loadUrl("file:///android_res/raw/rule321.html");
        }else if (position == 321) {
            Introwebview.loadUrl("file:///android_res/raw/rule322.html");
        }else if (position == 322) {
            Introwebview.loadUrl("file:///android_res/raw/rule323.html");
        }else if (position == 323) {
            Introwebview.loadUrl("file:///android_res/raw/rule324.html");
        }else if (position == 324) {
            Introwebview.loadUrl("file:///android_res/raw/rule325.html");
        }else if (position == 325) {
            Introwebview.loadUrl("file:///android_res/raw/rule326.html");
        }else if (position == 326) {
            Introwebview.loadUrl("file:///android_res/raw/rule327.html");
        }else if (position == 327) {
            Introwebview.loadUrl("file:///android_res/raw/rule328.html");
        }else if (position == 328) {
            Introwebview.loadUrl("file:///android_res/raw/rule329.html");
        }else if (position == 329) {
            Introwebview.loadUrl("file:///android_res/raw/rule330.html");
        }else if (position == 330) {
            Introwebview.loadUrl("file:///android_res/raw/rule331.html");
        }else if (position == 331) {
            Introwebview.loadUrl("file:///android_res/raw/rule332.html");
        }else if (position == 332) {
            Introwebview.loadUrl("file:///android_res/raw/rule333.html");
        }else if (position == 333) {
            Introwebview.loadUrl("file:///android_res/raw/rule334.html");
        }else if (position == 334) {
            Introwebview.loadUrl("file:///android_res/raw/rule335.html");
        }else if (position == 335) {
            Introwebview.loadUrl("file:///android_res/raw/rule336.html");
        }else if (position == 336) {
            Introwebview.loadUrl("file:///android_res/raw/rule337.html");
        }else if (position == 337) {
            Introwebview.loadUrl("file:///android_res/raw/rule338.html");
        }else if (position == 338) {
            Introwebview.loadUrl("file:///android_res/raw/rule339.html");
        }else if (position == 339) {
            Introwebview.loadUrl("file:///android_res/raw/rule340.html");
        }else if (position == 340) {
            Introwebview.loadUrl("file:///android_res/raw/rule341.html");
        }else if (position == 341) {
            Introwebview.loadUrl("file:///android_res/raw/rule342.html");
        }else if (position == 342) {
            Introwebview.loadUrl("file:///android_res/raw/rule343.html");
        }else if (position == 343) {
            Introwebview.loadUrl("file:///android_res/raw/rule344.html");
        }else if (position == 344) {
            Introwebview.loadUrl("file:///android_res/raw/rule345.html");
        }else if (position == 345) {
            Introwebview.loadUrl("file:///android_res/raw/rule346.html");
        }else if (position == 346) {
            Introwebview.loadUrl("file:///android_res/raw/rule347.html");
        }else if (position == 347) {
            Introwebview.loadUrl("file:///android_res/raw/rule348.html");
        }else if (position == 348) {
            Introwebview.loadUrl("file:///android_res/raw/rule349.html");
        }else if (position == 349) {
            Introwebview.loadUrl("file:///android_res/raw/rule350.html");
        }else if (position == 350) {
            Introwebview.loadUrl("file:///android_res/raw/rule351.html");
        }else if (position == 351) {
            Introwebview.loadUrl("file:///android_res/raw/rule352.html");
        }else if (position == 352) {
            Introwebview.loadUrl("file:///android_res/raw/rule353.html");
        }else if (position == 353) {
            Introwebview.loadUrl("file:///android_res/raw/rule354.html");
        }else if (position == 354) {
            Introwebview.loadUrl("file:///android_res/raw/rule355.html");
        }else if (position == 355) {
            Introwebview.loadUrl("file:///android_res/raw/rule356.html");
        }else if (position == 356) {
            Introwebview.loadUrl("file:///android_res/raw/rule357.html");
        }else if (position == 357) {
            Introwebview.loadUrl("file:///android_res/raw/rule358.html");
        }else if (position == 358) {
            Introwebview.loadUrl("file:///android_res/raw/rule359.html");
        }else if (position == 359) {
            Introwebview.loadUrl("file:///android_res/raw/rule360.html");
        }else if (position == 360) {
            Introwebview.loadUrl("file:///android_res/raw/rule361.html");
        }else if (position == 361) {
            Introwebview.loadUrl("file:///android_res/raw/rule362.html");
        }else if (position == 362) {
            Introwebview.loadUrl("file:///android_res/raw/rule363.html");
        }else if (position == 363) {
            Introwebview.loadUrl("file:///android_res/raw/rule364.html");
        }else if (position == 364) {
            Introwebview.loadUrl("file:///android_res/raw/rule365.html");
        }else if (position == 365) {
            Introwebview.loadUrl("file:///android_res/raw/rule366.html");
        }else if (position == 366) {
            Introwebview.loadUrl("file:///android_res/raw/rule367.html");
        }else if (position == 367) {
            Introwebview.loadUrl("file:///android_res/raw/rule368.html");
        }else if (position == 368) {
            Introwebview.loadUrl("file:///android_res/raw/rule369.html");
        }else if (position == 369) {
            Introwebview.loadUrl("file:///android_res/raw/rule370.html");
        }else if (position == 370) {
            Introwebview.loadUrl("file:///android_res/raw/rule371.html");
        }else if (position == 371) {
            Introwebview.loadUrl("file:///android_res/raw/rule372.html");
        }else if (position == 372) {
            Introwebview.loadUrl("file:///android_res/raw/rule373.html");
        }else if (position == 373) {
            Introwebview.loadUrl("file:///android_res/raw/rule374.html");
        }else if (position == 374) {
            Introwebview.loadUrl("file:///android_res/raw/rule375.html");
        }else if (position == 375) {
            Introwebview.loadUrl("file:///android_res/raw/rule376.html");
        }else if (position == 376) {
            Introwebview.loadUrl("file:///android_res/raw/rule377.html");
        }else if (position == 377) {
            Introwebview.loadUrl("file:///android_res/raw/rule378.html");
        }else if (position == 378) {
            Introwebview.loadUrl("file:///android_res/raw/rule379.html");
        }else if (position == 379) {
            Introwebview.loadUrl("file:///android_res/raw/rule380.html");
        }else if (position == 380) {
            Introwebview.loadUrl("file:///android_res/raw/rule381.html");
        }else if (position == 381) {
            Introwebview.loadUrl("file:///android_res/raw/rule382.html");
        }else if (position == 382) {
            Introwebview.loadUrl("file:///android_res/raw/rule383.html");
        }else if (position == 383) {
            Introwebview.loadUrl("file:///android_res/raw/rule384.html");
        }else if (position == 384) {
            Introwebview.loadUrl("file:///android_res/raw/rule385.html");
        }else if (position == 385) {
            Introwebview.loadUrl("file:///android_res/raw/rule386.html");
        }else if (position == 386) {
            Introwebview.loadUrl("file:///android_res/raw/rule387.html");
        }else if (position == 387) {
            Introwebview.loadUrl("file:///android_res/raw/rule388.html");
        }else if (position == 388) {
            Introwebview.loadUrl("file:///android_res/raw/rule389.html");
        }else if (position == 389) {
            Introwebview.loadUrl("file:///android_res/raw/rule390.html");
        }else if (position == 390) {
            Introwebview.loadUrl("file:///android_res/raw/rule391.html");
        }else if (position == 391) {
            Introwebview.loadUrl("file:///android_res/raw/rule392.html");
        }else if (position == 392) {
            Introwebview.loadUrl("file:///android_res/raw/rule393.html");
        }else if (position == 393) {
            Introwebview.loadUrl("file:///android_res/raw/rule394.html");
        }else if (position == 394) {
            Introwebview.loadUrl("file:///android_res/raw/rule395.html");
        }else if (position == 395) {
            Introwebview.loadUrl("file:///android_res/raw/rule396.html");
        }else if (position == 396) {
            Introwebview.loadUrl("file:///android_res/raw/rule397.html");
        }else if (position == 397) {
            Introwebview.loadUrl("file:///android_res/raw/rule398.html");
        }else if (position == 398) {
            Introwebview.loadUrl("file:///android_res/raw/rule399.html");
        }else if (position == 399) {
            Introwebview.loadUrl("file:///android_res/raw/rule400.html");
        }else if (position == 400) {
            Introwebview.loadUrl("file:///android_res/raw/rule401.html");
        }else if (position == 401) {
            Introwebview.loadUrl("file:///android_res/raw/rule402.html");
        }else if (position == 402) {
            Introwebview.loadUrl("file:///android_res/raw/rule403.html");
        }else if (position == 403) {
            Introwebview.loadUrl("file:///android_res/raw/rule404.html");
        }else if (position == 404) {
            Introwebview.loadUrl("file:///android_res/raw/rule405.html");
        }else if (position == 405) {
            Introwebview.loadUrl("file:///android_res/raw/rule406.html");
        }else if (position == 406) {
            Introwebview.loadUrl("file:///android_res/raw/rule407.html");
        }else if (position == 407) {
            Introwebview.loadUrl("file:///android_res/raw/rule408.html");
        }else if (position == 408) {
            Introwebview.loadUrl("file:///android_res/raw/rule409.html");
        }else if (position == 409) {
            Introwebview.loadUrl("file:///android_res/raw/rule410.html");
        }else if (position == 410) {
            Introwebview.loadUrl("file:///android_res/raw/rule411.html");
        }else if (position == 411) {
            Introwebview.loadUrl("file:///android_res/raw/rule412.html");
        }else if (position == 412) {
            Introwebview.loadUrl("file:///android_res/raw/rule413.html");
        }else if (position == 413) {
            Introwebview.loadUrl("file:///android_res/raw/rule414.html");
        }else if (position == 414) {
            Introwebview.loadUrl("file:///android_res/raw/rule415.html");
        }else if (position == 415) {
            Introwebview.loadUrl("file:///android_res/raw/rule416.html");
        }else if (position == 416) {
            Introwebview.loadUrl("file:///android_res/raw/rule417.html");
        }else if (position == 417) {
            Introwebview.loadUrl("file:///android_res/raw/rule418.html");
        }else if (position == 418) {
            Introwebview.loadUrl("file:///android_res/raw/rule419.html");
        }else if (position == 419) {
            Introwebview.loadUrl("file:///android_res/raw/rule420.html");
        }else if (position == 420) {
            Introwebview.loadUrl("file:///android_res/raw/rule421.html");
        }else if (position == 421) {
            Introwebview.loadUrl("file:///android_res/raw/rule422.html");
        }else if (position == 422) {
            Introwebview.loadUrl("file:///android_res/raw/rule423.html");
        }else if (position == 423) {
            Introwebview.loadUrl("file:///android_res/raw/rule424.html");
        }else if (position == 424) {
            Introwebview.loadUrl("file:///android_res/raw/rule425.html");
        }else if (position == 425) {
            Introwebview.loadUrl("file:///android_res/raw/rule426.html");
        }else if (position == 426) {
            Introwebview.loadUrl("file:///android_res/raw/rule427.html");
        }else if (position == 427) {
            Introwebview.loadUrl("file:///android_res/raw/rule428.html");
        }else if (position == 428) {
            Introwebview.loadUrl("file:///android_res/raw/rule429.html");
        }else if (position == 429) {
            Introwebview.loadUrl("file:///android_res/raw/rule430.html");
        }else if (position == 430) {
            Introwebview.loadUrl("file:///android_res/raw/rule431.html");
        }else if (position == 431) {
            Introwebview.loadUrl("file:///android_res/raw/rule432.html");
        }
    }
        public class WebViewClient extends android.webkit.WebViewClient {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return super.shouldOverrideUrlLoading(view, url);
            }
        }

}
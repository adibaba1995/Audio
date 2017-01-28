package com.dupletstudios.audio.network.ultrasonic;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.media.AudioRecord;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Build.VERSION;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import com.qraider.xt.JJRAutoResizeTextView;
import com.qraider.xt.XTUltrasonicsInterface;
import com.qraider.xt.R.id;
import com.qraider.xt.R.string;
import com.qraider.xt.fft.JJRRealDoubleFFT;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class XTUltrasonicsActivity extends AppCompatActivity implements XTUltrasonicsInterface {
//    public static final String TAG_TRIGGERS = "triggers";
//    public static final String TAG_TRIGGERPEAKS = "peaks";
//    public static final String TAG_TRIGGERVALLEYS = "valleys";
//    public static final String TAG_TRIGGERTITLE = "title";
//    public static final String TAG_TRIGGERTHRESHOLD = "hitThresholdAndroid";
//    public static final String TAG_TRIGGERTIMER = "timerAndroid";
//    private boolean k;
//    private Handler l;
//    boolean a = false;
//    int b = 16;
//    int c = 2;
//    AudioRecord d;
//    XTUltrasonicsActivity.b e;
//    private HashMap<String, HashMap<String, Object>> m = new HashMap();
//    private HashMap<String, Integer> n = new HashMap();
//    private String o = "";
//    private ArrayList<String> p = new ArrayList();
//    private SharedPreferences q;
//    static double f = 44100.0D;
//    int g = 0;
//    int h = 0;
//    int i = 2048;
//    private JJRRealDoubleFFT r;
//    int j = 4096;
//    private JJRAutoResizeTextView s;
//    private RelativeLayout t;
//    public static String kDEFAULT_LISTENINGLABELTEXT = "Listening for ultrasonic audio signals...";
//    public static String kDEFAULT_LISTENINGLABELTEXTCOLOR = "#AAAAAA";
//    public static boolean handleRecordPermissionsForMe = true;
//    public static String kPrePermissionTitle = "To use this app...";
//    public static String kPrePermissionBody = "This app detects ultrasonic triggers embedded in your local environement. To use this app, we will need your permission to record audio (access your microphone). Please grant microphone access by selecting \'Allow\' to the following question.";
//    public static String kPermissionBodyRejected = "This app detects ultrasonic triggers embedded in your local environement. To use this app, we will need your permission to record audio (access your microphone). Please grant microphone access in settings.";
//    public static String kMicPermissionDenyTitle = "Microphone Access Denied";
//    public static String kMicPermissionDenyBody = "This app detects ultrasonic triggers embedded in your local environement. To use this app, we will need your permission to record audio (access your microphone). Please grant microphone access in settings.";
//
//    public XTUltrasonicsActivity() {
//    }
//
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        this.a = true;
//        this.q = PreferenceManager.getDefaultSharedPreferences(this);
//        boolean var2 = this.q.getBoolean("qraiderXTdidInstallation", false);
//        if(!var2) {
//            this.q.edit().putBoolean("qraiderXTdidInstallation", true).apply();
//            this.q.edit().putString("qraiderXTdeviceID", UUID.randomUUID().toString()).commit();
//        }
//
//        try {
//            this.restoreTriggers(this.q);
//        } catch (Exception var4) {
//            ;
//        }
//
//        (new XTUltrasonicsActivity.a(null)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
//    }
//
//    protected void onStart() {
//        super.onStart();
//        this.a = true;
//        this.createNewRecordSess();
//    }
//
//    protected void onStop() {
//        super.onStop();
//        this.a = false;
//    }
//
//    public void onPause() {
//        super.onPause();
//        this.resetCounters();
//    }
//
//    public void onResume() {
//        super.onResume();
//        this.resetCounters();
//    }
//
//    protected void createListeningLabel() {
//        try {
//            RelativeLayout var1 = (RelativeLayout)this.findViewById(id.listeningReLay);
//            JJRAutoResizeTextView var2 = (JJRAutoResizeTextView)this.findViewById(id.listeninglabel);
//            var2.setText(kDEFAULT_LISTENINGLABELTEXT);
//            this.t = var1;
//            this.s = var2;
//            this.t.setVisibility(4);
//            this.setListeningLabelTextColor(Color.parseColor(kDEFAULT_LISTENINGLABELTEXTCOLOR));
//        } catch (Exception var3) {
//            Log.e("XT ERR:", "Make sure to include the file \'listeninglabel\' into your layout before calling this method");
//        }
//
//    }
//
//    protected void displayListeningLabelWithFadeTime(boolean display, int t) {
//        AlphaAnimation var3;
//        if(display) {
//            var3 = new AlphaAnimation(0.0F, 1.0F);
//            var3.setDuration((long)t);
//            var3.setFillAfter(true);
//            this.t.startAnimation(var3);
//        } else {
//            var3 = new AlphaAnimation(1.0F, 0.0F);
//            var3.setDuration((long)t);
//            var3.setFillAfter(true);
//            this.t.startAnimation(var3);
//        }
//
//    }
//
//    protected boolean setListeningLabelText(String text) {
//        if(this.s != null) {
//            this.s.setText(text);
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    protected boolean setListeningLabelTextColor(int c) {
//        if(this.s != null) {
//            this.s.setTextColor(c);
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
//        switch(requestCode) {
//            case 0:
//                if(grantResults.length > 0 && grantResults[0] == 0) {
//                    this.b();
//                    this.microphonePermissionGranted();
//                } else {
//                    Builder var4 = new Builder(new ContextThemeWrapper(this, 16973937));
//                    var4.setTitle(kMicPermissionDenyTitle).setMessage(kMicPermissionDenyBody).setPositiveButton("Go to App Settings", new OnClickListener() {
//                        public void onClick(DialogInterface dialog, int which) {
//                            Intent var3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
//                            Uri var4 = Uri.fromParts("package", XTUltrasonicsActivity.this.getPackageName(), (String)null);
//                            var3.setData(var4);
//                            XTUltrasonicsActivity.this.startActivityForResult(var3, 0);
//                        }
//                    }).setNegativeButton("Deny Access", new OnClickListener() {
//                        public void onClick(DialogInterface dialog, int which) {
//                            XTUltrasonicsActivity.this.finish();
//                        }
//                    }).show();
//                }
//
//                return;
//            default:
//        }
//    }
//
//    public void didHearTriggerWithTitle(String title, double amplitude) {
//        this.k = true;
//        Handler var4 = new Handler();
//        var4.postDelayed(new Runnable() {
//            public void run() {
//                XTUltrasonicsActivity.this.a();
//            }
//        }, 1000L);
//        Log.i("XT", "DidHearTriggerWithTitle: " + title);
//    }
//
//    public void logTriggerTitles() {
//        Iterator var1 = this.m.keySet().iterator();
//
//        while(var1.hasNext()) {
//            String var2 = (String)var1.next();
//            if(var2.substring(0, 1).equalsIgnoreCase("C")) {
//                Log.i("XT", var2);
//            }
//        }
//
//    }
//
//    public void microphonePermissionGranted() {
//        this.createListeningLabel();
//        this.displayListeningLabelWithFadeTime(true, 600);
//    }
//
//    protected void resetCounters() {
//        Iterator var1 = this.n.keySet().iterator();
//
//        while(var1.hasNext()) {
//            String var2 = (String)var1.next();
//            this.n.put(var2, Integer.valueOf(0));
//        }
//
//        this.o = "";
//    }
//
//    private void a(SharedPreferences var1) {
//        if(var1 != null) {
//            new HashSet();
//            Set var2 = var1.getStringSet("qraiderTriggerTitles", (Set)null);
//            if(var2 != null) {
//                Iterator var3 = var2.iterator();
//
//                while(var3.hasNext()) {
//                    String var4 = (String)var3.next();
//                    if(var1.contains("qraidertrigger" + var4)) {
//                        var1.edit().remove("qraidertrigger" + var4).commit();
//                    }
//                }
//            }
//
//            if(var1.contains("qraiderTriggerTitles")) {
//                var1.edit().remove("qraiderTriggerTitles").commit();
//            }
//        }
//
//    }
//
//    protected void restoreTriggers(SharedPreferences prefs) {
//        new HashSet();
//        Set var2 = prefs.getStringSet("qraiderTriggerTitles", (Set)null);
//        if(var2 != null) {
//            Iterator var3 = var2.iterator();
//
//            while(var3.hasNext()) {
//                String var4 = (String)var3.next();
//
//                try {
//                    JSONObject var5 = new JSONObject(prefs.getString("qraidertrigger" + var4, (String)null));
//                    if(var5.has("peaks") && var5.has("valleys") && var5.has("title")) {
//                        List var6 = Arrays.asList(var5.getString("peaks").split("_"));
//                        List var7 = Arrays.asList(var5.getString("valleys").split("_"));
//                        String var8 = var5.getString("title");
//                        String var9 = var5.getString("ID");
//                        String var10 = var5.getString("hitThresholdAndroid");
//                        String var11 = var5.getString("timerAndroid");
//                        HashMap var12 = new HashMap();
//                        Iterator var15;
//                        String var16;
//                        if(var5.has("permutation")) {
//                            String var13 = var5.getString("permutation");
//                            if(var13 != null && !var13.equalsIgnoreCase("null")) {
//                                List var14 = Arrays.asList(var13.split("_"));
//                                var15 = var14.iterator();
//
//                                while(var15.hasNext()) {
//                                    var16 = (String)var15.next();
//                                    if(var16.length() > 0) {
//                                        this.p.add(var16);
//                                    }
//                                }
//                            }
//
//                            var12.put("permutation", var13);
//                        }
//
//                        this.n.put(var8, Integer.valueOf(0));
//                        ArrayList var19 = new ArrayList();
//                        ArrayList var20 = new ArrayList();
//
//                        try {
//                            var15 = var6.iterator();
//
//                            while(var15.hasNext()) {
//                                var16 = (String)var15.next();
//                                var19.add(Integer.valueOf(var16));
//                            }
//
//                            var15 = var7.iterator();
//
//                            while(var15.hasNext()) {
//                                var16 = (String)var15.next();
//                                var20.add(Integer.valueOf(var16));
//                            }
//                        } catch (Exception var17) {
//                            Log.e("XT", "" + var17);
//                        }
//
//                        var12.put("peaks", var19);
//                        var12.put("valleys", var20);
//                        var12.put("title", var8);
//                        var12.put("ID", var9);
//                        var12.put("hitThresholdAndroid", var10);
//                        var12.put("timerAndroid", var11);
//                        this.m.put(var8, var12);
//                    }
//                } catch (Exception var18) {
//                    ;
//                }
//            }
//        }
//
//    }
//
//    private void a() {
//        this.k = !this.k;
//    }
//
//    public static String GetWebPage(String sAddress) throws IOException {
//        StringBuilder var1 = new StringBuilder();
//        BufferedInputStream var2 = null;
//        URL var3 = new URL(sAddress);
//        HttpURLConnection var4 = (HttpURLConnection)var3.openConnection();
//        var4.setConnectTimeout(30000);
//        var4.setReadTimeout(30000);
//        int var5 = var4.getResponseCode();
//        if(var5 == 200) {
//            var2 = new BufferedInputStream(var4.getInputStream());
//            BufferedReader var6 = new BufferedReader(new InputStreamReader(var2, "UTF-8"));
//            String var7 = null;
//
//            while((var7 = var6.readLine()) != null) {
//                var1.append(var7);
//            }
//
//            var2.close();
//        }
//
//        return var1.toString();
//    }
//
//    protected void createNewRecordSess() {
//        if(VERSION.SDK_INT < 23) {
//            this.b();
//        } else if(handleRecordPermissionsForMe) {
//            if(ContextCompat.checkSelfPermission(this, "android.permission.RECORD_AUDIO") != 0) {
//                Builder var1;
//                if(ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.RECORD_AUDIO")) {
//                    var1 = new Builder(new ContextThemeWrapper(this, 16973937));
//                    var1.setTitle(kPrePermissionTitle).setMessage(kPermissionBodyRejected).setPositiveButton("OK", new OnClickListener() {
//                        public void onClick(DialogInterface dialog, int which) {
//                            Intent var3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
//                            Uri var4 = Uri.fromParts("package", XTUltrasonicsActivity.this.getPackageName(), (String)null);
//                            var3.setData(var4);
//                            XTUltrasonicsActivity.this.startActivityForResult(var3, 0);
//                        }
//                    }).show();
//                } else {
//                    var1 = new Builder(new ContextThemeWrapper(this, 16973937));
//                    var1.setTitle(kPrePermissionTitle).setMessage(kPrePermissionBody).setPositiveButton("OK", new OnClickListener() {
//                        public void onClick(DialogInterface dialog, int which) {
//                            ActivityCompat.requestPermissions(XTUltrasonicsActivity.this, new String[]{"android.permission.RECORD_AUDIO"}, 0);
//                        }
//                    }).show();
//                }
//            } else {
//                this.b();
//            }
//        } else {
//            this.b();
//        }
//
//    }
//
//    private void b() {
//        Handler var1 = new Handler();
//        var1.postDelayed(new Runnable() {
//            public void run() {
//                XTUltrasonicsActivity.this.e = XTUltrasonicsActivity.this.new b();
//                XTUltrasonicsActivity.this.e.execute(new Void[0]);
//            }
//        }, 1000L);
//    }
//
//    private class b extends AsyncTask<Void, short[], Void> {
//        int[] a = new int[]{'걄', 22050, 16000, 11025, 8000};
//
//        public b() {
//            Log.i("XT", "Record Audio");
//        }
//
//        protected Void doInBackground(Void... var1) {
//            try {
//                XTUltrasonicsActivity.this.g = AudioRecord.getMinBufferSize((int)XTUltrasonicsActivity.f, XTUltrasonicsActivity.this.b, XTUltrasonicsActivity.this.c);
//                XTUltrasonicsActivity.this.d = new AudioRecord(1, (int)XTUltrasonicsActivity.f, XTUltrasonicsActivity.this.b, XTUltrasonicsActivity.this.c, XTUltrasonicsActivity.this.g);
//                short[] var2 = new short[XTUltrasonicsActivity.this.i];
//                XTUltrasonicsActivity.this.d.startRecording();
//
//                while(XTUltrasonicsActivity.this.a) {
//                    XTUltrasonicsActivity.this.h = XTUltrasonicsActivity.this.d.read(var2, 0, XTUltrasonicsActivity.this.i);
//                    this.publishProgress(new short[][]{var2});
//                }
//
//                XTUltrasonicsActivity.this.d.stop();
//            } catch (Throwable var3) {
//                Log.e("AudioRecord", "Recording Failed");
//            }
//
//            return null;
//        }
//
//        protected void a(short[]... var1) {
//            if(!XTUltrasonicsActivity.this.k) {
//                double[] var2 = new double[XTUltrasonicsActivity.this.j];
//                XTUltrasonicsActivity.this.r = new JJRRealDoubleFFT(XTUltrasonicsActivity.this.j);
//
//                int var4;
//                for(var4 = 0; var4 < XTUltrasonicsActivity.this.h; ++var4) {
//                    var2[var4] = (double)var1[0][var4];
//                }
//
//                XTUltrasonicsActivity.this.r.ft(var2);
//                double[] var3 = new double[XTUltrasonicsActivity.this.j / 2];
//
//                for(var4 = 0; var4 < var2.length / 2; ++var4) {
//                    var3[var4] = Math.sqrt(Math.pow(var2[var4 * 2], 2.0D) + Math.pow(var2[2 * var4 + 1], 2.0D));
//                }
//
//                Iterator var29 = XTUltrasonicsActivity.this.m.keySet().iterator();
//
//                while(true) {
//                    HashMap var6;
//                    String var7;
//                    double var16;
//                    do {
//                        do {
//                            Integer var8;
//                            do {
//                                do {
//                                    do {
//                                        do {
//                                            do {
//                                                do {
//                                                    do {
//                                                        do {
//                                                            if(!var29.hasNext()) {
//                                                                return;
//                                                            }
//
//                                                            String var5 = (String)var29.next();
//                                                            var6 = (HashMap)XTUltrasonicsActivity.this.m.get(var5);
//                                                        } while(var6 == null);
//
//                                                        var7 = (String)var6.get("title");
//                                                    } while(var7 == null);
//                                                } while(!var7.getClass().equals(String.class));
//                                            } while(var7.equalsIgnoreCase("demo"));
//                                        } while(!var6.containsKey("peaks"));
//                                    } while(!var6.containsKey("valleys"));
//                                } while(!XTUltrasonicsActivity.this.n.containsKey(var7));
//
//                                var8 = (Integer)XTUltrasonicsActivity.this.n.get(var7);
//                                List var9 = (List)var6.get("peaks");
//                                List var10 = (List)var6.get("valleys");
//                                double[] var11 = new double[var9.size()];
//
//                                for(int var12 = 0; var12 < var9.size(); ++var12) {
//                                    var11[var12] = Math.abs(var3[((Integer)var9.get(var12)).intValue()]);
//                                }
//
//                                double[] var30 = new double[var10.size()];
//
//                                int var13;
//                                for(var13 = 0; var13 < var10.size(); ++var13) {
//                                    var30[var13] = Math.abs(var3[((Integer)var10.get(var13)).intValue()]);
//                                }
//
//                                var13 = 300;
//                                int var14 = 14;
//                                if(var6.containsKey("timerAndroid")) {
//                                    var13 = (int)(Float.parseFloat((String)var6.get("timerAndroid")) * 1000.0F);
//                                }
//
//                                if(var6.containsKey("hitThresholdAndroid")) {
//                                    var14 = Integer.parseInt((String)var6.get("hitThresholdAndroid"));
//                                }
//
//                                byte var15 = 0;
//                                var16 = 0.0D;
//                                if(var7.length() > 0 && !var7.substring(0, 1).equalsIgnoreCase("C")) {
//                                    double[] var18 = var11;
//                                    int var19 = var11.length;
//
//                                    for(int var20 = 0; var20 < var19; ++var20) {
//                                        double var21 = var18[var20];
//                                        boolean var23 = false;
//                                        var16 += var21;
//                                        double[] var24 = var30;
//                                        int var25 = var30.length;
//
//                                        for(int var26 = 0; var26 < var25; ++var26) {
//                                            double var27 = var24[var26];
//                                            if(var21 <= var27) {
//                                                var23 = true;
//                                            }
//                                        }
//
//                                        if(var23) {
//                                            ++var15;
//                                        }
//                                    }
//
//                                    if(var15 <= var14) {
//                                        if(XTUltrasonicsActivity.this.l != null) {
//                                            XTUltrasonicsActivity.this.l.removeCallbacksAndMessages((Object)null);
//                                            XTUltrasonicsActivity.this.l = null;
//                                        }
//
//                                        XTUltrasonicsActivity.this.l = new Handler();
//                                        XTUltrasonicsActivity.this.l.postDelayed(new Runnable() {
//                                            public void run() {
//                                                XTUltrasonicsActivity.this.resetCounters();
//                                            }
//                                        }, (long)var13);
//                                        XTUltrasonicsActivity.this.n.put(var7, Integer.valueOf(var8.intValue() + 1));
//                                    }
//                                }
//                            } while(var8.intValue() < 4);
//
//                            if(XTUltrasonicsActivity.this.o.length() >= var7.length()) {
//                                if(!XTUltrasonicsActivity.this.o.substring(XTUltrasonicsActivity.this.o.length() - var7.length()).equalsIgnoreCase(var7)) {
//                                    XTUltrasonicsActivity.this.o = XTUltrasonicsActivity.this.o + "_" + var7;
//                                }
//                            } else {
//                                XTUltrasonicsActivity.this.o = XTUltrasonicsActivity.this.o + "_" + var7;
//                            }
//
//                            Iterator var31 = XTUltrasonicsActivity.this.m.keySet().iterator();
//
//                            while(var31.hasNext()) {
//                                String var32 = (String)var31.next();
//                                HashMap var33 = (HashMap)XTUltrasonicsActivity.this.m.get(var32);
//                                if(var33.containsKey("permutation") && var33.get("permutation").getClass().equals(String.class) && ((String)var33.get("permutation")).length() > 0 && ((String)var33.get("permutation")).equalsIgnoreCase(XTUltrasonicsActivity.this.o)) {
//                                    String var34 = (String)var33.get("title");
//                                    XTUltrasonicsActivity.this.didHearTriggerWithTitle(var34, var16);
//                                    (XTUltrasonicsActivity.this.new c(null)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
//                                    return;
//                                }
//                            }
//                        } while(XTUltrasonicsActivity.this.p.contains(var7));
//
//                        if(!var6.containsKey("permutation")) {
//                            XTUltrasonicsActivity.this.didHearTriggerWithTitle(var7, var16);
//                            (XTUltrasonicsActivity.this.new c(null)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
//                            return;
//                        }
//                    } while(var6.get("permutation") != null && (!var6.get("permutation").getClass().equals(String.class) || !((String)var6.get("permutation")).equalsIgnoreCase("null")));
//
//                    XTUltrasonicsActivity.this.didHearTriggerWithTitle(var7, var16);
//                    (XTUltrasonicsActivity.this.new c(null)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
//                }
//            }
//        }
//    }
//
//    private class c extends AsyncTask<Void, Void, Void> {
//        private c() {
//        }
//
//        protected void onPreExecute() {
//            super.onPreExecute();
//        }
//
//        protected Void doInBackground(Void... var1) {
//            SharedPreferences var2 = XTUltrasonicsActivity.this.getSharedPreferences("xtapi", 0);
//            Date var3 = new Date(var2.getLong("xtlasttalleydate", 0L));
//            Date var4 = new Date();
//            long var5 = (var4.getTime() - var3.getTime()) / 1000L;
//            if(var5 > 15L) {
//                var2.edit().putLong("xtlasttalleydate", var4.getTime()).apply();
//
//                try {
//                    XTUltrasonicsActivity.GetWebPage(XTUltrasonicsActivity.this.getString(string.TriggerHitURL) + "?userID=" + XTUltrasonicsActivity.this.q.getString("qraiderXTdeviceID", "DEFAULT") + "&appname=" + XTUltrasonicsActivity.this.getApplicationContext().getPackageName().replaceAll("[^A-Za-z0-9]", ""));
//                } catch (IOException var8) {
//                    ;
//                }
//            }
//
//            return null;
//        }
//
//        protected void a(Void var1) {
//            super.onPostExecute(var1);
//        }
//    }
//
//    private class a extends AsyncTask<Void, Void, Void> {
//        private a() {
//        }
//
//        protected void onPreExecute() {
//            super.onPreExecute();
//        }
//
//        protected Void doInBackground(Void... var1) {
//            String var2 = "0";
//
//            try {
//                var2 = XTUltrasonicsActivity.GetWebPage(XTUltrasonicsActivity.this.getString(string.UpdatedTriggersURL) + "?userID=" + XTUltrasonicsActivity.this.q.getString("qraiderXTdeviceID", "DEFAULT") + "&appname=" + XTUltrasonicsActivity.this.getApplicationContext().getPackageName().replaceAll("[^A-Za-z0-9]", ""));
//            } catch (IOException var9) {
//                ;
//            }
//
//            if(!var2.equalsIgnoreCase("0")) {
//                try {
//                    if(var2.contains("over 100")) {
//                        Builder var3 = new Builder(new ContextThemeWrapper(XTUltrasonicsActivity.this, 16973937));
//                        var3.setTitle("Free trial expired").setMessage("Your app has exceeded its quota. Contact info@qraider to extend your use.").setPositiveButton(17039370, new OnClickListener() {
//                            public void onClick(DialogInterface dialog, int which) {
//                            }
//                        }).setIcon(17301543).show();
//                    } else {
//                        JSONObject var11 = new JSONObject(var2);
//                        XTUltrasonicsActivity.this.a(XTUltrasonicsActivity.this.q);
//                        JSONArray var4 = var11.getJSONArray("triggers");
//                        ArrayList var5 = new ArrayList();
//
//                        for(int var6 = 0; var6 < var4.length(); ++var6) {
//                            JSONObject var7 = var4.getJSONObject(var6);
//                            if(var7 != null && var7.getClass().equals(JSONObject.class)) {
//                                String var8 = var7.getString("title");
//                                if(var8 != null) {
//                                    var5.add(var8);
//                                }
//
//                                XTUltrasonicsActivity.this.q.edit().putString("qraidertrigger" + var8, var7.toString()).commit();
//                            }
//                        }
//
//                        HashSet var12 = new HashSet();
//                        var12.addAll(var5);
//                        XTUltrasonicsActivity.this.q.edit().putStringSet("qraiderTriggerTitles", var12).commit();
//                    }
//                } catch (Exception var10) {
//                    ;
//                }
//            }
//
//            return null;
//        }
//
//        protected void a(Void var1) {
//            super.onPostExecute(var1);
//
//            try {
//                XTUltrasonicsActivity.this.restoreTriggers(XTUltrasonicsActivity.this.q);
//            } catch (Exception var3) {
//                ;
//            }
//
//        }
//    }
}

package com.learningapp.tri.quiz;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.ads.consent.ConsentForm;
import com.google.ads.consent.ConsentFormListener;
import com.google.ads.consent.ConsentInfoUpdateListener;
import com.google.ads.consent.ConsentInformation;
import com.google.ads.consent.ConsentStatus;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.learningapp.tri.quiz.R;
import com.learningapp.tri.quiz.wrapperDataBase.AppRightRoads;
import com.learningapp.tri.quiz.wrapperDataBase.AppRoads;
import com.learningapp.tri.quiz.wrapperDataBase.AppTheses;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    RelativeLayout startRelativeLayout;
    RelativeLayout testRelativeLayout;
    RelativeLayout linuxRelativeLayout;
    RelativeLayout pause;
    RelativeLayout waitRelative;
    ImageView modeOn;
    ImageView modeOff;
    Button answerButton0;
    Button answerButton1;
    Button answerButton2;
    Button answerButton3;
    String finalResult;
    CountDownTimer timer;
    int userAnswer;
    String currentTime;
    Toast toast;
    Toast toastFalse;
    ProgressBar progressBar;
    View toastshow;
    TextView questionsTextView;
    TextView resultTextView;
    TextView timerTextView;
    TextView percentage;
    TextView numberOfQuestionTextView;
    MediaPlayer m;
    MediaPlayer True;
    MediaPlayer False;
    private ProgressBar pgsBar;
    public AdView mAdView;
    RelativeLayout finalResultRelatveLayout;
    int score=0;
    int i;
    int seconds=60;
    int minutes=1;
    int falsAnswer=0;
    ArrayList ccnaQuestions = new ArrayList();
    String[][] ccnaAnswers;
    String[] ccnaCorrectAnswers;
    int numberOfQuestion=-1;
    ProgressBar progressBar_cyclic;
    Vibrator v;
    InterstitialAd mInterstitial;
    //inter
    public void interLoad(){
        mInterstitial = new InterstitialAd(this);
        mInterstitial.setAdUnitId(getResources().getString(R.string.inter_ad_unit_id));
        mInterstitial.loadAd(new AdRequest.Builder().build());
    }
    public void interShow(){
        if (mInterstitial.isLoaded()) {
            mInterstitial.show();
        }
        interLoad();
    }
    //banner
    public void refreshAdmob() {

            AdRequest adRequest = new AdRequest.Builder().build();

            mAdView.setAdListener(new AdListener() {

                @Override
                public void onAdLoaded() {

                    super.onAdLoaded();

                    Log.e("ADMOB", "onAdLoaded");
                    Toast.makeText(MainActivity.this, "banner is showing", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onAdFailedToLoad(int i) {

                    super.onAdFailedToLoad(i);

                    Log.e("ADMOB", "onAdFailedToLoad");
                    Toast.makeText(MainActivity.this, "banner is not showing", Toast.LENGTH_SHORT).show();
                }
            });

            mAdView.loadAd(adRequest);

        }
    public void startOfTest(View view) {
        interShow();
        startRelativeLayout.setVisibility(View.INVISIBLE);
        testRelativeLayout.setVisibility(View.VISIBLE);

    }
public void startShowingAnswers(View view){
        generateNewQuestion();
        String TagNumber = view.getTag().toString();
        m = MediaPlayer.create(this, R.raw.inspiration);
        m.start();
        if(TagNumber.equals("1000")){
            AppTheses appTheses = new AppTheses();
            ccnaQuestions = appTheses.CcnaQuestion();
            //call the Linux answers class
            AppRoads appRoads = new AppRoads();
            ccnaAnswers = appRoads.CCCNARoads();
            //call the Linux right answers class
            AppRightRoads appRightRoads = new AppRightRoads();
            ccnaCorrectAnswers = appRightRoads.CCNARightRoads();


        } else if(TagNumber.equals("2000")){
            AppTheses appTheses = new AppTheses();
            ccnaQuestions = appTheses.ItQuestion();
            //call the Linux answers class
            AppRoads appRoads = new AppRoads();
            ccnaAnswers = appRoads.ItRoads();
            //call the Linux right answers class
            AppRightRoads appRightRoads = new AppRightRoads();
            ccnaCorrectAnswers = appRightRoads.ItRightRoads();
        }
        else if(TagNumber.equals("3000")){
            AppTheses appTheses = new AppTheses();
            ccnaQuestions = appTheses.WindowsQuestion();
            //call the Linux answers class
            AppRoads appRoads = new AppRoads();
            ccnaAnswers = appRoads.WindowsRoads();
            //call the Linux right answers class
            AppRightRoads appRightRoads = new AppRightRoads();
            ccnaCorrectAnswers = appRightRoads.WindowsRightRoads();

        }
        else if(TagNumber.equals("4000")){
            AppTheses appTheses = new AppTheses();
            ccnaQuestions = appTheses.LinuxQuestion();
            //call the Linux answers class
            AppRoads appRoads = new AppRoads();
            ccnaAnswers = appRoads.UnixRoads();
            //call the Linux right answers class
            AppRightRoads appRightRoads = new AppRightRoads();
            ccnaCorrectAnswers = appRightRoads.LinuxRightRoads();

        }

        testRelativeLayout.setVisibility(View.INVISIBLE);
        testTime(findViewById(R.id.timerTextView));
        //m.start();

    }
    public void generateNewQuestion() {
        waitRelative.setVisibility(View.VISIBLE);
        new CountDownTimer(2000, 500){

            @Override
            public void onTick(long l) {
            }

            @Override
            public void onFinish() {
                if(numberOfQuestion <40){
                    answerButton0.setTag(0);
                    answerButton1.setTag(1);
                    answerButton2.setTag(2);
                    answerButton3.setTag(3);
                    answerButton0.setBackgroundResource(R.drawable.button_border);
                    answerButton1.setBackgroundResource(R.drawable.button_border);
                    answerButton2.setBackgroundResource(R.drawable.button_border);
                    answerButton3.setBackgroundResource(R.drawable.button_border);

                    numberOfQuestion++;
                    questionsTextView.setText(String.valueOf(ccnaQuestions.get(numberOfQuestion)));
                    // answers[numberOfQuestion][0] is mean that we get
                    answerButton0.setText(ccnaAnswers[numberOfQuestion][0]);
                    answerButton1.setText(ccnaAnswers[numberOfQuestion][1]);
                    answerButton2.setText(ccnaAnswers[numberOfQuestion][2]);
                    answerButton3.setText(ccnaAnswers[numberOfQuestion][3]);
                    // numberOfQuestionTextView.setText("Question: "+(numberOfQuestion+1)+"/40");
                    numberOfQuestionTextView.setText(" | votre score est :"+score+" | Question: "+(numberOfQuestion+1)+"/40");
                    waitRelative.setVisibility(View.GONE);
                    linuxRelativeLayout.setVisibility(View.VISIBLE);
                    float percentage = score/40*100;
                    String percentageString = String.valueOf(percentage);

                }

            }
        }.start();




        //this method is desplay questions of an arrayList named [answers]


    }
public void testTime(View view){
        seconds=60;
        minutes=20;
        timer = new CountDownTimer(1200000,1000) {
            @Override
            public void onTick(long timerWithMill) {

                m.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        m.start();
                    }

                });;
                seconds--;
                if(seconds == 0){
                    minutes--;
                    seconds=59;
                }
                if(seconds<10){
                    currentTime = minutes+":"+"0"+seconds;
                }else {
                    currentTime = minutes+":"+seconds;
                }
                int timerWithSecond = (int) timerWithMill / 1000;
                timerTextView.setText(currentTime);

            }

            @Override
            public void onFinish() {
                m.stop();
                timerTextView.setText(String.valueOf("00:00"));
                numberOfQuestion = 40;
                finalResultRelatveLayout.setVisibility(View.VISIBLE);
                finalResultRelatveLayout.animate().alpha(1f).setDuration(2000);
                finalResult = "nombre de Réponse correcte: "+score+"/40";
                float scoreF = (score*100)/40;
                String scoreS = String.valueOf(scoreF);
                resultTextView.setText(finalResult);
                percentage.setText(scoreS+"%");
                timer.cancel();

            }

        }.start();
    }
    public void rghitQuestion(View view) {
        String userAnswerString = view.getTag().toString();
        userAnswer = Integer.parseInt(userAnswerString);
        if(userAnswer<10){
            answerButton0.setTag(1000);
            answerButton1.setTag(2000);
            answerButton2.setTag(3000);
            answerButton3.setTag(4000);
            if( numberOfQuestion <40){
                if(ccnaAnswers[numberOfQuestion][userAnswer]  == ccnaCorrectAnswers[numberOfQuestion]){
                    True.start();
                    score=score+1;
                    view.setBackgroundColor(Color.GREEN);
                    //toast.show();
                }else {
                    False.start();
                    v.vibrate(100);
                    view.setBackgroundColor(Color.RED);
                    String firstanswer = answerButton0.getText().toString();
                    String secondanswer = answerButton1.getText().toString();
                    String tirthanswer = answerButton2.getText().toString();
                    String fourthanswer = answerButton3.getText().toString();
                    if(firstanswer.equals(ccnaCorrectAnswers[numberOfQuestion])){
                        answerButton0.setBackgroundColor(Color.GREEN);
                    }else if(secondanswer.equals(ccnaCorrectAnswers[numberOfQuestion])){
                        answerButton1.setBackgroundColor(Color.GREEN);
                    }else if(tirthanswer.equals(ccnaCorrectAnswers[numberOfQuestion])){
                        answerButton2.setBackgroundColor(Color.GREEN);
                    }else if(fourthanswer.equals(ccnaCorrectAnswers[numberOfQuestion])){
                        answerButton3.setBackgroundColor(Color.GREEN);
                    }


                }
            }
            //for (i=0;i<40;i++){

            //       if( numberOfQuestion <40){
            //         if(linuxAnswers[numberOfQuestion][userAnswer]  == correctAnswers[i]){
            //           score=score+1;
            //         view.setBackgroundColor(Color.GREEN);
            //       //toast.show();
            // }
            //}

            // }
            if(numberOfQuestion == 39){
                new CountDownTimer(2000, 3000){

                    @Override
                    public void onTick(long l) {

                    }

                    @Override
                    public void onFinish() {
                        timer.onFinish();
                    }
                }.start();

            }else{
                generateNewQuestion();
            }

        }

    }
    ConsentForm form;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Here is GDPR Simple Code
        ConsentInformation consentInformation = ConsentInformation.getInstance(this);
        String[] publisherIds = {"pub-5077122312815505"};
        consentInformation.requestConsentInfoUpdate(publisherIds, new ConsentInfoUpdateListener() {
            @Override
            public void onConsentInfoUpdated(ConsentStatus consentStatus) {
                // User's consent status successfully updated.
            }
            @Override
            public void onFailedToUpdateConsentInfo(String errorDescription) {
                // User's consent status failed to update.
            }
        });
        URL privacyUrl = null;
        try {
            // TODO: Replace with your app's privacy policy URL.
            privacyUrl = new URL("https://docs.google.com/document/d/1R8m7wPdqCxoNCeoZMG8HODHg7HpKrbz0HgmrS_FHEgg/edit?usp=sharing");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            // Handle error.
        }
        form = new ConsentForm.Builder(this, privacyUrl)
                .withListener(new ConsentFormListener() {
                    @Override
                    public void onConsentFormLoaded() {
                        // Consent form loaded successfully.
                        form.show();
                    }
                    @Override
                    public void onConsentFormOpened() {
                        // Consent form was displayed.
                    }
                    @Override
                    public void onConsentFormClosed(
                            ConsentStatus consentStatus, Boolean userPrefersAdFree) {
                        // Consent form was closed.
                    }
                    @Override
                    public void onConsentFormError(String errorDescription) {
                        // Consent form error.
                    }
                })
                .withPersonalizedAdsOption()
                .withNonPersonalizedAdsOption()
                .withAdFreeOption()
                .build();
        form.load();
        // ##GDPR End Code
        interLoad();
        pgsBar = (ProgressBar) findViewById(R.id.pBar);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(100,100);
        params.addRule(RelativeLayout.CENTER_IN_PARENT);
        mAdView = (AdView) findViewById(R.id.adView);
        refreshAdmob();
        m = MediaPlayer.create(this, R.raw.inspiration);
        startRelativeLayout = findViewById(R.id.startLayout);
        testRelativeLayout = findViewById(R.id.testLayout);
        linuxRelativeLayout = findViewById(R.id.linuxRlaytiveLayout);
        finalResultRelatveLayout = findViewById(R.id.finalResultRelatveLayout);
        resultTextView = findViewById(R.id.resultTextView);
        timerTextView = findViewById(R.id.timerTextView);
        questionsTextView = findViewById(R.id.questionsTextView);
        numberOfQuestionTextView = findViewById(R.id.numberOfQuestionTextView);
        percentage = findViewById(R.id.percentage);
        pause = findViewById(R.id.pause);
        answerButton0 = findViewById(R.id.answer0);
        answerButton1 = findViewById(R.id.answer1);
        answerButton2 = findViewById(R.id.answer2);
        answerButton3 = findViewById(R.id.answer3);
        True = MediaPlayer.create(this,R.raw.true_answer);
        False = MediaPlayer.create(this,R.raw.false_answer);
        testRelativeLayout.setVisibility(View.INVISIBLE);
modeOff = findViewById(R.id.mode_off);
modeOn = findViewById(R.id.mode_on);
        startRelativeLayout.setVisibility(View.VISIBLE);
        startRelativeLayout.animate().translationYBy(200f).setDuration(300);
       finalResultRelatveLayout.setVisibility(View.INVISIBLE);
        waitRelative = findViewById(R.id.waitRelative);
        // QuestionAndAnswers questionAndAnswers = new QuestionAndAnswers();
        //linuxQuestion1 = questionAndAnswers.LinuxQuestion();
        //call the Linux question class
        v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

    }
    public void actionAlterResultShow(View view) {
        int buttonTag = Integer.parseInt(view.getTag().toString());
       interShow();
        if(buttonTag == 500){
            interShow();
            testRelativeLayout.setVisibility(View.VISIBLE);
            startRelativeLayout.setVisibility(View.INVISIBLE);
            finalResultRelatveLayout.setVisibility(View.INVISIBLE);
            linuxRelativeLayout.setVisibility(View.INVISIBLE);
            numberOfQuestion=-1;
            //m = MediaPlayer.create(this, R.raw.inspiration);
         //  m.start();
            generateNewQuestion();
        }
        else if(buttonTag == 501){
            interShow();
            finalResultRelatveLayout.setVisibility(View.INVISIBLE);
            linuxRelativeLayout.setVisibility(View.VISIBLE);
            numberOfQuestion=-1;
            score=0;
            generateNewQuestion();
            m = MediaPlayer.create(this, R.raw.inspiration);
           m.start();
            testTime(findViewById(R.id.timerTextView));

        }
        else if(buttonTag == 600){
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String shareBodyText = "Evaluez votre niveau informatique avec notre série de tests de connaissance\n en linux, windows, ITe, et les réseaux informatiques avec notre application\ntéléchargez notre application mobile directement depuis play store :http://play.google.com/store/apps/details?id=" + this.getPackageName();
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT,"TRI quiz");
            sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBodyText);
            startActivity(Intent.createChooser(sharingIntent, "Shearing Option"));
        }
    }
    public void rateAs(View view) {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=" + this.getPackageName())));
        } catch (android.content.ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://play.google.com/store/apps/details?id=" + this.getPackageName())));
        }
    }
    public void backgroundMusicControl(View view) {
        String viewTag = String.valueOf(view.getTag());
        if (viewTag.equals("999")){
            m.stop();
            modeOff.setVisibility(View.GONE);
            modeOn.setVisibility(View.VISIBLE);
        } else if (viewTag.equals("888")){
            m = MediaPlayer.create(this, R.raw.inspiration);
            m.start();
            modeOn.setVisibility(View.GONE);
            modeOff.setVisibility(View.VISIBLE);
        }
    }
    public void pause(View view) {
        interShow();
        String viewTag = view.getTag().toString();
        if (viewTag.equals("123")){
            interShow();
            pause.setVisibility(View.INVISIBLE);
        }
        else if (viewTag.equals("321")){
            interShow();
            m.stop();
            pause.setVisibility(View.INVISIBLE);
            testRelativeLayout.setVisibility(View.VISIBLE);
            startRelativeLayout.setVisibility(View.INVISIBLE);
            finalResultRelatveLayout.setVisibility(View.INVISIBLE);
            linuxRelativeLayout.setVisibility(View.INVISIBLE);
            numberOfQuestion=-1;
            score=0;
            pause.setVisibility(View.INVISIBLE);

        }
        else if (viewTag.equals("312")){
            interShow();
pause.setVisibility(View.VISIBLE);
        }
    }
}

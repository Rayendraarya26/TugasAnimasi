    package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

    public class MainActivity extends AppCompatActivity {

    ObjectAnimator mPosisiAwal,mParabolaY, mParabolaXPos, mParabolaXNeg,
            mParabolaXPosKeluar1, mParabolaXNegKeluar1, mParabolaXNegKeluar2, mParabolaYKeluar1, mParabolaYKeluar2,
    mSpinXBawah1, mSpinXBawah2, mSpinXAtas, mSpinYPos1, mSpinYPos2, mSpinYPos3, mSpinYNeg1,mSpinYNeg2,
    mFallXAtas1, mFallXAtas2, mFallXAtas3, mFallXAtas4, mFallXBawah1, mFallXBawah2, mFallXBawah3, mFallXBawah4, mFallXBawah5;

    final int min = 1;
    final int max = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bola = findViewById(R.id.bola);
        Button btn_play = findViewById(R.id.btn_play);

        mPosisiAwal = ObjectAnimator.ofFloat(bola, "y", 600);

        mParabolaY = ObjectAnimator.ofFloat(bola, "y", 195);
        mParabolaXPos = ObjectAnimator.ofFloat(bola, "x", 800);
        mParabolaXNeg = ObjectAnimator.ofFloat(bola, "x", 610);

        mSpinXBawah1 = ObjectAnimator.ofFloat(bola, "x", 600);
        mSpinXBawah2 = ObjectAnimator.ofFloat(bola, "x", 600);
        mSpinXAtas = ObjectAnimator.ofFloat(bola, "x", 625);

        mSpinYPos1 = ObjectAnimator.ofFloat(bola, "y", 215);
        mSpinYPos2 = ObjectAnimator.ofFloat(bola, "y", 215);
        mSpinYPos3 = ObjectAnimator.ofFloat(bola, "y", 215);
        mSpinYNeg1 = ObjectAnimator.ofFloat(bola, "y", 240);
        mSpinYNeg2 = ObjectAnimator.ofFloat(bola, "y", 195);

        mFallXBawah1 = ObjectAnimator.ofFloat(bola, "x", 200);
        mFallXBawah2 = ObjectAnimator.ofFloat(bola, "x", 200);
        mFallXBawah3 = ObjectAnimator.ofFloat(bola, "x", 200);
        mFallXBawah4 = ObjectAnimator.ofFloat(bola, "x", 200);
        mFallXBawah5 = ObjectAnimator.ofFloat(bola, "x", 200);

        mFallXAtas1 = ObjectAnimator.ofFloat(bola, "x", 400);
        mFallXAtas2 = ObjectAnimator.ofFloat(bola, "x", 300);
        mFallXAtas3 = ObjectAnimator.ofFloat(bola, "x", 250);
        mFallXAtas4 = ObjectAnimator.ofFloat(bola, "x", 225);

        mParabolaYKeluar1 = ObjectAnimator.ofFloat(bola, "y", 210);
        mParabolaYKeluar2 = ObjectAnimator.ofFloat(bola, "y", -80);
        mParabolaXNegKeluar1 = ObjectAnimator.ofFloat(bola, "x", 200);
        mParabolaXNegKeluar2 = ObjectAnimator.ofFloat(bola, "x", 200);
        mParabolaXPosKeluar1 = ObjectAnimator.ofFloat(bola, "x", 500);


        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random = new Random().nextInt((max - min) + 1) + min;

                if ((random % 2) == 0){
                    mPosisiAwal.setDuration(1);
                    mPosisiAwal.start();

                    mParabolaY.setDuration(1000);
                    mParabolaY.start();

                    mParabolaXPos.setDuration(500);
                    mParabolaXPos.start();

                    mParabolaXNeg.setStartDelay(500);
                    mParabolaXNeg.getStartDelay();
                    mParabolaXNeg.setDuration(500);
                    mParabolaXNeg.start();

                    mSpinXBawah1.setStartDelay(1000);
                    mSpinXBawah1.getStartDelay();
                    mSpinXBawah1.setDuration(500);
                    mSpinXBawah1.start();

                    mSpinYPos1.setStartDelay(1000);
                    mSpinYPos1.getStartDelay();
                    mSpinYPos1.setDuration(500);
                    mSpinYPos1.start();

                    mSpinXAtas.setStartDelay(1500);
                    mSpinXAtas.getStartDelay();
                    mSpinXAtas.setDuration(1000);
                    mSpinXAtas.start();

                    mSpinYNeg1.setStartDelay(1000);
                    mSpinYNeg1.getStartDelay();
                    mSpinYNeg1.setDuration(1000);
                    mSpinYNeg1.start();

                    mSpinYPos2.setStartDelay(2000);
                    mSpinYPos2.getStartDelay();
                    mSpinYPos2.setDuration(500);
                    mSpinYPos2.start();

                    mSpinYNeg2.setStartDelay(2000);
                    mSpinYNeg2.getStartDelay();
                    mSpinYNeg2.setDuration(1000);
                    mSpinYNeg2.start();

                    mSpinXBawah2.setStartDelay(2500);
                    mSpinXBawah2.getStartDelay();
                    mSpinXBawah2.setDuration(1000);
                    mSpinXBawah2.start();

                    mSpinYPos3.setStartDelay(3000);
                    mSpinYPos3.getStartDelay();
                    mSpinYPos3.setDuration(500);
                    mSpinYPos3.start();

                    mFallXBawah1.setStartDelay(3250);
                    mFallXBawah1.getStartDelay();
                    mFallXBawah1.setDuration(1000);
                    mFallXBawah1.start();

                    mFallXAtas1.setStartDelay(4250);
                    mFallXAtas1.getStartDelay();
                    mFallXAtas1.setDuration(500);
                    mFallXAtas1.start();

                    mFallXBawah2.setStartDelay(4750);
                    mFallXBawah2.getStartDelay();
                    mFallXBawah2.setDuration(500);
                    mFallXBawah2.start();

                    mFallXAtas2.setStartDelay(5250);
                    mFallXAtas2.getStartDelay();
                    mFallXAtas2.setDuration(250);
                    mFallXAtas2.start();

                    mFallXBawah3.setStartDelay(5500);
                    mFallXBawah3.getStartDelay();
                    mFallXBawah3.setDuration(250);
                    mFallXBawah3.start();

                    mFallXAtas3.setStartDelay(5750);
                    mFallXAtas3.getStartDelay();
                    mFallXAtas3.setDuration(125);
                    mFallXAtas3.start();

                    mFallXBawah4.setStartDelay(5875);
                    mFallXBawah4.getStartDelay();
                    mFallXBawah4.setDuration(125);
                    mFallXBawah4.start();

                    mFallXAtas4.setStartDelay(6000);
                    mFallXAtas4.getStartDelay();
                    mFallXAtas4.setDuration(62);
                    mFallXAtas4.start();

                    mFallXBawah5.setStartDelay(6062);
                    mFallXBawah5.getStartDelay();
                    mFallXBawah5.setDuration(62);
                    mFallXBawah5.start();

                } else {
                    mPosisiAwal.setDuration(1);
                    mPosisiAwal.start();

                    mParabolaYKeluar1.setDuration(1000);
                    mParabolaYKeluar1.start();

                    mParabolaXPos.setDuration(500);
                    mParabolaXPos.start();

                    mParabolaXNegKeluar1.setStartDelay(500);
                    mParabolaXNegKeluar1.getStartDelay();
                    mParabolaXNegKeluar1.setDuration(500);
                    mParabolaXNegKeluar1.start();

                    mParabolaYKeluar2.setStartDelay(1000);
                    mParabolaYKeluar2.getStartDelay();
                    mParabolaYKeluar2.setDuration(500);
                    mParabolaYKeluar2.start();

                    mParabolaXPosKeluar1.setStartDelay(1000);
                    mParabolaXPosKeluar1.getStartDelay();
                    mParabolaXPosKeluar1.setDuration(250);
                    mParabolaXPosKeluar1.start();

                    mParabolaXNegKeluar2.setStartDelay(1250);
                    mParabolaXNegKeluar2.getStartDelay();
                    mParabolaXNegKeluar2.setDuration(250);
                    mParabolaXNegKeluar2.start();



                }
            }
        });
    }
}
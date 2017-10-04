package edu.chapman.cpsc.cardstack;

import android.support.v7.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.Stack;

public class CardStack extends AppCompatActivity {
    private final static int FULL_DECK = 14;

    private Stack<Cards> cardStack;
    private ImageView topLeft;
    private ImageView bottomRight;
    private ImageView centerImg;
    private TextView topIcon;
    private TextView bottomIcon;
    private FrameLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_stack_frame);

        this.cardStack = new Stack<>();
        this.topLeft = (ImageView) findViewById(R.id.topLeftImg);
        this.bottomRight = (ImageView) findViewById(R.id.btmRightImg);
        this.centerImg = (ImageView) findViewById(R.id.centerImg);
        this.topIcon = (TextView) findViewById(R.id.topLeftTv);
        this.bottomIcon = (TextView) findViewById(R.id.btmRightTv);
        this.mainLayout = (FrameLayout) findViewById(R.id.frameLO);

        for(Suite suite : Suite.values()){
            for(int i = 1; i < FULL_DECK; ++i){
                cardStack.push(new Cards(suite, i));
            }
        }

        Collections.shuffle(cardStack);
        flipCard();

        mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!cardStack.isEmpty()){
                    flipCard();
                }

                else{
                    finish();
                }
            }
        });
    }

    public void flipCard(){
        Cards current;
        Suite suiteIs;
        int cardIs;

        current = cardStack.pop();
        suiteIs = current.getSuite();
        cardIs = current.getCard();

        switch(suiteIs){
            case Hearts:
                topLeft.setImageResource(R.drawable.hearts);
                bottomRight.setImageResource(R.drawable.hearts);
                centerImg.setImageResource(R.drawable.hearts);
                topIcon.setTextColor(Color.RED);
                bottomIcon.setTextColor(Color.RED);
                break;

            case Diamonds:
                topLeft.setImageResource(R.drawable.diamond);
                bottomRight.setImageResource(R.drawable.diamond);
                centerImg.setImageResource(R.drawable.diamond);
                topIcon.setTextColor(Color.RED);
                bottomIcon.setTextColor(Color.RED);
                break;

            case Clubs:
                topLeft.setImageResource(R.drawable.clubs);
                bottomRight.setImageResource(R.drawable.clubs);
                centerImg.setImageResource(R.drawable.clubs);
                topIcon.setTextColor(Color.BLACK);
                bottomIcon.setTextColor(Color.BLACK);
                break;

            case Spades:
                topLeft.setImageResource(R.drawable.spades);
                bottomRight.setImageResource(R.drawable.spades);
                centerImg.setImageResource(R.drawable.spades);
                topIcon.setTextColor(Color.BLACK);
                bottomIcon.setTextColor(Color.BLACK);
                break;
        }

        switch(cardIs){
            case 1:
                topIcon.setText("A");
                bottomIcon.setText("A");
                break;

            case 11:
                topIcon.setText("J");
                bottomIcon.setText("J");
                break;

            case 12:
                topIcon.setText("Q");
                bottomIcon.setText("Q");
                break;

            case 13:
                topIcon.setText("K");
                bottomIcon.setText("K");
                break;

            default:
                topIcon.setText(String.valueOf(cardIs));
                bottomIcon.setText(String.valueOf(cardIs));
                break;
        }
    }
}

package edu.chapman.cpsc.cardstack;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Stack;

public class CardStack extends AppCompatActivity {
    private final static int FULL_DECK = 52;
    private final static int FULL_SUITE = 13;

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
        setContentView(R.layout.activity_card_stack_linear);

        this.topLeft = (ImageView) findViewById(R.id.topLeftImg);
        this.bottomRight = (ImageView) findViewById(R.id.btmRightImg);
        this.centerImg = (ImageView) findViewById(R.id.centerImg);
        this.topIcon = (TextView) findViewById(R.id.topLeftTv);
        this.bottomIcon = (TextView) findViewById(R.id.btmRightTv);
        this.mainLayout = (FrameLayout) findViewById(R.id.mainLayout);

    }
}

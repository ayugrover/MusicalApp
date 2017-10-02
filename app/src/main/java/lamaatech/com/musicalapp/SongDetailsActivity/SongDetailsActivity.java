package lamaatech.com.musicalapp.SongDetailsActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import lamaatech.com.musicalapp.MainActivity.MainActivity;
import lamaatech.com.musicalapp.PaymentActivity.PaymentActivity;
import lamaatech.com.musicalapp.PlayListActivity.PlayListActivity;
import lamaatech.com.musicalapp.R;

public class SongDetailsActivity extends AppCompatActivity implements SongDetailsContract.SongDetailsView {

    private SongDetailsPresenter presenter;
    @BindView(R.id.main_button)
    protected Button mainButton;
    @BindView(R.id.payment_button)
    protected Button paymentButton;
    @BindView(R.id.playList_button)
    protected Button playListButton;
    @BindView(R.id.toolbar)
    protected Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_details);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        presenter = new SongDetailsPresenter(this);

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onMainButtonClick();
            }
        });

        paymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onPaymentButtonClick();
            }
        });

        playListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onPlaylistButtonClick();
            }
        });

    }

    @Override
    public void goToMainActivity() {
        startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    public void goToPaymentActivity() {
        startActivity(new Intent(this, PaymentActivity.class));
    }

    @Override
    public void goToPlayListActivity() {
        startActivity(new Intent(this, PlayListActivity.class));
    }

    @Override
    @OnClick(R.id.main_button)
    public void onMainButtonClick() {
        presenter.onMainButtonClicked();
    }

    @Override
    @OnClick(R.id.payment_button)
    public void onPaymentButtonClick() {
        presenter.onPaymentButtonClicked();
    }

    @Override
    @OnClick(R.id.playList_button)
    public void onPlaylistButtonClick() {
        presenter.onPlayListButtonClicked();
    }
}

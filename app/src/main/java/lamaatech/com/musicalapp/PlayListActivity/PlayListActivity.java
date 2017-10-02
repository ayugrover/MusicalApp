package lamaatech.com.musicalapp.PlayListActivity;

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
import lamaatech.com.musicalapp.R;
import lamaatech.com.musicalapp.SongDetailsActivity.SongDetailsActivity;

public class PlayListActivity extends AppCompatActivity implements PlayListContract.PlayListView {

    private PlayListPresenter presenter;
    @BindView(R.id.main_button)
    protected Button mainButton;
    @BindView(R.id.payment_button)
    protected Button paymentButton;
    @BindView(R.id.songDetails_button)
    protected Button songDetailsButton;
    @BindView(R.id.toolbar)
    protected Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        presenter = new PlayListPresenter(this);

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

        songDetailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSongDetailsButtonClick();
            }
        });
    }

    @Override
    public void goToMainActivity() {
        startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    public void goToSongDetailsActivity() {
        startActivity(new Intent(this, SongDetailsActivity.class));
    }

    @Override
    public void goToPaymentActivity() {
        startActivity(new Intent(this, PaymentActivity.class));
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
    @OnClick(R.id.songDetails_button)
    public void onSongDetailsButtonClick() {
        presenter.onSongDetailsButtonClicked();
    }
}

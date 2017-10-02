package lamaatech.com.musicalapp.PaymentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import lamaatech.com.musicalapp.MainActivity.MainActivity;
import lamaatech.com.musicalapp.PlayListActivity.PlayListActivity;
import lamaatech.com.musicalapp.R;
import lamaatech.com.musicalapp.SongDetailsActivity.SongDetailsActivity;

public class PaymentActivity extends AppCompatActivity implements PaymentContract.PaymentView {

    private PaymentPresenter presenter;
    @BindView(R.id.main_button)
    protected Button mainButton;
    @BindView(R.id.playList_button)
    protected Button playListButton;
    @BindView(R.id.songDetails_button)
    protected Button songDetailsButton;
    @BindView(R.id.toolbar)
    protected Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        presenter = new PaymentPresenter(this);

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onMainButtonClick();
            }
        });

        playListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onPlaylistButtonClick();
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
    public void goToPlayListActivity() {
        startActivity(new Intent(this, PlayListActivity.class));
    }


    @Override
    public void onMainButtonClick() {
        presenter.onMainButtonClicked();
    }

    @Override
    public void onPlaylistButtonClick() {
        presenter.onPlayListButtonClicked();
    }

    @Override
    public void onSongDetailsButtonClick() {
        presenter.onSongDetailsButtonClicked();
    }

}

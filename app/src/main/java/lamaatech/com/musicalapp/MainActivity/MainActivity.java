package lamaatech.com.musicalapp.MainActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import lamaatech.com.musicalapp.PaymentActivity.PaymentActivity;
import lamaatech.com.musicalapp.PlayListActivity.PlayListActivity;
import lamaatech.com.musicalapp.R;
import lamaatech.com.musicalapp.SongDetailsActivity.SongDetailsActivity;

public class MainActivity extends AppCompatActivity implements MainContract.MainView {

    private MainPresenter presenter;
    @BindView(R.id.payment_button)
    protected Button paymentButton;
    @BindView(R.id.playList_button)
    protected Button playListButton;
    @BindView(R.id.songDetails_button)
    protected Button songDetailsButton;
    @BindView(R.id.toolbar)
    protected Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        presenter = new MainPresenter(this);

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

        songDetailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSongDetailsButtonClick();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void onPaymentButtonClick() {
        presenter.onPaymentButtonClicked();
    }

    public void onPlaylistButtonClick() {
        presenter.onPlayListButtonClicked();
    }

    public void onSongDetailsButtonClick() {
        presenter.onSongDetailsButtonClicked();
    }


    @Override
    public void goToPaymentActivity() {
        startActivity(new Intent(this, PaymentActivity.class));
    }

    @Override
    public void goToSongDetailsActivity() {
        startActivity(new Intent(this, SongDetailsActivity.class));
    }

    @Override
    public void goToPlayListActivity() {
        startActivity(new Intent(this, PlayListActivity.class));
    }


}

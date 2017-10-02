package lamaatech.com.musicalapp.PaymentActivity;

/**
 * Created by MrHacker on 9/16/2017.
 */

public interface PaymentContract {
    interface Presenter {
        void onMainButtonClicked();

        void onSongDetailsButtonClicked();

        void onPlayListButtonClicked();

    }

    interface PaymentView {
        void goToMainActivity();

        void goToSongDetailsActivity();

        void goToPlayListActivity();

        void onMainButtonClick();

        void onPlaylistButtonClick();

        void onSongDetailsButtonClick();
    }

}

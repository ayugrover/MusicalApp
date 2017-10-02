package lamaatech.com.musicalapp.SongDetailsActivity;

/**
 * Created by MrHacker on 9/16/2017.
 */

public interface SongDetailsContract {
    interface Presenter {
        void onPaymentButtonClicked();

        void onMainButtonClicked();

        void onPlayListButtonClicked();

    }

    interface SongDetailsView {
        void goToMainActivity();

        void goToPaymentActivity();

        void goToPlayListActivity();

        void onMainButtonClick();

        void onPaymentButtonClick();

        void onPlaylistButtonClick();
    }
}

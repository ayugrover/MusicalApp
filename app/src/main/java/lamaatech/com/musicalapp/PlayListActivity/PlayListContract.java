package lamaatech.com.musicalapp.PlayListActivity;

/**
 * Created by MrHacker on 9/16/2017.
 */

public interface PlayListContract {
    interface Presenter {
        void onPaymentButtonClicked();

        void onSongDetailsButtonClicked();

        void onMainButtonClicked();

    }


    interface PlayListView {
        void goToMainActivity();

        void goToSongDetailsActivity();

        void goToPaymentActivity();

        void onMainButtonClick();

        void onPaymentButtonClick();

        void onSongDetailsButtonClick();
    }

}

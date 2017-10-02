package lamaatech.com.musicalapp.MainActivity;

/**
 * Created by MrHacker on 9/16/2017.
 */

public interface MainContract {
    interface Presenter {
        void onPaymentButtonClicked();

        void onSongDetailsButtonClicked();

        void onPlayListButtonClicked();

    }

    interface MainView {
        void goToPaymentActivity();

        void goToSongDetailsActivity();

        void goToPlayListActivity();
    }


}

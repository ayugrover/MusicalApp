package lamaatech.com.musicalapp.MainActivity;

/**
 * Created by MrHacker on 10/2/2017.
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.MainView view;

    public MainPresenter(MainContract.MainView newView) {
        view = newView;
    }

    @Override
    public void onPaymentButtonClicked() {
        if (view != null) {
            view.goToPaymentActivity();
        }
    }

    @Override
    public void onSongDetailsButtonClicked() {
        if (view != null) {
            view.goToSongDetailsActivity();
        }
    }

    @Override
    public void onPlayListButtonClicked() {
        if (view != null) {
            view.goToPlayListActivity();
        }
    }
}

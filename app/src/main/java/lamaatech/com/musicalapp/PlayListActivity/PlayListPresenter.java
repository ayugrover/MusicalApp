package lamaatech.com.musicalapp.PlayListActivity;

/**
 * Created by MrHacker on 10/2/2017.
 */

class PlayListPresenter implements PlayListContract.Presenter {
    private PlayListContract.PlayListView view;

    PlayListPresenter(PlayListContract.PlayListView newView) {
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
    public void onMainButtonClicked() {

        if (view != null) {
            view.goToMainActivity();
        }
    }
}

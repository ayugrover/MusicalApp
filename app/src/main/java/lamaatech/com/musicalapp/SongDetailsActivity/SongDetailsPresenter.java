package lamaatech.com.musicalapp.SongDetailsActivity;

/**
 * Created by MrHacker on 10/2/2017.
 */

class SongDetailsPresenter implements SongDetailsContract.Presenter {
    private SongDetailsContract.SongDetailsView view;

    SongDetailsPresenter(SongDetailsContract.SongDetailsView newView) {
        view = newView;
    }

    @Override
    public void onPaymentButtonClicked() {
        if (view != null) {
            view.goToPaymentActivity();
        }
    }

    @Override
    public void onMainButtonClicked() {

        if (view != null) {
            view.goToMainActivity();
        }
    }

    @Override
    public void onPlayListButtonClicked() {
        if (view != null) {
            view.goToPlayListActivity();
        }
    }

}

package lamaatech.com.musicalapp.PaymentActivity;

/**
 * Created by MrHacker on 10/2/2017.
 */

public class PaymentPresenter implements PaymentContract.Presenter {

    private PaymentContract.PaymentView view;

    public PaymentPresenter(PaymentContract.PaymentView newView) {
        view = newView;
    }

    @Override
    public void onMainButtonClicked() {
        if (view != null) {
            view.goToMainActivity();
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

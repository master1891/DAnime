package danime.master.com.danime.Home.presenter;

import java.util.List;

import danime.master.com.danime.Home.view.HomeView;
import danime.master.com.danime.base.models.Anime;
import danime.master.com.danime.shared.Provider;

public class HomePresenterImpl implements HomePresenter {

    private Provider currentProvider;
    private HomeView view;
    private

    public HomePresenterImpl(HomeView homeView, Provider currentProvider) {
        this.currentProvider = currentProvider;
        this.view = homeView;
    }

    @Override
    public void requestProgramation() {

    }

    @Override
    public void requestSearch(String query) {

    }

    @Override
    public void animesProgramation(List<Anime> animers) {

    }

    @Override
    public void animesSearch(List<Anime> animers) {

    }

    @Override
    public void setProvider(Provider provider) {
        this.currentProvider = provider;
    }

}

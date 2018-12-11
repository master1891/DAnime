package danime.master.com.danime.Home.view;

import java.util.List;

import danime.master.com.danime.base.models.Anime;

public interface HomeView {
    void setProgramacion(List<Anime> programacionAnimes);
    void setSearchAnimes(List<Anime> animesResult);
    void showMessage(String message);
    void showLoadingRequest();
    void hideLoadingRequest();

}

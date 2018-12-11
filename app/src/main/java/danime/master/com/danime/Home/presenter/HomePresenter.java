package danime.master.com.danime.Home.presenter;

import java.util.List;

import danime.master.com.danime.base.models.Anime;
import danime.master.com.danime.shared.Provider;

public interface HomePresenter {

    void requestProgramation();
    void requestSearch(String query);
    void animesProgramation(List<Anime> animers);
    void animesSearch(List<Anime> animers);
    void setProvider(Provider provider);

}

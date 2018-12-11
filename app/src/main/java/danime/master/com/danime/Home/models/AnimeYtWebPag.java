package danime.master.com.danime.Home.models;

import java.util.List;

import danime.master.com.danime.base.models.Anime;
import danime.master.com.danime.base.models.WebPageAnime;


public class AnimeYtWebPag extends WebPageAnime {


    AnimeYtWebPag (String url){
        this.URL = url;
    }

    @Override
    public String getHtmlContent() {
        return null;
    }

    @Override
    public List<Anime> getAnimes() {
        return null;
    }


}

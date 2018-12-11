package danime.master.com.danime.base.models;

import java.util.List;

public abstract class WebPageAnime {

    protected String URL;
    protected String content;
    public List<Anime> animeList;
    public abstract String getHtmlContent();
    public abstract List<Anime> getAnimes();
}

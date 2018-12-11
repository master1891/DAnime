package danime.master.com.danime.base.models;


import java.util.List;


public class Capitulo {

    String name_capitule;
    List<ProviderContentVideo> listProvidersVideo;

    public Capitulo(String capituleName,List<ProviderContentVideo> listProvidersVideo) {
      this.name_capitule = capituleName;
      this.listProvidersVideo = listProvidersVideo;
    }


}

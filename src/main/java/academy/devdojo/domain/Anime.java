package academy.devdojo.domain;

import java.util.List;

public class Anime {
    private Long id;
    private String name;

    public Anime(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static List<Anime> getAnime() {
        var jojo = new Anime(1L,"JoJo's Bizarre Adventure");
        var SaintSeya = new Anime(2L,"Saint Seya");
        var yuyuHakusho = new Anime(3L,"Yuyu Hakusho");

        return List.of(jojo, SaintSeya, yuyuHakusho);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

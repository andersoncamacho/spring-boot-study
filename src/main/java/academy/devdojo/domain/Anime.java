package academy.devdojo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
@Getter
@AllArgsConstructor
public class Anime {
    private final Long id;
    private final String name;

    public static List<Anime> getAnime() {
        var jojo = new Anime(1L,"JoJo's Bizarre Adventure");
        var saintSeya = new Anime(2L,"Saint Seya");
        var yuyuHakusho = new Anime(3L,"Yuyu Hakusho");

        return List.of(jojo, saintSeya, yuyuHakusho);
    }

}

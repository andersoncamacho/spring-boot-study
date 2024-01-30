package academy.devdojo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
public class Anime {
    private Long id;
    private String name;
    private static List<Anime> animes = new ArrayList<>();

    static {
        var jojo = new Anime(1L,"JoJo's Bizarre Adventure");
        var saintSeya = new Anime(2L,"Saint Seya");
        var yuyuHakusho = new Anime(3L,"Yuyu Hakusho");
        animes.addAll(List.of(jojo, saintSeya, yuyuHakusho));
    }

    public static List<Anime> getAnimes() {
        return animes;
    }

}

package academy.devdojo.domain;

import lombok.Getter;

import java.util.List;

@Getter
public class Anime {
    private Long id;
    private String name;

    public Anime(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static List<Anime> getAnimes() {
      var YuyuHakusho = new Anime(1L, "YuyuHakusho");
      var SaintSeya = new Anime(2L, "SaintSeya");
      var JoJo = new Anime(3L, "JojoBizarreAdventure");

      return List.of(YuyuHakusho, SaintSeya, JoJo);
    }

}

package academy.devdojo.controller;

import academy.devdojo.domain.Anime;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping(path = {"v1/animes","v1/animes/"})
@Log4j2
public class AnimeController {

    @GetMapping
    public List<Anime> list(@RequestParam(required = false) String name) throws JsonProcessingException {
        log.info("Request received to list all Animes, param name '{}'", name);
        var animes = Anime.getAnimes();
        log.info("'{}'", new ObjectMapper().writeValueAsString(animes.get(0)));
        if (name == null || name.isBlank()) {
            return animes;
        }
        return animes.stream()
                .filter(anime -> anime.getName().equalsIgnoreCase(name))
                .toList();
    }

    @GetMapping({"{id}"})
    public Anime findById(@PathVariable Long id) {
        log.info("Request received find anime by id '{}'", id);
        return Anime.getAnimes()
                .stream().filter(anime -> anime.getId()
                .equals(id)).findFirst()
                .orElse(null);
    }

   @PostMapping
   public Anime save(@RequestBody Anime anime) {
        anime.setId(ThreadLocalRandom.current().nextLong(100_000));
        Anime.getAnimes().add(anime);
        return anime;
   }
}

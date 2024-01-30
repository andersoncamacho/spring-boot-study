package academy.devdojo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Producer {
    private Long id;
    private String name;

    private static List<Producer> producers = new ArrayList<>();

    static {
        var mappa = new Producer(1L, "Mappa");
        var kyotoAnimation = new Producer(1L, "Kyoto Animation");
        var madhouse = new Producer(1L, "Madhouse");
        producers.addAll(List.of(mappa, kyotoAnimation, madhouse));
    }

    public static List<Producer> getProducers() {
        return producers;
    }
}
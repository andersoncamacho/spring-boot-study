package academy.devdojo.controller;

import academy.devdojo.domain.Producer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping(path = {"v1/producers", "v1/producers/"})
public class ProducerController {

    @PostMapping
    public Producer save(@RequestBody Producer producer) {
        producer.setId(ThreadLocalRandom.current().nextLong(100_000));
        Producer.getProducers().add(producer);
        return producer;
    }
}

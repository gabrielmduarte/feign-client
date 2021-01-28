package com.gabrielduarte.feigncliente.consumer;

import com.gabrielduarte.feigncliente.domain.Character;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(url = "https://swapi.dev/api/", name = "character")
public interface CharacterConsumer {

    @RequestMapping("people/{id}/")
    Character getCharacterById(@PathVariable String id);

}

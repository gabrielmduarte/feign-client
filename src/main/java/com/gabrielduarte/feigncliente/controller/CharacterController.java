package com.gabrielduarte.feigncliente.controller;

import com.gabrielduarte.feigncliente.consumer.CharacterConsumer;
import com.gabrielduarte.feigncliente.domain.Character;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("poc-feign/")
public class CharacterController {

    private final CharacterConsumer consumer;

    public CharacterController(CharacterConsumer consumer) {
        this.consumer = consumer;
    }

    @GetMapping("{id}")
    public Character getCharacterById(@PathVariable String id) {
        return consumer.getCharacterById(id);
    }

}

package net.jst.fst.controller;

import net.jst.fst.model.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Controller {
    public static ResponseEntity<Message> hello() {
        return new ResponseEntity<Message>(new Message("hello world"), HttpStatus.OK);
    }

    public static ResponseEntity<Message> hello(String text) {
        return new ResponseEntity<Message>(new Message("hello " + text), HttpStatus.OK);
    }
}

package net.jst.fst.controller.rest;

import net.jst.fst.controller.Action;
import net.jst.fst.controller.Controller;
import net.jst.fst.model.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MessageRestController {
    @RequestMapping(value = "/api/v1/hello", method = RequestMethod.GET)
    public ResponseEntity<Message> getPrices() {
        return Controller.hello();
    }

    @RequestMapping(value = "/api/v1/hello/{text}", method = RequestMethod.GET)
    public ResponseEntity<Message> getStationByName(@PathVariable String text) {
        return Controller.hello(text);
    }
}

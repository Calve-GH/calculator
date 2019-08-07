package com.github.calvegh.controller;

import com.github.calvegh.to.Result;
import com.github.calvegh.to.TransferObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.StringJoiner;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = BaseController.REST_URL)
public class BaseController {
    public static final String REST_URL = "/api/";

    private static ResponseEntity<Result> getErrors(Errors errors) {
        StringJoiner joiner = new StringJoiner(", ");
        errors.getAllErrors().stream()
                .map(ObjectError::getDefaultMessage)
                .sorted()
                .collect(Collectors.toList())
                .forEach(joiner::add);
        return new ResponseEntity<>(new Result(joiner.toString()), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    private static ResponseEntity<Result> getResponseEntity(long l) {
        return new ResponseEntity<>(new Result(l), HttpStatus.OK);
    }

    @PostMapping(path = "plus")
    public ResponseEntity<Result> plus(@RequestBody @Valid TransferObject to, Errors errors) {
        if (errors.hasErrors()) {
            return getErrors(errors);
        }
        return getResponseEntity(to.getFirst() + to.getSecond());
    }

    @PostMapping(path = "minus")
    public ResponseEntity<Result> minus(@RequestBody @Valid TransferObject to, Errors errors) {
        if (errors.hasErrors()) {
            return getErrors(errors);
        }
        return getResponseEntity(to.getFirst() - to.getSecond());
    }

    @PostMapping(path = "multiply")
    public ResponseEntity<Result> multiply(@RequestBody @Valid TransferObject to, Errors errors) {
        if (errors.hasErrors()) {
            return getErrors(errors);
        }
        return getResponseEntity(to.getFirst() * to.getSecond());
    }

    @PostMapping(path = "divide")
    public ResponseEntity<Result> divide(@RequestBody @Valid TransferObject to, Errors errors) {
        if (errors.hasErrors()) {
            return getErrors(errors);
        }
        return getResponseEntity(to.getFirst() / to.getSecond());
    }
}

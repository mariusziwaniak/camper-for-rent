package pl.mrqs.camper_for_rent.api.controller;

import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ModelAndView handleException(Exception exception) {
        String message = "Unexpected exception occurred: [%s]".formatted(exception.getMessage());
        log.error(message, exception);
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage", message);
        return modelAndView;
    }

    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ModelAndView handleException(EntityNotFoundException exception) {
        String message = "Could not find a resource: [%s]".formatted(exception.getMessage());
        log.error(message, exception);
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage", message);
        return modelAndView;
    }

    @ExceptionHandler(BindException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ModelAndView handleException(BindException exception) {
        String message = "Bad request for field: [%s] wrong value: [%s]".formatted(
            Optional.ofNullable(exception.getFieldError()).map(FieldError::getField).orElse(null),
            Optional.ofNullable(exception.getFieldError()).map(FieldError::getRejectedValue).orElse(null)
        );
        log.error(message, exception);
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage", message);
        return modelAndView;
    }
}



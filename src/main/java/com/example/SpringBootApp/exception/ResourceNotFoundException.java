package com.example.SpringBootApp.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//Whenever your resource is not found in the database, we can clearly mention this Exception
//Rest API/Controller layer will throw this layer
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    //What is the purpose of serialVersionUID?
    //Simply put, we use the serialVersionUID attribute to remember versions of a Serializable class to verify that
    //a loaded class and the serialized object are compatible. The serialVersionUID attributes of different classes
    // are independent. Therefore, it is not necessary for different classes to have unique values.
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String message){
        super(message);
    }
}

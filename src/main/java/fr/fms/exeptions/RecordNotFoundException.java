package fr.fms.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RecordNotFoundException extends  RuntimeException
{
    private static final Long serialVersionUID = 1L;

    public RecordNotFoundException(String message)
    {
        super(message);
    }
}

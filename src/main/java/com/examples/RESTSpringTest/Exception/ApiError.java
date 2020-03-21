package com.examples.RESTSpringTest.Exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.http.HttpStatus;

import static com.examples.RESTSpringTest.Constants.ApiConstants.DATE_FORMAT;

import java.time.LocalDateTime;

@Data
class ApiError
{

	private HttpStatus status;
	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_FORMAT)
	private LocalDateTime timestamp;
	private String message;
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDebugMessage() {
		return debugMessage;
	}

	public void setDebugMessage(String debugMessage) {
		this.debugMessage = debugMessage;
	}

	private String debugMessage;
	private String path;

	private ApiError()
	{
		timestamp = LocalDateTime.now();
	}

	ApiError( HttpStatus status )
	{
		this();
		this.status = status;
	}

	ApiError( HttpStatus status, Throwable ex )
	{
		this(status);
		this.message = "Unexpected error";
		this.debugMessage = ex.getLocalizedMessage();
	}

	ApiError( HttpStatus status, String message, Throwable ex )
	{
		this(status,ex);
		this.message = message;
	}

    ApiError( HttpStatus status, String message,String path, Throwable ex )
    {
        this(status,message,ex);
        this.path = path;

    }
}
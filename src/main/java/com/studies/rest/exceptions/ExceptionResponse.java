package com.studies.rest.exceptions;

import java.util.Date;

public record ExceptionResponse(Date timeStamp, String message, String details) {}

package com.studies.rest.exeptions;

import java.util.Date;

public record ExceptionResponse(Date timeStamp,String message, String details) { }

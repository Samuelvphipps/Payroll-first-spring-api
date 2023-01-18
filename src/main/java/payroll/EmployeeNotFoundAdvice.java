package payroll;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class EmployeeNotFoundAdvice {
    //@responseBody says the advice is rendered straight into the response body
    @ResponseBody
    //only sends advice if Exception is thrown
    @ExceptionHandler(EmployeeNotFoundException.class)
    //sends 404 (i.e. NOT_FOUND)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(EmployeeNotFoundException ex) {
        return ex.getMessage();
    }
}
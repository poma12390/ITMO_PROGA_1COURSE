package lab5.exceptions;

public class InvalidSalaryException extends InvalidDataException {
    public InvalidSalaryException(){
        super("Bad salary bro");
    }
}

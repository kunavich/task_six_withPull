package by.kunavich.task6.data;

public class DataException extends Exception{
    public DataException(String message,Exception e)    {
        super(message,e);
    }

    public DataException(String message) {
        super(message);
    }
}

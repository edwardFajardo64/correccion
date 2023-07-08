public class DAOException_vendedor extends Exception {
  
    public DAOException_vendedor(String message) {
        super(message);
    }
   
    public DAOException_vendedor(String message, Throwable cause) {
        super(message, cause);
    }
    
    @Override
    public String toString() {
        String className = getClass().getName();
        String message = getLocalizedMessage();
        return (message != null) ? (className + ": " + message) : className;
    }
}

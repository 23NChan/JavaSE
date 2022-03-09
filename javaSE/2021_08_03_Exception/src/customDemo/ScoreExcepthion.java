package customDemo;

public class ScoreExcepthion extends Exception{
    public ScoreExcepthion() {}

    public ScoreExcepthion(String message) {
        super(message);
    }

    public ScoreExcepthion(String message, Throwable cause) {
        super(message, cause);
    }

    public ScoreExcepthion(Throwable cause) {
        super(cause);
    }

    public ScoreExcepthion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

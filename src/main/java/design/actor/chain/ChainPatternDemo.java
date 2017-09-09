package design.actor.chain;

/**
 * 模式: 责任链模式
 *
 * 描述: 每个接收器都包含对另一个接收器的引用,如果当前接收器不能处理请求,那么它将传递给下一个接收器
 *
 * 使用场景: 1. 多个对象可以共同处理一个请求; 2. 当没有能够处理的对象时,允许该请求不被处理
 *
 * Created by jianweilin on 2017/9/9.
 */
public class ChainPatternDemo {
    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO,"This is an info level information");
        loggerChain.logMessage(AbstractLogger.DEBUG,"This is an debug level information");
        loggerChain.logMessage(AbstractLogger.ERROR,"This is an error level information");
    }
}

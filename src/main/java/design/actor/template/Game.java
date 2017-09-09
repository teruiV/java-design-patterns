package design.actor.template;

/**
 * Created by jianweilin on 2017/9/9.
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    /**
     * template method
     */
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}

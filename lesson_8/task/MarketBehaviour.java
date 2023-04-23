package lesson_8.task;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);

    void releaseFromMarket(Actor actors);

    void update();
}

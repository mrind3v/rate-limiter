public class FixedWindowStrategy implements RateLimitStrategy{
    @Override
    public boolean canRequest() {
        return false;
    }
}

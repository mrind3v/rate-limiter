public class RateLimiterProxy implements ApiResource{
    private final ApiResource realApiResource;
    private final RateLimitStrategy rateLimitStrategy;
    public RateLimiterProxy(ApiResource apiResource, RateLimitStrategy rateLimitStrategy) {
        this.realApiResource = apiResource;
        this.rateLimitStrategy = rateLimitStrategy;
    }
    @Override
    public void fetchData() {
        if (rateLimitStrategy.canRequest()) {
            realApiResource.fetchData();
        } else {
            System.out.println("Api request rejected. Rate limit exceeded.");
        }
    }
}

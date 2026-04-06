public class RateLimiterProxy implements ApiResource{
    ApiResource apiResource;
    public RateLimiterProxy(ApiResource apiResource) {
        this.apiResource = apiResource;
    }
    @Override
    public void fetchData() {

    }
}

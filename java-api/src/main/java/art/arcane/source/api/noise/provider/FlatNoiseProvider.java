package art.arcane.source.api.noise.provider;

public class FlatNoiseProvider extends SeededNoiseProvider {
    public FlatNoiseProvider(long seed) {
        super(seed);
    }

    @Override
    public boolean isScalable()
    {
        return false;
    }

    @Override
    public boolean isFlat()
    {
        return true;
    }

    @Override
    public double noise(double x) {
        return 1;
    }

    @Override
    public double noise(double x, double y) {
        return 1;
    }

    @Override
    public double noise(double x, double y, double z) {
        return 1;
    }
}

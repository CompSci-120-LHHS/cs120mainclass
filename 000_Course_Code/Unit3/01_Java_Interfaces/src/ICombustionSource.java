public interface ICombustionSource {
    //by default these attributes are public
    public int igniteTemp = 451;

    //Interface methods must be overridden
    public void burn();
    public void extinguish();
}

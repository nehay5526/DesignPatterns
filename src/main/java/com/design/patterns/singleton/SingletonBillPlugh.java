public class SingletonBillPlugh {
    private SingletonBillPlugh(){

    }

    private static class Bps{
         private static final SingletonBillPlugh s = new SingletonBillPlugh();
    }
    public static SingletonBillPlugh getInstance(){
        return Bps.s;
    }
}
public class SingletonThreadSafe {
    public static SingletonThreadSafe singletonPattern=null;
    private SingletonThreadSafe(){
    }
    public synchronized  static SingletonThreadSafe getInstance(){
        if(null==singletonPattern){
            singletonPattern =new SingletonThreadSafe();
        }
        return singletonPattern;
    }

    public static SingletonThreadSafe getInstance(){
        if(null==singletonPattern){
            synchronized (SingletonThreadSafe.class){
                singletonPattern =new SingletonThreadSafe();
            }
        }
        return singletonPattern;
    }

}
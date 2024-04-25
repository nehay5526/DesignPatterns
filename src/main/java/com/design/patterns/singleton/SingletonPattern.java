/**
 * Lazy initialization
 */
public class SingletonPattern implements Cloneable{
public static SingletonPattern singletonPattern=null;
private SingletonPattern(){

}

public static SingletonPattern getInstance(){
    if(null==singletonPatter){
        singletonPattern = new SingletonPattern();
    }
    return singletonPattern;
}
}
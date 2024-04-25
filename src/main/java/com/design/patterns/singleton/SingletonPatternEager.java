/**
 * Eager initialization
 */
public class SingletonPatternEager{
    public static SingletonPatternEager singletonPattern=new SingletonPatternEager();
    private SingletonPatternEager(){
    }
    public static SingletonPatternEager getInstance(){
        return singletonPattern;
    }
}

import java.util.ArrayList;

public class Bester<T extends Betterable<T>>{

    private ArrayList<Betterable> list = new ArrayList<Betterable>();

    public T findBest(ArrayList<T> list) {
        if(list.size() < 1){
           return null;
        }

        T instance = list.get(0);
        for(T item : list){
            if(item.isBetterThan(instance)){
                instance = item;
            }
        }
        return instance;
    }
}
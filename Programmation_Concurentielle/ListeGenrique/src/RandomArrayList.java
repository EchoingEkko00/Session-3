import java.util.ArrayList;
import java.util.List;

public class RandomArrayList<E> extends ArrayList<E> implements RandomList<E> {
    public E getRandom() {
        int randomPos = (int) (Math.random()*size());
        return get(randomPos);
    }
}

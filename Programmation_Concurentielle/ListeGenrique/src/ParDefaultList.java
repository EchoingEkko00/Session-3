import java.util.ArrayList;
import java.util.List;

public class ParDefaultList<E> extends ArrayList<E> {
    public E get(int index, E parDefaut) {
        if ( index > this.size() || this.get(index).getClass() == null) {
            return null;
        }
        return this.get(index);
    }
}

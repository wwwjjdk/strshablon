import java.util.*;

public class Randoms implements Iterable<Integer>{
    protected Random random = new Random();
    int min,max;


    public Randoms(int min, int max){
      this.min = min;
      this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int index =0;
            @Override
            public boolean hasNext() {
                if(index < max){
                    return true;
                }
                return false;
            }

            @Override
            public Integer next() {
                if (index < max) {
                    int i = random.nextInt((max - min) + 1);
                    i += min;
                    index++;
                    return i;
                }
                return null;
            }
        };
    }
}

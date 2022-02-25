package my;


import java.util.*;


public class RandomsMy implements  Iterable<Integer> {
    Random random = new Random();
    int min,max,limit;
    int []array;

    public RandomsMy addMin(int min){
        this.min = min;
        return  this;
    }

    public RandomsMy addMax(int max){
        this.max = max;
        return this;
    }
    public RandomsMy addLimit(int limit){
        this.limit = limit;
        return this;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                if(index < limit){
                    return  true;
                }
                return false;
            }

            @Override
            public Integer next() {
                if(index < limit){
                    //todo
                }
                return null;
            }
        };
    }

    public RandomsMy creatArray(){
        array = new int[limit];

        for(int i = 0; i < array.length; i ++){
            int j = random.nextInt((max - min) + 1);
            j += min;
            array[i] =j;
        }
        return this;
    }
/*
    public List<Integer> creatArray(int count ){
        return new Random()
                .ints(min, max)
                .distinct()
                .limit(count)
                .boxed()
                .collect(Collectors.toList());
    }

 */
}

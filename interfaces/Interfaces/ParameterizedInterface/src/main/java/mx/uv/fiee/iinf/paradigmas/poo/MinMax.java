package mx.uv.fiee.iinf.paradigmas.poo;

public class MinMax<T extends Comparable<T>> implements IMinMax<T>
{
    T[] values;
    public MinMax(T[] values){
        this.values = values;
    }

    @Override
    public T min() {
        T min;
        if (values.length == 0) return null;
        else min = values[0];
        for (int i = 1; i < values.length; i++){
            if (values[i].compareTo(min) < 0) min = values[i];
        }
        return min;
    }

    @Override
    public T max() {
        T max;
        if (values.length == 0) return null;
        else max = values[0];
        for (int i = 1; i < values.length; i++){
            if (values[i].compareTo(max) > 0) max = values[i];
        }
        return max;
    }
}

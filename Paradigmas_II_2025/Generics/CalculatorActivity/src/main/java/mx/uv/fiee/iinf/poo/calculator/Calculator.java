package mx.uv.fiee.iinf.poo.calculator;

public class Calculator<T extends Number> {
    private T[] nums;

    public Calculator (T[] nums) {
        this.nums = nums; // El constructor guarda el arreglo de 5 elementos en nums
    }
    public double average(){
        // Metodo que calcula el promedio del arreglo
        int sum = 0;
        // Suma de todos los numeros
        for(int i = 0; i<5; i++){
            sum+=nums[i].doubleValue(); // Conversion de cualquier tipo numerico a tipo double
        }
        // Retorno del valor promedio
        return sum/5;
    }
}
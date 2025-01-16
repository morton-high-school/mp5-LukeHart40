public class BetterArray{
    public int[] array;
    private int size;
    public BetterArray(int length){
        array = new int[length];
        size = length;
    }

    public BetterArray(){
        array = new int[0];
        size = 0;
    }

    public int size(){
        int length = 0;
        for(int value: array){
            if(value != 0){
                length += 1;
            }
        }
        return length;
    }

    public boolean add(int item){
        int[] original = array;
        if(size == 0){
            array = new int[1];
            size = 1;
            array[0] = item;
            return true;
        }else if(size() + 1 > size){
            size = size * 2;
            array = new int[size];
            for(int i = 0; i < original.length - 1; i++){
                array[i] = original[i];
            }
            array[size() + 1] = item;
            return true;
        }else{
            array = new int[size];
            for(int i = 0; i < original.length - 1; i++){
                array[i] = original[i];
            }  
            array[size() + 1] = item;  
            return true;
        }
    }

    public void add(int index, int item){
        int[] original = array;
        if(size() + 1 < array.length){
            array = new int[array.length];
            for(int i = 0; i < original.length; i++){
                int oldIndex = original[index];
                array[i] = original[i];
                if(i == index){
                    array[i] = item;
                    array[i + 1] = oldIndex;
                }else if(i == i + 1){
                    array[i] = oldIndex;
                }
            }
        }else if(size() + 1 > array.length){
            array = new int[array.length * 2];
            for(int i = 0; i < original.length; i++){
                array = new int[array.length * 2];
                int oldIndex = original[index];
                array[i] = original[i];
                if(i == index){
                    array[i] = item;
                    array[i + 1] = oldIndex;
                }else if(i == i + 1){
                    array[i] = oldIndex;
                }
            }
        }
    }

    public int get(int index){
        return array[index];
    }

    public int set(int index, int item){
        int before = array[index];
        array[index] = item;
        return before;
    }

    // public int remove(int index){

    // }
}
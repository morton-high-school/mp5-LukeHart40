public class BetterArray{
    public int[] array;
    private int[] original;
    private int size;
    public BetterArray(int length){
        array = new int[length];
        original = new int[length];
        size = length;
    }

    public BetterArray(){
        array = new int[0];
        original = new int[0];
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
        if(size == 0){
            array = new int[1];
            size = 1;
            array[0] = item;
            original = new int[1];
            original = array;
            return true;
        }else if(size() == size){
            size = size * 2;
            array = new int[size];
            for(int i = 0; i < original.length; i++){
                array[i] = original[i];
            }
            array[size()] = item;
            original = new int[size];
            original = array;
            return true;
        }else{
            array = new int[size];
            for(int i = 0; i < original.length; i++){
                array[i] = original[i];
            }  
            array[size()] = item; 
            original = new int[size];
            original = array; 
            return true;
        }
    }

    public void add(int index, int item){
        if(size() == size){
            size = size * 2;
            array = new int[size];
            for(int i = 0; i <= original.length; i++){
                if(i < index){
                    array[i] = original[i];
                }else if(i == index){
                    array[index] = item;
                }else if(i > index){
                    array[i] = original[i - 1];
                }
            }
            original = new int[size];
            original = array;
        }else{
            array = new int[size];
            for(int i = 0; i < original.length; i++){
                if(i < index){
                    array[i] = original[i];
                }else if(i == index){
                    array[index] = item;
                }else if(i > index){
                    array[i] = original[i - 1];
                }
            }
            original = new int[size];
            original = array;
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

    public int remove(int index){
        final int remove = original[index];
        array = new int[size];
        for(int i = index; i < original.length; i++){
            array[i] = original[i];
        }
        for(int i = 0; i < original.length - 1; i++){
            if(i < index){
                array[i] = original[i];
            }else if(i >= index){
                array[i] = original[i + 1];
            }
        }
        original = new int[size];
        original = array;
        return remove;
    }
}
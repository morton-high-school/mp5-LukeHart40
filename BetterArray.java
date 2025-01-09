public class BetterArray{
    public int[] array;
    private static int size;
    public BetterArray(int length){
        array = new int[length];
    }

    public BetterArray(){
        array = new int[];
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

    }

    public void add(int index, int item){

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

    }
}
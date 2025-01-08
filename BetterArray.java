public class BetterArray{
    public int[] array;
    private static int size;
    public BetterArray(int length){
        array = new int[length];
    }

     public BetterArray(){
        array = new int[];
    }


    public static int size(){
        int size = 0;
        for(int value: array){
            if(value != 0){
                size += 1;
            }
        }
        return size;
    }
}
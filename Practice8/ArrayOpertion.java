package Practice8;

public class ArrayOpertion {
    private int[] arr;

    public ArrayOpertion(int[] arr){
            this.arr=arr;
    }
    public int[] getArray(){
        return arr; 
    }

    private static class Statistics{

        public double mean(ArrayOpertion ob){
            int[] a=ob.getArray();
            double sum=0;
            for(int i:a){
            sum+=i;
            }
            return sum/a.length;
        }
    }

        public static void main(String[] args) {
            ArrayOpertion ob=new ArrayOpertion(new int[]{12,3,24,5});
            Statistics s=new Statistics();
            
            System.out.println(s.mean(ob));
    }
  
}

 
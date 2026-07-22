public class learnMethod {
    private void addNums(int a ,int b){
        System.out.print(a+b);
    }
    private int addNums1(int a, int b){
     return a+b;
    } 
    public static void main (String [] args){
        learnMethod obj = new learnMethod();
        int a = 10;
        int b = 20;
        System.out.println(obj.addNums1(a,b));
        obj.addNums(a,b);
    }
}
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        method1();
        method2();
    }
    public static void method1(){
        System.out.println("Method 1::\n");
        
        // O(n)
        // O(1)
        // use two pinters.
        // swap the first and last element
        // only increament first low index. and fixed last index.
        // 1 2 3 4 5
        // 5 2 3 4 1
        // 5 1 3 4 2
        // 5 1 2 4 3
        // 5 1 2 3 4
        
        int a[]= new int[]{1,2,3,4,5};
        int low=0;
        int high=a.length-1;
        while(low!=high){
            int temp=a[low];
            a[low]=a[high];
            a[high]=temp;
            low++;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }
    public static void method2(){
        System.out.println("Method 2::\n");
        // O(n)
        // O(1)
        // 
        // swap the last and second last element
        // iterate thorugh loop.
        
        // 1 2 3 4 5
        // 1 2 3 5 4
        // 1 2 5 3 4
        // 1 5 2 3 4
        // 5 1 2 3 4
        
        int arr[]= new int[]{1,2,3,4,5};
        int n= arr.length;
        for(int i=n-1;i>0;i--){
            int temp = arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}

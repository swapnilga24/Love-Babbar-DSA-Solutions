import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int arr[] = new int[]{1,6,4,10,2,5};
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(stack.isEmpty()){
                res.add(-1);
            }else{
                if(!stack.isEmpty() && stack.peek()>arr[i]){
                     res.add(stack.peek());       
                }else{
                    if(!stack.isEmpty() && stack.peek()<=arr[i]){
                        while(!stack.isEmpty() && stack.peek()<=arr[i]){
                            stack.pop();
                        }
                        if(stack.isEmpty()){
                            res.add(-1);
                        }else{
                            res.add(stack.peek());
                        }
                    }
                }
            }
            stack.push(arr[i]);
        }
        //Collections.reverse(res);
        System.out.print(res);

    }
}


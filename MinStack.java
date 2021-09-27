import java.util.ArrayList;
import java.util.List;

class MinStack {

    List<Integer> stack;
    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new ArrayList<>();
    }

    public void push(int x) {
       stack.add(x);
    }

    public void pop() {
        if(stack.size() > 0) {   
            stack.remove(stack.size() -1);
        }
    }

    public int top() {
      if(stack.size() > 0) {
         return stack.get(stack.size() -1);
      } else {
          return 0;
      }
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        
        if(stack.size() == 1) {
            return stack.get(0);
        }

        if(stack.size() > 0) {
            for(int i = 0; i < stack.size()-1; i++) {
                int temp = stack.get(i);
                int temp2 = stack.get(i+1);
                if(temp < temp2) {
                    min = Integer.min(temp, min);
                } else {
                    min = Integer.min(temp2, min);
                }
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

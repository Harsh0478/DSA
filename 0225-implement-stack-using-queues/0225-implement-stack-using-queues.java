import java.util.*;

class MyStack {
    Queue<Integer> s1 = new LinkedList<>();
    Queue<Integer> s2 = new LinkedList<>();

    public boolean empty() {  
        return s1.isEmpty() && s2.isEmpty();
    }

    public void push(int x) {
        if (!s1.isEmpty()) {
            s1.add(x);
        } else {
            s2.add(x);
        }
    }

    public int pop() {
        if (empty()) {
            return -1;
        }

        int top = -1;

        if (!s1.isEmpty()) {
            while (!s1.isEmpty()) {
                top = s1.remove();
                if (s1.isEmpty()) break;
                s2.add(top);
            }
        } else {
            while (!s2.isEmpty()) {
                top = s2.remove();
                if (s2.isEmpty()) break;
                s1.add(top);
            }
        }

        return top;
    }

    public int top() {
        if (empty()) {
            return -1;
        }

        int top = -1;

        if (!s1.isEmpty()) {
            while (!s1.isEmpty()) {
                top = s1.remove();
                s2.add(top);
            }
        } else {
            while (!s2.isEmpty()) {
                top = s2.remove();
                s1.add(top);
            }
        }

        return top;
    }
}
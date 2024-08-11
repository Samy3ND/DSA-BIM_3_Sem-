 public class Stack {
        private int maxSize;
        private int top;
        private int[] stackArray;

        public Stack(int size) {
            maxSize = size;
            stackArray = new int[maxSize];
            top = -1;
        }

        public void push(int value) {
            if (top < maxSize - 1) {
                top++;
                stackArray[top] = value;
            } else {
                System.out.println("Stack is full. Cannot push " + value);
            }
        }

        public void pop() {
            if (top==-1) {
                System.out.println("Stack is empty. Cannot pop.");
                
              
            } else {
                int poppedValue = stackArray[top];
                top--;
               
            }
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public void traverse() {
            if (!isEmpty()) {
                System.out.print("Stack elements: ");
                for (int i = top; i >= 0; i--) {
                    System.out.print(stackArray[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("Stack is empty.");
            }
        }

        public boolean search(int value) {
            if (!isEmpty()) {
                for (int i = top; i >= 0; i--) {
                    if (stackArray[i] == value) {
                        System.out.println("Element " + value + " found at position " + (i + 1));
                        return true;
                    }
                }
                System.out.println("Element " + value + " not found.");
                return false;
            } else {
                System.out.println("Stack is empty.");
                return false;
            }
        }

        public static void main(String[] args) {
            Stack myStack = new Stack(5);

            myStack.push(10);
            myStack.push(20);
            myStack.push(30);
            myStack.push(40);
            myStack.push(50);

            myStack.traverse();

            myStack.pop();
            myStack.pop();

            myStack.traverse();

            myStack.search(30);
            myStack.search(60);
        }
    }
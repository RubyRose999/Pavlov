public class stek {
    STACK = struct {
        top: int
        items: array of int
        }
        
        # Initialize a stack
        
        def init_stack(stack):
        stack.top = -1
        
        # Push an element onto the stack
        
        def push(stack, item):
        stack.top += 1
        stack.items[stack.top] = item
        
        # Pop an element from the stack
        
        def pop(stack):
        if stack.is_empty():
        return None
        else:
        item = stack.items[stack.top]
        stack.top -= 1
        return item
        
        # Check if the stack is empty
        
        def is_empty(stack):
        return stack.top == -1
        
        # Display the stack
        
        def display_stack(stack):
        for i in range(stack.top, -1, -1):
        print(stack.items[i])
        
        # Main function
        
        def main():
        stack = init_stack(STACK())
        push(stack, 1)
        push(stack, 2)
        push(stack, 3)
        print("The stack:")
        display_stack(stack)
        print("Popped element:", pop(stack))
        print("The stack:")
        display_stack(stack)
        
        if __name__ == "__main__":
        main()
}

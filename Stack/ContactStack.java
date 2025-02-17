package Stack;

public class ContactStack {
	private Contact[] stack;
    private int top;
    private int maxSize;

    public ContactStack(int size) {
        this.maxSize = size;
        this.stack = new Contact[size];
        this.top = -1;
    }

    public void push(Contact contact) throws StackException {
        if (top == maxSize - 1) {
            throw new StackException("Stack is full! Cannot push a new contact.");
        }
        if (contact == null || !contact.validate()) {
            throw new StackException("Invalid contact! Cannot push to stack.");
        }
        stack[++top] = contact;
        System.out.println("Contact added: " + contact);
    }

    public Contact pop() throws StackException {
        if (top == -1) {
            throw new StackException("Stack is empty! Cannot pop.");
        }
        Contact poppedContact = stack[top--];
        System.out.println("Contact removed: " + poppedContact);
        return poppedContact;
    }

    public Contact peek() {
        if (top == -1) {
            return null;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int size() {
        return top + 1;
    }

}

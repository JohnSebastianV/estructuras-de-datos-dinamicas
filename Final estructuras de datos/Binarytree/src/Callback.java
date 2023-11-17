interface Callback {
    void execute(BinaryTree node);
}

class SomeCallback implements Callback {
    @Override
    public void execute(BinaryTree node) {
        
        System.out.println("callback(" + node.value + ")");
    }
}


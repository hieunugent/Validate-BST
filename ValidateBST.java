class ValidateBST{
  public static boolean ValidateBst (BST tree){
    return ValidBstRange(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }
  public static boolean ValidBstRange(BST tree, int lowerBound, int upperBound){
    if(tree.value < lowerBound || tree.value >= upperBound){ return false;}
    if(tree.left != null && !ValidBstRange(tree.left, lowerBound, tree.value)) return false;
    if(tree.right != null && !ValidBstRange(tree.right, tree.value, upperBound)) return false;
    return true;
  }
<<<<<<< HEAD

=======
>>>>>>> 128a821b7f366b54fb8d2c90e982d5639f2e7eaf
  static class BST{
    public int value;
    public BST left;
    public BST right;
    public BST(int value){
      this.value = value;
    }
  }
}

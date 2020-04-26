import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestCase{

    static TestBST test1 = new TestBST(10);


  @Test
  public void TestCase1(){

  }


  class TestBST extends ValidateBST.BST{
     public TestBST(int value){
      super(value);
    }
     public TestBST insert(int value){
      if(this.value < value){
        if (right != null){
            this.right.insert(value);
        }
        right.value = value;
      }
      else if(this.value >  value){
        if(left != null){
          this.left.insert(value);
        }
        left.value = value;
      }
      else{
        if(right != null){
          this.right.insert(value);
        }
        right.value = value;
      }
    }

  }
}


public class BinarySearchTreeRemoveTest {

    public static void main(String[] args) throws Exception {
        SortedADT sorted = new BinarySearchTree();
        sorted.insert(20);
        sorted.insert(10);
        sorted.insert(30);
        sorted.insert(60);
        sorted.insert(40);
        sorted.insert(90);
        sorted.insert(50);
        sorted.insert(70);
        sorted.insert(80);
        sorted.insert(100);
        System.out.println(sorted);
        Integer value;
        do{
            value = Input.getInteger("value: ");
            try {
                sorted.remove(value);
                System.out.println("removed");
            } catch (SortedADT.NotFoundException e) {
                System.out.println("value not found");
            }
            System.out.println(sorted);
        }while(Repeat.repeat());
    }
}

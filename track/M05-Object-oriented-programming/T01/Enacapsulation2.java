class Book {
    private int pageNum;

    public void setData(int x) {
        if (pageNum > 0) {
            pageNum = x;
        }
    }

    public int getData() {
        return pageNum;
    }
}

public class Enacapsulation2 {
    public static void main(String[] args) {
        Book b = new Book();
        b.setData(100);
        System.out.println(b.getData());
    }
}

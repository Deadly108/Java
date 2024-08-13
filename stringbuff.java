public class stringbuff {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("After append: " + sb);
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);

        sb.delete(6, 11);
        System.out.println("After delete: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
        sb.replace(6, 11, "Universe");
        System.out.println("After replace: " + sb);
        int len = sb.length();
        int cap = sb.capacity();
        System.out.println("Length: " + len + ", Capacity: " + cap);
    }
}

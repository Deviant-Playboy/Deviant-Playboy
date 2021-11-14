package ru.mirea.prac2;

public class TestAuthor {
    public static void main(String[] args) {
        Author q1 = new Author("Mike", "q@mail.com", 'X');
        Author q2 = new Author("Pike", "w@mail.com", 'Y');
        Author q3 = new Author("Like", "r@mail.com", 'Y');
        q2.setEmail("qwerty@mail.com");
        System.out.println(q1.getName());
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
    }
}

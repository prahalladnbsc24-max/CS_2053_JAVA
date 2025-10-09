class Book
{
public String author;
public String title;
public int yearPublished;
public Book(String author, String title, int yearPublished)
{
this.author=author;
this.title=title;
this.yearPublished=yearPublished;
}
public void display()
{
System.out.println("The Author " + author);
System.out.println("Published the book "+title);
System.out.println("in the year " +yearPublished);
}
}
public class Lab1
{
public static void main(String args[])
{
Book bk=new Book("Paulo Coelho", "The Alchemist",1988);
bk.display();
}
}
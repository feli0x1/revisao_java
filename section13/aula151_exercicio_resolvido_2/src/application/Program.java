package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class Program {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date dt1 = sdf.parse("21/06/2018 13:05:44");
		Comment comment1 = new Comment("Have a nice trip!");
		Comment comment2 = new Comment("Wow that's awesome!");
		Post post1 = new Post(dt1, "Traveling to New Zealand", "I'm going to visit this wonderful country", 12);
		post1.addComment(comment1);
		post1.addComment(comment2);
		
		Date dt2 = sdf.parse("28/07/2018 23:14:19");
		Comment comment3 = new Comment("Good night");
		Comment comment4 = new Comment("May the force be with you");
		Post post2 = new Post(dt2, "Good night guys", "See you tomorrow", 5);
		post2.addComment(comment3);
		post2.addComment(comment4);
		
		System.out.println(post1);
		System.out.println(post2);
	}
}
package test;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  ArrayList<String> names= new ArrayList<String>();
	  names.add("abjiii");
	  names.add("abhi");
	  names.add("sali");
	  names.add("alko");
	  names.add("CATH");
	  names.add("dog");
	  /*int count=0;

	  for(int i=0;i<names.size();i++)
	  {
	  	String name=names.get(i);
	  if(name.startsWith("a"))
	  {
	  	count++;
	  }
	  	
	  }
	  
	  System.out.println(count);
	  */
  long abc =names.stream().filter(s->s.startsWith("a")).count();
  names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
  names.stream().filter(s->s.length()<4).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
  names.stream().filter(s->s.endsWith("i")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
  names.stream().filter(s->s.contains("H")).map(s->s.toLowerCase()).forEach(s->System.out.println(s));
  //System.out.println(abc);
  
  }


	
	





}

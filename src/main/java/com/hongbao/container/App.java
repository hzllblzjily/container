package com.hongbao.container;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
 

    	Entity entity1 = new Entity("hzl",8);
    	entity1.setSuperNameString("superhzl");
    	Entity entity2 = null;
    	entity2 = (Entity) entity1.clone();
    	
       	Entity[] a = {entity1};
       	Entity[] bb = Arrays.copyOf(a, a.length);
    	a[0].setName("1111");
    	

    	entity1.setName("hzl改");
    	entity1.setSuperNameString("superhzl改");
    	entity1.getCompositeEntity().setCompositeString("2222");
    	System.out.println("name = " + entity2.getCompositeEntity().getCompositeString());
    	
    	LinkedList<Entity> llLinkedList = new LinkedList<Entity>();

    	HashSet<Entity> set = new HashSet<Entity>();
    	set.add(new Entity("hzl",1));
    	boolean bbb = set.add(new Entity("hzl",1));
    	
    	LinkedHashSet<Entity> set2 = new LinkedHashSet<Entity>();
    	set2.add(new Entity("hzl",2));
    	set2.add(new Entity("hzl",1));
    	set2.add(new Entity("hzl",3));
    	for (Entity entity : set2) {
			System.out.println("id = " + entity.getId());
		}
    
    	HashMap<Entity,String> hMap = new HashMap<Entity, String>();
    	hMap.put(new Entity("hzl",1), "2222");
    	hMap.put(new Entity("hzl",1), "3333");
    	hMap.put(new Entity("hzl",1), "4444");
    	
    	int size = hMap.size();
    	

    	List<Entity> list1 = new ArrayList<Entity>();

    	list1.add(new Entity("hzl1", 1));
    	list1.add(new Entity("hzl2", 2));

    	List<Entity> list2 = new ArrayList<Entity>();
    	list2.add(new Entity("hzl1", 1));
    	boolean b = list1.listIterator().hasPrevious();
    	list1.toArray();
    	LinkedList<Entity> linkList1 = new LinkedList<Entity>();
    	linkList1.add(new Entity("hzl3",3));


    }
}

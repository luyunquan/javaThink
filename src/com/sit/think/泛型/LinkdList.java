package com.sit.think.泛型;

public class LinkdList<T> {

	private  class  Node<U>
	{
		 U item;
		 Node<U> next;
		 Node(U item,Node<U> next){
			this.item=item;
			this.next=next;
		}
		 Node(){
			 this.item=null;
			 this.next=null;
		 }
		boolean  end(){
			return item==null&&next==null;
		}
	}
	private  Node<T> top=new  Node<T>();
	public void push(T t){
		top=new  Node<T>(t,top);
	}
	public T pop(){
		T result=top.item;
		if(!top.end()){
			top=top.next;
		}
		return result;
	}
	
	public static void main(String[] args) {
		LinkdList<String> list=new  LinkdList<String>();
		for(String str:"Pharase  or  spuknt".split(" "))
			list.push(str);
		String s=null;
		while((s=list.pop())!=null)
			System.out.println(s);
	}
}

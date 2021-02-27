package com.bridgelabz.uc1;

public interface INode<K> {
	K getKey();	

	INode getNext();
	void setNext(INode next);
	void setKey(K key);
}


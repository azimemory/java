package com.kh.c_collection.a_list.simple.node;

public class Node<E> {
	
	private Node<E> link;  // 다음 노드의 주소를 보관하는 레퍼런스
	private E data; // 사용자가 입력한 데이터를 저장하는 레퍼런스
	
	public Node(E data) {
		this.data = data;
	}

	public Node<E> getLink() {
		return link;
	}

	public void setLink(Node<E> link) {
		this.link = link;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return data.toString();
	}
}

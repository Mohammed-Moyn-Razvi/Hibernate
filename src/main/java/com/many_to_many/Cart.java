package com.many_to_many;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Cart {

	@Id
	@Column
	int cart_id;
	@Column
	String cart_name;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="cart_item",
			joinColumns=@JoinColumn(name="cart_id"),
			inverseJoinColumns=@JoinColumn(name="item_id"))
	Set<Item>it;

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public String getCart_name() {
		return cart_name;
	}

	public void setCart_name(String cart_name) {
		this.cart_name = cart_name;
	}

	public Set<Item> getIt() {
		return it;
	}

	public void setIt(Set<Item> it) {
		this.it = it;
	}
	
}

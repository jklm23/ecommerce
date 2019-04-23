package com.bean.user;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.bean.book.Book;
import com.bean.book.Order;

@Entity @Table(name="user")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private Integer uid;		//�û�ID
	@Column(length=20,nullable=false,unique=true)
	private String account;		//�û�ע��ʱ�õ������绰����
	@Column(length=50,nullable=false)
	private String password;		//�û�����
	@Column(length=30,nullable=false)
	private String nickname;		//�û��ǳ�
	@Column(length=30)
	private String photo="default.jpg";	//�û�ͷ��
	@Enumerated(EnumType.STRING) @Column(length=8)
	private Type type=Type.GENERAL;	//�û�������
	@Column(length=5)
	private Integer status=0;	//�û���״̬0��ͨ 1���� 
	@Column(length=5,name="message_count")
	private Integer messageCount=0;	//�û�����Ϣ����
	@Column(length=5,name="points_count")
	private Integer pointsCount=0;	//�û��Ļ���
	@OneToMany(cascade=CascadeType.ALL,mappedBy="user")
	private Set<Address> address=new HashSet<Address>();		//�û���Ӧ�ĵ�ַ
	@ManyToMany(cascade=CascadeType.REFRESH,mappedBy="users")
	private Set<Book> books=new HashSet<Book>();	//�ղص�ͼ��
	@OneToMany(cascade=CascadeType.ALL,mappedBy="user")
	private Set<Order> order=new HashSet<Order>();			//�û��Ķ���
	
	public Set<Order> getOrder() {
		return order;
	}
	public void setOrder(Set<Order> order) {
		this.order = order;
	}
	public Integer getPointsCount() {
		return pointsCount;
	}
	public void setPointsCount(Integer pointsCount) {
		this.pointsCount = pointsCount;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	public Set<Address> getAddress() {
		return address;
	}
	public void setAddress(Set<Address> address) {
		this.address = address;
	}
	public Integer getMessageCount() {
		return messageCount;
	}
	public void setMessageCount(Integer messageCount) {
		this.messageCount = messageCount;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String account, String password, String nickname, Type type) {
		super();
		this.account = account;
		this.password = password;
		this.nickname = nickname;
		this.type = type;
	}
	//���ӵ�ַ
	public void addAddress(Address address){
		this.address.add(address);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (uid == null) {
			if (other.uid != null)
				return false;
		} else if (!uid.equals(other.uid))
			return false;
		return true;
	}
	
}

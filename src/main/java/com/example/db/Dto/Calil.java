package com.example.db.Dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity //DBから特定の列のデータを持ってきてオブジェクトに代入
@Component //JavaBeanとして登録するクラス
@Table(name="Calil")
public class Calil {
@Id private int id;
	private String libkey;
	private String lending;

	public int getId() {
	return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibkey() {
		return libkey;
	}
	public void setLibkey(String libkey) {
		this.libkey = libkey;
	}
	public String getLending() {
		return lending;
	}
	public void setLending(String lending) {
		this.lending = lending;
	}
}
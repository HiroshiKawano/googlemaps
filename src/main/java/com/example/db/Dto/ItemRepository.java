package com.example.db.Dto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository //⑥DBのItemテーブルに接続
public interface ItemRepository extends JpaRepository<Item, Integer>{
	public Item findByLibkey(String libkey);
}
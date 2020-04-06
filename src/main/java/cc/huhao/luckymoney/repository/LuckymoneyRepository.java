package cc.huhao.luckymoney.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cc.huhao.luckymoney.model.Luckymoney;

public interface LuckymoneyRepository extends JpaRepository<Luckymoney, Integer> {

}
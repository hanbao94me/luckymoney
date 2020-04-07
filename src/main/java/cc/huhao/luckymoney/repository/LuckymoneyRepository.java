package cc.huhao.luckymoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cc.huhao.luckymoney.model.Luckymoney;

public interface LuckymoneyRepository extends JpaRepository<Luckymoney, Integer> {

}
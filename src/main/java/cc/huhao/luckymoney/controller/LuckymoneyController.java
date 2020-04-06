package cc.huhao.luckymoney.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cc.huhao.luckymoney.config.LimitConfig;
import cc.huhao.luckymoney.repository.LuckymoneyRepository;
import cc.huhao.luckymoney.model.Luckymoney;

@RestController
public class LuckymoneyController {
    @Autowired
    private LimitConfig limitConfig;
    @Autowired
    private LuckymoneyRepository luckymoneyRepository;

    @GetMapping("/hello")
    public String SayHello() {
        return limitConfig.getDescription();
    }

    @GetMapping("/")
    public List<Luckymoney> List() {
        List<Luckymoney> list = luckymoneyRepository.findAll();
        return list;
    }

    @PostMapping("/")
    public Luckymoney Create(@RequestParam("producer") String producer, @RequestParam("consumer") String consumer,
            @RequestParam("money") BigDecimal money) {
        Luckymoney luckymoney = new Luckymoney();
        luckymoney.setConsumer(consumer);
        luckymoney.setMoney(money);
        luckymoney.setProducer(producer);
        return luckymoneyRepository.save(luckymoney);
    }
}
package cc.huhao.luckymoney.config;

import java.math.BigDecimal;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "limit")
public class LimitConfig {
    private BigDecimal minMoney;
    private String description;
    private String maxMoney;

    /**
     * @param maxMoney the maxMoney to set
     */
    public void setMaxMoney(String maxMoney) {
        this.maxMoney = maxMoney;
    }

    public BigDecimal getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(BigDecimal minMoney) {
        this.minMoney = minMoney;
    }

    /**
     * @return the maxMoney
     */
    public String getMaxMoney() {
        return maxMoney;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

}
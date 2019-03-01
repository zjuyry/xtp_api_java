package com.zts.xtp.quote.model.response;

import com.zts.xtp.common.enums.ExchangeType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TickerPriceInfoResponse {

    /** 交易所代码 */
    private ExchangeType exchangeType;

    /** 合约代码 */
    private String ticker;

    /** 最新价 */
    private double lastPrice;

    /** 是否最后一条记录 */
    private boolean lastResp;

    public void setExchangeType(int exchangeType) {
        this.exchangeType = ExchangeType.values()[exchangeType - 1];
    }
}

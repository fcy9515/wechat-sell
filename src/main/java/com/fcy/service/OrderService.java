package com.fcy.service;

import com.fcy.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: feichangyong
 * Date: 2018-05-10
 * Time: 11:16
 */
public interface OrderService {
    /* 创建订单 */
    OrderDTO create(OrderDTO orderDTO);
    /* 查询单个订单 */
    OrderDTO findOne(String orderId);
    /* 查询订单列表 */
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);
    /* 取消订单 */
    OrderDTO cancel(OrderDTO orderDTO);
    /* 支付订单 */
    OrderDTO paid(OrderDTO orderDTO);
    /* 完成订单 */
    OrderDTO finish(OrderDTO orderDTO);

}

package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.Order;
import cn.tedu.sp01.pojo.User;

public interface OrderService {
    Order getOrder(String orderId);

    void addOrder(Order order);
}

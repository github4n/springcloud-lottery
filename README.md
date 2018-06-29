## 博彩商城项目Spring Cloud微服务版

## 项目简介

| 微服务角色                     | 对应的技术选型                  |
| :----------------------------- | :------------------------------ |
| 注册中心(Register Server)      | Eureka                          |
| 服务提供者 (Service  Provider) | spring mvc、spring-data-jpa、h2 |
| 服务消费者(Service Consumer)   | Feign消费服务提供者的接口       |
| 网关路由(API Gateway)          | Zuul                            |



## 准备

### 环境准备:

| 工具    | 版本          |
| ------- | ------------- |
| JDK     | 1.8           |
| IDE     | IntelliJ IDEA |
| Gradle  | 4.8           |
| node.js | 8.11.1        |



### 主机规划:

| 项目名称          | 端口 | 描述         |
| ----------------- | ---- | ------------ |
| lottery-discovery | 8761 | 注册中心     |
| lottery-gateway   | 80   | API Gateway  |
| lottery-info      | 8081 | 彩票信息     |
| lottery-user      | 8082 | 用户管理     |
| lottery-order     | 8083 | 订单管理     |
| lottery-res       | 8084 | 静态资源服务 |


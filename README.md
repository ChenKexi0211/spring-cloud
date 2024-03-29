
  # spring cloud

 ## 组件说明

#### Eureka，服务注册中心，特性有失效剔除、服务保护。

#### Ribbon，客户端负载均衡，特性有区域亲和、重试机制。

#### Feign，声明式服务调用，本质上就是Ribbon+Hystrix

#### Hystrix，客户端容错保护，特性有服务降级、服务熔断、请求缓存、请求合并、依赖隔离。

#### Zuul，API服务网关，功能有路由分发和过滤。

#### Config，分布式配置中心，支持本地仓库、SVN、Git、Jar包内配置等模式，

#### Bus，消息总线，配合Config仓库修改的一种Stream实现，

#### Sleuth，分布式服务追踪，需要搞清楚TraceID和SpanID以及抽样，如何与ELK整合。

#### Stream，消息驱动，有Sink、Source、Processor三种通道，特性有订阅发布、消费组、消息分区。

#### Dashboard，Hystrix仪表盘，监控集群模式和单点模式，其中集群模式需要收集器Turbine配合。


 ## 总结
```
Eureka和Ribbon，是最基础的组件，一个注册服务，一个消费服务。

Hystrix为了优化Ribbon、防止整个微服务架构因为某个服务节点的问题导致崩溃，是个保险丝的作用。

Dashboard给Hystrix统计和展示用的，而且监控服务节点的整体压力和健康情况。

Turbine是集群收集器，服务于Dashboard的。

Feign是方便我们程序员写更优美的代码的。

Zuul是加在整个微服务最前沿的防火墙和代理器，隐藏微服务结点IP端口信息，加强安全保护的。

Config是为了解决所有微服务各自维护各自的配置，设置一个统一的配置中心，方便修改配置的。

Bus是因为config修改完配置后各个结点都要refresh才能生效实在太麻烦，所以交给bus来通知服务节点刷新配置的。

Stream是为了简化研发人员对MQ使用的复杂度，弱化MQ的差异性，达到程序和MQ松耦合。

Sleuth是因为单次请求在微服务节点中跳转无法追溯，解决任务链日志追踪问题的。
```

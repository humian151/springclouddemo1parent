# springCloud入门实例
- 新建Maven父级项目spring-cloud-demo1-parent用来管理jar包版本
- 新建子项目spring-cloud-api用来存储项目需要的entity
- 新建提供者项目spring-cloud-provider绑定端口8001
- 消费者spring-cloud-cuonsumer-80绑定端口80
注意消费者需要引入spring-cloud-api但是不需要jpa包，这里我们需要移出掉里面的jpa依赖，否则会启动报错
·
<exclusions>
                <exclusion>
                    <artifactId>spring-boot-starter-data-jpa</artifactId>
                    <groupId>org.springframework.boot</groupId>
                </exclusion>
            </exclusions>
·
- 安全管理项目spring-cloud-security
